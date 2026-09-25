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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jy extends org.telegram.ui.Components.aw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final /* synthetic */ qy E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(Context context, qy qyVar) {
        super(context, null);
        this.E0 = qyVar;
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
    @Override // org.telegram.ui.Components.aw0
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
            qy qyVar = this.E0;
            if (qyVar.l4 != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.m2) qyVar).resourceProvider;
                if (eh.b.c(i10, d6Var)) {
                    d6Var2 = ((org.telegram.ui.ActionBar.m2) qyVar).resourceProvider;
                    if (d6Var2 != null) {
                        d6Var3 = ((org.telegram.ui.ActionBar.m2) qyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    qyVar.l4.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.aw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        zx zxVar;
        org.telegram.ui.Components.wl0 p5;
        qy qyVar = this.E0;
        if (qyVar.p3 && (zxVar = qyVar.C0) != null && zxVar.getVisibility() == 0) {
            zx zxVar2 = qyVar.C0;
            View[] viewArr = zxVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.w81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + zxVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public final void M() {
        super.M();
        this.E0.m3();
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        qy qyVar = this.E0;
        if (!qyVar.g3) {
            return false;
        }
        if (!qyVar.j3) {
            if (Math.abs(qyVar.e0[1].getTranslationX()) < 1.0f) {
                qyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (qyVar.h3 ? -1 : 1));
                qyVar.e0[1].setTranslationX(0.0f);
                qy.f1(qyVar, true);
                animatorSet = qyVar.f3;
                if (animatorSet != null) {
                }
                qyVar.g3 = false;
            }
            return qyVar.g3;
        }
        if (Math.abs(qyVar.e0[0].getTranslationX()) < 1.0f) {
            qyVar.e0[0].setTranslationX(0.0f);
            qyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (qyVar.h3 ? 1 : -1));
            qy.f1(qyVar, true);
            animatorSet = qyVar.f3;
            if (animatorSet != null) {
                animatorSet.cancel();
                qyVar.f3 = null;
            }
            qyVar.g3 = false;
        }
        return qyVar.g3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        float height = kVar.getHeight();
        kx kxVar = qyVar.F3;
        float f7 = (kxVar == null || !kxVar.c()) ? 0.0f : qyVar.F3.e;
        if (qyVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, qyVar.t3, (1.0f - f7) * (1.0f - qyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - qyVar.x1) * (1.0f - qyVar.t3) * AndroidUtilities.dp(48.0f), height + qyVar.T);
    }

    public final int b0() {
        qy qyVar = this.E0;
        float f7 = qyVar.N;
        kx kxVar = qyVar.F3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, qyVar.x1, org.telegram.messenger.f0.z(1.0f, (kxVar == null || !kxVar.c()) ? 0.0f : qyVar.F3.e, 1.0f - qyVar.t3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.E0;
        nw nwVar = qyVar.z0;
        int i10 = nwVar.j0.get(nwVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        qyVar.m3 = false;
        qyVar.l3 = true;
        this.y0 = (int) (motionEvent.getX() + qyVar.i3);
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        kVar.setEnabled(false);
        qyVar.z0.setEnabled(false);
        py pyVar = qyVar.e0[1];
        pyVar.h = i10;
        pyVar.setVisibility(0);
        qyVar.h3 = z10;
        qy.f1(qyVar, false);
        qyVar.R4(true);
        if (z10) {
            qyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        qyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        kx kxVar;
        gy gyVar;
        float f11;
        ci.bb bbVar;
        float f12;
        gy gyVar2;
        org.telegram.ui.ActionBar.k kVar;
        kx kxVar2;
        qy qyVar = this.E0;
        Paint paint = qyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && qyVar.k4 != null) {
            qyVar.m3();
        }
        if (qyVar.Q && (((kxVar2 = qyVar.F3) == null || !kxVar2.c()) && qyVar.t3 == 0.0f)) {
            qyVar.Q = false;
            int i10 = (qyVar.Z3() && qyVar.e0[0].s == 0) ? 1 : 0;
            my myVar = qyVar.e0[0].a;
            if (qyVar.R) {
                if (!qyVar.b1) {
                    if (i10 == 0) {
                        qyVar.R = false;
                    }
                    if (qyVar.R) {
                        s4.c1 L = myVar.L(0, false);
                        if (L == null) {
                            qyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= myVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                qyVar.R = false;
                            } else if (view.getTop() >= myVar.getPaddingTop()) {
                                qyVar.R = false;
                            }
                        }
                        if (qyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.c1 L2 = myVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = myVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -qyVar.T3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    qyVar.C4(f13);
                } else {
                    qyVar.C4(0.0f);
                }
            } else {
                qyVar.C4(-qyVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.m2) qyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        qyVar.F3.setCurrentTop(i11);
        boolean z12 = qyVar.r3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = qyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            } else if (f15 == 0.0f && (gyVar2 = qyVar.X) != null) {
                gyVar2.setTranslationY(qyVar.W3() + qyVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.x1 * 2.0f));
            float f16 = qyVar.x1;
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
            float f17 = qyVar.x1;
            if (f17 > 0.0f && f17 < f7) {
                paint2.setColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (!qyVar.p3 && qyVar.q3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                gy gyVar3 = qyVar.X;
                if (gyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                    int height = kVar.getHeight();
                    gyVar3.setTranslationY(qyVar.W3() + (i11 - (height + (qyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 1.0f;
            f10 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.m2) qyVar).inPreviewMode;
            if (!z11) {
                if (qyVar.t3 > 0.0f) {
                    paint2.setColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(qyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                qyVar.w3 = 0.0f;
                qyVar.v3 = 0.0f;
                float min = qyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.K ? 81.0f : 0.0f)) + qyVar.N, qyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.K ? 81.0f : 0.0f)));
                qyVar.w3 = min;
                qyVar.v3 = min;
                kxVar = qyVar.F3;
                if (kxVar == null && kxVar.c()) {
                    float f18 = qyVar.F3.e;
                    float T3 = qyVar.w3 - ((qyVar.T3() + qyVar.N) * f18);
                    qyVar.w3 = T3;
                    qyVar.v3 = T3;
                    float clamp = qyVar.G0 ? f7 - Utilities.clamp(f18 / 0.5f, f7, 0.0f) : 1.0f;
                    nw nwVar = qyVar.z0;
                    if (nwVar != null && nwVar.getVisibility() == 0) {
                        qyVar.w3 -= (f7 - qyVar.r.e) * qyVar.z0.getMeasuredHeight();
                    }
                    gy gyVar4 = qyVar.X;
                    if (gyVar4 != null) {
                        gyVar4.setTranslationY(qyVar.W3() + AndroidUtilities.lerp(qyVar.N + qyVar.w3, -AndroidUtilities.dp(qyVar.K ? 81.0f : 0.0f), f18));
                    }
                    if (qyVar.y) {
                        boolean z13 = qyVar.E;
                        float f19 = z13 ? 0.0f : qyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !qyVar.w) ? 0.0f : 50.0f), f19, qyVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    qyVar.e0[0].setTranslationY(f12 - (((qyVar.K ? AndroidUtilities.dp(f10) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * qyVar.F3.e));
                    f11 = clamp;
                } else {
                    gyVar = qyVar.X;
                    if (gyVar != null) {
                        gyVar.setTranslationY(AndroidUtilities.lerp(((qyVar.N + qyVar.w3) + qyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((qyVar.K ? 81 : 0) + 48), qyVar.x1));
                    }
                    f11 = 1.0f;
                }
                qyVar.S4();
                qy.N2(qyVar, f11);
                super.dispatchDraw(canvas);
                qy.O2(qyVar, canvas2, i11);
                bbVar = qyVar.K0;
                if (bbVar != null && bbVar.getVisibility() == 0) {
                    if (qyVar.K0.getAlpha() != f7) {
                        qyVar.K0.draw(canvas2);
                    } else if (qyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(qyVar.K0.getLeft(), qyVar.K0.getTop(), qyVar.K0.getRight(), qyVar.K0.getBottom(), (int) (qyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(qyVar.K0.getLeft(), qyVar.K0.getTop());
                        qyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!qyVar.W && qyVar.X2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6), qyVar.f4);
                }
                qyVar.V = true;
            }
        }
        canvas2 = canvas;
        qyVar.w3 = 0.0f;
        qyVar.v3 = 0.0f;
        float min2 = qyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.K ? 81.0f : 0.0f)) + qyVar.N, qyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!qyVar.K ? 81.0f : 0.0f)));
        qyVar.w3 = min2;
        qyVar.v3 = min2;
        kxVar = qyVar.F3;
        if (kxVar == null) {
        }
        gyVar = qyVar.X;
        if (gyVar != null) {
        }
        f11 = 1.0f;
        qyVar.S4();
        qy.N2(qyVar, f11);
        super.dispatchDraw(canvas);
        qy.O2(qyVar, canvas2, i11);
        bbVar = qyVar.K0;
        if (bbVar != null) {
            if (qyVar.K0.getAlpha() != f7) {
            }
        }
        if (!qyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6), qyVar.f4);
        }
        qyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.E0;
        if (view == qyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.aw0.v0) {
            return super.drawChild(canvas, view, j3);
        }
        py[] pyVarArr = qyVar.e0;
        if (view == pyVarArr[0] || ((pyVarArr.length > 1 && view == pyVarArr[1]) || view == qyVar.J1 || view == qyVar.z0)) {
            canvas.save();
            if (view != qyVar.J1 && view != qyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = qyVar.W3;
            if (f7 != 1.0f) {
                if (qyVar.X3) {
                    canvas.translate((1.0f - qyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - qyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(b10, b10, 0.0f, (-getY()) + qyVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (view != kVar || qyVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (qyVar.X3) {
            canvas.translate((1.0f - qyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, qyVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - qyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
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

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.o5 o5Var = this.E0.D3;
        if (o5Var != null) {
            o5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
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
        nw nwVar;
        int actionMasked = motionEvent.getActionMasked();
        qy qyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            if (kVar.s()) {
                qyVar.Y0 = true;
            }
        }
        return Z() || ((nwVar = qyVar.z0) != null && nwVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        qy qyVar;
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
        jy jyVar = this;
        int childCount = jyVar.getChildCount();
        int R = jyVar.R();
        jyVar.setBottomClip(0);
        int measuredWidth = jyVar.getMeasuredWidth();
        int measuredHeight = jyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            qyVar = jyVar.E0;
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
                        if (childAt != qyVar.X || childAt == qyVar.Z || childAt == (hxVar2 = qyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != qyVar.X && childAt != qyVar.E0 && childAt != qyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (qyVar.K && childAt == qyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            hxVar = qyVar.E0;
                            if (childAt == hxVar && hxVar.getPremiumHint() != null) {
                                qyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.ok.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, qyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.ok.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == qyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == qyVar.C0) {
                            i19 = -AndroidUtilities.dp(qyVar.a);
                        } else if (childAt instanceof xu) {
                            kVar3 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof py) {
                            i19 = 0;
                        } else if (childAt == qyVar.J1 || childAt == qyVar.K1 || childAt == qyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (hxVar2 != null && hxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != qyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != qyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (qyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    hxVar = qyVar.E0;
                    if (childAt == hxVar) {
                        qyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.ok.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, qyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.ok.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == qyVar.X) {
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
                if (childAt != qyVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != qyVar.X) {
                }
                if (qyVar.K) {
                }
                hxVar = qyVar.E0;
                if (childAt == hxVar) {
                }
                if (childAt == qyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            jyVar = this;
        }
        zx zxVar = qyVar.C0;
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
        qy qyVar = this.E0;
        int i12 = qyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.u0 u0Var = qyVar.m0;
        if (u0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof xu) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof py) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (qyVar.F3.c()) {
                            if (qyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (qyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + qyVar.P;
                        if (qyVar.u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = qyVar.Y3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        zx zxVar = qyVar.C0;
                        if (childAt == zxVar) {
                            zxVar.setTranslationY(qyVar.I0);
                            qyVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            qyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ax axVar = qyVar.B1;
                            if (axVar == null || !axVar.u0(childAt)) {
                                if (childAt == qyVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = qyVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    qyVar.F3.setTransitionPaddingBottom(i16);
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
            post(new iy(this, 1));
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
        org.telegram.ui.ActionBar.b5 b5Var;
        nw nwVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.b5 b5Var3;
        org.telegram.ui.ActionBar.b5 b5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        hh.g gVar;
        qy qyVar = this.E0;
        b5Var = ((org.telegram.ui.ActionBar.m2) qyVar).parentLayout;
        Object[] objArr = 0;
        if (b5Var != null && (nwVar = qyVar.z0) != null && !nwVar.n && !qyVar.j2 && !qyVar.F3.c()) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) qyVar).parentLayout;
            if (!((ActionBarLayout) b5Var2).j()) {
                b5Var3 = ((org.telegram.ui.ActionBar.m2) qyVar).parentLayout;
                if (!((ActionBarLayout) b5Var3).y()) {
                    b5Var4 = ((org.telegram.ui.ActionBar.m2) qyVar).parentLayout;
                    if (!((ActionBarLayout) b5Var4).n && (motionEvent == null || qyVar.l3 || (motionEvent.getY() > a0() + b0() && ((gVar = qyVar.y1) == null || gVar.getVisibility() != 0 || motionEvent.getY() < qyVar.y1.getY())))) {
                        if (qyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    py pyVar = qyVar.e0[0];
                                    if (pyVar != null) {
                                        int i12 = pyVar.d.h;
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
                            qyVar.l3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (qyVar.h3) {
                                if (x10 < qyVar.e0[0].getTranslationX() + qyVar.e0[0].getMeasuredWidth()) {
                                    qyVar.i3 = qyVar.e0[0].getTranslationX();
                                } else {
                                    py[] pyVarArr = qyVar.e0;
                                    py pyVar2 = pyVarArr[0];
                                    py pyVar3 = pyVarArr[1];
                                    pyVarArr[0] = pyVar3;
                                    pyVarArr[1] = pyVar2;
                                    qyVar.h3 = false;
                                    qyVar.i3 = pyVar3.getTranslationX();
                                    qyVar.z0.g(1.0f, qyVar.e0[0].h);
                                    qyVar.z0.g(qyVar.i3 / r10[0].getMeasuredWidth(), qyVar.e0[1].h);
                                    qyVar.R4(true);
                                    qyVar.e0[0].d.getClass();
                                    qyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < qyVar.e0[1].getTranslationX() + qyVar.e0[1].getMeasuredWidth()) {
                                py[] pyVarArr2 = qyVar.e0;
                                py pyVar4 = pyVarArr2[0];
                                py pyVar5 = pyVarArr2[1];
                                pyVarArr2[0] = pyVar5;
                                pyVarArr2[1] = pyVar4;
                                qyVar.h3 = true;
                                qyVar.i3 = pyVar5.getTranslationX();
                                qyVar.z0.g(1.0f, qyVar.e0[0].h);
                                qyVar.z0.g((-qyVar.i3) / r10[0].getMeasuredWidth(), qyVar.e0[1].h);
                                qyVar.R4(true);
                                qyVar.e0[0].d.getClass();
                                qyVar.e0[1].d.getClass();
                            } else {
                                qyVar.i3 = qyVar.e0[0].getTranslationX();
                            }
                            qyVar.f3.removeAllListeners();
                            qyVar.f3.cancel();
                            qyVar.g3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            qyVar.i3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !qyVar.l3 && !qyVar.m3 && qyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            qyVar.m3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + qyVar.i3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (qyVar.l3 && (((z10 = qyVar.h3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    qyVar.m3 = true;
                                    qyVar.l3 = false;
                                    qyVar.e0[0].setTranslationX(0.0f);
                                    qyVar.e0[1].setTranslationX(qyVar.h3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    qyVar.z0.g(0.0f, qyVar.e0[1].h);
                                }
                            }
                            if (qyVar.m3 && !qyVar.l3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (qyVar.l3) {
                                qyVar.e0[0].setTranslationX(x11);
                                if (qyVar.h3) {
                                    qyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    qyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / qyVar.e0[0].getMeasuredWidth();
                                py pyVar6 = qyVar.e0[1];
                                if (pyVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    qyVar.z0.i(qyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new iy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                qyVar.z0.g(abs2, pyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, qyVar.k3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!qyVar.l3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (qyVar.l3) {
                                float x13 = qyVar.e0[0].getX();
                                qyVar.f3 = new AnimatorSet();
                                if (qyVar.e0[1].E) {
                                    qyVar.j3 = true;
                                } else if (qyVar.i3 == 0.0f) {
                                    qyVar.j3 = Math.abs(x13) < ((float) qyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = qyVar.h3 ? false : false;
                                    qyVar.j3 = z11;
                                } else if (qyVar.h3) {
                                    qyVar.j3 = qyVar.e0[1].getX() > ((float) (qyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    qyVar.j3 = qyVar.e0[0].getX() < ((float) (qyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = qyVar.j3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (qyVar.h3) {
                                        qyVar.f3.playTogether(ObjectAnimator.ofFloat(qyVar.e0[0], (Property<py, Float>) property, 0.0f), ObjectAnimator.ofFloat(qyVar.e0[1], (Property<py, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        qyVar.f3.playTogether(ObjectAnimator.ofFloat(qyVar.e0[0], (Property<py, Float>) property, 0.0f), ObjectAnimator.ofFloat(qyVar.e0[1], (Property<py, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = qyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (qyVar.h3) {
                                        qyVar.f3.playTogether(ObjectAnimator.ofFloat(qyVar.e0[0], (Property<py, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(qyVar.e0[1], (Property<py, Float>) property, 0.0f));
                                    } else {
                                        qyVar.f3.playTogether(ObjectAnimator.ofFloat(qyVar.e0[0], (Property<py, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(qyVar.e0[1], (Property<py, Float>) property, 0.0f));
                                    }
                                }
                                qyVar.f3.setInterpolator(qy.y4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                qyVar.f3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                qyVar.f3.addListener(new org.telegram.ui.Components.q81(this, 19));
                                qyVar.f3.start();
                                qyVar.g3 = true;
                                qyVar.l3 = false;
                            } else {
                                qyVar.m3 = false;
                                kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                                kVar.setEnabled(true);
                                qyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return qyVar.l3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        qy qyVar = this.E0;
        if (qyVar.m3 && !qyVar.l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
