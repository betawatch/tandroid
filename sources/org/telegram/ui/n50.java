package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.Components.ov0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ j60 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = j60Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.d4 d4Var;
        float f10;
        float y3;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.d4 d4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x11;
        float f11;
        float f12;
        float f13;
        int i10;
        Shader.TileMode tileMode;
        j60 j60Var = this.D0;
        h60 h60Var = j60Var.B1;
        View view = j60Var.K2;
        View view2 = j60Var.J2;
        ArrayList arrayList2 = j60Var.Y1;
        mh.h hVar = j60Var.c0;
        Paint paint = j60Var.C0;
        w30 w30Var = j60Var.m2;
        d40 d40Var = j60Var.C2;
        a40 a40Var = j60Var.a2;
        p50 p50Var = j60Var.Q;
        if (!j60Var.s2 && !j60Var.F2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (j60Var.Q2 == null) {
                    j60Var.Q2 = new RenderNode("CallActivity.Blur");
                    j60Var.R2 = org.telegram.ui.Components.ov0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.ov0.getBlurRadius();
                    RenderNode renderNode = j60Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = j60Var.Q2;
                    float f14 = j60Var.R2;
                    hVar.W0 = renderNode2;
                    hVar.X0 = f14;
                }
                int round = Math.round(getMeasuredWidth() / j60Var.R2);
                int round2 = Math.round(getMeasuredHeight() / j60Var.R2);
                j60Var.s2 = true;
                j60Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = j60Var.Q2.beginRecording();
                float f15 = 1.0f / j60Var.R2;
                beginRecording.scale(f15, f15);
                dispatchDraw(beginRecording);
                j60Var.Q2.endRecording();
                j60Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < p50Var.getChildCount(); i11++) {
            View childAt = p50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                ((org.telegram.ui.Cells.d4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != p50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((p50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (a40Var.r == null) {
            for (int i12 = 0; i12 < w30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.r20) w30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (w30Var.getVisibility() == 0) {
            HashMap hashMap = this.C0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < p50Var.getChildCount()) {
                View childAt2 = p50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        p50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != a40Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                        p50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.d4 d4Var3 = (org.telegram.ui.Cells.d4) childAt2;
                            hashMap.put(d4Var3.getParticipant(), d4Var3);
                        }
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
            }
            int i14 = 0;
            while (i14 < w30Var.getChildCount()) {
                org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) w30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(r20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(r20Var.getParticipant());
                }
                float f16 = a40Var.c;
                HashMap hashMap2 = hashMap;
                if (!j60Var.N2.k()) {
                    r20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (p50Var.getX() + lVar3.getLeft()) - a40Var.getLeft();
                        f11 = (p50Var.getY() + lVar3.getTop()) - a40Var.getTop();
                        f12 = w30Var.getX() + r20Var.getLeft();
                        f13 = w30Var.getY() + r20Var.getTop();
                    } else {
                        x11 = ((p50Var.getX() + r14.getLeft()) - a40Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((p50Var.getY() + r14.getTop()) - a40Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = w30Var.getX() + r20Var.getLeft() + (r20Var.getMeasuredWidth() >> 1);
                        float y11 = w30Var.getY() + r20Var.getTop() + (r20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.d4) view3).setDrawAvatar(false);
                        f11 = y10;
                        f12 = x12;
                        f13 = y11;
                    }
                    float f17 = 1.0f - f16;
                    r20Var.setTranslationX((x11 - f12) * f17);
                    r20Var.setTranslationY((f11 - f13) * f17);
                    r20Var.setScaleX(1.0f);
                    r20Var.setScaleY(1.0f);
                    r20Var.setProgressToFullscreen(f16);
                } else {
                    r20Var.setScaleX(1.0f);
                    r20Var.setScaleY(1.0f);
                    r20Var.setTranslationX(0.0f);
                    r20Var.setTranslationY(0.0f);
                    r20Var.setProgressToFullscreen(1.0f);
                    if (r20Var.getRenderer() == null) {
                        r20Var.setAlpha(f16);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i15);
            org.telegram.ui.Components.ll0 ll0Var = j60Var.n2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.P) {
                arrayList = arrayList2;
            } else {
                tVar.y0 = false;
                float f18 = a40Var.c;
                arrayList = arrayList2;
                if (tVar.r || tVar.b) {
                    org.telegram.ui.Components.voip.l lVar4 = tVar.c;
                    org.telegram.ui.Components.voip.l lVar5 = lVar4;
                    if (lVar4 == null && tVar.e == null) {
                        tVar.setTranslationX(0.0f);
                        tVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.l lVar6 = tVar.e;
                        if (lVar6 != null) {
                            lVar5 = lVar6;
                        }
                        if (lVar6 == null) {
                            ll0Var = p50Var;
                        }
                        float x13 = ((ll0Var.getX() + lVar5.getX()) - tVar.getLeft()) - a40Var.getLeft();
                        float y12 = ((ll0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - a40Var.getTop();
                        float f19 = 1.0f - f18;
                        float f20 = f18 * 0.0f;
                        tVar.setTranslationX((x13 * f19) + f20);
                        tVar.setTranslationY((y12 * f19) + f20);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.r20 r20Var2 = tVar.d;
                    if (r20Var2 != null) {
                        r20Var2.setAlpha(f18);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f18);
                    } else if (!tVar.E) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.r20 r20Var3 = tVar.d;
                    if (r20Var3 != null) {
                        w30Var.getClass();
                        if (RecyclerView.R(r20Var3) == -1) {
                            tVar.setAlpha(tVar.d.getAlpha());
                        } else if (tVar.c == null) {
                            if (tVar.v && !tVar.E) {
                                tVar.setAlpha(f18);
                            }
                            tVar.d.setAlpha(f18);
                            f18 = 1.0f;
                        } else {
                            tVar.d.setAlpha(1.0f);
                            if (tVar.v && !tVar.E) {
                                tVar.setAlpha(1.0f);
                            }
                        }
                        tVar.setTranslationX((w30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f21 = 1.0f - f18;
                        tVar.setTranslationY((w30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f21))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f21) + (AndroidUtilities.dp(13.0f) * f18));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    ll0Var = p50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (j60.G3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            ll0Var = p50Var;
                                        }
                                    }
                                } else {
                                    lVar = lVar9;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            tVar.setTranslationX(((ll0Var.getX() + lVar8.getX()) - tVar.getLeft()) - a40Var.getLeft());
                            tVar.setTranslationY(((ll0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - a40Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.E) {
                                if (!j60.G3) {
                                    tVar.y0 = true;
                                    tVar.setAlpha(lVar8.getAlpha() * (1.0f - f18));
                                } else if (tVar.c != null && tVar.e == null) {
                                    tVar.setAlpha(lVar8.getAlpha() * f18);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (j60.G3) {
            f7 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f7 = 1.0f;
            view2.setAlpha(1.0f - a40Var.c);
            view.setAlpha(1.0f - a40Var.c);
        }
        if (a40Var.L0) {
            p50Var.setAlpha(f7 - a40Var.c);
        } else {
            p50Var.setAlpha(f7);
        }
        if (h60Var != null) {
            h60Var.setAlpha(f7 - a40Var.c);
            h60Var.setTranslationY(a40Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (j60Var.F2) {
            return;
        }
        boolean z11 = j60Var.f2;
        RectF rectF = this.x0;
        if (!z11) {
            if (j60Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), j60Var.W2);
                float y13 = p50Var.getY();
                p50Var.getY();
                p50Var.getMeasuredHeight();
                if (!j60Var.b3) {
                    if (j60Var.a3 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = j60Var.Z2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(a40Var.getX() + j60Var.Z2.getX(), a40Var.getY() + j60Var.Z2.getY());
                        j60Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(a40Var.getX() + w30Var.getX() + j60Var.a3.getX(), a40Var.getY() + w30Var.getY() + j60Var.a3.getY());
                    if (j60Var.a3.getRenderer() == null || !j60Var.a3.getRenderer().v || j60Var.a3.getRenderer().b) {
                        j60Var.a3.draw(canvas);
                    } else {
                        j60Var.a3.getRenderer().draw(canvas);
                    }
                    j60Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = p50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = p50Var.getChildAt(i16);
                    if (childAt3 == j60Var.X2) {
                        float max = Math.max(p50Var.getLeft(), childAt3.getX() + p50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + p50Var.getY());
                        float min = Math.min(p50Var.getRight(), childAt3.getX() + p50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(p50Var.getY() + p50Var.getMeasuredHeight(), childAt3.getY() + p50Var.getY() + j60Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + p50Var.getLeft(), childAt3.getY() + p50Var.getY());
                            float alpha = j60Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((j60Var.X2.getClipHeight() - j60Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.pr.g.getInterpolation(1.0f - alpha))) + j60Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.d4 d4Var4 = j60Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.j5[] j5VarArr = d4Var4.d;
                            if (TextUtils.isEmpty(j5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            j5VarArr[4].setFullAlpha(alpha);
                            j5VarArr[4].h(0, 0);
                            d4Var4.invalidate();
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (j60Var.X2 != null) {
            if (j60Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), j60Var.W2);
            }
            float y14 = p50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = p50Var.getChildCount();
            float y15 = p50Var.getY() + p50Var.getMeasuredHeight();
            if (j60Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        d4Var = null;
                        break;
                    }
                    View childAt4 = p50Var.getChildAt(i17);
                    d4Var = j60Var.X2;
                    if (childAt4 == d4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                d4Var = j60Var.X2;
            }
            if (d4Var != null && y14 < y15) {
                canvas3.save();
                if (j60Var.a3 == null) {
                    f10 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - j60Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * j60Var.d2) + ((1.0f - j60Var.d2) * y15));
                } else {
                    f10 = 255.0f;
                }
                if (j60Var.b3) {
                    y3 = ((1.0f - j60Var.d2) * (d4Var.getY() + p50Var.getY())) + ((d40Var.getMeasuredWidth() + d40Var.getTop()) * j60Var.d2);
                    x10 = ((1.0f - j60Var.d2) * (d4Var.getX() + p50Var.getLeft())) + (j60Var.d2 * d40Var.getLeft());
                } else {
                    y3 = d40Var.getMeasuredWidth() + d40Var.getTop();
                    x10 = d40Var.getLeft();
                }
                float f22 = y3;
                canvas3.translate(x10, f22);
                if (j60Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    d4Var2 = d4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    d4Var2 = d4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, d4Var.getMeasuredWidth(), d4Var.getClipHeight(), (int) (j60Var.d2 * f10), 31);
                }
                float clipHeight = (int) (((d4Var2.getClipHeight() - d4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.pr.g.getInterpolation(1.0f - j60Var.d2))) + d4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, d4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.d4 d4Var5 = d4Var2;
                d4Var5.setProgressToAvatarPreview(j60Var.b3 ? j60Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - j60Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                d4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (j60Var.e2 != null) {
                    float f23 = f22 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - j60Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (j60Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f23, j60Var.e2.getMeasuredWidth() + measuredWidth, j60Var.e2.getMeasuredHeight() + f23, (int) (j60Var.d2 * f10), 31);
                    } else {
                        canvas3.save();
                    }
                    j60Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    j60Var.e2.setTranslationY(f23 - r4.getTop());
                    float f24 = (j60Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f24, f24, (j60Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f23);
                    canvas3.translate(measuredWidth, f23);
                    j60Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (j60Var.c2.n) {
                return;
            }
            canvas3.save();
            if (j60Var.b3 && j60Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - j60Var.d2) * y14, getMeasuredWidth(), (j60Var.d2 * getMeasuredHeight()) + ((1.0f - j60Var.d2) * y15));
            }
            canvas3.scale(d40Var.getScaleX(), d40Var.getScaleY(), d40Var.getX(), d40Var.getY());
            canvas3.translate(d40Var.getX(), d40Var.getY());
            d40Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        j60 j60Var = this.D0;
        n30 n30Var = j60Var.e;
        w30 w30Var = j60Var.m2;
        p50 p50Var = j60Var.Q;
        a40 a40Var = j60Var.a2;
        if (j60Var.s2) {
            if (view == p50Var) {
                int childCount = p50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = p50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == a40Var || view == n30Var) {
                return super.drawChild(canvas, view, j3);
            }
        } else if (j60.G3 || a40Var.c != 1.0f || (view != j60Var.O && view != j60Var.g0 && view != j60Var.N && view != j60Var.e1 && view != j60Var.z1 && view != j60Var.U0)) {
            if (j60Var.F2 && view == a40Var) {
                canvas.save();
                canvas.translate(w30Var.getX() + a40Var.getX(), w30Var.getY() + a40Var.getY());
                w30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != j60Var.C2 && view != j60Var.e2 && view != j60Var.X2 && (!j60Var.l2 || !j60Var.g2 || (view != p50Var && view != n30Var && view != j60Var.c0))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0.Z.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int dp = AndroidUtilities.dp(74.0f);
        j60 j60Var = this.D0;
        ImageReceiver imageReceiver = j60Var.Z;
        Drawable drawable = j60Var.f0;
        a40 a40Var = j60Var.a2;
        float f10 = j60Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        j60Var.Q1();
        if (a40Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.j6.t0.setColor(j60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.t0);
            }
            org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) (j60Var.O.getAlpha() * 255.0f), (int) (Color.red(j60Var.V1) * 0.8f), (int) (Color.green(j60Var.V1) * 0.8f), (int) (Color.blue(j60Var.V1) * 0.8f)));
            float statusBarHeight = j60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
            u40 u40Var = j60Var.z0;
            if (u40Var != null) {
                org.telegram.ui.ActionBar.j6.t0.setColor(u40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) j60Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, j60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        if (a40Var.c != 0.0f) {
            org.telegram.ui.ActionBar.j6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), (int) (a40Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.t0);
        }
        if (j60Var.r1() && LiteMode.isEnabled(512)) {
            if (a40Var.c < 0.15d) {
                if (!j60Var.z2) {
                    j60Var.z2 = true;
                    j60Var.z1();
                }
            } else if (j60Var.z2) {
                j60Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(j60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j60 j60Var = this.D0;
        d40 d40Var = j60Var.C2;
        if (j60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = j60Var.e2.getX();
            float y10 = j60Var.e2.getY();
            float x12 = j60Var.e2.getX() + j60Var.e2.getMeasuredWidth();
            float y11 = j60Var.e2.getY() + j60Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(d40Var.getX(), d40Var.getY(), d40Var.getX() + d40Var.getMeasuredWidth(), d40Var.getY() + d40Var.getMeasuredWidth() + j60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                j60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || j60Var.y0 == 0.0f || motionEvent.getY() >= j60Var.y0 - AndroidUtilities.dp(37.0f) || j60Var.O.getAlpha() != 0.0f || j60Var.f2 || j60Var.z0 != null || j60Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        j60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        j60 j60Var = this.D0;
        if (j60Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        j60Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        j60 j60Var = this.D0;
        View view = j60Var.K2;
        View view2 = j60Var.J2;
        n30 n30Var = j60Var.e;
        a40 a40Var = j60Var.a2;
        p50 p50Var = j60Var.Q;
        if (j60.G3 && this.A0 != j60Var.I2 && this.B0) {
            f7 = p50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = j60Var.I2;
        a40Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        a40Var.s = false;
        j60.J0(j60Var);
        this.B0 = true;
        if (!z11 || p50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - p50Var.getLeft();
        p50Var.setTranslationX(left);
        n30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = p50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
        duration.setInterpolator(prVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
        n30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(prVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int b10;
        j60 j60Var = this.D0;
        k40 k40Var = j60Var.G;
        t30 t30Var = j60Var.N;
        LinearLayout linearLayout = j60Var.z1;
        f50 f50Var = j60Var.O;
        p60 p60Var = j60Var.o2;
        org.telegram.ui.Components.s20 s20Var = j60Var.p2;
        org.telegram.ui.Components.oz ozVar = j60Var.Y;
        org.telegram.ui.Components.voip.t2 t2Var = j60Var.w;
        org.telegram.ui.ActionBar.j5 j5Var = j60Var.U;
        View view = j60Var.g0;
        n30 n30Var = j60Var.e;
        View view2 = j60Var.K2;
        View view3 = j60Var.J2;
        ArrayList arrayList = j60Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = j60Var.W;
        i40 i40Var = j60Var.H;
        ArrayList arrayList2 = j60Var.Z1;
        org.telegram.ui.Components.ll0 ll0Var = j60Var.n2;
        p50 p50Var = j60Var.Q;
        a40 a40Var = j60Var.a2;
        w30 w30Var = j60Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        a40Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !j60Var.r1();
        if (j60.F3 != z11) {
            j60.F3 = z11;
            if (t2Var.getMeasuredWidth() == 0) {
                int i13 = t2Var.getLayoutParams().width;
            }
            j60.H0(j60Var);
            ozVar.y1(j60.F3 ? 6 : 2);
            p50Var.a0();
            w30Var.a0();
            this.z0 = true;
            TextView textView = j60Var.S;
            if (textView != null) {
                textView.setVisibility(!j60.F3 ? 0 : 8);
            }
            if (j60Var.q1() == z11 && j60Var.r1() && !a40Var.b && !j60Var.a1.visibleVideoParticipants.isEmpty()) {
                j60Var.e1(j60Var.a1.visibleVideoParticipants.get(0));
                a40Var.e();
            }
        }
        if (j60.G3 != z12) {
            j60.G3 = z12;
            ll0Var.setVisibility(z12 ? 0 : 8);
            p50Var.a0();
            w30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            j60Var.O0(z10);
            j60Var.P.l();
            s20Var.G(ll0Var, false);
            if (j60.G3) {
                p60Var.I(ll0Var, false);
            }
            ll0Var.setVisibility(j60.G3 ? 0 : 8);
            p60Var.H(ll0Var, j60.G3 && !a40Var.b, true);
            boolean z13 = j60.G3;
            j60Var.P2 = !z13 || a40Var.b;
            boolean z14 = !z13 && a40Var.b;
            s20Var.F(w30Var, z14);
            w30Var.setVisibility(z14 ? 0 : 8);
            p50Var.setVisibility((j60.G3 || !a40Var.b) ? 0 : 8);
            ozVar.y1(j60.F3 ? 6 : 2);
            j60Var.N1(false, false);
            p50Var.a0();
            w30Var.a0();
            AndroidUtilities.updateVisibleRows(p50Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            a40Var.setIsTablet(j60.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (j60Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
        if (j60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j60Var.j0[i15].getLayoutParams();
            if (j60.G3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (ll0Var != null) {
            ((FrameLayout.LayoutParams) ll0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (i40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) i40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(j60Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p50Var.getLayoutParams();
        if (j60.G3) {
            layoutParams3.gravity = j60Var.I2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f7 = 90.0f;
        } else {
            f7 = 90.0f;
            if (j60.F3) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                layoutParams3.rightMargin = AndroidUtilities.dp(90.0f);
                layoutParams3.leftMargin = AndroidUtilities.dp(14.0f);
                dp = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                dp = AndroidUtilities.dp(60.0f);
                layoutParams3.bottomMargin = dp2;
                layoutParams3.topMargin = AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp4 = AndroidUtilities.dp(14.0f);
                layoutParams3.leftMargin = dp4;
                layoutParams3.rightMargin = dp4;
            }
        }
        if (!j60.F3 || j60.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (j60.G3) {
                layoutParams4.gravity = j60Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (j60.G3) {
                layoutParams5.gravity = j60Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (j60.F3) {
            w30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            w30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (j60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = j60Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (j60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!j60.F3 || j60.G3) {
            ((FrameLayout.LayoutParams) f50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) t30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) f50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) t30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) w30Var.getLayoutParams();
        if (j60.F3) {
            if (((s4.c0) w30Var.getLayoutManager()).o != 1) {
                ((s4.c0) w30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((s4.c0) w30Var.getLayoutManager()).o != 0) {
                ((s4.c0) w30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        k40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) k40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (i40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) i40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (j60.G3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.w1.b(8.0f, paddingTop - max, 0);
        }
        if (p50Var.getPaddingTop() != b10 || p50Var.getPaddingBottom() != dp) {
            p50Var.setPadding(i12, b10, i12, dp);
        }
        h60 h60Var = j60Var.B1;
        if (h60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) h60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = j60.I0(j60Var);
            if (I0 != null) {
                int measuredHeight = ((n30Var.getMeasuredHeight() / 2) + n30Var.getTop()) - (j60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = i2.g.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        y50 y50Var = j60Var.U0;
        if (y50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) y50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = j60.I0(j60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (j5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) j5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) j60Var.V.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    j5Var.setVisibility(0);
                    j5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            j5Var.setVisibility(4);
            j5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(a40Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            j60Var.d1(false);
        }
        j60Var.r2.f = getMeasuredWidth();
        j60Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.D0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.D0.Q1();
    }
}
