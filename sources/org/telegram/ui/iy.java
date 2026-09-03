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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.Components.pv0 {
    public final yd.b A0;
    public final /* synthetic */ py B0;
    public final Paint t0;
    public int u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public final Rect y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(Context context, py pyVar) {
        super(context, null);
        this.B0 = pyVar;
        this.t0 = new Paint(1);
        this.y0 = new Rect();
        this.A0 = new yd.b(new h(this, 15));
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
    
        if (org.telegram.ui.ActionBar.k6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.pv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            py pyVar = this.B0;
            if (pyVar.j4 != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
                if (sg.b.c(i10, g6Var)) {
                    g6Var2 = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
                    if (g6Var2 != null) {
                        g6Var3 = ((org.telegram.ui.ActionBar.p2) pyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    pyVar.j4.I(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
        yx yxVar;
        org.telegram.ui.Components.sl0 p10;
        py pyVar = this.B0;
        if (pyVar.m3 && (yxVar = pyVar.z0) != null && yxVar.getVisibility() == 0) {
            yx yxVar2 = pyVar.z0;
            View[] viewArr = yxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.l81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + yxVar2.getY());
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
        this.B0.m3();
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
        py pyVar = this.B0;
        if (!pyVar.d3) {
            return false;
        }
        if (!pyVar.g3) {
            if (Math.abs(pyVar.b0[1].getTranslationX()) < 1.0f) {
                pyVar.b0[0].setTranslationX(r1.getMeasuredWidth() * (pyVar.e3 ? -1 : 1));
                pyVar.b0[1].setTranslationX(0.0f);
                py.f1(pyVar, true);
                animatorSet = pyVar.c3;
                if (animatorSet != null) {
                }
                pyVar.d3 = false;
            }
            return pyVar.d3;
        }
        if (Math.abs(pyVar.b0[0].getTranslationX()) < 1.0f) {
            pyVar.b0[0].setTranslationX(0.0f);
            pyVar.b0[1].setTranslationX(r1[0].getMeasuredWidth() * (pyVar.e3 ? 1 : -1));
            py.f1(pyVar, true);
            animatorSet = pyVar.c3;
            if (animatorSet != null) {
                animatorSet.cancel();
                pyVar.c3 = null;
            }
            pyVar.d3 = false;
        }
        return pyVar.d3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        py pyVar = this.B0;
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        float height = kVar.getHeight();
        kx kxVar = pyVar.C3;
        float f10 = (kxVar == null || !kxVar.c()) ? 0.0f : pyVar.C3.e;
        if (pyVar.H) {
            height = e2.c.w(1.0f, pyVar.q3, (1.0f - f10) * (1.0f - pyVar.u1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) e2.c.w(1.0f, f10, (1.0f - pyVar.u1) * (1.0f - pyVar.q3) * AndroidUtilities.dp(48.0f), height + pyVar.Q);
    }

    public final int b0() {
        py pyVar = this.B0;
        float f10 = pyVar.K;
        kx kxVar = pyVar.C3;
        return (int) e2.c.w(1.0f, pyVar.u1, org.telegram.messenger.y3.y(1.0f, (kxVar == null || !kxVar.c()) ? 0.0f : pyVar.C3.e, 1.0f - pyVar.q3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        py pyVar = this.B0;
        ow owVar = pyVar.w0;
        int i10 = owVar.g0.get(owVar.H + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        pyVar.j3 = false;
        pyVar.i3 = true;
        this.v0 = (int) (motionEvent.getX() + pyVar.f3);
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        kVar.setEnabled(false);
        pyVar.w0.setEnabled(false);
        oy oyVar = pyVar.b0[1];
        oyVar.h = i10;
        oyVar.setVisibility(0);
        pyVar.e3 = z4;
        py.f1(pyVar, false);
        pyVar.R4(true);
        if (z4) {
            pyVar.b0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        pyVar.b0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
        boolean z4;
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2;
        kx kxVar;
        fy fyVar;
        float f12;
        fg.h0 h0Var;
        float f13;
        fy fyVar2;
        org.telegram.ui.ActionBar.k kVar;
        kx kxVar2;
        py pyVar = this.B0;
        Paint paint = pyVar.c1;
        if (Build.VERSION.SDK_INT >= 31 && pyVar.i4 != null) {
            pyVar.m3();
        }
        if (pyVar.N && (((kxVar2 = pyVar.C3) == null || !kxVar2.c()) && pyVar.q3 == 0.0f)) {
            pyVar.N = false;
            int i10 = (pyVar.Z3() && pyVar.b0[0].s == 0) ? 1 : 0;
            ly lyVar = pyVar.b0[0].a;
            if (pyVar.O) {
                if (!pyVar.Y0) {
                    if (i10 == 0) {
                        pyVar.O = false;
                    }
                    if (pyVar.O) {
                        f2.m1 L = lyVar.L(0, false);
                        if (L == null) {
                            pyVar.O = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= lyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                pyVar.O = false;
                            } else if (view.getTop() >= lyVar.getPaddingTop()) {
                                pyVar.O = false;
                            }
                        }
                        if (pyVar.O) {
                        }
                    }
                }
                i10 = 0;
            }
            f2.m1 L2 = lyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = lyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -pyVar.T3();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    pyVar.C4(f14);
                } else {
                    pyVar.C4(0.0f);
                }
            } else {
                pyVar.C4(-pyVar.T3());
            }
        }
        int a02 = a0();
        z4 = ((org.telegram.ui.ActionBar.p2) pyVar).inPreviewMode;
        int b02 = z4 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        pyVar.C3.setCurrentTop(i11);
        boolean z11 = pyVar.o3;
        Rect rect = this.y0;
        Paint paint2 = this.t0;
        if (z11) {
            float f16 = pyVar.u1;
            if (f16 == 1.0f) {
                paint2.setColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            } else if (f16 == 0.0f && (fyVar2 = pyVar.U) != null) {
                fyVar2.setTranslationY(pyVar.W3() + pyVar.K);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(pyVar.u1 * 2.0f));
            float f17 = pyVar.u1;
            if (f17 < 0.0f) {
                if (f17 == 1.0f) {
                    paint = paint2;
                }
                f10 = 1.0f;
                f11 = 81.0f;
                J(canvas, 0.0f, this.y0, paint, true);
            } else {
                f10 = 1.0f;
                f11 = 81.0f;
            }
            float f18 = pyVar.u1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (!pyVar.m3 && pyVar.n3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(pyVar.u1 * 2.0f));
                    J(canvas, 0.0f, this.y0, paint2, true);
                }
                fy fyVar3 = pyVar.U;
                if (fyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                    int height = kVar.getHeight();
                    fyVar3.setTranslationY(pyVar.W3() + (i11 - (height + (pyVar.w0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            f11 = 81.0f;
            z10 = ((org.telegram.ui.ActionBar.p2) pyVar).inPreviewMode;
            if (!z10) {
                if (pyVar.q3 > 0.0f) {
                    paint2.setColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(pyVar.u1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.y0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(pyVar.u1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.y0, paint, true);
                }
                pyVar.t3 = 0.0f;
                pyVar.s3 = 0.0f;
                float min = pyVar.t3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!pyVar.H ? 81.0f : 0.0f)) + pyVar.K, pyVar.q3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!pyVar.H ? 81.0f : 0.0f)));
                pyVar.t3 = min;
                pyVar.s3 = min;
                kxVar = pyVar.C3;
                if (kxVar == null && kxVar.c()) {
                    float f19 = pyVar.C3.e;
                    float T3 = pyVar.t3 - ((pyVar.T3() + pyVar.K) * f19);
                    pyVar.t3 = T3;
                    pyVar.s3 = T3;
                    float clamp = pyVar.D0 ? f10 - Utilities.clamp(f19 / 0.5f, f10, 0.0f) : 1.0f;
                    ow owVar = pyVar.w0;
                    if (owVar != null && owVar.getVisibility() == 0) {
                        pyVar.t3 -= (f10 - pyVar.r.e) * pyVar.w0.getMeasuredHeight();
                    }
                    fy fyVar4 = pyVar.U;
                    if (fyVar4 != null) {
                        fyVar4.setTranslationY(pyVar.W3() + AndroidUtilities.lerp(pyVar.K + pyVar.t3, -AndroidUtilities.dp(pyVar.H ? 81.0f : 0.0f), f19));
                    }
                    if (pyVar.y) {
                        boolean z12 = pyVar.B;
                        float f20 = z12 ? 0.0f : pyVar.K;
                        f13 = -AndroidUtilities.lerp((-f20) + AndroidUtilities.dp((z12 || !pyVar.w) ? 0.0f : 50.0f), f20, pyVar.C3.e);
                    } else {
                        f13 = 0.0f;
                    }
                    pyVar.b0[0].setTranslationY(f13 - (((pyVar.H ? AndroidUtilities.dp(f11) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * pyVar.C3.e));
                    f12 = clamp;
                } else {
                    fyVar = pyVar.U;
                    if (fyVar != null) {
                        fyVar.setTranslationY(AndroidUtilities.lerp(((pyVar.K + pyVar.t3) + pyVar.Q) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((pyVar.H ? 81 : 0) + 48), pyVar.u1));
                    }
                    f12 = 1.0f;
                }
                pyVar.S4();
                py.N2(pyVar, f12);
                super.dispatchDraw(canvas);
                py.O2(pyVar, canvas2, i11);
                h0Var = pyVar.H0;
                if (h0Var != null && h0Var.getVisibility() == 0) {
                    if (pyVar.H0.getAlpha() != f10) {
                        pyVar.H0.draw(canvas2);
                    } else if (pyVar.H0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(pyVar.H0.getLeft(), pyVar.H0.getTop(), pyVar.H0.getRight(), pyVar.H0.getBottom(), (int) (pyVar.H0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(pyVar.H0.getLeft(), pyVar.H0.getTop());
                        pyVar.H0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!pyVar.T && pyVar.U2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), pyVar.d4);
                }
                pyVar.S = true;
            }
        }
        canvas2 = canvas;
        pyVar.t3 = 0.0f;
        pyVar.s3 = 0.0f;
        float min2 = pyVar.t3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!pyVar.H ? 81.0f : 0.0f)) + pyVar.K, pyVar.q3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!pyVar.H ? 81.0f : 0.0f)));
        pyVar.t3 = min2;
        pyVar.s3 = min2;
        kxVar = pyVar.C3;
        if (kxVar == null) {
        }
        fyVar = pyVar.U;
        if (fyVar != null) {
        }
        f12 = 1.0f;
        pyVar.S4();
        py.N2(pyVar, f12);
        super.dispatchDraw(canvas);
        py.O2(pyVar, canvas2, i11);
        h0Var = pyVar.H0;
        if (h0Var != null) {
            if (pyVar.H0.getAlpha() != f10) {
            }
        }
        if (!pyVar.T) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), pyVar.d4);
        }
        pyVar.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        py pyVar = this.B0;
        if (view == pyVar.H0) {
            return true;
        }
        if (org.telegram.ui.Components.pv0.s0) {
            return super.drawChild(canvas, view, j10);
        }
        oy[] oyVarArr = pyVar.b0;
        if (view == oyVarArr[0] || ((oyVarArr.length > 1 && view == oyVarArr[1]) || view == pyVar.G1 || view == pyVar.w0)) {
            canvas.save();
            if (view != pyVar.G1 && view != pyVar.w0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = pyVar.U3;
            if (f10 != 1.0f) {
                if (pyVar.V3) {
                    canvas.translate((1.0f - pyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float c3 = yh.c(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - pyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(c3, c3, 0.0f, (-getY()) + pyVar.K + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (view != kVar || pyVar.U3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (pyVar.V3) {
            canvas.translate((1.0f - pyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float c10 = yh.c(1.0f, pyVar.U3, 0.05f, 1.0f);
            canvas.translate((1.0f - pyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            canvas.scale(c10, c10, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
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
        org.telegram.ui.Components.j5 j5Var = this.B0.A3;
        if (j5Var != null) {
            j5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.j5 j5Var = this.B0.A3;
        if (j5Var != null) {
            j5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        ow owVar;
        int actionMasked = motionEvent.getActionMasked();
        py pyVar = this.B0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            if (kVar.s()) {
                pyVar.V0 = true;
            }
        }
        return Z() || ((owVar = pyVar.w0) != null && owVar.L) || onTouchEvent(motionEvent);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        py pyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        hx hxVar;
        hx hxVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        iy iyVar = this;
        int childCount = iyVar.getChildCount();
        int R = iyVar.R();
        iyVar.setBottomClip(0);
        int measuredWidth = iyVar.getMeasuredWidth();
        int measuredHeight = iyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            pyVar = iyVar.B0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = iyVar.getChildAt(i20);
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
                            i19 = layoutParams.topMargin + iyVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != pyVar.U || childAt == pyVar.W || childAt == (hxVar2 = pyVar.B0)) {
                            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != pyVar.U && childAt != pyVar.B0 && childAt != pyVar.W) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (pyVar.H && childAt == pyVar.U) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            hxVar = pyVar.B0;
                            if (childAt == hxVar && hxVar.getPremiumHint() != null) {
                                pyVar.B0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, pyVar.B0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == pyVar.U) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == pyVar.z0) {
                            i19 = -AndroidUtilities.dp(pyVar.a);
                        } else if (childAt instanceof av) {
                            kVar3 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof oy) {
                            i19 = 0;
                        } else if (childAt == pyVar.G1 || childAt == pyVar.H1 || childAt == pyVar.w0) {
                            kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (hxVar2 != null && hxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != pyVar.U) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != pyVar.U) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (pyVar.H) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    hxVar = pyVar.B0;
                    if (childAt == hxVar) {
                        pyVar.B0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, pyVar.B0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == pyVar.U) {
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
                if (childAt != pyVar.U) {
                }
                kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != pyVar.U) {
                }
                if (pyVar.H) {
                }
                hxVar = pyVar.B0;
                if (childAt == hxVar) {
                }
                if (childAt == pyVar.U) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            iyVar = this;
        }
        yx yxVar = pyVar.z0;
        if (yxVar != null) {
            yxVar.setKeyboardHeight(R);
        }
        S();
        pyVar.X4();
        pyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        py pyVar = this.B0;
        int i12 = pyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z4 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = pyVar.j0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof av) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof oy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (pyVar.C3.c()) {
                            if (pyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (pyVar.H) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + pyVar.M;
                        if (pyVar.r3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = pyVar.W3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        yx yxVar = pyVar.z0;
                        if (childAt == yxVar) {
                            yxVar.setTranslationY(pyVar.F0);
                            pyVar.z0.m0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            pyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ax axVar = pyVar.y1;
                            if (axVar == null || !axVar.u0(childAt)) {
                                if (childAt == pyVar.C3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = pyVar.W3 ? (int) (size4 * 0.05f) : 0;
                                    pyVar.C3.setTransitionPaddingBottom(i16);
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
        if (z4 != this.z0) {
            post(new hy(this, 1));
            this.z0 = z4;
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
        org.telegram.ui.ActionBar.f5 f5Var;
        ow owVar;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z4;
        int i10;
        int i11;
        vg.f fVar;
        py pyVar = this.B0;
        f5Var = ((org.telegram.ui.ActionBar.p2) pyVar).parentLayout;
        Object[] objArr = 0;
        if (f5Var != null && (owVar = pyVar.w0) != null && !owVar.n && !pyVar.g2 && !pyVar.C3.c()) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) pyVar).parentLayout;
            if (!((ActionBarLayout) f5Var2).j()) {
                f5Var3 = ((org.telegram.ui.ActionBar.p2) pyVar).parentLayout;
                if (!((ActionBarLayout) f5Var3).y()) {
                    f5Var4 = ((org.telegram.ui.ActionBar.p2) pyVar).parentLayout;
                    if (!((ActionBarLayout) f5Var4).n && (motionEvent == null || pyVar.i3 || (motionEvent.getY() > a0() + b0() && ((fVar = pyVar.v1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < pyVar.v1.getY())))) {
                        if (pyVar.O0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    oy oyVar = pyVar.b0[0];
                                    if (oyVar != null) {
                                        int i12 = oyVar.d.h;
                                        if (i12 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.x0 == null) {
                                this.x0 = VelocityTracker.obtain();
                            }
                            this.x0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && Z()) {
                            pyVar.i3 = true;
                            this.u0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.v0 = x10;
                            if (pyVar.e3) {
                                if (x10 < pyVar.b0[0].getTranslationX() + pyVar.b0[0].getMeasuredWidth()) {
                                    pyVar.f3 = pyVar.b0[0].getTranslationX();
                                } else {
                                    oy[] oyVarArr = pyVar.b0;
                                    oy oyVar2 = oyVarArr[0];
                                    oy oyVar3 = oyVarArr[1];
                                    oyVarArr[0] = oyVar3;
                                    oyVarArr[1] = oyVar2;
                                    pyVar.e3 = false;
                                    pyVar.f3 = oyVar3.getTranslationX();
                                    pyVar.w0.g(1.0f, pyVar.b0[0].h);
                                    pyVar.w0.g(pyVar.f3 / r10[0].getMeasuredWidth(), pyVar.b0[1].h);
                                    pyVar.R4(true);
                                    pyVar.b0[0].d.getClass();
                                    pyVar.b0[1].d.getClass();
                                }
                            } else if (x10 < pyVar.b0[1].getTranslationX() + pyVar.b0[1].getMeasuredWidth()) {
                                oy[] oyVarArr2 = pyVar.b0;
                                oy oyVar4 = oyVarArr2[0];
                                oy oyVar5 = oyVarArr2[1];
                                oyVarArr2[0] = oyVar5;
                                oyVarArr2[1] = oyVar4;
                                pyVar.e3 = true;
                                pyVar.f3 = oyVar5.getTranslationX();
                                pyVar.w0.g(1.0f, pyVar.b0[0].h);
                                pyVar.w0.g((-pyVar.f3) / r10[0].getMeasuredWidth(), pyVar.b0[1].h);
                                pyVar.R4(true);
                                pyVar.b0[0].d.getClass();
                                pyVar.b0[1].d.getClass();
                            } else {
                                pyVar.f3 = pyVar.b0[0].getTranslationX();
                            }
                            pyVar.c3.removeAllListeners();
                            pyVar.c3.cancel();
                            pyVar.d3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            pyVar.f3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !pyVar.i3 && !pyVar.j3 && pyVar.w0.getVisibility() == 0) {
                            this.u0 = motionEvent.getPointerId(0);
                            pyVar.j3 = true;
                            this.v0 = (int) motionEvent.getX();
                            this.w0 = (int) motionEvent.getY();
                            this.x0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.u0) {
                            int x11 = (int) ((motionEvent.getX() - this.v0) + pyVar.f3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.w0);
                            if (pyVar.i3 && (((z4 = pyVar.e3) && x11 > 0) || (!z4 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    pyVar.j3 = true;
                                    pyVar.i3 = false;
                                    pyVar.b0[0].setTranslationX(0.0f);
                                    pyVar.b0[1].setTranslationX(pyVar.e3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    pyVar.w0.g(0.0f, pyVar.b0[1].h);
                                }
                            }
                            if (pyVar.j3 && !pyVar.i3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.v0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (pyVar.i3) {
                                pyVar.b0[0].setTranslationX(x11);
                                if (pyVar.e3) {
                                    pyVar.b0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    pyVar.b0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / pyVar.b0[0].getMeasuredWidth();
                                oy oyVar6 = pyVar.b0[1];
                                if (oyVar6.B && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    pyVar.w0.i(pyVar.b0[1].h);
                                    AndroidUtilities.runOnUIThread(new hy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                pyVar.w0.g(abs2, oyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.u0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.x0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, pyVar.h3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.x0.getXVelocity();
                                f11 = this.x0.getYVelocity();
                                if (!pyVar.i3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    c0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (pyVar.i3) {
                                float x13 = pyVar.b0[0].getX();
                                pyVar.c3 = new AnimatorSet();
                                if (pyVar.b0[1].B) {
                                    pyVar.g3 = true;
                                } else if (pyVar.f3 == 0.0f) {
                                    pyVar.g3 = Math.abs(x13) < ((float) pyVar.b0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z10 = pyVar.e3 ? false : false;
                                    pyVar.g3 = z10;
                                } else if (pyVar.e3) {
                                    pyVar.g3 = pyVar.b0[1].getX() > ((float) (pyVar.b0[0].getMeasuredWidth() >> 1));
                                } else {
                                    pyVar.g3 = pyVar.b0[0].getX() < ((float) (pyVar.b0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z11 = pyVar.g3;
                                Property property = View.TRANSLATION_X;
                                if (z11) {
                                    measuredWidth = Math.abs(x13);
                                    if (pyVar.e3) {
                                        pyVar.c3.playTogether(ObjectAnimator.ofFloat(pyVar.b0[0], (Property<oy, Float>) property, 0.0f), ObjectAnimator.ofFloat(pyVar.b0[1], (Property<oy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        pyVar.c3.playTogether(ObjectAnimator.ofFloat(pyVar.b0[0], (Property<oy, Float>) property, 0.0f), ObjectAnimator.ofFloat(pyVar.b0[1], (Property<oy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = pyVar.b0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (pyVar.e3) {
                                        pyVar.c3.playTogether(ObjectAnimator.ofFloat(pyVar.b0[0], (Property<oy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(pyVar.b0[1], (Property<oy, Float>) property, 0.0f));
                                    } else {
                                        pyVar.c3.playTogether(ObjectAnimator.ofFloat(pyVar.b0[0], (Property<oy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(pyVar.b0[1], (Property<oy, Float>) property, 0.0f));
                                    }
                                }
                                pyVar.c3.setInterpolator(py.w4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                pyVar.c3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                pyVar.c3.addListener(new org.telegram.ui.Components.f91(this, 17));
                                pyVar.c3.start();
                                pyVar.d3 = true;
                                pyVar.i3 = false;
                            } else {
                                pyVar.j3 = false;
                                kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                                kVar.setEnabled(true);
                                pyVar.w0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.x0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.x0 = null;
                            }
                        }
                        return pyVar.i3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        py pyVar = this.B0;
        if (pyVar.j3 && !pyVar.i3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
