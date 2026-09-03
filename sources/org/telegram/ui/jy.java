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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jy extends org.telegram.ui.Components.qv0 {
    public final yd.b A0;
    public final /* synthetic */ qy B0;
    public final Paint t0;
    public int u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public final Rect y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(Context context, qy qyVar) {
        super(context, null);
        this.B0 = qyVar;
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
            qy qyVar = this.B0;
            if (qyVar.j4 != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
                if (rg.b.c(i10, f6Var)) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
                    if (f6Var2 != null) {
                        f6Var3 = ((org.telegram.ui.ActionBar.p2) qyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    qyVar.j4.H(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
        zx zxVar;
        org.telegram.ui.Components.rl0 p10;
        qy qyVar = this.B0;
        if (qyVar.m3 && (zxVar = qyVar.z0) != null && zxVar.getVisibility() == 0) {
            zx zxVar2 = qyVar.z0;
            View[] viewArr = zxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.l81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p10.getChildCount(); i11++) {
                        View childAt = p10.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p10.getY() + viewArr[i10].getY() + zxVar2.getY());
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
        qy qyVar = this.B0;
        if (!qyVar.d3) {
            return false;
        }
        if (!qyVar.g3) {
            if (Math.abs(qyVar.b0[1].getTranslationX()) < 1.0f) {
                qyVar.b0[0].setTranslationX(r1.getMeasuredWidth() * (qyVar.e3 ? -1 : 1));
                qyVar.b0[1].setTranslationX(0.0f);
                qy.f1(qyVar, true);
                animatorSet = qyVar.c3;
                if (animatorSet != null) {
                }
                qyVar.d3 = false;
            }
            return qyVar.d3;
        }
        if (Math.abs(qyVar.b0[0].getTranslationX()) < 1.0f) {
            qyVar.b0[0].setTranslationX(0.0f);
            qyVar.b0[1].setTranslationX(r1[0].getMeasuredWidth() * (qyVar.e3 ? 1 : -1));
            qy.f1(qyVar, true);
            animatorSet = qyVar.c3;
            if (animatorSet != null) {
                animatorSet.cancel();
                qyVar.c3 = null;
            }
            qyVar.d3 = false;
        }
        return qyVar.d3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.B0;
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        float height = kVar.getHeight();
        lx lxVar = qyVar.C3;
        float f10 = (lxVar == null || !lxVar.c()) ? 0.0f : qyVar.C3.e;
        if (qyVar.H) {
            height = e2.c.w(1.0f, qyVar.q3, (1.0f - f10) * (1.0f - qyVar.u1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) e2.c.w(1.0f, f10, (1.0f - qyVar.u1) * (1.0f - qyVar.q3) * AndroidUtilities.dp(48.0f), height + qyVar.Q);
    }

    public final int b0() {
        qy qyVar = this.B0;
        float f10 = qyVar.K;
        lx lxVar = qyVar.C3;
        return (int) e2.c.w(1.0f, qyVar.u1, org.telegram.messenger.y3.y(1.0f, (lxVar == null || !lxVar.c()) ? 0.0f : qyVar.C3.e, 1.0f - qyVar.q3, f10), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z4) {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.B0;
        pw pwVar = qyVar.w0;
        int i10 = pwVar.g0.get(pwVar.H + (z4 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        qyVar.j3 = false;
        qyVar.i3 = true;
        this.v0 = (int) (motionEvent.getX() + qyVar.f3);
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        kVar.setEnabled(false);
        qyVar.w0.setEnabled(false);
        py pyVar = qyVar.b0[1];
        pyVar.h = i10;
        pyVar.setVisibility(0);
        qyVar.e3 = z4;
        qy.f1(qyVar, false);
        qyVar.R4(true);
        if (z4) {
            qyVar.b0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        qyVar.b0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
        lx lxVar;
        gy gyVar;
        float f12;
        eg.h0 h0Var;
        float f13;
        gy gyVar2;
        org.telegram.ui.ActionBar.k kVar;
        lx lxVar2;
        qy qyVar = this.B0;
        Paint paint = qyVar.c1;
        if (Build.VERSION.SDK_INT >= 31 && qyVar.i4 != null) {
            qyVar.m3();
        }
        if (qyVar.N && (((lxVar2 = qyVar.C3) == null || !lxVar2.c()) && qyVar.q3 == 0.0f)) {
            qyVar.N = false;
            int i10 = (qyVar.Z3() && qyVar.b0[0].s == 0) ? 1 : 0;
            my myVar = qyVar.b0[0].a;
            if (qyVar.O) {
                if (!qyVar.Y0) {
                    if (i10 == 0) {
                        qyVar.O = false;
                    }
                    if (qyVar.O) {
                        f2.l1 L = myVar.L(0, false);
                        if (L == null) {
                            qyVar.O = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= myVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                qyVar.O = false;
                            } else if (view.getTop() >= myVar.getPaddingTop()) {
                                qyVar.O = false;
                            }
                        }
                        if (qyVar.O) {
                        }
                    }
                }
                i10 = 0;
            }
            f2.l1 L2 = myVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = myVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -qyVar.T3();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    qyVar.C4(f14);
                } else {
                    qyVar.C4(0.0f);
                }
            } else {
                qyVar.C4(-qyVar.T3());
            }
        }
        int a02 = a0();
        z4 = ((org.telegram.ui.ActionBar.p2) qyVar).inPreviewMode;
        int b02 = z4 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        qyVar.C3.setCurrentTop(i11);
        boolean z11 = qyVar.o3;
        Rect rect = this.y0;
        Paint paint2 = this.t0;
        if (z11) {
            float f16 = qyVar.u1;
            if (f16 == 1.0f) {
                paint2.setColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            } else if (f16 == 0.0f && (gyVar2 = qyVar.U) != null) {
                gyVar2.setTranslationY(qyVar.W3() + qyVar.K);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.u1 * 2.0f));
            float f17 = qyVar.u1;
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
            float f18 = qyVar.u1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (!qyVar.m3 && qyVar.n3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.u1 * 2.0f));
                    J(canvas, 0.0f, this.y0, paint2, true);
                }
                gy gyVar3 = qyVar.U;
                if (gyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                    int height = kVar.getHeight();
                    gyVar3.setTranslationY(qyVar.W3() + (i11 - (height + (qyVar.w0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            f11 = 81.0f;
            z10 = ((org.telegram.ui.ActionBar.p2) qyVar).inPreviewMode;
            if (!z10) {
                if (qyVar.q3 > 0.0f) {
                    paint2.setColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.u1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.y0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.u1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.y0, paint, true);
                }
                qyVar.t3 = 0.0f;
                qyVar.s3 = 0.0f;
                float min = qyVar.t3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.H ? 81.0f : 0.0f)) + qyVar.K, qyVar.q3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.H ? 81.0f : 0.0f)));
                qyVar.t3 = min;
                qyVar.s3 = min;
                lxVar = qyVar.C3;
                if (lxVar == null && lxVar.c()) {
                    float f19 = qyVar.C3.e;
                    float T3 = qyVar.t3 - ((qyVar.T3() + qyVar.K) * f19);
                    qyVar.t3 = T3;
                    qyVar.s3 = T3;
                    float clamp = qyVar.D0 ? f10 - Utilities.clamp(f19 / 0.5f, f10, 0.0f) : 1.0f;
                    pw pwVar = qyVar.w0;
                    if (pwVar != null && pwVar.getVisibility() == 0) {
                        qyVar.t3 -= (f10 - qyVar.r.e) * qyVar.w0.getMeasuredHeight();
                    }
                    gy gyVar4 = qyVar.U;
                    if (gyVar4 != null) {
                        gyVar4.setTranslationY(qyVar.W3() + AndroidUtilities.lerp(qyVar.K + qyVar.t3, -AndroidUtilities.dp(qyVar.H ? 81.0f : 0.0f), f19));
                    }
                    if (qyVar.y) {
                        boolean z12 = qyVar.B;
                        float f20 = z12 ? 0.0f : qyVar.K;
                        f13 = -AndroidUtilities.lerp((-f20) + AndroidUtilities.dp((z12 || !qyVar.w) ? 0.0f : 50.0f), f20, qyVar.C3.e);
                    } else {
                        f13 = 0.0f;
                    }
                    qyVar.b0[0].setTranslationY(f13 - (((qyVar.H ? AndroidUtilities.dp(f11) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * qyVar.C3.e));
                    f12 = clamp;
                } else {
                    gyVar = qyVar.U;
                    if (gyVar != null) {
                        gyVar.setTranslationY(AndroidUtilities.lerp(((qyVar.K + qyVar.t3) + qyVar.Q) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((qyVar.H ? 81 : 0) + 48), qyVar.u1));
                    }
                    f12 = 1.0f;
                }
                qyVar.S4();
                qy.N2(qyVar, f12);
                super.dispatchDraw(canvas);
                qy.O2(qyVar, canvas2, i11);
                h0Var = qyVar.H0;
                if (h0Var != null && h0Var.getVisibility() == 0) {
                    if (qyVar.H0.getAlpha() != f10) {
                        qyVar.H0.draw(canvas2);
                    } else if (qyVar.H0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(qyVar.H0.getLeft(), qyVar.H0.getTop(), qyVar.H0.getRight(), qyVar.H0.getBottom(), (int) (qyVar.H0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(qyVar.H0.getLeft(), qyVar.H0.getTop());
                        qyVar.H0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!qyVar.T && qyVar.U2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), qyVar.d4);
                }
                qyVar.S = true;
            }
        }
        canvas2 = canvas;
        qyVar.t3 = 0.0f;
        qyVar.s3 = 0.0f;
        float min2 = qyVar.t3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.H ? 81.0f : 0.0f)) + qyVar.K, qyVar.q3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.H ? 81.0f : 0.0f)));
        qyVar.t3 = min2;
        qyVar.s3 = min2;
        lxVar = qyVar.C3;
        if (lxVar == null) {
        }
        gyVar = qyVar.U;
        if (gyVar != null) {
        }
        f12 = 1.0f;
        qyVar.S4();
        qy.N2(qyVar, f12);
        super.dispatchDraw(canvas);
        qy.O2(qyVar, canvas2, i11);
        h0Var = qyVar.H0;
        if (h0Var != null) {
            if (qyVar.H0.getAlpha() != f10) {
            }
        }
        if (!qyVar.T) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), qyVar.d4);
        }
        qyVar.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.B0;
        if (view == qyVar.H0) {
            return true;
        }
        if (org.telegram.ui.Components.qv0.s0) {
            return super.drawChild(canvas, view, j10);
        }
        py[] pyVarArr = qyVar.b0;
        if (view == pyVarArr[0] || ((pyVarArr.length > 1 && view == pyVarArr[1]) || view == qyVar.G1 || view == qyVar.w0)) {
            canvas.save();
            if (view != qyVar.G1 && view != qyVar.w0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = qyVar.U3;
            if (f10 != 1.0f) {
                if (qyVar.V3) {
                    canvas.translate((1.0f - qyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float c3 = ai.c(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - qyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(c3, c3, 0.0f, (-getY()) + qyVar.K + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        if (view != kVar || qyVar.U3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (qyVar.V3) {
            canvas.translate((1.0f - qyVar.U3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float c10 = ai.c(1.0f, qyVar.U3, 0.05f, 1.0f);
            canvas.translate((1.0f - qyVar.U3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
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
        pw pwVar;
        int actionMasked = motionEvent.getActionMasked();
        qy qyVar = this.B0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (kVar.s()) {
                qyVar.V0 = true;
            }
        }
        return Z() || ((pwVar = qyVar.w0) != null && pwVar.L) || onTouchEvent(motionEvent);
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
        qy qyVar;
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
        jy jyVar = this;
        int childCount = jyVar.getChildCount();
        int R = jyVar.R();
        jyVar.setBottomClip(0);
        int measuredWidth = jyVar.getMeasuredWidth();
        int measuredHeight = jyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            qyVar = jyVar.B0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = jyVar.getChildAt(i20);
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
                            i19 = layoutParams.topMargin + jyVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != qyVar.U || childAt == qyVar.W || childAt == (ixVar2 = qyVar.B0)) {
                            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != qyVar.U && childAt != qyVar.B0 && childAt != qyVar.W) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (qyVar.H && childAt == qyVar.U) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            ixVar = qyVar.B0;
                            if (childAt == ixVar && ixVar.getPremiumHint() != null) {
                                qyVar.B0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, qyVar.B0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == qyVar.U) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == qyVar.z0) {
                            i19 = -AndroidUtilities.dp(qyVar.a);
                        } else if (childAt instanceof bv) {
                            kVar3 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof py) {
                            i19 = 0;
                        } else if (childAt == qyVar.G1 || childAt == qyVar.H1 || childAt == qyVar.w0) {
                            kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (ixVar2 != null && ixVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != qyVar.U) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != qyVar.U) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (qyVar.H) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    ixVar = qyVar.B0;
                    if (childAt == ixVar) {
                        qyVar.B0.getPremiumHint().layout(i16, b.C(54.0f, i19, measuredHeight2), i16 + measuredWidth2, qyVar.B0.getPremiumHint().getMeasuredHeight() + b.C(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == qyVar.U) {
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
                if (childAt != qyVar.U) {
                }
                kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != qyVar.U) {
                }
                if (qyVar.H) {
                }
                ixVar = qyVar.B0;
                if (childAt == ixVar) {
                }
                if (childAt == qyVar.U) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            jyVar = this;
        }
        zx zxVar = qyVar.z0;
        if (zxVar != null) {
            zxVar.setKeyboardHeight(R);
        }
        S();
        qyVar.X4();
        qyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        qy qyVar = this.B0;
        int i12 = qyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z4 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = qyVar.j0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof bv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof py) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (qyVar.C3.c()) {
                            if (qyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (qyVar.H) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + qyVar.M;
                        if (qyVar.r3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = qyVar.W3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        zx zxVar = qyVar.z0;
                        if (childAt == zxVar) {
                            zxVar.setTranslationY(qyVar.F0);
                            qyVar.z0.m0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            qyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            bx bxVar = qyVar.y1;
                            if (bxVar == null || !bxVar.u0(childAt)) {
                                if (childAt == qyVar.C3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = qyVar.W3 ? (int) (size4 * 0.05f) : 0;
                                    qyVar.C3.setTransitionPaddingBottom(i16);
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
            post(new iy(this, 1));
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
        pw pwVar;
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
        qy qyVar = this.B0;
        e5Var = ((org.telegram.ui.ActionBar.p2) qyVar).parentLayout;
        Object[] objArr = 0;
        if (e5Var != null && (pwVar = qyVar.w0) != null && !pwVar.n && !qyVar.g2 && !qyVar.C3.c()) {
            e5Var2 = ((org.telegram.ui.ActionBar.p2) qyVar).parentLayout;
            if (!((ActionBarLayout) e5Var2).j()) {
                e5Var3 = ((org.telegram.ui.ActionBar.p2) qyVar).parentLayout;
                if (!((ActionBarLayout) e5Var3).y()) {
                    e5Var4 = ((org.telegram.ui.ActionBar.p2) qyVar).parentLayout;
                    if (!((ActionBarLayout) e5Var4).n && (motionEvent == null || qyVar.i3 || (motionEvent.getY() > a0() + b0() && ((fVar = qyVar.v1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < qyVar.v1.getY())))) {
                        if (qyVar.O0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    py pyVar = qyVar.b0[0];
                                    if (pyVar != null) {
                                        int i12 = pyVar.d.h;
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
                            qyVar.i3 = true;
                            this.u0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.v0 = x10;
                            if (qyVar.e3) {
                                if (x10 < qyVar.b0[0].getTranslationX() + qyVar.b0[0].getMeasuredWidth()) {
                                    qyVar.f3 = qyVar.b0[0].getTranslationX();
                                } else {
                                    py[] pyVarArr = qyVar.b0;
                                    py pyVar2 = pyVarArr[0];
                                    py pyVar3 = pyVarArr[1];
                                    pyVarArr[0] = pyVar3;
                                    pyVarArr[1] = pyVar2;
                                    qyVar.e3 = false;
                                    qyVar.f3 = pyVar3.getTranslationX();
                                    qyVar.w0.g(1.0f, qyVar.b0[0].h);
                                    qyVar.w0.g(qyVar.f3 / r10[0].getMeasuredWidth(), qyVar.b0[1].h);
                                    qyVar.R4(true);
                                    qyVar.b0[0].d.getClass();
                                    qyVar.b0[1].d.getClass();
                                }
                            } else if (x10 < qyVar.b0[1].getTranslationX() + qyVar.b0[1].getMeasuredWidth()) {
                                py[] pyVarArr2 = qyVar.b0;
                                py pyVar4 = pyVarArr2[0];
                                py pyVar5 = pyVarArr2[1];
                                pyVarArr2[0] = pyVar5;
                                pyVarArr2[1] = pyVar4;
                                qyVar.e3 = true;
                                qyVar.f3 = pyVar5.getTranslationX();
                                qyVar.w0.g(1.0f, qyVar.b0[0].h);
                                qyVar.w0.g((-qyVar.f3) / r10[0].getMeasuredWidth(), qyVar.b0[1].h);
                                qyVar.R4(true);
                                qyVar.b0[0].d.getClass();
                                qyVar.b0[1].d.getClass();
                            } else {
                                qyVar.f3 = qyVar.b0[0].getTranslationX();
                            }
                            qyVar.c3.removeAllListeners();
                            qyVar.c3.cancel();
                            qyVar.d3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            qyVar.f3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !qyVar.i3 && !qyVar.j3 && qyVar.w0.getVisibility() == 0) {
                            this.u0 = motionEvent.getPointerId(0);
                            qyVar.j3 = true;
                            this.v0 = (int) motionEvent.getX();
                            this.w0 = (int) motionEvent.getY();
                            this.x0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.u0) {
                            int x11 = (int) ((motionEvent.getX() - this.v0) + qyVar.f3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.w0);
                            if (qyVar.i3 && (((z4 = qyVar.e3) && x11 > 0) || (!z4 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    qyVar.j3 = true;
                                    qyVar.i3 = false;
                                    qyVar.b0[0].setTranslationX(0.0f);
                                    qyVar.b0[1].setTranslationX(qyVar.e3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    qyVar.w0.g(0.0f, qyVar.b0[1].h);
                                }
                            }
                            if (qyVar.j3 && !qyVar.i3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.v0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (qyVar.i3) {
                                qyVar.b0[0].setTranslationX(x11);
                                if (qyVar.e3) {
                                    qyVar.b0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    qyVar.b0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / qyVar.b0[0].getMeasuredWidth();
                                py pyVar6 = qyVar.b0[1];
                                if (pyVar6.B && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    qyVar.w0.i(qyVar.b0[1].h);
                                    AndroidUtilities.runOnUIThread(new iy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                qyVar.w0.g(abs2, pyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.u0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.x0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, qyVar.h3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.x0.getXVelocity();
                                f11 = this.x0.getYVelocity();
                                if (!qyVar.i3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    c0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (qyVar.i3) {
                                float x13 = qyVar.b0[0].getX();
                                qyVar.c3 = new AnimatorSet();
                                if (qyVar.b0[1].B) {
                                    qyVar.g3 = true;
                                } else if (qyVar.f3 == 0.0f) {
                                    qyVar.g3 = Math.abs(x13) < ((float) qyVar.b0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z10 = qyVar.e3 ? false : false;
                                    qyVar.g3 = z10;
                                } else if (qyVar.e3) {
                                    qyVar.g3 = qyVar.b0[1].getX() > ((float) (qyVar.b0[0].getMeasuredWidth() >> 1));
                                } else {
                                    qyVar.g3 = qyVar.b0[0].getX() < ((float) (qyVar.b0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z11 = qyVar.g3;
                                Property property = View.TRANSLATION_X;
                                if (z11) {
                                    measuredWidth = Math.abs(x13);
                                    if (qyVar.e3) {
                                        qyVar.c3.playTogether(ObjectAnimator.ofFloat(qyVar.b0[0], (Property<py, Float>) property, 0.0f), ObjectAnimator.ofFloat(qyVar.b0[1], (Property<py, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        qyVar.c3.playTogether(ObjectAnimator.ofFloat(qyVar.b0[0], (Property<py, Float>) property, 0.0f), ObjectAnimator.ofFloat(qyVar.b0[1], (Property<py, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = qyVar.b0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (qyVar.e3) {
                                        qyVar.c3.playTogether(ObjectAnimator.ofFloat(qyVar.b0[0], (Property<py, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(qyVar.b0[1], (Property<py, Float>) property, 0.0f));
                                    } else {
                                        qyVar.c3.playTogether(ObjectAnimator.ofFloat(qyVar.b0[0], (Property<py, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(qyVar.b0[1], (Property<py, Float>) property, 0.0f));
                                    }
                                }
                                qyVar.c3.setInterpolator(qy.w4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                qyVar.c3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                qyVar.c3.addListener(new org.telegram.ui.Components.f91(this, 17));
                                qyVar.c3.start();
                                qyVar.d3 = true;
                                qyVar.i3 = false;
                            } else {
                                qyVar.j3 = false;
                                kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                                kVar.setEnabled(true);
                                qyVar.w0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.x0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.x0 = null;
                            }
                        }
                        return qyVar.i3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        qy qyVar = this.B0;
        if (qyVar.j3 && !qyVar.i3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
