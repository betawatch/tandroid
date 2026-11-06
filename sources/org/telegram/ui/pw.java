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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.Components.rt0 {
    public final Paint f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;
    public final Rect k0;
    public boolean l0;
    public final org.telegram.ui.Cells.l9 m0;
    public final /* synthetic */ ww n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(Context context, ww wwVar) {
        super(context, null);
        this.n0 = wwVar;
        this.f0 = new Paint(1);
        this.k0 = new Rect();
        this.m0 = new org.telegram.ui.Cells.l9(new f(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.qs.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.qs.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.k6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.rt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.iz.f()) {
            ww wwVar = this.n0;
            if (wwVar.k4 != null) {
                i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f2) wwVar).resourceProvider;
                if (c8.g0.c(i7, f6Var)) {
                    f6Var2 = ((org.telegram.ui.ActionBar.f2) wwVar).resourceProvider;
                    if (f6Var2 != null) {
                        f6Var3 = ((org.telegram.ui.ActionBar.f2) wwVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    wwVar.k4.e(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(i10);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override // org.telegram.ui.Components.rt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        fw fwVar;
        org.telegram.ui.Components.pj0 p10;
        ww wwVar = this.n0;
        if (wwVar.q3 && (fwVar = wwVar.C0) != null && fwVar.getVisibility() == 0) {
            fw fwVar2 = wwVar.C0;
            View[] viewArr = fwVar2.e;
            for (int i7 = 0; i7 < viewArr.length; i7++) {
                View view = viewArr[i7];
                if (view != null && view.getVisibility() == 0 && (p10 = org.telegram.ui.Components.p61.p(viewArr[i7])) != null) {
                    for (int i10 = 0; i10 < p10.getChildCount(); i10++) {
                        View childAt = p10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i7].getX(), childAt.getY() + p10.getY() + viewArr[i7].getY() + fwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L() {
        oi.q qVar;
        org.telegram.messenger.iz.f();
        qVar = ((org.telegram.ui.ActionBar.f2) this.n0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.rt0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        ww wwVar = this.n0;
        if (!wwVar.h3) {
            return false;
        }
        if (!wwVar.k3) {
            if (Math.abs(wwVar.e0[1].getTranslationX()) < 1.0f) {
                wwVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (wwVar.i3 ? -1 : 1));
                wwVar.e0[1].setTranslationX(0.0f);
                ww.j1(wwVar, true);
                animatorSet = wwVar.g3;
                if (animatorSet != null) {
                }
                wwVar.h3 = false;
            }
            return wwVar.h3;
        }
        if (Math.abs(wwVar.e0[0].getTranslationX()) < 1.0f) {
            wwVar.e0[0].setTranslationX(0.0f);
            wwVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (wwVar.i3 ? 1 : -1));
            ww.j1(wwVar, true);
            animatorSet = wwVar.g3;
            if (animatorSet != null) {
                animatorSet.cancel();
                wwVar.g3 = null;
            }
            wwVar.h3 = false;
        }
        return wwVar.h3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        ww wwVar = this.n0;
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        float height = kVar.getHeight();
        sv svVar = wwVar.F3;
        float f10 = (svVar == null || !svVar.c()) ? 0.0f : wwVar.F3.e;
        if (wwVar.K) {
            height = com.google.android.recaptcha.internal.a.z(1.0f, wwVar.u3, (1.0f - f10) * (1.0f - wwVar.x1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, f10, (1.0f - wwVar.x1) * (1.0f - wwVar.u3) * org.telegram.messenger.g0.L(48.0f), height + wwVar.T);
    }

    public final int Z() {
        ww wwVar = this.n0;
        float f10 = wwVar.N;
        sv svVar = wwVar.F3;
        return (int) com.google.android.recaptcha.internal.a.z(1.0f, wwVar.x1, org.telegram.messenger.k5.A(1.0f, (svVar == null || !svVar.c()) ? 0.0f : wwVar.F3.e, 1.0f - wwVar.u3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z9) {
        org.telegram.ui.ActionBar.k kVar;
        ww wwVar = this.n0;
        mw mwVar = wwVar.z0;
        int i7 = mwVar.j0.get(mwVar.K + (z9 ? 1 : -1), -1);
        if (i7 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        wwVar.n3 = false;
        wwVar.m3 = true;
        this.h0 = (int) (motionEvent.getX() + wwVar.j3);
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        kVar.setEnabled(false);
        wwVar.z0.setEnabled(false);
        vw vwVar = wwVar.e0[1];
        vwVar.h = i7;
        vwVar.setVisibility(0);
        wwVar.i3 = z9;
        ww.j1(wwVar, false);
        wwVar.d5(true);
        if (z9) {
            wwVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        wwVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r1 == 1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        boolean z9;
        float f10;
        boolean z10;
        Canvas canvas2;
        sv svVar;
        lw lwVar;
        float f11;
        bi.ec ecVar;
        float f12;
        lw lwVar2;
        float f13;
        org.telegram.ui.ActionBar.k kVar;
        sv svVar2;
        ww wwVar = this.n0;
        Paint paint = wwVar.f1;
        qVar = ((org.telegram.ui.ActionBar.f2) wwVar).glassEngine;
        qVar.g();
        if (wwVar.Q && (((svVar2 = wwVar.F3) == null || !svVar2.c()) && wwVar.u3 == 0.0f)) {
            wwVar.Q = false;
            int i7 = (wwVar.l4() && wwVar.e0[0].s == 0) ? 1 : 0;
            sw swVar = wwVar.e0[0].a;
            if (wwVar.R) {
                if (!wwVar.b1) {
                    if (i7 == 0) {
                        wwVar.R = false;
                    }
                    if (wwVar.R) {
                        v4.d1 L = swVar.L(0, false);
                        if (L == null) {
                            wwVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= swVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                wwVar.R = false;
                            } else if (view.getTop() >= swVar.getPaddingTop()) {
                                wwVar.R = false;
                            }
                        }
                        if (wwVar.R) {
                        }
                    }
                }
                i7 = 0;
            }
            v4.d1 L2 = swVar.L(i7, false);
            if (L2 != null) {
                float paddingTop = swVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -wwVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    wwVar.O4(f14);
                } else {
                    wwVar.O4(0.0f);
                }
            } else {
                wwVar.O4(-wwVar.f4());
            }
        }
        int Y = Y();
        z9 = ((org.telegram.ui.ActionBar.f2) wwVar).inPreviewMode;
        int Z = z9 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        wwVar.F3.setCurrentTop(i10);
        boolean z11 = wwVar.s3;
        Rect rect = this.k0;
        Paint paint2 = this.f0;
        if (z11) {
            float f16 = wwVar.x1;
            if (f16 == 1.0f) {
                paint2.setColor(wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            } else if (f16 == 0.0f && (lwVar2 = wwVar.X) != null) {
                lwVar2.setTranslationY(wwVar.i4() + wwVar.N);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(wwVar.x1 * 2.0f));
            float f17 = wwVar.x1;
            if (f17 < 0.0f) {
                if (f17 == 1.0f) {
                    paint = paint2;
                }
                f13 = 2.0f;
                f10 = 1.0f;
                H(canvas, 0.0f, this.k0, paint, true);
            } else {
                f13 = 2.0f;
                f10 = 1.0f;
            }
            float f18 = wwVar.x1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (!wwVar.q3 && wwVar.r3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(wwVar.x1 * f13));
                    H(canvas, 0.0f, this.k0, paint2, true);
                }
                lw lwVar3 = wwVar.X;
                if (lwVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                    int height = kVar.getHeight();
                    lwVar3.setTranslationY(wwVar.i4() + (i10 - (height + (wwVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z10 = ((org.telegram.ui.ActionBar.f2) wwVar).inPreviewMode;
            if (!z10) {
                if (wwVar.u3 > 0.0f) {
                    paint2.setColor(wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(wwVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(wwVar.x1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.k0, paint, true);
                }
                wwVar.x3 = 0.0f;
                wwVar.w3 = 0.0f;
                float min = wwVar.x3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!wwVar.K ? 81.0f : 0.0f)) + wwVar.N, wwVar.u3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!wwVar.K ? 81.0f : 0.0f)));
                wwVar.x3 = min;
                wwVar.w3 = min;
                svVar = wwVar.F3;
                if (svVar == null && svVar.c()) {
                    float f19 = wwVar.F3.e;
                    float f42 = wwVar.x3 - ((wwVar.f4() + wwVar.N) * f19);
                    wwVar.x3 = f42;
                    wwVar.w3 = f42;
                    float i11 = wwVar.G0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    mw mwVar = wwVar.z0;
                    if (mwVar != null && mwVar.getVisibility() == 0) {
                        wwVar.x3 -= (f10 - wwVar.r.e) * wwVar.z0.getMeasuredHeight();
                    }
                    lw lwVar4 = wwVar.X;
                    if (lwVar4 != null) {
                        lwVar4.setTranslationY(wwVar.i4() + org.telegram.messenger.g0.T1(wwVar.N + wwVar.x3, -org.telegram.messenger.g0.L(wwVar.K ? 81.0f : 0.0f), f19));
                    }
                    if (wwVar.D) {
                        float f20 = wwVar.E ? 0.0f : wwVar.N;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, wwVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    wwVar.e0[0].setTranslationY(f12 - (((wwVar.K ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * wwVar.F3.e));
                    f11 = i11;
                } else {
                    lwVar = wwVar.X;
                    if (lwVar != null) {
                        lwVar.setTranslationY(org.telegram.messenger.g0.T1(((wwVar.N + wwVar.x3) + wwVar.T) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((wwVar.K ? 81 : 0) + 48), wwVar.x1));
                    }
                    f11 = f10;
                }
                wwVar.e5();
                ww.X2(wwVar, f11);
                super.dispatchDraw(canvas);
                ww.Y2(wwVar, canvas2, i10);
                ecVar = wwVar.K0;
                if (ecVar != null && ecVar.getVisibility() == 0) {
                    if (wwVar.K0.getAlpha() != f10) {
                        wwVar.K0.draw(canvas2);
                    } else if (wwVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(wwVar.K0.getLeft(), wwVar.K0.getTop(), wwVar.K0.getRight(), wwVar.K0.getBottom(), (int) (wwVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(wwVar.K0.getLeft(), wwVar.K0.getTop());
                        wwVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!wwVar.W && wwVar.Y2 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), wwVar.f4, f10);
                }
                wwVar.V = true;
            }
        }
        canvas2 = canvas;
        wwVar.x3 = 0.0f;
        wwVar.w3 = 0.0f;
        float min2 = wwVar.x3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!wwVar.K ? 81.0f : 0.0f)) + wwVar.N, wwVar.u3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!wwVar.K ? 81.0f : 0.0f)));
        wwVar.x3 = min2;
        wwVar.w3 = min2;
        svVar = wwVar.F3;
        if (svVar == null) {
        }
        lwVar = wwVar.X;
        if (lwVar != null) {
        }
        f11 = f10;
        wwVar.e5();
        ww.X2(wwVar, f11);
        super.dispatchDraw(canvas);
        ww.Y2(wwVar, canvas2, i10);
        ecVar = wwVar.K0;
        if (ecVar != null) {
            if (wwVar.K0.getAlpha() != f10) {
            }
        }
        if (!wwVar.W) {
            org.telegram.messenger.g0.O(canvas2, this, wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), wwVar.f4, f10);
        }
        wwVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.m0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ww wwVar = this.n0;
        if (view == wwVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.rt0.e0) {
            return super.drawChild(canvas, view, j3);
        }
        vw[] vwVarArr = wwVar.e0;
        if (view == vwVarArr[0] || ((vwVarArr.length > 1 && view == vwVarArr[1]) || view == wwVar.J1 || view == wwVar.z0)) {
            canvas.save();
            if (view != wwVar.J1 && view != wwVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = wwVar.W3;
            if (f10 != 1.0f) {
                if (wwVar.X3) {
                    canvas.translate((1.0f - wwVar.W3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float v = com.google.android.recaptcha.internal.a.v(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - wwVar.W3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(v, v, 0.0f, (-getY()) + wwVar.N + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (view != kVar || wwVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (wwVar.X3) {
            canvas.translate((1.0f - wwVar.W3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float v10 = com.google.android.recaptcha.internal.a.v(1.0f, wwVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - wwVar.W3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            canvas.scale(v10, v10, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.g5 g5Var = this.n0.D3;
        if (g5Var != null) {
            g5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g5 g5Var = this.n0.D3;
        if (g5Var != null) {
            g5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        mw mwVar;
        int actionMasked = motionEvent.getActionMasked();
        ww wwVar = this.n0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar.v()) {
                wwVar.Y0 = true;
            }
        }
        return X() || ((mwVar = wwVar.z0) != null && mwVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ww wwVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        pv pvVar;
        pv pvVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        pw pwVar = this;
        int childCount = pwVar.getChildCount();
        int Q = pwVar.Q();
        int i19 = 0;
        pwVar.setBottomClip(0);
        int measuredWidth = pwVar.getMeasuredWidth();
        int measuredHeight = pwVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            wwVar = pwVar.n0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = pwVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.qs.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + pwVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != wwVar.X || childAt == wwVar.Z || childAt == (pvVar2 = wwVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != wwVar.X && childAt != wwVar.E0 && childAt != wwVar.Z) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (wwVar.K && childAt == wwVar.X) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            pvVar = wwVar.E0;
                            if (childAt == pvVar && pvVar.getPremiumHint() != null) {
                                wwVar.E0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, wwVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == wwVar.X) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == wwVar.C0) {
                            i18 = -org.telegram.messenger.g0.L(wwVar.a);
                        } else if (childAt instanceof mt) {
                            kVar3 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof vw) {
                            i18 = i19;
                        } else if (childAt == wwVar.J1 || childAt == wwVar.K1 || childAt == wwVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (pvVar2 != null && pvVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != wwVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != wwVar.X) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (wwVar.K) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    pvVar = wwVar.E0;
                    if (childAt == pvVar) {
                        wwVar.E0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, wwVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == wwVar.X) {
                    }
                    childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                } else {
                    i13 = measuredWidth - measuredWidth2;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 == 16) {
                }
                i18 = i16 - i17;
                if (childAt != wwVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != wwVar.X) {
                }
                if (wwVar.K) {
                }
                pvVar = wwVar.E0;
                if (childAt == pvVar) {
                }
                if (childAt == wwVar.X) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            pwVar = this;
        }
        fw fwVar = wwVar.C0;
        if (fwVar != null) {
            fwVar.setKeyboardHeight(Q);
        }
        R();
        wwVar.k5();
        wwVar.e5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        ww wwVar = this.n0;
        int i11 = wwVar.a;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z9 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.r0 r0Var = wwVar.m0;
        if (r0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        measureChildWithMargins(kVar, i7, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof mt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof vw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (wwVar.F3.c()) {
                            if (wwVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (wwVar.K) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + wwVar.P;
                        if (wwVar.v3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = wwVar.Y3 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        fw fwVar = wwVar.C0;
                        if (childAt == fwVar) {
                            fwVar.setTranslationY(wwVar.I0);
                            wwVar.C0.r0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            wwVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            jv jvVar = wwVar.B1;
                            if (jvVar == null || !jvVar.t0(childAt)) {
                                if (childAt == wwVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = wwVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    wwVar.F3.setTransitionPaddingBottom(i15);
                                    childAt.measure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i15), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i7, 0, i10, 0);
                                }
                            } else if (!org.telegram.messenger.g0.E) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (org.telegram.messenger.g0.Q1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z9 != this.l0) {
            post(new ow(this, 1));
            this.l0 = z9;
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
        org.telegram.ui.ActionBar.q4 q4Var;
        mw mwVar;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z9;
        int i7;
        int i10;
        jh.f fVar;
        ww wwVar = this.n0;
        q4Var = ((org.telegram.ui.ActionBar.f2) wwVar).parentLayout;
        Object[] objArr = 0;
        if (q4Var != null && (mwVar = wwVar.z0) != null && !mwVar.n && !wwVar.j2 && !wwVar.F3.c()) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) wwVar).parentLayout;
            if (!((ActionBarLayout) q4Var2).i()) {
                q4Var3 = ((org.telegram.ui.ActionBar.f2) wwVar).parentLayout;
                if (!((ActionBarLayout) q4Var3).y()) {
                    q4Var4 = ((org.telegram.ui.ActionBar.f2) wwVar).parentLayout;
                    if (!((ActionBarLayout) q4Var4).n && (motionEvent == null || wwVar.m3 || (motionEvent.getY() > Y() + Z() && ((fVar = wwVar.y1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < wwVar.y1.getY())))) {
                        if (wwVar.R0 != 3) {
                            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                            if (org.telegram.messenger.iz.m(i7) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
                                if (org.telegram.messenger.iz.m(i10) == 2) {
                                    vw vwVar = wwVar.e0[0];
                                    if (vwVar != null) {
                                        int i11 = vwVar.d.h;
                                        if (i11 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.j0 == null) {
                                this.j0 = VelocityTracker.obtain();
                            }
                            this.j0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            wwVar.m3 = true;
                            this.g0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.h0 = x10;
                            if (wwVar.i3) {
                                if (x10 < wwVar.e0[0].getTranslationX() + wwVar.e0[0].getMeasuredWidth()) {
                                    wwVar.j3 = wwVar.e0[0].getTranslationX();
                                } else {
                                    vw[] vwVarArr = wwVar.e0;
                                    vw vwVar2 = vwVarArr[0];
                                    vw vwVar3 = vwVarArr[1];
                                    vwVarArr[0] = vwVar3;
                                    vwVarArr[1] = vwVar2;
                                    wwVar.i3 = false;
                                    wwVar.j3 = vwVar3.getTranslationX();
                                    wwVar.z0.g(1.0f, wwVar.e0[0].h);
                                    wwVar.z0.g(wwVar.j3 / r10[0].getMeasuredWidth(), wwVar.e0[1].h);
                                    wwVar.d5(true);
                                    wwVar.e0[0].d.getClass();
                                    wwVar.e0[1].d.getClass();
                                }
                            } else if (x10 < wwVar.e0[1].getTranslationX() + wwVar.e0[1].getMeasuredWidth()) {
                                vw[] vwVarArr2 = wwVar.e0;
                                vw vwVar4 = vwVarArr2[0];
                                vw vwVar5 = vwVarArr2[1];
                                vwVarArr2[0] = vwVar5;
                                vwVarArr2[1] = vwVar4;
                                wwVar.i3 = true;
                                wwVar.j3 = vwVar5.getTranslationX();
                                wwVar.z0.g(1.0f, wwVar.e0[0].h);
                                wwVar.z0.g((-wwVar.j3) / r10[0].getMeasuredWidth(), wwVar.e0[1].h);
                                wwVar.d5(true);
                                wwVar.e0[0].d.getClass();
                                wwVar.e0[1].d.getClass();
                            } else {
                                wwVar.j3 = wwVar.e0[0].getTranslationX();
                            }
                            wwVar.g3.removeAllListeners();
                            wwVar.g3.cancel();
                            wwVar.h3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            wwVar.j3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !wwVar.m3 && !wwVar.n3 && wwVar.z0.getVisibility() == 0) {
                            this.g0 = motionEvent.getPointerId(0);
                            wwVar.n3 = true;
                            this.h0 = (int) motionEvent.getX();
                            this.i0 = (int) motionEvent.getY();
                            this.j0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.g0) {
                            int x11 = (int) ((motionEvent.getX() - this.h0) + wwVar.j3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.i0);
                            if (wwVar.m3 && (((z9 = wwVar.i3) && x11 > 0) || (!z9 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    wwVar.n3 = true;
                                    wwVar.m3 = false;
                                    wwVar.e0[0].setTranslationX(0.0f);
                                    wwVar.e0[1].setTranslationX(wwVar.i3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    wwVar.z0.g(0.0f, wwVar.e0[1].h);
                                }
                            }
                            if (wwVar.n3 && !wwVar.m3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.h0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (wwVar.m3) {
                                wwVar.e0[0].setTranslationX(x11);
                                if (wwVar.i3) {
                                    wwVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    wwVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / wwVar.e0[0].getMeasuredWidth();
                                vw vwVar6 = wwVar.e0[1];
                                if (vwVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    wwVar.z0.i(wwVar.e0[1].h);
                                    org.telegram.messenger.g0.i3(new ow(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                wwVar.z0.g(abs2, vwVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.g0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.j0.computeCurrentVelocity(1000, wwVar.l3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.j0.getXVelocity();
                                f11 = this.j0.getYVelocity();
                                if (!wwVar.m3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (wwVar.m3) {
                                float x13 = wwVar.e0[0].getX();
                                wwVar.g3 = new AnimatorSet();
                                if (wwVar.e0[1].E) {
                                    wwVar.k3 = true;
                                } else if (wwVar.j3 == 0.0f) {
                                    wwVar.k3 = Math.abs(x13) < ((float) wwVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z10 = wwVar.i3 ? false : false;
                                    wwVar.k3 = z10;
                                } else if (wwVar.i3) {
                                    wwVar.k3 = wwVar.e0[1].getX() > ((float) (wwVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    wwVar.k3 = wwVar.e0[0].getX() < ((float) (wwVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z11 = wwVar.k3;
                                Property property = View.TRANSLATION_X;
                                if (z11) {
                                    measuredWidth = Math.abs(x13);
                                    if (wwVar.i3) {
                                        wwVar.g3.playTogether(ObjectAnimator.ofFloat(wwVar.e0[0], (Property<vw, Float>) property, 0.0f), ObjectAnimator.ofFloat(wwVar.e0[1], (Property<vw, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        wwVar.g3.playTogether(ObjectAnimator.ofFloat(wwVar.e0[0], (Property<vw, Float>) property, 0.0f), ObjectAnimator.ofFloat(wwVar.e0[1], (Property<vw, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = wwVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (wwVar.i3) {
                                        wwVar.g3.playTogether(ObjectAnimator.ofFloat(wwVar.e0[0], (Property<vw, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(wwVar.e0[1], (Property<vw, Float>) property, 0.0f));
                                    } else {
                                        wwVar.g3.playTogether(ObjectAnimator.ofFloat(wwVar.e0[0], (Property<vw, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(wwVar.e0[1], (Property<vw, Float>) property, 0.0f));
                                    }
                                }
                                wwVar.g3.setInterpolator(ww.z4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                wwVar.g3.setDuration(Math.max(org.telegram.messenger.qs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                wwVar.g3.addListener(new va(this, 26));
                                wwVar.g3.start();
                                wwVar.h3 = true;
                                wwVar.m3 = false;
                            } else {
                                wwVar.n3 = false;
                                kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                                kVar.setEnabled(true);
                                wwVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.j0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.j0 = null;
                            }
                        }
                        return wwVar.m3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        ww wwVar = this.n0;
        if (wwVar.n3 && !wwVar.m3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }
}
