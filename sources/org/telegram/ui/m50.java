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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.Components.pv0 {
    public boolean A0;
    public boolean B0;
    public final HashMap C0;
    public final /* synthetic */ i60 D0;
    public boolean w0;
    public final RectF x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.D0 = i60Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.C0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a1  */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.e4 e4Var;
        float f10;
        float y3;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.e4 e4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.l lVar;
        boolean z10;
        float x11;
        float f11;
        float f12;
        float f13;
        int i10;
        Shader.TileMode tileMode;
        i60 i60Var = this.D0;
        g60 g60Var = i60Var.B1;
        View view = i60Var.K2;
        View view2 = i60Var.J2;
        ArrayList arrayList2 = i60Var.Y1;
        lh.h hVar = i60Var.c0;
        Paint paint = i60Var.C0;
        w30 w30Var = i60Var.m2;
        d40 d40Var = i60Var.C2;
        a40 a40Var = i60Var.a2;
        o50 o50Var = i60Var.Q;
        if (!i60Var.s2 && !i60Var.F2) {
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
                if (i60Var.Q2 == null) {
                    i60Var.Q2 = new RenderNode("CallActivity.Blur");
                    i60Var.R2 = org.telegram.ui.Components.pv0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.pv0.getBlurRadius();
                    RenderNode renderNode = i60Var.Q2;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = i60Var.Q2;
                    float f14 = i60Var.R2;
                    hVar.W0 = renderNode2;
                    hVar.X0 = f14;
                }
                int round = Math.round(getMeasuredWidth() / i60Var.R2);
                int round2 = Math.round(getMeasuredHeight() / i60Var.R2);
                i60Var.s2 = true;
                i60Var.Q2.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = i60Var.Q2.beginRecording();
                float f15 = 1.0f / i60Var.R2;
                beginRecording.scale(f15, f15);
                dispatchDraw(beginRecording);
                i60Var.Q2.endRecording();
                i60Var.s2 = false;
            }
        }
        for (int i11 = 0; i11 < o50Var.getChildCount(); i11++) {
            View childAt = o50Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.e4) {
                ((org.telegram.ui.Cells.e4) childAt).setDrawAvatar(true);
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.l)) {
                if (childAt.getMeasuredWidth() != o50Var.getMeasuredWidth()) {
                    childAt.setTranslationX((o50Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
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
            while (i13 < o50Var.getChildCount()) {
                View childAt2 = o50Var.getChildAt(i13);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.l) {
                        o50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) childAt2;
                            i10 = i13;
                            if (lVar2.getRenderer() != a40Var.y) {
                                hashMap.put(lVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i10 = i13;
                    if (childAt2 instanceof org.telegram.ui.Cells.e4) {
                        o50Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.e4 e4Var3 = (org.telegram.ui.Cells.e4) childAt2;
                            hashMap.put(e4Var3.getParticipant(), e4Var3);
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
                if (!i60Var.N2.k()) {
                    r20Var.setAlpha(1.0f);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.l) {
                        org.telegram.ui.Components.voip.l lVar3 = (org.telegram.ui.Components.voip.l) view3;
                        x11 = (o50Var.getX() + lVar3.getLeft()) - a40Var.getLeft();
                        f11 = (o50Var.getY() + lVar3.getTop()) - a40Var.getTop();
                        f12 = w30Var.getX() + r20Var.getLeft();
                        f13 = w30Var.getY() + r20Var.getTop();
                    } else {
                        x11 = ((o50Var.getX() + r14.getLeft()) - a40Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((o50Var.getY() + r14.getTop()) - a40Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = w30Var.getX() + r20Var.getLeft() + (r20Var.getMeasuredWidth() >> 1);
                        float y11 = w30Var.getY() + r20Var.getTop() + (r20Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.e4) view3).setDrawAvatar(false);
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
            org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList2.get(i15);
            org.telegram.ui.Components.ll0 ll0Var = i60Var.n2;
            org.telegram.ui.Components.voip.p pVar = uVar.a;
            if (uVar.h || uVar.f || uVar.P) {
                arrayList = arrayList2;
            } else {
                uVar.y0 = false;
                float f18 = a40Var.c;
                arrayList = arrayList2;
                if (uVar.r || uVar.b) {
                    org.telegram.ui.Components.voip.l lVar4 = uVar.c;
                    org.telegram.ui.Components.voip.l lVar5 = lVar4;
                    if (lVar4 == null && uVar.e == null) {
                        uVar.setTranslationX(0.0f);
                        uVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.l lVar6 = uVar.e;
                        if (lVar6 != null) {
                            lVar5 = lVar6;
                        }
                        if (lVar6 == null) {
                            ll0Var = o50Var;
                        }
                        float x13 = ((ll0Var.getX() + lVar5.getX()) - uVar.getLeft()) - a40Var.getLeft();
                        float y12 = ((ll0Var.getY() + (lVar5.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - a40Var.getTop();
                        float f19 = 1.0f - f18;
                        float f20 = f18 * 0.0f;
                        uVar.setTranslationX((x13 * f19) + f20);
                        uVar.setTranslationY((y12 * f19) + f20);
                    }
                    pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                    org.telegram.ui.Components.r20 r20Var2 = uVar.d;
                    if (r20Var2 != null) {
                        r20Var2.setAlpha(f18);
                    }
                    if (!uVar.b && uVar.c == null && uVar.e == null) {
                        uVar.setAlpha(f18);
                    } else if (!uVar.E) {
                        uVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.r20 r20Var3 = uVar.d;
                    if (r20Var3 != null) {
                        w30Var.getClass();
                        if (RecyclerView.R(r20Var3) == -1) {
                            uVar.setAlpha(uVar.d.getAlpha());
                        } else if (uVar.c == null) {
                            if (uVar.v && !uVar.E) {
                                uVar.setAlpha(f18);
                            }
                            uVar.d.setAlpha(f18);
                            f18 = 1.0f;
                        } else {
                            uVar.d.setAlpha(1.0f);
                            if (uVar.v && !uVar.E) {
                                uVar.setAlpha(1.0f);
                            }
                        }
                        uVar.setTranslationX((w30Var.getX() + uVar.d.getX()) - uVar.getLeft());
                        float f21 = 1.0f - f18;
                        uVar.setTranslationY((w30Var.getY() + (uVar.d.getY() + (AndroidUtilities.dp(2.0f) * f21))) - uVar.getTop());
                        pVar.setRoundCorners((AndroidUtilities.dp(8.0f) * f21) + (AndroidUtilities.dp(13.0f) * f18));
                    } else {
                        org.telegram.ui.Components.voip.l lVar7 = uVar.c;
                        org.telegram.ui.Components.voip.l lVar8 = lVar7;
                        if (lVar7 != null || uVar.e != null) {
                            org.telegram.ui.Components.voip.l lVar9 = uVar.e;
                            if (lVar9 == null || lVar8 == null) {
                                org.telegram.ui.Components.voip.l lVar10 = lVar9 != null ? lVar9 : lVar8;
                                if (lVar9 == null) {
                                    ll0Var = o50Var;
                                }
                                lVar8 = lVar10;
                            } else {
                                if (i60.G3) {
                                    lVar = lVar9;
                                    if (!uVar.x.b) {
                                        z10 = true;
                                        if (z10) {
                                            lVar8 = lVar;
                                        }
                                        if (!z10) {
                                            ll0Var = o50Var;
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
                            uVar.setTranslationX(((ll0Var.getX() + lVar8.getX()) - uVar.getLeft()) - a40Var.getLeft());
                            uVar.setTranslationY(((ll0Var.getY() + (lVar8.getY() + AndroidUtilities.dp(2.0f))) - uVar.getTop()) - a40Var.getTop());
                            pVar.setRoundCorners(AndroidUtilities.dp(8.0f));
                            if (uVar.v && !uVar.E) {
                                if (!i60.G3) {
                                    uVar.y0 = true;
                                    uVar.setAlpha(lVar8.getAlpha() * (1.0f - f18));
                                } else if (uVar.c != null && uVar.e == null) {
                                    uVar.setAlpha(lVar8.getAlpha() * f18);
                                }
                            }
                        }
                    }
                }
            }
            i15++;
            arrayList2 = arrayList;
        }
        if (i60.G3) {
            f7 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f7 = 1.0f;
            view2.setAlpha(1.0f - a40Var.c);
            view.setAlpha(1.0f - a40Var.c);
        }
        if (a40Var.L0) {
            o50Var.setAlpha(f7 - a40Var.c);
        } else {
            o50Var.setAlpha(f7);
        }
        if (g60Var != null) {
            g60Var.setAlpha(f7 - a40Var.c);
            g60Var.setTranslationY(a40Var.c * AndroidUtilities.dp(64.0f));
        }
        super.dispatchDraw(canvas);
        if (i60Var.F2) {
            return;
        }
        boolean z11 = i60Var.f2;
        RectF rectF = this.x0;
        if (!z11) {
            if (i60Var.X2 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), i60Var.W2);
                float y13 = o50Var.getY();
                o50Var.getY();
                o50Var.getMeasuredHeight();
                if (!i60Var.b3) {
                    if (i60Var.a3 == null) {
                        org.telegram.ui.Components.voip.u uVar2 = i60Var.Z2;
                        if (uVar2 == null || !uVar2.v) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(a40Var.getX() + i60Var.Z2.getX(), a40Var.getY() + i60Var.Z2.getY());
                        i60Var.Z2.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(a40Var.getX() + w30Var.getX() + i60Var.a3.getX(), a40Var.getY() + w30Var.getY() + i60Var.a3.getY());
                    if (i60Var.a3.getRenderer() == null || !i60Var.a3.getRenderer().v || i60Var.a3.getRenderer().b) {
                        i60Var.a3.draw(canvas);
                    } else {
                        i60Var.a3.getRenderer().draw(canvas);
                    }
                    i60Var.a3.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = o50Var.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt3 = o50Var.getChildAt(i16);
                    if (childAt3 == i60Var.X2) {
                        float max = Math.max(o50Var.getLeft(), childAt3.getX() + o50Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + o50Var.getY());
                        float min = Math.min(o50Var.getRight(), childAt3.getX() + o50Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(o50Var.getY() + o50Var.getMeasuredHeight(), childAt3.getY() + o50Var.getY() + i60Var.X2.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + o50Var.getLeft(), childAt3.getY() + o50Var.getY());
                            float alpha = i60Var.W2.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((i60Var.X2.getClipHeight() - i60Var.X2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.qr.g.getInterpolation(1.0f - alpha))) + i60Var.X2.getMeasuredHeight()));
                            org.telegram.ui.Cells.e4 e4Var4 = i60Var.X2;
                            paint.getColor();
                            org.telegram.ui.ActionBar.j5[] j5VarArr = e4Var4.d;
                            if (TextUtils.isEmpty(j5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            j5VarArr[4].setFullAlpha(alpha);
                            j5VarArr[4].h(0, 0);
                            e4Var4.invalidate();
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
        if (i60Var.X2 != null) {
            if (i60Var.g2) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), i60Var.W2);
            }
            float y14 = o50Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = o50Var.getChildCount();
            float y15 = o50Var.getY() + o50Var.getMeasuredHeight();
            if (i60Var.b3) {
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount2) {
                        e4Var = null;
                        break;
                    }
                    View childAt4 = o50Var.getChildAt(i17);
                    e4Var = i60Var.X2;
                    if (childAt4 == e4Var) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                e4Var = i60Var.X2;
            }
            if (e4Var != null && y14 < y15) {
                canvas3.save();
                if (i60Var.a3 == null) {
                    f10 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - i60Var.d2) * y14, getMeasuredWidth(), (getMeasuredHeight() * i60Var.d2) + ((1.0f - i60Var.d2) * y15));
                } else {
                    f10 = 255.0f;
                }
                if (i60Var.b3) {
                    y3 = ((1.0f - i60Var.d2) * (e4Var.getY() + o50Var.getY())) + ((d40Var.getMeasuredWidth() + d40Var.getTop()) * i60Var.d2);
                    x10 = ((1.0f - i60Var.d2) * (e4Var.getX() + o50Var.getLeft())) + (i60Var.d2 * d40Var.getLeft());
                } else {
                    y3 = d40Var.getMeasuredWidth() + d40Var.getTop();
                    x10 = d40Var.getLeft();
                }
                float f22 = y3;
                canvas3.translate(x10, f22);
                if (i60Var.b3) {
                    fArr = fArr2;
                    path = path2;
                    e4Var2 = e4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    e4Var2 = e4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, e4Var.getMeasuredWidth(), e4Var.getClipHeight(), (int) (i60Var.d2 * f10), 31);
                }
                float clipHeight = (int) (((e4Var2.getClipHeight() - e4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.qr.g.getInterpolation(1.0f - i60Var.d2))) + e4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, e4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.e4 e4Var5 = e4Var2;
                e4Var5.setProgressToAvatarPreview(i60Var.b3 ? i60Var.d2 : 1.0f);
                for (int i18 = 0; i18 < 4; i18++) {
                    fArr[i18] = (1.0f - i60Var.d2) * AndroidUtilities.dp(13.0f);
                    fArr[i18 + 4] = AndroidUtilities.dp(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                e4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (i60Var.e2 != null) {
                    float f23 = f22 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - i60Var.e2.getMeasuredWidth()) - AndroidUtilities.dp(14.0f);
                    if (i60Var.d2 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f23, i60Var.e2.getMeasuredWidth() + measuredWidth, i60Var.e2.getMeasuredHeight() + f23, (int) (i60Var.d2 * f10), 31);
                    } else {
                        canvas3.save();
                    }
                    i60Var.e2.setTranslationX(measuredWidth - r4.getLeft());
                    i60Var.e2.setTranslationY(f23 - r4.getTop());
                    float f24 = (i60Var.d2 * 0.2f) + 0.8f;
                    canvas3.scale(f24, f24, (i60Var.e2.getMeasuredWidth() / 2.0f) + measuredWidth, f23);
                    canvas3.translate(measuredWidth, f23);
                    i60Var.e2.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (i60Var.c2.n) {
                return;
            }
            canvas3.save();
            if (i60Var.b3 && i60Var.a3 == null) {
                canvas3.clipRect(0.0f, (1.0f - i60Var.d2) * y14, getMeasuredWidth(), (i60Var.d2 * getMeasuredHeight()) + ((1.0f - i60Var.d2) * y15));
            }
            canvas3.scale(d40Var.getScaleX(), d40Var.getScaleY(), d40Var.getX(), d40Var.getY());
            canvas3.translate(d40Var.getX(), d40Var.getY());
            d40Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        i60 i60Var = this.D0;
        n30 n30Var = i60Var.e;
        w30 w30Var = i60Var.m2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        if (i60Var.s2) {
            if (view == o50Var) {
                int childCount = o50Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = o50Var.getChildAt(i10);
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
        } else if (i60.G3 || a40Var.c != 1.0f || (view != i60Var.O && view != i60Var.g0 && view != i60Var.N && view != i60Var.e1 && view != i60Var.z1 && view != i60Var.U0)) {
            if (i60Var.F2 && view == a40Var) {
                canvas.save();
                canvas.translate(w30Var.getX() + a40Var.getX(), w30Var.getY() + a40Var.getY());
                w30Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != i60Var.C2 && view != i60Var.e2 && view != i60Var.X2 && (!i60Var.l2 || !i60Var.g2 || (view != o50Var && view != n30Var && view != i60Var.c0))) {
                return super.drawChild(canvas, view, j3);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0.Z.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
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
        i60 i60Var = this.D0;
        ImageReceiver imageReceiver = i60Var.Z;
        Drawable drawable = i60Var.f0;
        a40 a40Var = i60Var.a2;
        float f10 = i60Var.y0 - dp;
        int dp2 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
        i10 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
        int i22 = i10 + dp2;
        i11 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
        if (i11 + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            i20 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
            i21 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - i21) / ((dp - i20) - AndroidUtilities.dp(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f10 -= currentActionBarHeight;
            i22 += currentActionBarHeight;
            f7 = 1.0f - min;
        } else {
            f7 = 1.0f;
        }
        float paddingTop = f10 + getPaddingTop();
        i60Var.Q1();
        if (a40Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i22);
            drawable.draw(canvas);
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.i6.t0.setColor(i60Var.V1);
                i16 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
                float f11 = i17 + paddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
                float dp3 = i19 + paddingTop + AndroidUtilities.dp(24.0f);
                RectF rectF = this.x0;
                rectF.set(i16, f11, f12, dp3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.t0);
            }
            org.telegram.ui.ActionBar.i6.t0.setColor(Color.argb((int) (i60Var.O.getAlpha() * 255.0f), (int) (Color.red(i60Var.V1) * 0.8f), (int) (Color.green(i60Var.V1) * 0.8f), (int) (Color.blue(i60Var.V1) * 0.8f)));
            float statusBarHeight = i60Var.getStatusBarHeight();
            i12 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
            canvas.drawRect(i12, 0.0f, measuredWidth2 - i13, statusBarHeight, org.telegram.ui.ActionBar.i6.t0);
            u40 u40Var = i60Var.z0;
            if (u40Var != null) {
                org.telegram.ui.ActionBar.i6.t0.setColor(u40Var.getBackgroundColor());
                i14 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                float f13 = i14;
                int measuredWidth3 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingLeft;
                canvas.drawRect(f13, 0.0f, measuredWidth3 - i15, i60Var.getStatusBarHeight(), org.telegram.ui.ActionBar.i6.t0);
            }
        }
        if (a40Var.c != 0.0f) {
            org.telegram.ui.ActionBar.i6.t0.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gg, false), (int) (a40Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.t0);
        }
        if (i60Var.r1() && LiteMode.isEnabled(512)) {
            if (a40Var.c < 0.15d) {
                if (!i60Var.z2) {
                    i60Var.z2 = true;
                    i60Var.z1();
                }
            } else if (i60Var.z2) {
                i60Var.z2 = false;
                AndroidUtilities.cancelRunOnUIThread(i60Var.A2);
            }
        }
        imageReceiver.setImageCoords((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(30.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        imageReceiver.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i60 i60Var = this.D0;
        d40 d40Var = i60Var.C2;
        if (i60Var.X2 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float x11 = i60Var.e2.getX();
            float y10 = i60Var.e2.getY();
            float x12 = i60Var.e2.getX() + i60Var.e2.getMeasuredWidth();
            float y11 = i60Var.e2.getY() + i60Var.e2.getMeasuredHeight();
            RectF rectF = this.x0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y3);
            rectF.set(d40Var.getX(), d40Var.getY(), d40Var.getX() + d40Var.getMeasuredWidth(), d40Var.getY() + d40Var.getMeasuredWidth() + i60Var.X2.getMeasuredHeight());
            if (rectF.contains(x10, y3)) {
                z10 = false;
            }
            if (z10) {
                i60Var.d1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || i60Var.y0 == 0.0f || motionEvent.getY() >= i60Var.y0 - AndroidUtilities.dp(37.0f) || i60Var.O.getAlpha() != 0.0f || i60Var.f2 || i60Var.z0 != null || i60Var.a2.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        i60Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        i60 i60Var = this.D0;
        if (i60Var.X2 == null || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        i60Var.d1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        boolean z11;
        i60 i60Var = this.D0;
        View view = i60Var.K2;
        View view2 = i60Var.J2;
        n30 n30Var = i60Var.e;
        a40 a40Var = i60Var.a2;
        o50 o50Var = i60Var.Q;
        if (i60.G3 && this.A0 != i60Var.I2 && this.B0) {
            f7 = o50Var.getX();
            z11 = true;
        } else {
            f7 = 0.0f;
            z11 = false;
        }
        this.A0 = i60Var.I2;
        a40Var.s = true;
        super.onLayout(z10, i10, i11, i12, i13);
        a40Var.s = false;
        i60.J0(i60Var);
        this.B0 = true;
        if (!z11 || o50Var.getLeft() == f7) {
            return;
        }
        float left = f7 - o50Var.getLeft();
        o50Var.setTranslationX(left);
        n30Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = o50Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f;
        duration.setInterpolator(qrVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
        n30Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(qrVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        int dp;
        float f10;
        int i12;
        int b10;
        i60 i60Var = this.D0;
        k40 k40Var = i60Var.G;
        t30 t30Var = i60Var.N;
        LinearLayout linearLayout = i60Var.z1;
        e50 e50Var = i60Var.O;
        o60 o60Var = i60Var.o2;
        org.telegram.ui.Components.s20 s20Var = i60Var.p2;
        org.telegram.ui.Components.oz ozVar = i60Var.Y;
        org.telegram.ui.Components.voip.v2 v2Var = i60Var.w;
        org.telegram.ui.ActionBar.j5 j5Var = i60Var.U;
        View view = i60Var.g0;
        n30 n30Var = i60Var.e;
        View view2 = i60Var.K2;
        View view3 = i60Var.J2;
        ArrayList arrayList = i60Var.Y1;
        org.telegram.ui.ActionBar.j5 j5Var2 = i60Var.W;
        i40 i40Var = i60Var.H;
        ArrayList arrayList2 = i60Var.Z1;
        org.telegram.ui.Components.ll0 ll0Var = i60Var.n2;
        o50 o50Var = i60Var.Q;
        a40 a40Var = i60Var.a2;
        w30 w30Var = i60Var.m2;
        int size = View.MeasureSpec.getSize(i11);
        this.w0 = true;
        boolean z11 = View.MeasureSpec.getSize(i10) > size && !AndroidUtilities.isTablet();
        View.MeasureSpec.getSize(i10);
        a40Var.getClass();
        boolean z12 = AndroidUtilities.isTablet() && View.MeasureSpec.getSize(i10) > size && !i60Var.r1();
        if (i60.F3 != z11) {
            i60.F3 = z11;
            if (v2Var.getMeasuredWidth() == 0) {
                int i13 = v2Var.getLayoutParams().width;
            }
            i60.H0(i60Var);
            ozVar.y1(i60.F3 ? 6 : 2);
            o50Var.a0();
            w30Var.a0();
            this.z0 = true;
            TextView textView = i60Var.S;
            if (textView != null) {
                textView.setVisibility(!i60.F3 ? 0 : 8);
            }
            if (i60Var.q1() == z11 && i60Var.r1() && !a40Var.b && !i60Var.a1.visibleVideoParticipants.isEmpty()) {
                i60Var.e1(i60Var.a1.visibleVideoParticipants.get(0));
                a40Var.e();
            }
        }
        if (i60.G3 != z12) {
            i60.G3 = z12;
            ll0Var.setVisibility(z12 ? 0 : 8);
            o50Var.a0();
            w30Var.a0();
            z10 = true;
            this.z0 = true;
        } else {
            z10 = true;
        }
        if (this.z0) {
            i60Var.O0(z10);
            i60Var.P.l();
            s20Var.G(ll0Var, false);
            if (i60.G3) {
                o60Var.I(ll0Var, false);
            }
            ll0Var.setVisibility(i60.G3 ? 0 : 8);
            o60Var.H(ll0Var, i60.G3 && !a40Var.b, true);
            boolean z13 = i60.G3;
            i60Var.P2 = !z13 || a40Var.b;
            boolean z14 = !z13 && a40Var.b;
            s20Var.F(w30Var, z14);
            w30Var.setVisibility(z14 ? 0 : 8);
            o50Var.setVisibility((i60.G3 || !a40Var.b) ? 0 : 8);
            ozVar.y1(i60.F3 ? 6 : 2);
            i60Var.N1(false, false);
            o50Var.a0();
            w30Var.a0();
            AndroidUtilities.updateVisibleRows(o50Var);
            this.z0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            a40Var.setIsTablet(i60.G3);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.u) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (i60Var.r1() ? AndroidUtilities.dp(72.0f) : AndroidUtilities.dp(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a40Var.getLayoutParams();
        if (i60.G3) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i60Var.j0[i15].getLayoutParams();
            if (i60.G3) {
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
        int dp2 = AndroidUtilities.dp(i60Var.r1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) o50Var.getLayoutParams();
        if (i60.G3) {
            layoutParams3.gravity = i60Var.I2 ? 5 : 1;
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
            if (i60.F3) {
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
        if (!i60.F3 || i60.G3) {
            f10 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = dp2;
            if (i60.G3) {
                layoutParams4.gravity = i60Var.I2 ? 85 : 81;
                layoutParams4.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = dp2;
            if (i60.G3) {
                layoutParams5.gravity = i60Var.I2 ? 85 : 81;
                layoutParams5.width = AndroidUtilities.dp(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f10 = 320.0f;
        }
        if (i60.F3) {
            w30Var.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        } else {
            w30Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) n30Var.getLayoutParams();
        if (i60.G3) {
            layoutParams6.width = AndroidUtilities.dp(f10);
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = i60Var.I2 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (i60.F3) {
            layoutParams6.width = AndroidUtilities.dp(f7);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = AndroidUtilities.dp(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!i60.F3 || i60.G3) {
            ((FrameLayout.LayoutParams) e50Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) t30Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) e50Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) t30Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) w30Var.getLayoutParams();
        if (i60.F3) {
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
        if (i60.G3) {
            b10 = 0;
            i12 = 0;
        } else {
            i12 = 0;
            b10 = org.telegram.messenger.y0.b(8.0f, paddingTop - max, 0);
        }
        if (o50Var.getPaddingTop() != b10 || o50Var.getPaddingBottom() != dp) {
            o50Var.setPadding(i12, b10, i12, dp);
        }
        g60 g60Var = i60Var.B1;
        if (g60Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) g60Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I0 = i60.I0(i60Var);
            if (I0 != null) {
                int measuredHeight = ((n30Var.getMeasuredHeight() / 2) + n30Var.getTop()) - (i60Var.s.getMeasuredHeight() / 2);
                int measuredHeight2 = I0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = hg.c.C(measuredHeight, measuredHeight2, 2, measuredHeight2) - AndroidUtilities.dp(32.0f);
                layoutParams9.height = AndroidUtilities.dp(70.0f);
            }
        }
        x50 x50Var = i60Var.U0;
        if (x50Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) x50Var.getLayoutParams();
            org.telegram.ui.Components.voip.l I02 = i60.I0(i60Var);
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
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) i60Var.V.getLayoutParams();
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
            ((org.telegram.ui.Components.voip.u) arrayList.get(i16)).g(a40Var.b, true);
        }
        this.w0 = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.y0) {
            this.y0 = measuredHeight3;
            i60Var.d1(false);
        }
        i60Var.r2.f = getMeasuredWidth();
        i60Var.Y0();
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
