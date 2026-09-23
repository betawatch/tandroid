package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ky extends org.telegram.ui.Components.pv0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final /* synthetic */ ry E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(Context context, ry ryVar) {
        super(context, null);
        this.E0 = ryVar;
        this.w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new me.b(new g(this, 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = 178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = 216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.h6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.pv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ry ryVar = this.E0;
            if (ryVar.l4 != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
                if (eh.b.c(i10, d6Var)) {
                    d6Var2 = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
                    if (d6Var2 != null) {
                        d6Var3 = ((org.telegram.ui.ActionBar.n2) ryVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    ryVar.l4.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(i11);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        ay ayVar;
        org.telegram.ui.Components.ml0 p5;
        ry ryVar = this.E0;
        if (ryVar.p3 && (ayVar = ryVar.C0) != null && ayVar.getVisibility() == 0) {
            ay ayVar2 = ryVar.C0;
            View[] viewArr = ayVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.h81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + ayVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.pv0
    public final void M() {
        super.M();
        this.E0.m3();
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        ry ryVar = this.E0;
        if (!ryVar.g3) {
            return false;
        }
        if (!ryVar.j3) {
            if (Math.abs(ryVar.e0[1].getTranslationX()) < 1.0f) {
                ryVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (ryVar.h3 ? -1 : 1));
                ryVar.e0[1].setTranslationX(0.0f);
                ry.f1(ryVar, true);
                animatorSet = ryVar.f3;
                if (animatorSet != null) {
                }
                ryVar.g3 = false;
            }
            return ryVar.g3;
        }
        if (Math.abs(ryVar.e0[0].getTranslationX()) < 1.0f) {
            ryVar.e0[0].setTranslationX(0.0f);
            ryVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (ryVar.h3 ? 1 : -1));
            ry.f1(ryVar, true);
            animatorSet = ryVar.f3;
            if (animatorSet != null) {
                animatorSet.cancel();
                ryVar.f3 = null;
            }
            ryVar.g3 = false;
        }
        return ryVar.g3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        ry ryVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        float height = kVar.getHeight();
        lx lxVar = ryVar.F3;
        float f7 = (lxVar == null || !lxVar.c()) ? 0.0f : ryVar.F3.e;
        if (ryVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, ryVar.t3, (1.0f - f7) * (1.0f - ryVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - ryVar.x1) * (1.0f - ryVar.t3) * AndroidUtilities.dp(48.0f), height + ryVar.T);
    }

    public final int b0() {
        ry ryVar = this.E0;
        float f7 = ryVar.N;
        lx lxVar = ryVar.F3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, ryVar.x1, org.telegram.messenger.z0.A(1.0f, (lxVar == null || !lxVar.c()) ? 0.0f : ryVar.F3.e, 1.0f - ryVar.t3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ry ryVar = this.E0;
        pw pwVar = ryVar.z0;
        int i10 = pwVar.j0.get(pwVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ryVar.m3 = false;
        ryVar.l3 = true;
        this.y0 = (int) (motionEvent.getX() + ryVar.i3);
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        kVar.setEnabled(false);
        ryVar.z0.setEnabled(false);
        qy qyVar = ryVar.e0[1];
        qyVar.h = i10;
        qyVar.setVisibility(0);
        ryVar.h3 = z10;
        ry.f1(ryVar, false);
        ryVar.R4(true);
        if (z10) {
            ryVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        ryVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r1 == 1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        lx lxVar;
        hy hyVar;
        float f11;
        ci.bb bbVar;
        float f12;
        hy hyVar2;
        org.telegram.ui.ActionBar.k kVar;
        lx lxVar2;
        ry ryVar = this.E0;
        Paint paint = ryVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && ryVar.k4 != null) {
            ryVar.m3();
        }
        if (ryVar.Q && (((lxVar2 = ryVar.F3) == null || !lxVar2.c()) && ryVar.t3 == 0.0f)) {
            ryVar.Q = false;
            int i10 = (ryVar.Z3() && ryVar.e0[0].s == 0) ? 1 : 0;
            ny nyVar = ryVar.e0[0].a;
            if (ryVar.R) {
                if (!ryVar.b1) {
                    if (i10 == 0) {
                        ryVar.R = false;
                    }
                    if (ryVar.R) {
                        s4.c1 L = nyVar.L(0, false);
                        if (L == null) {
                            ryVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= nyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                ryVar.R = false;
                            } else if (view.getTop() >= nyVar.getPaddingTop()) {
                                ryVar.R = false;
                            }
                        }
                        if (ryVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.c1 L2 = nyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = nyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -ryVar.T3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    ryVar.C4(f13);
                } else {
                    ryVar.C4(0.0f);
                }
            } else {
                ryVar.C4(-ryVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.n2) ryVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        ryVar.F3.setCurrentTop(i11);
        boolean z12 = ryVar.r3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = ryVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            } else if (f15 == 0.0f && (hyVar2 = ryVar.X) != null) {
                hyVar2.setTranslationY(ryVar.W3() + ryVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(ryVar.x1 * 2.0f));
            float f16 = ryVar.x1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f7 = 1.0f;
                f10 = 81.0f;
                J(canvas, 0.0f, this.B0, paint, true);
            } else {
                f7 = 1.0f;
                f10 = 81.0f;
            }
            float f17 = ryVar.x1;
            if (f17 > 0.0f && f17 < f7) {
                paint2.setColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (!ryVar.p3 && ryVar.q3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(ryVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                hy hyVar3 = ryVar.X;
                if (hyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                    int height = kVar.getHeight();
                    hyVar3.setTranslationY(ryVar.W3() + (i11 - (height + (ryVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 1.0f;
            f10 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.n2) ryVar).inPreviewMode;
            if (!z11) {
                if (ryVar.t3 > 0.0f) {
                    paint2.setColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(ryVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(ryVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                ryVar.w3 = 0.0f;
                ryVar.v3 = 0.0f;
                float min = ryVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!ryVar.K ? 81.0f : 0.0f)) + ryVar.N, ryVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!ryVar.K ? 81.0f : 0.0f)));
                ryVar.w3 = min;
                ryVar.v3 = min;
                lxVar = ryVar.F3;
                if (lxVar == null && lxVar.c()) {
                    float f18 = ryVar.F3.e;
                    float T3 = ryVar.w3 - ((ryVar.T3() + ryVar.N) * f18);
                    ryVar.w3 = T3;
                    ryVar.v3 = T3;
                    float clamp = ryVar.G0 ? f7 - Utilities.clamp(f18 / 0.5f, f7, 0.0f) : 1.0f;
                    pw pwVar = ryVar.z0;
                    if (pwVar != null && pwVar.getVisibility() == 0) {
                        ryVar.w3 -= (f7 - ryVar.r.e) * ryVar.z0.getMeasuredHeight();
                    }
                    hy hyVar4 = ryVar.X;
                    if (hyVar4 != null) {
                        hyVar4.setTranslationY(ryVar.W3() + AndroidUtilities.lerp(ryVar.N + ryVar.w3, -AndroidUtilities.dp(ryVar.K ? 81.0f : 0.0f), f18));
                    }
                    if (ryVar.y) {
                        boolean z13 = ryVar.E;
                        float f19 = z13 ? 0.0f : ryVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !ryVar.w) ? 0.0f : 50.0f), f19, ryVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    ryVar.e0[0].setTranslationY(f12 - (((ryVar.K ? AndroidUtilities.dp(f10) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * ryVar.F3.e));
                    f11 = clamp;
                } else {
                    hyVar = ryVar.X;
                    if (hyVar != null) {
                        hyVar.setTranslationY(AndroidUtilities.lerp(((ryVar.N + ryVar.w3) + ryVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((ryVar.K ? 81 : 0) + 48), ryVar.x1));
                    }
                    f11 = 1.0f;
                }
                ryVar.S4();
                ry.N2(ryVar, f11);
                super.dispatchDraw(canvas);
                ry.O2(ryVar, canvas2, i11);
                bbVar = ryVar.K0;
                if (bbVar != null && bbVar.getVisibility() == 0) {
                    if (ryVar.K0.getAlpha() != f7) {
                        ryVar.K0.draw(canvas2);
                    } else if (ryVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(ryVar.K0.getLeft(), ryVar.K0.getTop(), ryVar.K0.getRight(), ryVar.K0.getBottom(), (int) (ryVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(ryVar.K0.getLeft(), ryVar.K0.getTop());
                        ryVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!ryVar.W && ryVar.X2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6), ryVar.f4);
                }
                ryVar.V = true;
            }
        }
        canvas2 = canvas;
        ryVar.w3 = 0.0f;
        ryVar.v3 = 0.0f;
        float min2 = ryVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!ryVar.K ? 81.0f : 0.0f)) + ryVar.N, ryVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!ryVar.K ? 81.0f : 0.0f)));
        ryVar.w3 = min2;
        ryVar.v3 = min2;
        lxVar = ryVar.F3;
        if (lxVar == null) {
        }
        hyVar = ryVar.X;
        if (hyVar != null) {
        }
        f11 = 1.0f;
        ryVar.S4();
        ry.N2(ryVar, f11);
        super.dispatchDraw(canvas);
        ry.O2(ryVar, canvas2, i11);
        bbVar = ryVar.K0;
        if (bbVar != null) {
            if (ryVar.K0.getAlpha() != f7) {
            }
        }
        if (!ryVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6), ryVar.f4);
        }
        ryVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ry ryVar = this.E0;
        if (view == ryVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.pv0.v0) {
            return super.drawChild(canvas, view, j3);
        }
        qy[] qyVarArr = ryVar.e0;
        if (view == qyVarArr[0] || ((qyVarArr.length > 1 && view == qyVarArr[1]) || view == ryVar.J1 || view == ryVar.z0)) {
            canvas.save();
            if (view != ryVar.J1 && view != ryVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = ryVar.W3;
            if (f7 != 1.0f) {
                if (ryVar.X3) {
                    canvas.translate((1.0f - ryVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - ryVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(b10, b10, 0.0f, (-getY()) + ryVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        if (view != kVar || ryVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (ryVar.X3) {
            canvas.translate((1.0f - ryVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, ryVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - ryVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            canvas.scale(b11, b11, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.o5 o5Var = this.E0.D3;
        if (o5Var != null) {
            o5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5 o5Var = this.E0.D3;
        if (o5Var != null) {
            o5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        pw pwVar;
        int actionMasked = motionEvent.getActionMasked();
        ry ryVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            if (kVar.s()) {
                ryVar.Y0 = true;
            }
        }
        return Z() || ((pwVar = ryVar.z0) != null && pwVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ry ryVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        ix ixVar;
        ix ixVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ky kyVar = this;
        int childCount = kyVar.getChildCount();
        int R = kyVar.R();
        kyVar.setBottomClip(0);
        int measuredWidth = kyVar.getMeasuredWidth();
        int measuredHeight = kyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            ryVar = kyVar.E0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = kyVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 112;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = layoutParams.topMargin + kyVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != ryVar.X || childAt == ryVar.Z || childAt == (ixVar2 = ryVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != ryVar.X && childAt != ryVar.E0 && childAt != ryVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (ryVar.K && childAt == ryVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            ixVar = ryVar.E0;
                            if (childAt == ixVar && ixVar.getPremiumHint() != null) {
                                ryVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.ul.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, ryVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.ul.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == ryVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == ryVar.C0) {
                            i19 = -AndroidUtilities.dp(ryVar.a);
                        } else if (childAt instanceof yu) {
                            kVar3 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof qy) {
                            i19 = 0;
                        } else if (childAt == ryVar.J1 || childAt == ryVar.K1 || childAt == ryVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (ixVar2 != null && ixVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != ryVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != ryVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (ryVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    ixVar = ryVar.E0;
                    if (childAt == ixVar) {
                        ryVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.ul.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, ryVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.ul.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == ryVar.X) {
                    }
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = measuredWidth - measuredWidth2;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != ryVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != ryVar.X) {
                }
                if (ryVar.K) {
                }
                ixVar = ryVar.E0;
                if (childAt == ixVar) {
                }
                if (childAt == ryVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            kyVar = this;
        }
        ay ayVar = ryVar.C0;
        if (ayVar != null) {
            ayVar.setKeyboardHeight(R);
        }
        S();
        ryVar.X4();
        ryVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        ry ryVar = this.E0;
        int i12 = ryVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.v0 v0Var = ryVar.m0;
        if (v0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof yu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof qy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (ryVar.F3.c()) {
                            if (ryVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (ryVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + ryVar.P;
                        if (ryVar.u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = ryVar.Y3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        ay ayVar = ryVar.C0;
                        if (childAt == ayVar) {
                            ayVar.setTranslationY(ryVar.I0);
                            ryVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            ryVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            bx bxVar = ryVar.B1;
                            if (bxVar == null || !bxVar.v0(childAt)) {
                                if (childAt == ryVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = ryVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    ryVar.F3.setTransitionPaddingBottom(i16);
                                    childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size4 + i16), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i10, 0, i11, 0);
                                }
                            } else if (!AndroidUtilities.isInMultiwindow) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z10 != this.C0) {
            post(new jy(this, 1));
            this.C0 = z10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x03ac, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r3 == 8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c5 c5Var;
        pw pwVar;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.ActionBar.c5 c5Var3;
        org.telegram.ui.ActionBar.c5 c5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        hh.g gVar;
        ry ryVar = this.E0;
        c5Var = ((org.telegram.ui.ActionBar.n2) ryVar).parentLayout;
        Object[] objArr = 0;
        if (c5Var != null && (pwVar = ryVar.z0) != null && !pwVar.n && !ryVar.j2 && !ryVar.F3.c()) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) ryVar).parentLayout;
            if (!((ActionBarLayout) c5Var2).j()) {
                c5Var3 = ((org.telegram.ui.ActionBar.n2) ryVar).parentLayout;
                if (!((ActionBarLayout) c5Var3).y()) {
                    c5Var4 = ((org.telegram.ui.ActionBar.n2) ryVar).parentLayout;
                    if (!((ActionBarLayout) c5Var4).n && (motionEvent == null || ryVar.l3 || (motionEvent.getY() > a0() + b0() && ((gVar = ryVar.y1) == null || gVar.getVisibility() != 0 || motionEvent.getY() < ryVar.y1.getY())))) {
                        if (ryVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    qy qyVar = ryVar.e0[0];
                                    if (qyVar != null) {
                                        int i12 = qyVar.d.h;
                                        if (i12 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.A0 == null) {
                                this.A0 = VelocityTracker.obtain();
                            }
                            this.A0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && Z()) {
                            ryVar.l3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (ryVar.h3) {
                                if (x10 < ryVar.e0[0].getTranslationX() + ryVar.e0[0].getMeasuredWidth()) {
                                    ryVar.i3 = ryVar.e0[0].getTranslationX();
                                } else {
                                    qy[] qyVarArr = ryVar.e0;
                                    qy qyVar2 = qyVarArr[0];
                                    qy qyVar3 = qyVarArr[1];
                                    qyVarArr[0] = qyVar3;
                                    qyVarArr[1] = qyVar2;
                                    ryVar.h3 = false;
                                    ryVar.i3 = qyVar3.getTranslationX();
                                    ryVar.z0.g(1.0f, ryVar.e0[0].h);
                                    ryVar.z0.g(ryVar.i3 / r10[0].getMeasuredWidth(), ryVar.e0[1].h);
                                    ryVar.R4(true);
                                    ryVar.e0[0].d.getClass();
                                    ryVar.e0[1].d.getClass();
                                }
                            } else if (x10 < ryVar.e0[1].getTranslationX() + ryVar.e0[1].getMeasuredWidth()) {
                                qy[] qyVarArr2 = ryVar.e0;
                                qy qyVar4 = qyVarArr2[0];
                                qy qyVar5 = qyVarArr2[1];
                                qyVarArr2[0] = qyVar5;
                                qyVarArr2[1] = qyVar4;
                                ryVar.h3 = true;
                                ryVar.i3 = qyVar5.getTranslationX();
                                ryVar.z0.g(1.0f, ryVar.e0[0].h);
                                ryVar.z0.g((-ryVar.i3) / r10[0].getMeasuredWidth(), ryVar.e0[1].h);
                                ryVar.R4(true);
                                ryVar.e0[0].d.getClass();
                                ryVar.e0[1].d.getClass();
                            } else {
                                ryVar.i3 = ryVar.e0[0].getTranslationX();
                            }
                            ryVar.f3.removeAllListeners();
                            ryVar.f3.cancel();
                            ryVar.g3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            ryVar.i3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !ryVar.l3 && !ryVar.m3 && ryVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            ryVar.m3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + ryVar.i3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (ryVar.l3 && (((z10 = ryVar.h3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    ryVar.m3 = true;
                                    ryVar.l3 = false;
                                    ryVar.e0[0].setTranslationX(0.0f);
                                    ryVar.e0[1].setTranslationX(ryVar.h3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    ryVar.z0.g(0.0f, ryVar.e0[1].h);
                                }
                            }
                            if (ryVar.m3 && !ryVar.l3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (ryVar.l3) {
                                ryVar.e0[0].setTranslationX(x11);
                                if (ryVar.h3) {
                                    ryVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    ryVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / ryVar.e0[0].getMeasuredWidth();
                                qy qyVar6 = ryVar.e0[1];
                                if (qyVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    ryVar.z0.i(ryVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new jy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                ryVar.z0.g(abs2, qyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, ryVar.k3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!ryVar.l3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (ryVar.l3) {
                                float x13 = ryVar.e0[0].getX();
                                ryVar.f3 = new AnimatorSet();
                                if (ryVar.e0[1].E) {
                                    ryVar.j3 = true;
                                } else if (ryVar.i3 == 0.0f) {
                                    ryVar.j3 = Math.abs(x13) < ((float) ryVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = ryVar.h3 ? false : false;
                                    ryVar.j3 = z11;
                                } else if (ryVar.h3) {
                                    ryVar.j3 = ryVar.e0[1].getX() > ((float) (ryVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    ryVar.j3 = ryVar.e0[0].getX() < ((float) (ryVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = ryVar.j3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (ryVar.h3) {
                                        ryVar.f3.playTogether(ObjectAnimator.ofFloat(ryVar.e0[0], (Property<qy, Float>) property, 0.0f), ObjectAnimator.ofFloat(ryVar.e0[1], (Property<qy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        ryVar.f3.playTogether(ObjectAnimator.ofFloat(ryVar.e0[0], (Property<qy, Float>) property, 0.0f), ObjectAnimator.ofFloat(ryVar.e0[1], (Property<qy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = ryVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (ryVar.h3) {
                                        ryVar.f3.playTogether(ObjectAnimator.ofFloat(ryVar.e0[0], (Property<qy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(ryVar.e0[1], (Property<qy, Float>) property, 0.0f));
                                    } else {
                                        ryVar.f3.playTogether(ObjectAnimator.ofFloat(ryVar.e0[0], (Property<qy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(ryVar.e0[1], (Property<qy, Float>) property, 0.0f));
                                    }
                                }
                                ryVar.f3.setInterpolator(ry.y4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                ryVar.f3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                ryVar.f3.addListener(new org.telegram.ui.Components.u81(this, 18));
                                ryVar.f3.start();
                                ryVar.g3 = true;
                                ryVar.l3 = false;
                            } else {
                                ryVar.m3 = false;
                                kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                                kVar.setEnabled(true);
                                ryVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return ryVar.l3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ry ryVar = this.E0;
        if (ryVar.m3 && !ryVar.l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
