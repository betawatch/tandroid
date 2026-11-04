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
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d30 extends org.telegram.ui.Components.qt0 {
    public boolean g0;
    public final RectF h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final HashMap m0;
    public final /* synthetic */ x30 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.n0 = x30Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.m0 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039e  */
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        Canvas canvas3;
        org.telegram.ui.Cells.f4 f4Var;
        float f12;
        float y9;
        float x10;
        float[] fArr;
        Path path;
        org.telegram.ui.Cells.f4 f4Var2;
        ArrayList arrayList;
        org.telegram.ui.Components.voip.k kVar;
        boolean z10;
        float x11;
        float f13;
        float f14;
        float f15;
        int i3;
        boolean z11;
        Shader.TileMode tileMode;
        x30 x30Var = this.n0;
        v30 v30Var = x30Var.t3;
        View view = x30Var.C4;
        View view2 = x30Var.B4;
        ArrayList arrayList2 = x30Var.Q3;
        oh.h hVar = x30Var.U1;
        Paint paint = x30Var.u2;
        q10 q10Var = x30Var.e4;
        x10 x10Var = x30Var.u4;
        u10 u10Var = x30Var.S3;
        f30 f30Var = x30Var.I1;
        if (x30Var.k4 || x30Var.x4) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.g0.m0) {
                if (x30Var.I4 == null) {
                    x30Var.I4 = new RenderNode("CallActivity.Blur");
                    x30Var.J4 = org.telegram.ui.Components.qt0.getRenderNodeScale();
                    ColorMatrix colorMatrix = new ColorMatrix(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 8.5f, 0.0f, 0.5f, 0.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.5f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    float blurRadius = org.telegram.ui.Components.qt0.getBlurRadius();
                    RenderNode renderNode = x30Var.I4;
                    tileMode = Shader.TileMode.DECAL;
                    renderNode.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                    hVar.setBlurRoot(this);
                    RenderNode renderNode2 = x30Var.I4;
                    float f16 = x30Var.J4;
                    hVar.V0 = renderNode2;
                    hVar.W0 = f16;
                }
                int round = Math.round(getMeasuredWidth() / x30Var.J4);
                int round2 = Math.round(getMeasuredHeight() / x30Var.J4);
                x30Var.k4 = true;
                x30Var.I4.setPosition(0, 0, round, round2);
                RecordingCanvas beginRecording = x30Var.I4.beginRecording();
                float f17 = 1.0f / x30Var.J4;
                beginRecording.scale(f17, f17);
                dispatchDraw(beginRecording);
                x30Var.I4.endRecording();
                x30Var.k4 = false;
            }
        }
        for (int i10 = 0; i10 < f30Var.getChildCount(); i10++) {
            View childAt = f30Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                z11 = true;
                ((org.telegram.ui.Cells.f4) childAt).setDrawAvatar(true);
            } else {
                z11 = true;
            }
            if (!(childAt instanceof org.telegram.ui.Components.voip.k)) {
                if (childAt.getMeasuredWidth() != f30Var.getMeasuredWidth()) {
                    childAt.setTranslationX((f30Var.getMeasuredWidth() - childAt.getMeasuredWidth()) >> 1);
                } else {
                    childAt.setTranslationX(0.0f);
                }
            }
        }
        if (u10Var.r == null) {
            for (int i11 = 0; i11 < q10Var.getChildCount(); i11++) {
                ((org.telegram.ui.Components.d10) q10Var.getChildAt(i11)).setProgressToFullscreen(1.0f);
            }
        } else if (q10Var.getVisibility() == 0) {
            HashMap hashMap = this.m0;
            hashMap.clear();
            int i12 = 0;
            while (i12 < f30Var.getChildCount()) {
                View childAt2 = f30Var.getChildAt(i12);
                if (childAt2.isAttachedToWindow()) {
                    if (childAt2 instanceof org.telegram.ui.Components.voip.k) {
                        f30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Components.voip.k kVar2 = (org.telegram.ui.Components.voip.k) childAt2;
                            i3 = i12;
                            if (kVar2.getRenderer() != u10Var.E) {
                                hashMap.put(kVar2.getParticipant(), childAt2);
                            }
                        }
                    }
                    i3 = i12;
                    if (childAt2 instanceof org.telegram.ui.Cells.f4) {
                        f30Var.getClass();
                        if (RecyclerView.R(childAt2) >= 0) {
                            org.telegram.ui.Cells.f4 f4Var3 = (org.telegram.ui.Cells.f4) childAt2;
                            hashMap.put(f4Var3.getParticipant(), f4Var3);
                        }
                    }
                } else {
                    i3 = i12;
                }
                i12 = i3 + 1;
            }
            int i13 = 0;
            while (i13 < q10Var.getChildCount()) {
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) q10Var.getChildAt(i13);
                View view3 = (View) hashMap.get(d10Var.getVideoParticipant());
                if (view3 == null) {
                    view3 = (View) hashMap.get(d10Var.getParticipant());
                }
                float f18 = u10Var.c;
                HashMap hashMap2 = hashMap;
                if (!x30Var.F4.k()) {
                    d10Var.setAlpha(f10);
                }
                if (view3 != null) {
                    if (view3 instanceof org.telegram.ui.Components.voip.k) {
                        org.telegram.ui.Components.voip.k kVar3 = (org.telegram.ui.Components.voip.k) view3;
                        x11 = (f30Var.getX() + kVar3.getLeft()) - u10Var.getLeft();
                        f13 = (f30Var.getY() + kVar3.getTop()) - u10Var.getTop();
                        f14 = q10Var.getX() + d10Var.getLeft();
                        f15 = q10Var.getY() + d10Var.getTop();
                    } else {
                        x11 = ((f30Var.getX() + r14.getLeft()) - u10Var.getLeft()) + r14.getAvatarImageView().getLeft() + (r14.getAvatarImageView().getMeasuredWidth() >> 1);
                        float y10 = ((f30Var.getY() + r14.getTop()) - u10Var.getTop()) + r14.getAvatarImageView().getTop() + (r14.getAvatarImageView().getMeasuredHeight() >> 1);
                        float x12 = q10Var.getX() + d10Var.getLeft() + (d10Var.getMeasuredWidth() >> 1);
                        float y11 = q10Var.getY() + d10Var.getTop() + (d10Var.getMeasuredHeight() >> 1);
                        ((org.telegram.ui.Cells.f4) view3).setDrawAvatar(false);
                        f13 = y10;
                        f14 = x12;
                        f15 = y11;
                    }
                    float f19 = 1.0f - f18;
                    d10Var.setTranslationX((x11 - f14) * f19);
                    d10Var.setTranslationY((f13 - f15) * f19);
                    d10Var.setScaleX(1.0f);
                    d10Var.setScaleY(1.0f);
                    d10Var.setProgressToFullscreen(f18);
                } else {
                    d10Var.setScaleX(1.0f);
                    d10Var.setScaleY(1.0f);
                    d10Var.setTranslationX(0.0f);
                    d10Var.setTranslationY(0.0f);
                    d10Var.setProgressToFullscreen(1.0f);
                    if (d10Var.getRenderer() == null) {
                        d10Var.setAlpha(f18);
                    }
                }
                i13++;
                hashMap = hashMap2;
                f10 = 1.0f;
            }
        }
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList2.get(i14);
            org.telegram.ui.Components.tj0 tj0Var = x30Var.f4;
            org.telegram.ui.Components.voip.n nVar = rVar.a;
            if (rVar.h || rVar.f || rVar.Q) {
                arrayList = arrayList2;
            } else {
                rVar.z0 = false;
                float f20 = u10Var.c;
                arrayList = arrayList2;
                if (rVar.r || rVar.b) {
                    org.telegram.ui.Components.voip.k kVar4 = rVar.c;
                    org.telegram.ui.Components.voip.k kVar5 = kVar4;
                    if (kVar4 == null && rVar.e == null) {
                        rVar.setTranslationX(0.0f);
                        rVar.setTranslationY(0.0f);
                    } else {
                        org.telegram.ui.Components.voip.k kVar6 = rVar.e;
                        if (kVar6 != null) {
                            kVar5 = kVar6;
                        }
                        if (kVar6 == null) {
                            tj0Var = f30Var;
                        }
                        float x13 = ((tj0Var.getX() + kVar5.getX()) - rVar.getLeft()) - u10Var.getLeft();
                        float y12 = ((tj0Var.getY() + (kVar5.getY() + org.telegram.messenger.g0.L(2.0f))) - rVar.getTop()) - u10Var.getTop();
                        float f21 = 1.0f - f20;
                        float f22 = f20 * 0.0f;
                        rVar.setTranslationX((x13 * f21) + f22);
                        rVar.setTranslationY((y12 * f21) + f22);
                    }
                    nVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                    org.telegram.ui.Components.d10 d10Var2 = rVar.d;
                    if (d10Var2 != null) {
                        d10Var2.setAlpha(f20);
                    }
                    if (!rVar.b && rVar.c == null && rVar.e == null) {
                        rVar.setAlpha(f20);
                    } else if (!rVar.F) {
                        rVar.setAlpha(1.0f);
                    }
                } else {
                    org.telegram.ui.Components.d10 d10Var3 = rVar.d;
                    if (d10Var3 != null) {
                        q10Var.getClass();
                        if (RecyclerView.R(d10Var3) == -1) {
                            rVar.setAlpha(rVar.d.getAlpha());
                        } else if (rVar.c == null) {
                            if (rVar.w && !rVar.F) {
                                rVar.setAlpha(f20);
                            }
                            rVar.d.setAlpha(f20);
                            f20 = 1.0f;
                        } else {
                            rVar.d.setAlpha(1.0f);
                            if (rVar.w && !rVar.F) {
                                rVar.setAlpha(1.0f);
                            }
                        }
                        rVar.setTranslationX((q10Var.getX() + rVar.d.getX()) - rVar.getLeft());
                        float f23 = 1.0f - f20;
                        rVar.setTranslationY((q10Var.getY() + (rVar.d.getY() + (org.telegram.messenger.g0.L(2.0f) * f23))) - rVar.getTop());
                        nVar.setRoundCorners((org.telegram.messenger.g0.L(8.0f) * f23) + (org.telegram.messenger.g0.L(13.0f) * f20));
                    } else {
                        org.telegram.ui.Components.voip.k kVar7 = rVar.c;
                        org.telegram.ui.Components.voip.k kVar8 = kVar7;
                        if (kVar7 != null || rVar.e != null) {
                            org.telegram.ui.Components.voip.k kVar9 = rVar.e;
                            if (kVar9 == null || kVar8 == null) {
                                org.telegram.ui.Components.voip.k kVar10 = kVar9 != null ? kVar9 : kVar8;
                                if (kVar9 == null) {
                                    tj0Var = f30Var;
                                }
                                kVar8 = kVar10;
                            } else {
                                if (x30.y5) {
                                    kVar = kVar9;
                                    if (!rVar.y.b) {
                                        z10 = true;
                                        if (z10) {
                                            kVar8 = kVar;
                                        }
                                        if (!z10) {
                                            tj0Var = f30Var;
                                        }
                                    }
                                } else {
                                    kVar = kVar9;
                                }
                                z10 = false;
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            rVar.setTranslationX(((tj0Var.getX() + kVar8.getX()) - rVar.getLeft()) - u10Var.getLeft());
                            rVar.setTranslationY(((tj0Var.getY() + (kVar8.getY() + org.telegram.messenger.g0.L(2.0f))) - rVar.getTop()) - u10Var.getTop());
                            nVar.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
                            if (rVar.w && !rVar.F) {
                                if (!x30.y5) {
                                    rVar.z0 = true;
                                    rVar.setAlpha(kVar8.getAlpha() * (1.0f - f20));
                                } else if (rVar.c != null && rVar.e == null) {
                                    rVar.setAlpha(kVar8.getAlpha() * f20);
                                }
                            }
                        }
                    }
                }
            }
            i14++;
            arrayList2 = arrayList;
        }
        if (x30.y5) {
            f11 = 1.0f;
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
        } else {
            f11 = 1.0f;
            view2.setAlpha(1.0f - u10Var.c);
            view.setAlpha(1.0f - u10Var.c);
        }
        if (u10Var.M0) {
            f30Var.setAlpha(f11 - u10Var.c);
        } else {
            f30Var.setAlpha(f11);
        }
        if (v30Var != null) {
            v30Var.setAlpha(f11 - u10Var.c);
            v30Var.setTranslationY(u10Var.c * org.telegram.messenger.g0.L(64.0f));
        }
        super.dispatchDraw(canvas);
        if (x30Var.x4) {
            return;
        }
        boolean z12 = x30Var.X3;
        RectF rectF = this.h0;
        if (!z12) {
            if (x30Var.P4 != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x30Var.O4);
                float y13 = f30Var.getY();
                f30Var.getY();
                f30Var.getMeasuredHeight();
                if (!x30Var.T4) {
                    if (x30Var.S4 == null) {
                        org.telegram.ui.Components.voip.r rVar2 = x30Var.R4;
                        if (rVar2 == null || !rVar2.w) {
                            return;
                        }
                        canvas.save();
                        canvas.translate(u10Var.getX() + x30Var.R4.getX(), u10Var.getY() + x30Var.R4.getY());
                        x30Var.R4.draw(canvas);
                        canvas.restore();
                        return;
                    }
                    canvas.save();
                    canvas.translate(u10Var.getX() + q10Var.getX() + x30Var.S4.getX(), u10Var.getY() + q10Var.getY() + x30Var.S4.getY());
                    if (x30Var.S4.getRenderer() == null || !x30Var.S4.getRenderer().w || x30Var.S4.getRenderer().b) {
                        x30Var.S4.draw(canvas);
                    } else {
                        x30Var.S4.getRenderer().draw(canvas);
                    }
                    x30Var.S4.c(canvas);
                    canvas.restore();
                    return;
                }
                int childCount = f30Var.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt3 = f30Var.getChildAt(i15);
                    if (childAt3 == x30Var.P4) {
                        float max = Math.max(f30Var.getLeft(), childAt3.getX() + f30Var.getLeft());
                        float max2 = Math.max(y13, childAt3.getY() + f30Var.getY());
                        float min = Math.min(f30Var.getRight(), childAt3.getX() + f30Var.getLeft() + childAt3.getMeasuredWidth());
                        float min2 = Math.min(f30Var.getY() + f30Var.getMeasuredHeight(), childAt3.getY() + f30Var.getY() + x30Var.P4.getClipHeight());
                        if (max2 < min2) {
                            if (childAt3.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(max, max2, min, min2, (int) (childAt3.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                            }
                            canvas2.clipRect(max, max2, min, getMeasuredHeight());
                            canvas2.translate(childAt3.getX() + f30Var.getLeft(), childAt3.getY() + f30Var.getY());
                            float alpha = x30Var.O4.getAlpha() / 100.0f;
                            rectF.set(0.0f, 0.0f, childAt3.getMeasuredWidth(), (int) (((x30Var.P4.getClipHeight() - x30Var.P4.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.xq.g.getInterpolation(1.0f - alpha))) + x30Var.P4.getMeasuredHeight()));
                            org.telegram.ui.Cells.f4 f4Var4 = x30Var.P4;
                            paint.getColor();
                            org.telegram.ui.ActionBar.k5[] k5VarArr = f4Var4.d;
                            if (TextUtils.isEmpty(k5VarArr[4].getText())) {
                                alpha = 0.0f;
                            }
                            k5VarArr[4].setFullAlpha(alpha);
                            k5VarArr[4].h(0, 0);
                            f4Var4.invalidate();
                            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                            childAt3.draw(canvas2);
                            canvas2.restore();
                        }
                    }
                }
                return;
            }
            return;
        }
        if (x30Var.P4 != null) {
            if (x30Var.Y3) {
                canvas3 = canvas;
            } else {
                canvas3 = canvas;
                canvas3.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x30Var.O4);
            }
            float y14 = f30Var.getY();
            float[] fArr2 = new float[8];
            Path path2 = new Path();
            int childCount2 = f30Var.getChildCount();
            float y15 = f30Var.getY() + f30Var.getMeasuredHeight();
            if (x30Var.T4) {
                int i16 = 0;
                while (true) {
                    if (i16 >= childCount2) {
                        f4Var = null;
                        break;
                    }
                    View childAt4 = f30Var.getChildAt(i16);
                    f4Var = x30Var.P4;
                    if (childAt4 == f4Var) {
                        break;
                    } else {
                        i16++;
                    }
                }
            } else {
                f4Var = x30Var.P4;
            }
            if (f4Var != null && y14 < y15) {
                canvas3.save();
                if (x30Var.S4 == null) {
                    f12 = 255.0f;
                    canvas3.clipRect(0.0f, (1.0f - x30Var.V3) * y14, getMeasuredWidth(), (getMeasuredHeight() * x30Var.V3) + ((1.0f - x30Var.V3) * y15));
                } else {
                    f12 = 255.0f;
                }
                if (x30Var.T4) {
                    y9 = ((1.0f - x30Var.V3) * (f4Var.getY() + f30Var.getY())) + ((x10Var.getMeasuredWidth() + x10Var.getTop()) * x30Var.V3);
                    x10 = ((1.0f - x30Var.V3) * (f4Var.getX() + f30Var.getLeft())) + (x30Var.V3 * x10Var.getLeft());
                } else {
                    y9 = x10Var.getMeasuredWidth() + x10Var.getTop();
                    x10 = x10Var.getLeft();
                }
                float f24 = y9;
                canvas3.translate(x10, f24);
                if (x30Var.T4) {
                    fArr = fArr2;
                    path = path2;
                    f4Var2 = f4Var;
                    canvas3.save();
                } else {
                    fArr = fArr2;
                    f4Var2 = f4Var;
                    path = path2;
                    canvas3.saveLayerAlpha(0.0f, 0.0f, f4Var.getMeasuredWidth(), f4Var.getClipHeight(), (int) (x30Var.V3 * f12), 31);
                }
                float clipHeight = (int) (((f4Var2.getClipHeight() - f4Var2.getMeasuredHeight()) * (1.0f - org.telegram.ui.Components.xq.g.getInterpolation(1.0f - x30Var.V3))) + f4Var2.getMeasuredHeight());
                rectF.set(0.0f, 0.0f, f4Var2.getMeasuredWidth(), clipHeight);
                org.telegram.ui.Cells.f4 f4Var5 = f4Var2;
                f4Var5.setProgressToAvatarPreview(x30Var.T4 ? x30Var.V3 : 1.0f);
                for (int i17 = 0; i17 < 4; i17++) {
                    fArr[i17] = (1.0f - x30Var.V3) * org.telegram.messenger.g0.L(13.0f);
                    fArr[i17 + 4] = org.telegram.messenger.g0.L(13.0f);
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                canvas3.drawPath(path, paint);
                f4Var5.draw(canvas3);
                canvas3.restore();
                canvas3.restore();
                if (x30Var.W3 != null) {
                    float f25 = f24 + clipHeight;
                    float measuredWidth = (getMeasuredWidth() - x30Var.W3.getMeasuredWidth()) - org.telegram.messenger.g0.L(14.0f);
                    if (x30Var.V3 != 1.0f) {
                        canvas3.saveLayerAlpha(measuredWidth, f25, x30Var.W3.getMeasuredWidth() + measuredWidth, x30Var.W3.getMeasuredHeight() + f25, (int) (x30Var.V3 * f12), 31);
                    } else {
                        canvas3.save();
                    }
                    x30Var.W3.setTranslationX(measuredWidth - r4.getLeft());
                    x30Var.W3.setTranslationY(f25 - r4.getTop());
                    float f26 = (x30Var.V3 * 0.2f) + 0.8f;
                    canvas3.scale(f26, f26, (x30Var.W3.getMeasuredWidth() / 2.0f) + measuredWidth, f25);
                    canvas3.translate(measuredWidth, f25);
                    x30Var.W3.draw(canvas3);
                    canvas3.restore();
                }
            }
            if (x30Var.U3.n) {
                return;
            }
            canvas3.save();
            if (x30Var.T4 && x30Var.S4 == null) {
                canvas3.clipRect(0.0f, (1.0f - x30Var.V3) * y14, getMeasuredWidth(), (x30Var.V3 * getMeasuredHeight()) + ((1.0f - x30Var.V3) * y15));
            }
            canvas3.scale(x10Var.getScaleX(), x10Var.getScaleY(), x10Var.getX(), x10Var.getY());
            canvas3.translate(x10Var.getX(), x10Var.getY());
            x10Var.draw(canvas3);
            canvas3.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x30 x30Var = this.n0;
        h10 h10Var = x30Var.m1;
        q10 q10Var = x30Var.e4;
        f30 f30Var = x30Var.I1;
        u10 u10Var = x30Var.S3;
        if (x30Var.k4) {
            if (view == f30Var) {
                int childCount = f30Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = f30Var.getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == u10Var || view == h10Var) {
                return super.drawChild(canvas, view, j10);
            }
        } else if (x30.y5 || u10Var.c != 1.0f || (view != x30Var.G1 && view != x30Var.Y1 && view != x30Var.F1 && view != x30Var.W2 && view != x30Var.r3 && view != x30Var.M2)) {
            if (x30Var.x4 && view == u10Var) {
                canvas.save();
                canvas.translate(q10Var.getX() + u10Var.getX(), q10Var.getY() + u10Var.getY());
                q10Var.draw(canvas);
                canvas.restore();
                return true;
            }
            if (view != x30Var.u4 && view != x30Var.W3 && view != x30Var.P4 && (!x30Var.d4 || !x30Var.Y3 || (view != f30Var && view != h10Var && view != x30Var.U1))) {
                return super.drawChild(canvas, view, j10);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n0.R1.P();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0.R1.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        x30 x30Var = this.n0;
        ImageReceiver imageReceiver = x30Var.R1;
        Drawable drawable = x30Var.X1;
        u10 u10Var = x30Var.S3;
        float f11 = x30Var.q2 - L;
        int L2 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
        int i3 = x30Var.t0;
        int i10 = L2 + i3;
        if (i3 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - x30Var.t0) / ((L - x30Var.t0) - org.telegram.messenger.g0.L(14.0f)));
            int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - r1) * min);
            f11 -= currentActionBarHeight;
            i10 += currentActionBarHeight;
            f10 = 1.0f - min;
        } else {
            f10 = 1.0f;
        }
        float paddingTop = f11 + getPaddingTop();
        x30Var.T1();
        if (u10Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i10);
            drawable.draw(canvas);
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.t0.setColor(x30Var.N3);
                float f12 = x30Var.u0;
                float f13 = x30Var.t0 + paddingTop;
                float measuredWidth = getMeasuredWidth() - x30Var.u0;
                float L3 = x30Var.t0 + paddingTop + org.telegram.messenger.g0.L(24.0f);
                RectF rectF = this.h0;
                rectF.set(f12, f13, measuredWidth, L3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
            }
            org.telegram.ui.ActionBar.k6.t0.setColor(Color.argb((int) (x30Var.G1.getAlpha() * 255.0f), (int) (Color.red(x30Var.N3) * 0.8f), (int) (Color.green(x30Var.N3) * 0.8f), (int) (Color.blue(x30Var.N3) * 0.8f)));
            canvas.drawRect(x30Var.u0, 0.0f, getMeasuredWidth() - x30Var.u0, (int) ((1.0f - x30Var.T0) * x30Var.h0), org.telegram.ui.ActionBar.k6.t0);
            o20 o20Var = x30Var.r2;
            if (o20Var != null) {
                org.telegram.ui.ActionBar.k6.t0.setColor(o20Var.getBackgroundColor());
                canvas.drawRect(x30Var.u0, 0.0f, getMeasuredWidth() - x30Var.u0, (int) ((1.0f - x30Var.T0) * x30Var.h0), org.telegram.ui.ActionBar.k6.t0);
            }
        }
        if (u10Var.c != 0.0f) {
            org.telegram.ui.ActionBar.k6.t0.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false), (int) (u10Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.t0);
        }
        if (x30Var.t1() && org.telegram.messenger.lc.e(512)) {
            if (u10Var.c < 0.15d) {
                if (!x30Var.r4) {
                    x30Var.r4 = true;
                    x30Var.B1();
                }
            } else if (x30Var.r4) {
                x30Var.r4 = false;
                org.telegram.messenger.g0.r(x30Var.s4);
            }
        }
        imageReceiver.y0((getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(30.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x30 x30Var = this.n0;
        x10 x10Var = x30Var.u4;
        if (x30Var.P4 != null && motionEvent.getAction() == 0) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            float x11 = x30Var.W3.getX();
            float y10 = x30Var.W3.getY();
            float x12 = x30Var.W3.getX() + x30Var.W3.getMeasuredWidth();
            float y11 = x30Var.W3.getY() + x30Var.W3.getMeasuredHeight();
            RectF rectF = this.h0;
            rectF.set(x11, y10, x12, y11);
            boolean z10 = !rectF.contains(x10, y9);
            rectF.set(x10Var.getX(), x10Var.getY(), x10Var.getX() + x10Var.getMeasuredWidth(), x10Var.getY() + x10Var.getMeasuredWidth() + x30Var.P4.getMeasuredHeight());
            if (rectF.contains(x10, y9)) {
                z10 = false;
            }
            if (z10) {
                x30Var.f1(true);
                return true;
            }
        }
        if (motionEvent.getAction() != 0 || x30Var.q2 == 0.0f || motionEvent.getY() >= x30Var.q2 - org.telegram.messenger.g0.L(37.0f) || x30Var.G1.getAlpha() != 0.0f || x30Var.X3 || x30Var.r2 != null || x30Var.S3.b) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        x30Var.dismiss();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        x30 x30Var = this.n0;
        if (x30Var.P4 == null || i3 != 4) {
            return super.onKeyDown(i3, keyEvent);
        }
        x30Var.f1(true);
        return true;
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        x30 x30Var = this.n0;
        View view = x30Var.C4;
        View view2 = x30Var.B4;
        h10 h10Var = x30Var.m1;
        u10 u10Var = x30Var.S3;
        f30 f30Var = x30Var.I1;
        if (x30.y5 && this.k0 != x30Var.A4 && this.l0) {
            f10 = f30Var.getX();
            z11 = true;
        } else {
            z11 = false;
            f10 = 0.0f;
        }
        this.k0 = x30Var.A4;
        u10Var.s = true;
        super.onLayout(z10, i3, i10, i11, i12);
        u10Var.s = false;
        x30.P0(x30Var);
        this.l0 = true;
        if (!z11 || f30Var.getLeft() == f10) {
            return;
        }
        float left = f10 - f30Var.getLeft();
        f30Var.setTranslationX(left);
        h10Var.setTranslationX(left);
        view2.setTranslationX(left);
        view.setTranslationX(left);
        ViewPropertyAnimator duration = f30Var.animate().translationX(0.0f).setDuration(350L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
        duration.setInterpolator(xqVar).start();
        view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        view.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
        h10Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(xqVar).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        float f10;
        int L;
        float f11;
        int i11;
        int b10;
        int i12;
        x30 x30Var = this.n0;
        e20 e20Var = x30Var.y1;
        n10 n10Var = x30Var.F1;
        LinearLayout linearLayout = x30Var.r3;
        u20 u20Var = x30Var.G1;
        a40 a40Var = x30Var.g4;
        org.telegram.ui.Components.e10 e10Var = x30Var.h4;
        org.telegram.ui.Components.iy iyVar = x30Var.Q1;
        org.telegram.ui.Components.voip.c2 c2Var = x30Var.t1;
        org.telegram.ui.ActionBar.k5 k5Var = x30Var.M1;
        View view = x30Var.Y1;
        h10 h10Var = x30Var.m1;
        View view2 = x30Var.C4;
        View view3 = x30Var.B4;
        ArrayList arrayList = x30Var.Q3;
        org.telegram.ui.ActionBar.k5 k5Var2 = x30Var.O1;
        c20 c20Var = x30Var.z1;
        ArrayList arrayList2 = x30Var.R3;
        org.telegram.ui.Components.tj0 tj0Var = x30Var.f4;
        f30 f30Var = x30Var.I1;
        u10 u10Var = x30Var.S3;
        q10 q10Var = x30Var.e4;
        int size = View.MeasureSpec.getSize(i10);
        this.g0 = true;
        boolean z11 = View.MeasureSpec.getSize(i3) > size && !org.telegram.messenger.g0.Q1();
        View.MeasureSpec.getSize(i3);
        u10Var.getClass();
        boolean z12 = org.telegram.messenger.g0.Q1() && View.MeasureSpec.getSize(i3) > size && !x30Var.t1();
        if (x30.x5 != z11) {
            x30.x5 = z11;
            if (c2Var.getMeasuredWidth() == 0) {
                int i13 = c2Var.getLayoutParams().width;
            }
            if (x30Var.t1()) {
                boolean z13 = (!u10Var.W && u10Var.b && (x30.x5 == x30Var.s1() || org.telegram.messenger.g0.Q1())) ? false : true;
                Boolean bool = x30Var.b4;
                if (bool == null || z13 != bool.booleanValue()) {
                    int systemUiVisibility = x30Var.b.getSystemUiVisibility();
                    boolean z14 = z13;
                    if (z14) {
                        i12 = systemUiVisibility & (-7);
                        x30Var.getWindow().clearFlags(1024);
                        x30Var.B0(false);
                    } else {
                        x30Var.B0(true);
                        i12 = systemUiVisibility | 6;
                        x30Var.getWindow().addFlags(1024);
                    }
                    x30Var.b.setSystemUiVisibility(i12);
                    x30Var.b4 = Boolean.valueOf(z14);
                    x30Var.K4 = !z14;
                    x30Var.b.requestApplyInsets();
                }
            } else {
                x30Var.W = false;
            }
            iyVar.y1(x30.x5 ? 6 : 2);
            f30Var.a0();
            q10Var.a0();
            this.j0 = true;
            TextView textView = x30Var.K1;
            if (textView != null) {
                textView.setVisibility(!x30.x5 ? 0 : 8);
            }
            if (x30Var.s1() == z11 && x30Var.t1() && !u10Var.b && !x30Var.S2.f.isEmpty()) {
                x30Var.g1((org.telegram.messenger.s3) x30Var.S2.f.get(0));
                u10Var.e();
            }
        }
        if (x30.y5 != z12) {
            x30.y5 = z12;
            tj0Var.setVisibility(z12 ? 0 : 8);
            f30Var.a0();
            q10Var.a0();
            z10 = true;
            this.j0 = true;
        } else {
            z10 = true;
        }
        if (this.j0) {
            x30Var.Q0(z10);
            x30Var.H1.f();
            e10Var.G(tj0Var, false);
            if (x30.y5) {
                a40Var.I(tj0Var, false);
            }
            tj0Var.setVisibility(x30.y5 ? 0 : 8);
            a40Var.H(tj0Var, x30.y5 && !u10Var.b, true);
            boolean z15 = x30.y5;
            x30Var.H4 = !z15 || u10Var.b;
            boolean z16 = !z15 && u10Var.b;
            e10Var.F(q10Var, z16);
            q10Var.setVisibility(z16 ? 0 : 8);
            f30Var.setVisibility((x30.y5 || !u10Var.b) ? 0 : 8);
            iyVar.y1(x30.x5 ? 6 : 2);
            x30Var.Q1(false, false);
            f30Var.a0();
            q10Var.a0();
            org.telegram.messenger.g0.b4(f30Var);
            this.j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            u10Var.setIsTablet(x30.y5);
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                ((org.telegram.ui.Components.voip.r) arrayList2.get(i14)).j(true);
            }
        }
        int paddingTop = (size - getPaddingTop()) - (x30Var.t1() ? org.telegram.messenger.g0.L(72.0f) : org.telegram.messenger.g0.L(245.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u10Var.getLayoutParams();
        if (x30.y5) {
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x30Var.b2[i15].getLayoutParams();
            if (x30.y5) {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams2.rightMargin = org.telegram.messenger.g0.L(8.0f);
            }
        }
        if (tj0Var != null) {
            ((FrameLayout.LayoutParams) tj0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        if (c20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) c20Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        int L2 = org.telegram.messenger.g0.L(x30Var.t1() ? 40.0f : 90.0f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) f30Var.getLayoutParams();
        if (x30.y5) {
            layoutParams3.gravity = x30Var.A4 ? 5 : 1;
            layoutParams3.width = org.telegram.messenger.g0.L(320.0f);
            int L3 = org.telegram.messenger.g0.L(4.0f);
            layoutParams3.leftMargin = L3;
            layoutParams3.rightMargin = L3;
            layoutParams3.bottomMargin = L2;
            layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            L = org.telegram.messenger.g0.L(60.0f);
            f10 = 90.0f;
        } else {
            f10 = 90.0f;
            if (x30.x5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.rightMargin = org.telegram.messenger.g0.L(90.0f);
                layoutParams3.leftMargin = org.telegram.messenger.g0.L(14.0f);
                L = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L = org.telegram.messenger.g0.L(60.0f);
                layoutParams3.bottomMargin = L2;
                layoutParams3.topMargin = org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int L4 = org.telegram.messenger.g0.L(14.0f);
                layoutParams3.leftMargin = L4;
                layoutParams3.rightMargin = L4;
            }
        }
        if (!x30.x5 || x30.y5) {
            f11 = 320.0f;
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L2;
            if (x30.y5) {
                layoutParams4.gravity = x30Var.A4 ? 85 : 81;
                layoutParams4.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L2;
            if (x30.y5) {
                layoutParams5.gravity = x30Var.A4 ? 85 : 81;
                layoutParams5.width = org.telegram.messenger.g0.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        } else {
            view3.setVisibility(8);
            view2.setVisibility(8);
            f11 = 320.0f;
        }
        if (x30.x5) {
            q10Var.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
        } else {
            q10Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) h10Var.getLayoutParams();
        if (x30.y5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f11);
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = x30Var.A4 ? 85 : 81;
            layoutParams6.rightMargin = 0;
        } else if (x30.x5) {
            layoutParams6.width = org.telegram.messenger.g0.L(f10);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = org.telegram.messenger.g0.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (!x30.x5 || x30.y5) {
            ((FrameLayout.LayoutParams) u20Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) n10Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        } else {
            ((FrameLayout.LayoutParams) u20Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) n10Var.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) q10Var.getLayoutParams();
        if (x30.x5) {
            if (((u4.b0) q10Var.getLayoutManager()).o != 1) {
                ((u4.b0) q10Var.getLayoutManager()).j1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = org.telegram.messenger.g0.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((u4.b0) q10Var.getLayoutManager()).o != 0) {
                ((u4.b0) q10Var.getLayoutManager()).j1(0);
            }
            layoutParams7.height = org.telegram.messenger.g0.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = org.telegram.messenger.g0.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        e20Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) e20Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (c20Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) c20Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(org.telegram.messenger.g0.L(259.0f), (paddingTop / 5) * 3);
        if (x30.y5) {
            b10 = 0;
            i11 = 0;
        } else {
            i11 = 0;
            b10 = org.telegram.messenger.k5.b(8.0f, paddingTop - max, 0);
        }
        if (f30Var.getPaddingTop() != b10 || f30Var.getPaddingBottom() != L) {
            f30Var.setPadding(i11, b10, i11, L);
        }
        v30 v30Var = x30Var.t3;
        if (v30Var != null) {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) v30Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O0 = x30.O0(x30Var);
            if (O0 != null) {
                int measuredHeight = ((h10Var.getMeasuredHeight() / 2) + h10Var.getTop()) - (x30Var.r1.getMeasuredHeight() / 2);
                int measuredHeight2 = O0.getMeasuredHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + b10;
                layoutParams9.topMargin = k2.p1.e(measuredHeight, measuredHeight2, 2, measuredHeight2) - org.telegram.messenger.g0.L(32.0f);
                layoutParams9.height = org.telegram.messenger.g0.L(70.0f);
            }
        }
        m30 m30Var = x30Var.M2;
        if (m30Var != null) {
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) m30Var.getLayoutParams();
            org.telegram.ui.Components.voip.k O02 = x30.O0(x30Var);
            if (O02 != null) {
                layoutParams10.height = O02.getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f);
                layoutParams10.width = O02.getMeasuredWidth() - org.telegram.messenger.g0.L(7.0f);
                int L5 = org.telegram.messenger.g0.L(16.0f);
                layoutParams10.leftMargin = L5;
                layoutParams10.rightMargin = L5;
            }
        }
        if (k5Var2 != null) {
            int L6 = ((org.telegram.messenger.g0.L(60.0f) + (paddingTop - b10)) / 2) + b10;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) k5Var.getLayoutParams();
            layoutParams11.topMargin = L6 - org.telegram.messenger.g0.L(30.0f);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) k5Var2.getLayoutParams();
            layoutParams12.topMargin = org.telegram.messenger.g0.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) x30Var.N1.getLayoutParams();
            if (layoutParams11.topMargin >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                if (org.telegram.messenger.g0.L(20.0f) + layoutParams12.topMargin <= size - org.telegram.messenger.g0.L(231.0f)) {
                    k5Var.setVisibility(0);
                    k5Var2.setVisibility(0);
                    layoutParams13.topMargin = L6;
                }
            }
            k5Var.setVisibility(4);
            k5Var2.setVisibility(4);
            layoutParams13.topMargin = L6 - org.telegram.messenger.g0.L(20.0f);
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i16)).g(u10Var.b, true);
        }
        this.g0 = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        int measuredHeight3 = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight3 != this.i0) {
            this.i0 = measuredHeight3;
            x30Var.f1(false);
        }
        x30Var.j4.f = getMeasuredWidth();
        x30Var.a1();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n0.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.n0.T1();
    }
}
