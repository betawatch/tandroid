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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hy extends org.telegram.ui.Components.qv0 {
    public final yd.b A0;
    public final /* synthetic */ oy B0;
    public final Paint t0;
    public int u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public final Rect y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(Context context, oy oyVar) {
        super(context, null);
        this.B0 = oyVar;
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
    
        if (org.telegram.ui.ActionBar.j6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.qv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            oy oyVar = this.B0;
            if (oyVar.j4 != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) oyVar).resourceProvider;
                if (rg.b.c(i10, f6Var)) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) oyVar).resourceProvider;
                    if (f6Var2 != null) {
                        f6Var3 = ((org.telegram.ui.ActionBar.p2) oyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    oyVar.j4.X(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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

    @Override // org.telegram.ui.Components.qv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        xx xxVar;
        org.telegram.ui.Components.sl0 p10;
        oy oyVar = this.B0;
        if (oyVar.m3 && (xxVar = oyVar.z0) != null && xxVar.getVisibility() == 0) {
            xx xxVar2 = oyVar.z0;
            View[] viewArr = xxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.l81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + xxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void M() {
        super.M();
        this.B0.m3();
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        oy oyVar = this.B0;
        if (!oyVar.d3) {
            return false;
        }
        if (!oyVar.g3) {
            if (Math.abs(oyVar.b0[1].getTranslationX()) < 1.0f) {
                oyVar.b0[0].setTranslationX(r1.getMeasuredWidth() * (oyVar.e3 ? -1 : 1));
                oyVar.b0[1].setTranslationX(0.0f);
                oy.f1(oyVar, true);
                animatorSet = oyVar.c3;
                if (animatorSet != null) {
                }
                oyVar.d3 = false;
            }
            return oyVar.d3;
        }
        if (Math.abs(oyVar.b0[0].getTranslationX()) < 1.0f) {
            oyVar.b0[0].setTranslationX(0.0f);
            oyVar.b0[1].setTranslationX(r1[0].getMeasuredWidth() * (oyVar.e3 ? 1 : -1));
            oy.f1(oyVar, true);
            animatorSet = oyVar.c3;
            if (animatorSet != null) {
                animatorSet.cancel();
                oyVar.c3 = null;
            }
            oyVar.d3 = false;
        }
        return oyVar.d3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        oy oyVar = this.B0;
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        float height = kVar.getHeight();
        jx jxVar = oyVar.C3;
        float f10 = (jxVar == null || !jxVar.c()) ? 0.0f : oyVar.C3.e;
        if (oyVar.H) {
            height = e2.c.w(1.0f, oyVar.q3, (1.0f - f10) * (1.0f - oyVar.u1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) e2.c.w(1.0f, f10, (1.0f - oyVar.u1) * (1.0f - oyVar.q3) * AndroidUtilities.dp(48.0f), height + oyVar.Q);
    }

    public final int b0() {
        oy oyVar = this.B0;
        float f10 = oyVar.K;
        jx jxVar = oyVar.C3;
        return (int) e2.c.w(1.0f, oyVar.u1, org.telegram.messenger.y3.y(1.0f, (jxVar == null || !jxVar.c()) ? 0.0f : oyVar.C3.e, 1.0f - oyVar.q3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        oy oyVar = this.B0;
        nw nwVar = oyVar.w0;
        int i10 = nwVar.g0.get(nwVar.H + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        oyVar.j3 = false;
        oyVar.i3 = true;
        this.v0 = (int) (motionEvent.getX() + oyVar.f3);
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        kVar.setEnabled(false);
        oyVar.w0.setEnabled(false);
        ny nyVar = oyVar.b0[1];
        nyVar.h = i10;
        nyVar.setVisibility(0);
        oyVar.e3 = z4;
        oy.f1(oyVar, false);
        oyVar.R4(true);
        if (z4) {
            oyVar.b0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        oyVar.b0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2;
        jx jxVar;
        ey eyVar;
        float f12;
        eg.h0 h0Var;
        float f13;
        ey eyVar2;
        org.telegram.ui.ActionBar.k kVar;
        jx jxVar2;
        oy oyVar = this.B0;
        Paint paint = oyVar.c1;
        if (Build.VERSION.SDK_INT >= 31 && oyVar.i4 != null) {
            oyVar.m3();
        }
        if (oyVar.N && (((jxVar2 = oyVar.C3) == null || !jxVar2.c()) && oyVar.q3 == 0.0f)) {
            oyVar.N = false;
            int i10 = (oyVar.Z3() && oyVar.b0[0].s == 0) ? 1 : 0;
            ky kyVar = oyVar.b0[0].a;
            if (oyVar.O) {
                if (!oyVar.Y0) {
                    if (i10 == 0) {
                        oyVar.O = false;
                    }
                    if (oyVar.O) {
                        f2.l1 L = kyVar.L(0, false);
                        if (L == null) {
                            oyVar.O = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= kyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                oyVar.O = false;
                            } else if (view.getTop() >= kyVar.getPaddingTop()) {
                                oyVar.O = false;
                            }
                        }
                        if (oyVar.O) {
                        }
                    }
                }
                i10 = 0;
            }
            f2.l1 L2 = kyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = kyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -oyVar.T3();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    oyVar.C4(f14);
                } else {
                    oyVar.C4(0.0f);
                }
            } else {
                oyVar.C4(-oyVar.T3());
            }
        }
        int a02 = a0();
        z4 = ((org.telegram.ui.ActionBar.p2) oyVar).inPreviewMode;
        int b02 = z4 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        oyVar.C3.setCurrentTop(i11);
        boolean z11 = oyVar.o3;
        Rect rect = this.y0;
        Paint paint2 = this.t0;
        if (z11) {
            float f16 = oyVar.u1;
            if (f16 == 1.0f) {
                paint2.setColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            } else if (f16 == 0.0f && (eyVar2 = oyVar.U) != null) {
                eyVar2.setTranslationY(oyVar.W3() + oyVar.K);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(oyVar.u1 * 2.0f));
            float f17 = oyVar.u1;
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
            float f18 = oyVar.u1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (!oyVar.m3 && oyVar.n3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(oyVar.u1 * 2.0f));
                    J(canvas, 0.0f, this.y0, paint2, true);
                }
                ey eyVar3 = oyVar.U;
                if (eyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                    int height = kVar.getHeight();
                    eyVar3.setTranslationY(oyVar.W3() + (i11 - (height + (oyVar.w0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            f11 = 81.0f;
            z10 = ((org.telegram.ui.ActionBar.p2) oyVar).inPreviewMode;
            if (!z10) {
                if (oyVar.q3 > 0.0f) {
                    paint2.setColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(oyVar.u1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.y0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(oyVar.u1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.y0, paint, true);
                }
                oyVar.t3 = 0.0f;
                oyVar.s3 = 0.0f;
                float min = oyVar.t3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!oyVar.H ? 81.0f : 0.0f)) + oyVar.K, oyVar.q3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!oyVar.H ? 81.0f : 0.0f)));
                oyVar.t3 = min;
                oyVar.s3 = min;
                jxVar = oyVar.C3;
                if (jxVar == null && jxVar.c()) {
                    float f19 = oyVar.C3.e;
                    float T3 = oyVar.t3 - ((oyVar.T3() + oyVar.K) * f19);
                    oyVar.t3 = T3;
                    oyVar.s3 = T3;
                    float clamp = oyVar.D0 ? f10 - Utilities.clamp(f19 / 0.5f, f10, 0.0f) : 1.0f;
                    nw nwVar = oyVar.w0;
                    if (nwVar != null && nwVar.getVisibility() == 0) {
                        oyVar.t3 -= (f10 - oyVar.r.e) * oyVar.w0.getMeasuredHeight();
                    }
                    ey eyVar4 = oyVar.U;
                    if (eyVar4 != null) {
                        eyVar4.setTranslationY(oyVar.W3() + AndroidUtilities.lerp(oyVar.K + oyVar.t3, -AndroidUtilities.dp(oyVar.H ? 81.0f : 0.0f), f19));
                    }
                    if (oyVar.y) {
                        boolean z12 = oyVar.B;
                        float f20 = z12 ? 0.0f : oyVar.K;
                        f13 = -AndroidUtilities.lerp((-f20) + AndroidUtilities.dp((z12 || !oyVar.w) ? 0.0f : 50.0f), f20, oyVar.C3.e);
                    } else {
                        f13 = 0.0f;
                    }
                    oyVar.b0[0].setTranslationY(f13 - (((oyVar.H ? AndroidUtilities.dp(f11) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * oyVar.C3.e));
                    f12 = clamp;
                } else {
                    eyVar = oyVar.U;
                    if (eyVar != null) {
                        eyVar.setTranslationY(AndroidUtilities.lerp(((oyVar.K + oyVar.t3) + oyVar.Q) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((oyVar.H ? 81 : 0) + 48), oyVar.u1));
                    }
                    f12 = 1.0f;
                }
                oyVar.S4();
                oy.N2(oyVar, f12);
                super.dispatchDraw(canvas);
                oy.O2(oyVar, canvas2, i11);
                h0Var = oyVar.H0;
                if (h0Var != null && h0Var.getVisibility() == 0) {
                    if (oyVar.H0.getAlpha() != f10) {
                        oyVar.H0.draw(canvas2);
                    } else if (oyVar.H0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(oyVar.H0.getLeft(), oyVar.H0.getTop(), oyVar.H0.getRight(), oyVar.H0.getBottom(), (int) (oyVar.H0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(oyVar.H0.getLeft(), oyVar.H0.getTop());
                        oyVar.H0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!oyVar.T && oyVar.U2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), oyVar.d4);
                }
                oyVar.S = true;
            }
        }
        canvas2 = canvas;
        oyVar.t3 = 0.0f;
        oyVar.s3 = 0.0f;
        float min2 = oyVar.t3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!oyVar.H ? 81.0f : 0.0f)) + oyVar.K, oyVar.q3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!oyVar.H ? 81.0f : 0.0f)));
        oyVar.t3 = min2;
        oyVar.s3 = min2;
        jxVar = oyVar.C3;
        if (jxVar == null) {
        }
        eyVar = oyVar.U;
        if (eyVar != null) {
        }
        f12 = 1.0f;
        oyVar.S4();
        oy.N2(oyVar, f12);
        super.dispatchDraw(canvas);
        oy.O2(oyVar, canvas2, i11);
        h0Var = oyVar.H0;
        if (h0Var != null) {
            if (oyVar.H0.getAlpha() != f10) {
            }
        }
        if (!oyVar.T) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), oyVar.d4);
        }
        oyVar.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        oy oyVar = this.B0;
        if (view == oyVar.H0) {
            return true;
        }
        if (org.telegram.ui.Components.qv0.s0) {
            return super.drawChild(canvas, view, j10);
        }
        ny[] nyVarArr = oyVar.b0;
        if (view == nyVarArr[0] || ((nyVarArr.length > 1 && view == nyVarArr[1]) || view == oyVar.G1 || view == oyVar.w0)) {
            canvas.save();
            if (view != oyVar.G1 && view != oyVar.w0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = oyVar.U3;
            if (f10 != 1.0f) {
                if (oyVar.V3) {
                    canvas.translate((1.0f - oyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float c3 = yh.c(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - oyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(c3, c3, 0.0f, (-getY()) + oyVar.K + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (view != kVar || oyVar.U3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (oyVar.V3) {
            canvas.translate((1.0f - oyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float c10 = yh.c(1.0f, oyVar.U3, 0.05f, 1.0f);
            canvas.translate((1.0f - oyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
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

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.j5 j5Var = this.B0.A3;
        if (j5Var != null) {
            j5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
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
        nw nwVar;
        int actionMasked = motionEvent.getActionMasked();
        oy oyVar = this.B0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            if (kVar.s()) {
                oyVar.V0 = true;
            }
        }
        return Z() || ((nwVar = oyVar.w0) != null && nwVar.L) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        oy oyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        gx gxVar;
        gx gxVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        hy hyVar = this;
        int childCount = hyVar.getChildCount();
        int R = hyVar.R();
        hyVar.setBottomClip(0);
        int measuredWidth = hyVar.getMeasuredWidth();
        int measuredHeight = hyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            oyVar = hyVar.B0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = hyVar.getChildAt(i20);
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
                            i19 = layoutParams.topMargin + hyVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != oyVar.U || childAt == oyVar.W || childAt == (gxVar2 = oyVar.B0)) {
                            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != oyVar.U && childAt != oyVar.B0 && childAt != oyVar.W) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (oyVar.H && childAt == oyVar.U) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            gxVar = oyVar.B0;
                            if (childAt == gxVar && gxVar.getPremiumHint() != null) {
                                oyVar.B0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, oyVar.B0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == oyVar.U) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == oyVar.z0) {
                            i19 = -AndroidUtilities.dp(oyVar.a);
                        } else if (childAt instanceof zu) {
                            kVar3 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof ny) {
                            i19 = 0;
                        } else if (childAt == oyVar.G1 || childAt == oyVar.H1 || childAt == oyVar.w0) {
                            kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (gxVar2 != null && gxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != oyVar.U) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != oyVar.U) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (oyVar.H) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    gxVar = oyVar.B0;
                    if (childAt == gxVar) {
                        oyVar.B0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, oyVar.B0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == oyVar.U) {
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
                if (childAt != oyVar.U) {
                }
                kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != oyVar.U) {
                }
                if (oyVar.H) {
                }
                gxVar = oyVar.B0;
                if (childAt == gxVar) {
                }
                if (childAt == oyVar.U) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            hyVar = this;
        }
        xx xxVar = oyVar.z0;
        if (xxVar != null) {
            xxVar.setKeyboardHeight(R);
        }
        S();
        oyVar.X4();
        oyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        oy oyVar = this.B0;
        int i12 = oyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z4 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = oyVar.j0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof zu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof ny) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (oyVar.C3.c()) {
                            if (oyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (oyVar.H) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + oyVar.M;
                        if (oyVar.r3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = oyVar.W3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        xx xxVar = oyVar.z0;
                        if (childAt == xxVar) {
                            xxVar.setTranslationY(oyVar.F0);
                            oyVar.z0.m0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            oyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            zw zwVar = oyVar.y1;
                            if (zwVar == null || !zwVar.u0(childAt)) {
                                if (childAt == oyVar.C3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = oyVar.W3 ? (int) (size4 * 0.05f) : 0;
                                    oyVar.C3.setTransitionPaddingBottom(i16);
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
            post(new gy(this, 1));
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
        org.telegram.ui.ActionBar.e5 e5Var;
        nw nwVar;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.e5 e5Var3;
        org.telegram.ui.ActionBar.e5 e5Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z4;
        int i10;
        int i11;
        ug.f fVar;
        oy oyVar = this.B0;
        e5Var = ((org.telegram.ui.ActionBar.p2) oyVar).parentLayout;
        Object[] objArr = 0;
        if (e5Var != null && (nwVar = oyVar.w0) != null && !nwVar.n && !oyVar.g2 && !oyVar.C3.c()) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) oyVar).parentLayout;
            if (!((ActionBarLayout) e5Var2).j()) {
                e5Var3 = ((org.telegram.ui.ActionBar.p2) oyVar).parentLayout;
                if (!((ActionBarLayout) e5Var3).y()) {
                    e5Var4 = ((org.telegram.ui.ActionBar.p2) oyVar).parentLayout;
                    if (!((ActionBarLayout) e5Var4).n && (motionEvent == null || oyVar.i3 || (motionEvent.getY() > a0() + b0() && ((fVar = oyVar.v1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < oyVar.v1.getY())))) {
                        if (oyVar.O0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    ny nyVar = oyVar.b0[0];
                                    if (nyVar != null) {
                                        int i12 = nyVar.d.h;
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
                            oyVar.i3 = true;
                            this.u0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.v0 = x10;
                            if (oyVar.e3) {
                                if (x10 < oyVar.b0[0].getTranslationX() + oyVar.b0[0].getMeasuredWidth()) {
                                    oyVar.f3 = oyVar.b0[0].getTranslationX();
                                } else {
                                    ny[] nyVarArr = oyVar.b0;
                                    ny nyVar2 = nyVarArr[0];
                                    ny nyVar3 = nyVarArr[1];
                                    nyVarArr[0] = nyVar3;
                                    nyVarArr[1] = nyVar2;
                                    oyVar.e3 = false;
                                    oyVar.f3 = nyVar3.getTranslationX();
                                    oyVar.w0.g(1.0f, oyVar.b0[0].h);
                                    oyVar.w0.g(oyVar.f3 / r10[0].getMeasuredWidth(), oyVar.b0[1].h);
                                    oyVar.R4(true);
                                    oyVar.b0[0].d.getClass();
                                    oyVar.b0[1].d.getClass();
                                }
                            } else if (x10 < oyVar.b0[1].getTranslationX() + oyVar.b0[1].getMeasuredWidth()) {
                                ny[] nyVarArr2 = oyVar.b0;
                                ny nyVar4 = nyVarArr2[0];
                                ny nyVar5 = nyVarArr2[1];
                                nyVarArr2[0] = nyVar5;
                                nyVarArr2[1] = nyVar4;
                                oyVar.e3 = true;
                                oyVar.f3 = nyVar5.getTranslationX();
                                oyVar.w0.g(1.0f, oyVar.b0[0].h);
                                oyVar.w0.g((-oyVar.f3) / r10[0].getMeasuredWidth(), oyVar.b0[1].h);
                                oyVar.R4(true);
                                oyVar.b0[0].d.getClass();
                                oyVar.b0[1].d.getClass();
                            } else {
                                oyVar.f3 = oyVar.b0[0].getTranslationX();
                            }
                            oyVar.c3.removeAllListeners();
                            oyVar.c3.cancel();
                            oyVar.d3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            oyVar.f3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !oyVar.i3 && !oyVar.j3 && oyVar.w0.getVisibility() == 0) {
                            this.u0 = motionEvent.getPointerId(0);
                            oyVar.j3 = true;
                            this.v0 = (int) motionEvent.getX();
                            this.w0 = (int) motionEvent.getY();
                            this.x0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.u0) {
                            int x11 = (int) ((motionEvent.getX() - this.v0) + oyVar.f3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.w0);
                            if (oyVar.i3 && (((z4 = oyVar.e3) && x11 > 0) || (!z4 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    oyVar.j3 = true;
                                    oyVar.i3 = false;
                                    oyVar.b0[0].setTranslationX(0.0f);
                                    oyVar.b0[1].setTranslationX(oyVar.e3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    oyVar.w0.g(0.0f, oyVar.b0[1].h);
                                }
                            }
                            if (oyVar.j3 && !oyVar.i3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.v0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (oyVar.i3) {
                                oyVar.b0[0].setTranslationX(x11);
                                if (oyVar.e3) {
                                    oyVar.b0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    oyVar.b0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / oyVar.b0[0].getMeasuredWidth();
                                ny nyVar6 = oyVar.b0[1];
                                if (nyVar6.B && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    oyVar.w0.i(oyVar.b0[1].h);
                                    AndroidUtilities.runOnUIThread(new gy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                oyVar.w0.g(abs2, nyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.u0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.x0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, oyVar.h3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.x0.getXVelocity();
                                f11 = this.x0.getYVelocity();
                                if (!oyVar.i3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    c0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (oyVar.i3) {
                                float x13 = oyVar.b0[0].getX();
                                oyVar.c3 = new AnimatorSet();
                                if (oyVar.b0[1].B) {
                                    oyVar.g3 = true;
                                } else if (oyVar.f3 == 0.0f) {
                                    oyVar.g3 = Math.abs(x13) < ((float) oyVar.b0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z10 = oyVar.e3 ? false : false;
                                    oyVar.g3 = z10;
                                } else if (oyVar.e3) {
                                    oyVar.g3 = oyVar.b0[1].getX() > ((float) (oyVar.b0[0].getMeasuredWidth() >> 1));
                                } else {
                                    oyVar.g3 = oyVar.b0[0].getX() < ((float) (oyVar.b0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z11 = oyVar.g3;
                                Property property = View.TRANSLATION_X;
                                if (z11) {
                                    measuredWidth = Math.abs(x13);
                                    if (oyVar.e3) {
                                        oyVar.c3.playTogether(ObjectAnimator.ofFloat(oyVar.b0[0], (Property<ny, Float>) property, 0.0f), ObjectAnimator.ofFloat(oyVar.b0[1], (Property<ny, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        oyVar.c3.playTogether(ObjectAnimator.ofFloat(oyVar.b0[0], (Property<ny, Float>) property, 0.0f), ObjectAnimator.ofFloat(oyVar.b0[1], (Property<ny, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = oyVar.b0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (oyVar.e3) {
                                        oyVar.c3.playTogether(ObjectAnimator.ofFloat(oyVar.b0[0], (Property<ny, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(oyVar.b0[1], (Property<ny, Float>) property, 0.0f));
                                    } else {
                                        oyVar.c3.playTogether(ObjectAnimator.ofFloat(oyVar.b0[0], (Property<ny, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(oyVar.b0[1], (Property<ny, Float>) property, 0.0f));
                                    }
                                }
                                oyVar.c3.setInterpolator(oy.w4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                oyVar.c3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                oyVar.c3.addListener(new org.telegram.ui.Components.f91(this, 17));
                                oyVar.c3.start();
                                oyVar.d3 = true;
                                oyVar.i3 = false;
                            } else {
                                oyVar.j3 = false;
                                kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                                kVar.setEnabled(true);
                                oyVar.w0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.x0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.x0 = null;
                            }
                        }
                        return oyVar.i3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        oy oyVar = this.B0;
        if (oyVar.j3 && !oyVar.i3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
