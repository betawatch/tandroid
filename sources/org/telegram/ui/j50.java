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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.Components.qv0 {
    public final /* synthetic */ e60 A0;
    public boolean t0;
    public final RectF u0;
    public int v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public final HashMap z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.A0 = e60Var;
        this.t0 = false;
        this.u0 = new RectF();
        this.z0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.d4 d4Var;
        float f11;
        float y10;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.d4 d4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z4;
        float x11;
        float f12;
        float f13;
        float f14;
        int i10;
        Shader.TileMode tileMode;
        e60 e60Var = this.A0;
        c60 c60Var = e60Var.y1;
        View view = e60Var.H2;
        View view2 = e60Var.G2;
        ArrayList arrayList2 = e60Var.V1;
        yg.h hVar = e60Var.Z;
        Paint paint = e60Var.z0;
        t30 t30Var = e60Var.j2;
        a40 a40Var = e60Var.z2;
        x30 x30Var = e60Var.X1;
        l50 l50Var = e60Var.N;
        if (!e60Var.p2 && !e60Var.C2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (e60Var.N2 == null) {
                    e60Var.N2 = new RenderNode("CallActivity.Blur");
                    e60Var.O2 = org.telegram.ui.Components.qv0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.qv0.getBlurRadius();
                    RenderNode renderNode = e60Var.N2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = e60Var.N2;
                    float f15 = e60Var.O2;
                    hVar.T0 = renderNode2;
                    hVar.U0 = f15;
                }
                int round = Math.round(getMeasuredWidth() / e60Var.O2);
                int round2 = Math.round(getMeasuredHeight() / e60Var.O2);
                e60Var.p2 = true;
                e60Var.N2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = e60Var.N2.beginRecording();
                float f16 = 1.0f / e60Var.O2;
                beginRecording.scale(f16, f16);
                dispatchDraw(beginRecording);
                e60Var.N2.endRecording();
                e60Var.p2 = false;
            }
        }
        for (int i11 = 0; i11 < l50Var.getChildCount(); i11++) {
            View childAt = l50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.d4) {
                ((org.telegram.ui.Cells.d4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != l50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((l50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (x30Var.r == null) {
            for (int i12 = 0; i12 < t30Var.getChildCount(); i12++) {
                ((org.telegram.ui.Components.t20) t30Var.getChildAt(i12)).setProgressToFullscreen(1.0f);
            }
        } else if (t30Var.getVisibility() == 0) {
            HashMap hashMap = this.z0;
            hashMap.clear();
            int i13 = 0;
            while (i13 < l50Var.getChildCount()) {
                View childAt2 = l50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        l50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != x30Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.d4) {
                        l50Var.getClass();
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
            while (i14 < t30Var.getChildCount()) {
                org.telegram.ui.Components.t20 t20Var = (org.telegram.ui.Components.t20) t30Var.getChildAt(i14);
                View view3 = (View) hashMap.get(t20Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(t20Var.getParticipant());
                }
                float f17 = x30Var.c;
                HashMap hashMap2 = hashMap;
                if (!e60Var.K2.k()) {
                    t20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (l50Var.getX() + lVar3.getLeft()) - x30Var.getLeft();
                        f12 = (l50Var.getY() + lVar3.getTop()) - x30Var.getTop();
                        f13 = t30Var.getX() + t20Var.getLeft();
                        f14 = t30Var.getY() + t20Var.getTop();
                    } else {
                        x11 = ((l50Var.getX() + r14.getLeft()) - x30Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y11 = ((l50Var.getY() + r14.getTop()) - x30Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = t30Var.getX() + t20Var.getLeft() + (t20Var.getMeasuredWidth() >> 1);
                        float y12 = t30Var.getY() + t20Var.getTop() + (t20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.d4) view3).setDrawAvatar(false);
                        f12 = y11;
                        f13 = x12;
                        f14 = y12;
                    }
                    float f18 = 1.0f - f17;
                    t20Var.setTranslationX((x11 - f13) * f18);
                    t20Var.setTranslationY((f12 - f14) * f18);
                    t20Var.setScaleX(1.0f);
                    t20Var.setScaleY(1.0f);
                    t20Var.setProgressToFullscreen(f17);
                } else {
                    t20Var.setScaleX(1.0f);
                    t20Var.setScaleY(1.0f);
                    t20Var.setTranslationX(0.0f);
                    t20Var.setTranslationY(0.0f);
                    t20Var.setProgressToFullscreen(1.0f);
                    if (t20Var.getRenderer() == null) {
                        t20Var.setAlpha(f17);
                    }
                }
                i14++;
                hashMap = hashMap2;
            }
        }
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList2.get(i15);
            org.telegram.ui.Components.rl0 rl0Var = e60Var.k2;
            org.telegram.ui.Components.voip.o oVar = tVar.a;
            if (tVar.h || tVar.f || tVar.M) {
                arrayList = arrayList2;
            } else {
                tVar.v0 = false;
                float f19 = x30Var.c;
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
                            rl0Var = l50Var;
                        }
                        float x13 = ((rl0Var.getX() + lVar5.getX()) - tVar.getLeft()) - x30Var.getLeft();
                        float y13 = ((rl0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - x30Var.getTop();
                        float f20 = 1.0f - f19;
                        float f21 = f19 * 0.0f;
                        tVar.setTranslationX((x13 * f20) + f21);
                        tVar.setTranslationY((y13 * f20) + f21);
                    }
                    oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.t20 t20Var2 = tVar.d;
                    if (t20Var2 != null) {
                        t20Var2.setAlpha(f19);
                    }
                    if (!tVar.b && tVar.c == null && tVar.e == null) {
                        tVar.setAlpha(f19);
                    } else if (!tVar.B) {
                        tVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.t20 t20Var3 = tVar.d;
                    if (t20Var3 != null) {
                        t30Var.getClass();
                        if (RecyclerView.R(t20Var3) == -1) {
                            tVar.setAlpha(tVar.d.getAlpha());
                        } else if (tVar.c == null) {
                            if (tVar.v && !tVar.B) {
                                tVar.setAlpha(f19);
                            }
                            tVar.d.setAlpha(f19);
                            f19 = 1.0f;
                        } else {
                            tVar.d.setAlpha(1.0f);
                            if (tVar.v && !tVar.B) {
                                tVar.setAlpha(1.0f);
                            }
                        }
                        tVar.setTranslationX((t30Var.getX() + tVar.d.getX()) - tVar.getLeft());
                        float f22 = 1.0f - f19;
                        tVar.setTranslationY((t30Var.getY() + (tVar.d.getY() + (AndroidUtilities.dp(2.0f) * f22))) - tVar.getTop());
                        oVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f22) + (AndroidUtilities.dp(13.0f) * f19));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = tVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || tVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = tVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    rl0Var = l50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (e60.D3) {
                                    lVar = lVar9;
                                    if (!tVar.x.b) {
                                        z4 = true;
                                        if (z4) {
                                            lVar8 = lVar;
                                        }
                                        if (!z4) {
                                            rl0Var = l50Var;
                                        }
                                    }
                                } else {
                                    lVar = lVar9;
                                }
                                z4 = false;
                                if (z4) {
                                }
                                if (!z4) {
                                }
                            }
                            tVar.setTranslationX(((rl0Var.getX() + lVar8.getX()) - tVar.getLeft()) - x30Var.getLeft());
                            tVar.setTranslationY(((rl0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - tVar.getTop()) - x30Var.getTop());
                            oVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (tVar.v && !tVar.B) {
                                if (!e60.D3) {
                                    tVar.v0 = true;
                                    tVar.setAlpha(lVar8.getAlpha() * (1.0f - f19));
                                } else if (tVar.c != null && tVar.e == null) {
                                    tVar.setAlpha(lVar8.getAlpha() * f19);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (e60.D3) {
            f10 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f10 = 1.0f;
            view2.setAlpha(1.0f - x30Var.c);
            view.setAlpha(1.0f - x30Var.c);
        }
        if (x30Var.I0) {
            l50Var.setAlpha(f10 - x30Var.c);
        } else {
            l50Var.setAlpha(f10);
        }
        if (c60Var != null) {
            c60Var.setAlpha(f10 - x30Var.c);
            c60Var.setTranslationY(x30Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (e60Var.C2) {
            return;
        }
        boolean z10 = e60Var.c2;
        RectF rectF = this.u0;
        if (!z10) {
            if (e60Var.U2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), e60Var.T2);
                float y14 = l50Var.getY();
                l50Var.getY();
                l50Var.getMeasuredHeight();
                if (!e60Var.Y2) {
                    if (e60Var.X2 == null) {
                        org.telegram.ui.Components.voip.t tVar2 = e60Var.W2;
                        if (tVar2 == null || !tVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(x30Var.getX() + e60Var.W2.getX(), x30Var.getY() + e60Var.W2.getY());
                        e60Var.W2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(x30Var.getX() + t30Var.getX() + e60Var.X2.getX(), x30Var.getY() + t30Var.getY() + e60Var.X2.getY());
                    if (e60Var.X2.getRenderer() == null || !e60Var.X2.getRenderer().v || e60Var.X2.getRenderer().b) {
                        e60Var.X2.draw(canvas);
                    } else {
                        e60Var.X2.getRenderer().draw(canvas);
                    }
                    e60Var.X2.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = l50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = l50Var.getChildAt(i16);
                    if (childAt3 == e60Var.U2) {
                        float max = Math.max(l50Var.getLeft(), childAt3.getX() + l50Var.getLeft());
                        float max2 = Math.max(y14, childAt3.getY() + l50Var.getY());
                        float min = Math.min(l50Var.getRight(), childAt3.getX() + l50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(l50Var.getY() + l50Var.getMeasuredHeight(), childAt3.getY() + l50Var.getY() + e60Var.U2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + l50Var.getLeft(), childAt3.getY() + l50Var.getY());
                            float alpha = e60Var.T2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((e60Var.U2.getClipHeight() - e60Var.U2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.mr.g.getInterpolation(1.0f - alpha))) + e60Var.U2.getMeasuredHeight()));
                            org.telegram.ui.Cells.d4 d4Var4 = e60Var.U2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.k5[] k5VarArr = d4Var4.d;
                            if (TextUtils.isEmpty(k5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            k5VarArr[4].setFullAlpha(alpha);
                            k5VarArr[4].h(0, 0);
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
        if (e60Var.U2 != null) {
            if (e60Var.d2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), e60Var.T2);
            }
            float y15 = l50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = l50Var.getChildCount();
            float y16 = l50Var.getY() + l50Var.getMeasuredHeight();
            if (e60Var.Y2) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        d4Var = null;
                        break;
                    }
                    View childAt4 = l50Var.getChildAt(i17);
                    d4Var = e60Var.U2;
                    if (childAt4 == d4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                d4Var = e60Var.U2;
            }
            if (d4Var != null && y15 < y16) {
                canvas3.save();
                if (e60Var.X2 == null) {
                    f11 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - e60Var.a2) * y15, getMeasuredWidth(), (getMeasuredHeight() * e60Var.a2) + ((1.0f - e60Var.a2) * y16));
                } else {
                    f11 = 255.0f;
                }
                if (e60Var.Y2) {
                    y10 = ((1.0f - e60Var.a2) * (d4Var.getY() + l50Var.getY())) + ((a40Var.getMeasuredWidth() + a40Var.getTop()) * e60Var.a2);
                    x10 = ((1.0f - e60Var.a2) * (d4Var.getX() + l50Var.getLeft())) + (e60Var.a2 * a40Var.getLeft());
                } else {
                    y10 = a40Var.getMeasuredWidth() + a40Var.getTop();
                    x10 = a40Var.getLeft();
                }
                float f23 = y10;
                canvas3.translate(x10, f23);
                if (e60Var.Y2) {
                    fArr = fArr2;
                    path = path2;
                    d4Var2 = d4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    d4Var2 = d4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, d4Var.getMeasuredWidth(), d4Var.getClipHeight(), (int) (e60Var.a2 * f11), 31);
                }
                float clipHeight = (int) (((d4Var2.getClipHeight() - d4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.mr.g.getInterpolation(1.0f - e60Var.a2))) + d4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, d4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.d4 d4Var5 = d4Var2;
                d4Var5.setProgressToAvatarPreview(e60Var.Y2 ? e60Var.a2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - e60Var.a2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                d4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (e60Var.b2 != null) {
                    float f24 = f23 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - e60Var.b2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (e60Var.a2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f24, e60Var.b2.getMeasuredWidth() + measuredWidth, e60Var.b2.getMeasuredHeight() + f24, (int) (e60Var.a2 * f11), 31);
                    } else {
                        canvas3.save();
                    }
                    e60Var.b2.setTranslationX(measuredWidth - r4.getLeft());
                    e60Var.b2.setTranslationY(f24 - r4.getTop());
                    float f25 = (e60Var.a2 * 0.2f) + 0.8f;
                    canvas3.scale(f25, f25, (e60Var.b2.getMeasuredWidth() / 2.0f) + measuredWidth, f24);
                    canvas3.translate(measuredWidth, f24);
                    e60Var.b2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (e60Var.Z1.n) {
                return;
            }
            canvas3.save();
            if (e60Var.Y2 && e60Var.X2 == null) {
                canvas3.clipRect(0.0f, (1.0f - e60Var.a2) * y15, getMeasuredWidth(), (e60Var.a2 * getMeasuredHeight()) + ((1.0f - e60Var.a2) * y16));
            }
            canvas3.scale(a40Var.getScaleX(), a40Var.getScaleY(), a40Var.getX(), a40Var.getY());
            canvas3.translate(a40Var.getX(), a40Var.getY());
            a40Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        e60 e60Var = this.A0;
        k30 k30Var = e60Var.e;
        t30 t30Var = e60Var.j2;
        l50 l50Var = e60Var.N;
        x30 x30Var = e60Var.X1;
        if (e60Var.p2) {
            if (view == l50Var) {
                int childCount = l50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = l50Var.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == x30Var || view == k30Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (e60.D3 || x30Var.c != 1.0f || (view != e60Var.L && view != e60Var.d0 && view != e60Var.K && view != e60Var.b1 && view != e60Var.w1 && view != e60Var.R0)) {
            if (e60Var.C2 && view == x30Var) {
                canvas.save();
                canvas.translate(t30Var.getX() + x30Var.getX(), t30Var.getY() + x30Var.getY());
                t30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != e60Var.z2 && view != e60Var.b2 && view != e60Var.U2 && (!e60Var.i2 || !e60Var.d2 || (view != l50Var && view != k30Var && view != e60Var.Z))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0.W.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0.W.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
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
        e60 e60Var = this.A0;
        ImageReceiver imageReceiver = e60Var.W;
        Drawable drawable = e60Var.c0;
        x30 x30Var = e60Var.X1;
        float f11 = e60Var.v0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
        if (i11 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        e60Var.Q1();
        if (x30Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.j6.t0.setColor(e60Var.S1);
                i16 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
                float f12 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                float f13 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.u0;
                rectF.set(i16, f12, f13, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.j6.t0);
            }
            org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) (e60Var.L.getAlpha() * 255.0f), (int) (Color.red(e60Var.S1) * 0.8f), (int) (Color.green(e60Var.S1) * 0.8f), (int) (Color.blue(e60Var.S1) * 0.8f)));
            float statusBarHeight = e60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
            r40 r40Var = e60Var.w0;
            if (r40Var != null) {
                org.telegram.ui.ActionBar.j6.t0.setColor(r40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                float f14 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingLeft;
                canvas.drawRect(f14, 0.0f, measuredWidth3 - i15, e60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        if (x30Var.c != 0.0f) {
            org.telegram.ui.ActionBar.j6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gg, false), (int) (x30Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.t0);
        }
        if (e60Var.r1() && LiteMode.isEnabled(512)) {
            if (x30Var.c < 0.15d) {
                if (!e60Var.w2) {
                    e60Var.w2 = true;
                    e60Var.z1();
                }
            } else if (e60Var.w2) {
                e60Var.w2 = false;
                AndroidUtilities.cancelRunOnUIThread(e60Var.x2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e60 e60Var = this.A0;
        a40 a40Var = e60Var.z2;
        if (e60Var.U2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float x11 = e60Var.b2.getX();
            float y11 = e60Var.b2.getY();
            float x12 = e60Var.b2.getX() + e60Var.b2.getMeasuredWidth();
            float y12 = e60Var.b2.getY() + e60Var.b2.getMeasuredHeight();
            RectF rectF = this.u0;
            rectF.set(x11, y11, x12, y12);
            boolean z4 = !rectF.contains(x10, y10);
            rectF.set(a40Var.getX(), a40Var.getY(), a40Var.getX() + a40Var.getMeasuredWidth(), a40Var.getY() + a40Var.getMeasuredWidth() + e60Var.U2.getMeasuredHeight());
            if (rectF.contains(x10, y10)) {
                z4 = false;
            }
            if (z4) {
                e60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || e60Var.v0 == 0.0f || motionEvent.getY() >= e60Var.v0 - AndroidUtilities.dp(37.0f) || e60Var.L.getAlpha() != 0.0f || e60Var.c2 || e60Var.w0 != null || e60Var.X1.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        e60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        e60 e60Var = this.A0;
        if (e60Var.U2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        e60Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float f10;
        boolean z10;
        e60 e60Var = this.A0;
        View view = e60Var.H2;
        View view2 = e60Var.G2;
        k30 k30Var = e60Var.e;
        x30 x30Var = e60Var.X1;
        l50 l50Var = e60Var.N;
        if (e60.D3 && this.x0 != e60Var.F2 && this.y0) {
            f10 = l50Var.getX();
            z10 = true;
        } else {
            f10 = 0.0f;
            z10 = false;
        }
        this.x0 = e60Var.F2;
        x30Var.s = true;
        super.onLayout(z4, i10, i11, i12, i13);
        x30Var.s = false;
        e60.J0(e60Var);
        this.y0 = true;
        if (!z10 || l50Var.getLeft() == f10) {
            return;
        }
        float left = f10 - l50Var.getLeft();
        l50Var.setTranslationX(left);
        k30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = l50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
        duration.setInterpolator(mrVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(mrVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(mrVar).start();
        k30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(mrVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        float f10;
        int dp;
        float f11;
        int i12;
        int b10;
        e60 e60Var = this.A0;
        h40 h40Var = e60Var.D;
        q30 q30Var = e60Var.K;
        LinearLayout linearLayout = e60Var.w1;
        b50 b50Var = e60Var.L;
        k60 k60Var = e60Var.l2;
        org.telegram.ui.Components.u20 u20Var = e60Var.m2;
        org.telegram.ui.Components.oz ozVar = e60Var.V;
        org.telegram.ui.Components.voip.v2 v2Var = e60Var.w;
        org.telegram.ui.ActionBar.k5 k5Var = e60Var.R;
        View view = e60Var.d0;
        k30 k30Var = e60Var.e;
        View view2 = e60Var.H2;
        View view3 = e60Var.G2;
        ArrayList arrayList = e60Var.V1;
        org.telegram.ui.ActionBar.k5 k5Var2 = e60Var.T;
        f40 f40Var = e60Var.E;
        ArrayList arrayList2 = e60Var.W1;
        org.telegram.ui.Components.rl0 rl0Var = e60Var.k2;
        l50 l50Var = e60Var.N;
        x30 x30Var = e60Var.X1;
        t30 t30Var = e60Var.j2;
        int size = View.MeasureSpec.getSize(i11);
        this.t0 = true;
        boolean z10 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        x30Var.getClass();
        boolean z11 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !e60Var.r1();
        if (e60.C3 != z10) {
            e60.C3 = z10;
            if (v2Var.getMeasuredWidth() == 0) {
                int i13 = v2Var.getLayoutParams().width;
            }
            e60.H0(e60Var);
            ozVar.y1(e60.C3 ? 6 : 2);
            l50Var.a0();
            t30Var.a0();
            this.w0 = true;
            TextView textView = e60Var.P;
            if (textView != null) {
                textView.setVisibility(!e60.C3 ? 0 : 8);
            }
            if (e60Var.q1() == z10 && e60Var.r1() && !x30Var.b && !e60Var.X0.visibleVideoParticipants.isEmpty()) {
                e60Var.e1(e60Var.X0.visibleVideoParticipants.get(0));
                x30Var.e();
            }
        }
        if (e60.D3 != z11) {
            e60.D3 = z11;
            rl0Var.setVisibility(z11 ? 0 : 8);
            l50Var.a0();
            t30Var.a0();
            z4 = true;
            this.w0 = true;
        } else {
            z4 = true;
        }
        if (this.w0) {
            e60Var.O0(z4);
            e60Var.M.l();
            u20Var.G(rl0Var, false);
            if (e60.D3) {
                k60Var.I(rl0Var, false);
            }
            rl0Var.setVisibility(e60.D3 ? 0 : 8);
            k60Var.H(rl0Var, e60.D3 && !x30Var.b, true);
            boolean z12 = e60.D3;
            e60Var.M2 = !z12 || x30Var.b;
            boolean z13 = !z12 && x30Var.b;
            u20Var.F(t30Var, z13);
            t30Var.setVisibility(z13 ? 0 : 8);
            l50Var.setVisibility((e60.D3 || !x30Var.b) ? 0 : 8);
            ozVar.y1(e60.C3 ? 6 : 2);
            e60Var.N1(false, false);
            l50Var.a0();
            t30Var.a0();
            AndroidUtilities.updateVisibleRows(l50Var);
            this.w0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            x30Var.setIsTablet(e60.D3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (e60Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x30Var.getLayoutParams();
        if (e60.D3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e60Var.g0[i15].getLayoutParams();
            if (e60.D3) {
                layoutParams2.rightMargin = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams2.rightMargin = AndroidUtilities.dp(8.0f);
            }
        }
        if (rl0Var != null) {
            ((FrameLayout.LayoutParams) rl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (f40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f40Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int dp2 = AndroidUtilities.dp(e60Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l50Var.getLayoutParams();
        if (e60.D3) {
            layoutParams3.gravity = e60Var.F2 ? 5 : 1;
            layoutParams3.width = AndroidUtilities.dp(320.0f);
            int dp3 = AndroidUtilities.dp(4.0f);
            layoutParams3.leftMargin = dp3;
            layoutParams3.rightMargin = dp3;
            layoutParams3.bottomMargin = dp2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            dp = AndroidUtilities.dp(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (e60.C3) {
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
        if (!e60.C3 || e60.D3) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (e60.D3) {
                layoutParams4.gravity = e60Var.F2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (e60.D3) {
                layoutParams5.gravity = e60Var.F2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (e60.C3) {
            t30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            t30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) k30Var.getLayoutParams();
        if (e60.D3) {
            layoutParams6.width = AndroidUtilities.dp(f11);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = e60Var.F2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (e60.C3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!e60.C3 || e60.D3) {
            ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) q30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) q30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) t30Var.getLayoutParams();
        if (e60.C3) {
            if (((f2.i0) t30Var.getLayoutManager()).o != 1) {
                ((f2.i0) t30Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = AndroidUtilities.dp(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = AndroidUtilities.dp(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((f2.i0) t30Var.getLayoutManager()).o != 0) {
                ((f2.i0) t30Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = AndroidUtilities.dp(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = AndroidUtilities.dp(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        h40Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) h40Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (f40Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) f40Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(AndroidUtilities.dp(259.0f), (paddingTop / 5) * 3);
        if (e60.D3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.y3.b(8.0f, paddingTop - max, 0);
        }
        if (l50Var.getPaddingTop() != b10 || l50Var.getPaddingBottom() != dp) {
            l50Var.setPadding(i12, b10, i12, dp);
        }
        c60 c60Var = e60Var.y1;
        if (c60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) c60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = e60.I0(e60Var);
            if (I0 != null) {
                int measuredHeight = ((k30Var.getMeasuredHeight() / 2) + k30Var.getTop()) - (e60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = kf.k0.d(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        t50 t50Var = e60Var.R0;
        if (t50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) t50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = e60.I0(e60Var);
            if (I02 != null) {
                layoutParams10.height = I02.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                layoutParams10.width = I02.getMeasuredWidth() - AndroidUtilities.dp(7.0f);
                int dp5 = AndroidUtilities.dp(16.0f);
                layoutParams10.leftMargin = dp5;
                layoutParams10.rightMargin = dp5;
            }
        }
        if (k5Var2 != null) {
            int dp6 = ((AndroidUtilities.dp(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) k5Var.getLayoutParams();
            layoutParams11.topMargin = dp6 - AndroidUtilities.dp(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) k5Var2.getLayoutParams();
            layoutParams12.topMargin = AndroidUtilities.dp(80.0f) + dp6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) e60Var.S.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (AndroidUtilities.dp(20.0f) + layoutParams12.topMargin <= size - AndroidUtilities.dp(231.0f)) {
                    k5Var.setVisibility(0);
                    k5Var2.setVisibility(0);
                    layoutParams13.topMargin = dp6;
                }
            }
            k5Var.setVisibility(4);
            k5Var2.setVisibility(4);
            layoutParams13.topMargin = dp6 - AndroidUtilities.dp(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i16)).g(x30Var.b, true);
        }
        this.t0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.v0) {
            this.v0 = measuredHeight3;
            e60Var.d1(false);
        }
        e60Var.o2.f = getMeasuredWidth();
        e60Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.A0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.A0.Q1();
    }
}
