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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.qt0 {
    public final Paint g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public final Rect l0;
    public boolean m0;
    public final org.telegram.ui.Cells.k9 n0;
    public final /* synthetic */ uw o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(Context context, uw uwVar) {
        super(context, null);
        this.o0 = uwVar;
        this.g0 = new Paint(1);
        this.l0 = new Rect();
        this.n0 = new org.telegram.ui.Cells.k9(new f(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0.a() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r0 = org.telegram.messenger.hs.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = org.telegram.messenger.hs.t3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (org.telegram.ui.ActionBar.k6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.qt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var3;
        if (Build.VERSION.SDK_INT >= 29 && org.telegram.messenger.az.f()) {
            uw uwVar = this.o0;
            if (uwVar.l4 != null) {
                i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.d2) uwVar).resourceProvider;
                if (b8.cd.c(i3, e6Var)) {
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) uwVar).resourceProvider;
                    if (e6Var2 != null) {
                        e6Var3 = ((org.telegram.ui.ActionBar.d2) uwVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    uwVar.l4.l(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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

    @Override // org.telegram.ui.Components.qt0
    public final void J(Canvas canvas, ArrayList arrayList) {
        cw cwVar;
        org.telegram.ui.Components.tj0 l10;
        uw uwVar = this.o0;
        if (uwVar.r3 && (cwVar = uwVar.D0) != null && cwVar.getVisibility() == 0) {
            cw cwVar2 = uwVar.D0;
            View[] viewArr = cwVar2.e;
            for (int i3 = 0; i3 < viewArr.length; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0 && (l10 = org.telegram.ui.Components.n61.l(viewArr[i3])) != null) {
                    for (int i10 = 0; i10 < l10.getChildCount(); i10++) {
                        View childAt = l10.getChildAt(i10);
                        if (childAt.getY() < org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i3].getX(), childAt.getY() + l10.getY() + viewArr[i3].getY() + cwVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public final void L() {
        pi.q qVar;
        org.telegram.messenger.az.f();
        qVar = ((org.telegram.ui.ActionBar.d2) this.o0).glassEngine;
        qVar.g();
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        uw uwVar = this.o0;
        if (!uwVar.i3) {
            return false;
        }
        if (!uwVar.l3) {
            if (Math.abs(uwVar.f0[1].getTranslationX()) < 1.0f) {
                uwVar.f0[0].setTranslationX(r1.getMeasuredWidth() * (uwVar.j3 ? -1 : 1));
                uwVar.f0[1].setTranslationX(0.0f);
                uw.j1(uwVar, true);
                animatorSet = uwVar.h3;
                if (animatorSet != null) {
                }
                uwVar.i3 = false;
            }
            return uwVar.i3;
        }
        if (Math.abs(uwVar.f0[0].getTranslationX()) < 1.0f) {
            uwVar.f0[0].setTranslationX(0.0f);
            uwVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() * (uwVar.j3 ? 1 : -1));
            uw.j1(uwVar, true);
            animatorSet = uwVar.h3;
            if (animatorSet != null) {
                animatorSet.cancel();
                uwVar.h3 = null;
            }
            uwVar.i3 = false;
        }
        return uwVar.i3;
    }

    public final int Y() {
        org.telegram.ui.ActionBar.k kVar;
        uw uwVar = this.o0;
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        float height = kVar.getHeight();
        pv pvVar = uwVar.G3;
        float f10 = (pvVar == null || !pvVar.c()) ? 0.0f : uwVar.G3.e;
        if (uwVar.L) {
            height = com.google.android.recaptcha.internal.a.y(1.0f, uwVar.v3, (1.0f - f10) * (1.0f - uwVar.y1) * org.telegram.messenger.g0.L(81.0f), height);
        }
        return (int) com.google.android.recaptcha.internal.a.y(1.0f, f10, (1.0f - uwVar.y1) * (1.0f - uwVar.v3) * org.telegram.messenger.g0.L(48.0f), height + uwVar.U);
    }

    public final int Z() {
        uw uwVar = this.o0;
        float f10 = uwVar.O;
        pv pvVar = uwVar.G3;
        return (int) com.google.android.recaptcha.internal.a.y(1.0f, uwVar.y1, org.telegram.messenger.k5.A(1.0f, (pvVar == null || !pvVar.c()) ? 0.0f : uwVar.G3.e, 1.0f - uwVar.v3, f10), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        uw uwVar = this.o0;
        jw jwVar = uwVar.A0;
        int i3 = jwVar.k0.get(jwVar.L + (z10 ? 1 : -1), -1);
        if (i3 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        uwVar.o3 = false;
        uwVar.n3 = true;
        this.i0 = (int) (motionEvent.getX() + uwVar.k3);
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        kVar.setEnabled(false);
        uwVar.A0.setEnabled(false);
        tw twVar = uwVar.f0[1];
        twVar.h = i3;
        twVar.setVisibility(0);
        uwVar.j3 = z10;
        uw.j1(uwVar, false);
        uwVar.d5(true);
        if (z10) {
            uwVar.f0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        uwVar.f0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        pi.q qVar;
        boolean z10;
        float f10;
        boolean z11;
        Canvas canvas2;
        pv pvVar;
        iw iwVar;
        float f11;
        org.telegram.ui.Components.voip.r0 r0Var;
        float f12;
        iw iwVar2;
        float f13;
        org.telegram.ui.ActionBar.k kVar;
        pv pvVar2;
        uw uwVar = this.o0;
        Paint paint = uwVar.g1;
        qVar = ((org.telegram.ui.ActionBar.d2) uwVar).glassEngine;
        qVar.g();
        if (uwVar.R && (((pvVar2 = uwVar.G3) == null || !pvVar2.c()) && uwVar.v3 == 0.0f)) {
            uwVar.R = false;
            int i3 = (uwVar.l4() && uwVar.f0[0].s == 0) ? 1 : 0;
            pw pwVar = uwVar.f0[0].a;
            if (uwVar.S) {
                if (!uwVar.c1) {
                    if (i3 == 0) {
                        uwVar.S = false;
                    }
                    if (uwVar.S) {
                        u4.d1 L = pwVar.L(0, false);
                        if (L == null) {
                            uwVar.S = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= pwVar.getPaddingTop() - org.telegram.messenger.g0.L(81.0f)) {
                                uwVar.S = false;
                            } else if (view.getTop() >= pwVar.getPaddingTop()) {
                                uwVar.S = false;
                            }
                        }
                        if (uwVar.S) {
                        }
                    }
                }
                i3 = 0;
            }
            u4.d1 L2 = pwVar.L(i3, false);
            if (L2 != null) {
                float paddingTop = pwVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f14 = -paddingTop;
                    float f15 = -uwVar.f4();
                    if (f14 < f15) {
                        f14 = f15;
                    } else if (f14 > 0.0f) {
                        f14 = 0.0f;
                    }
                    uwVar.O4(f14);
                } else {
                    uwVar.O4(0.0f);
                }
            } else {
                uwVar.O4(-uwVar.f4());
            }
        }
        int Y = Y();
        z10 = ((org.telegram.ui.ActionBar.d2) uwVar).inPreviewMode;
        int Z = z10 ? org.telegram.messenger.g0.m : Z();
        int i10 = Z + Y;
        uwVar.G3.setCurrentTop(i10);
        boolean z12 = uwVar.t3;
        Rect rect = this.l0;
        Paint paint2 = this.g0;
        if (z12) {
            float f16 = uwVar.y1;
            if (f16 == 1.0f) {
                paint2.setColor(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            } else if (f16 == 0.0f && (iwVar2 = uwVar.Y) != null) {
                iwVar2.setTranslationY(uwVar.i4() + uwVar.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(uwVar.y1 * 2.0f));
            float f17 = uwVar.y1;
            if (f17 < 0.0f) {
                if (f17 == 1.0f) {
                    paint = paint2;
                }
                f13 = 2.0f;
                f10 = 1.0f;
                H(canvas, 0.0f, this.l0, paint, true);
            } else {
                f13 = 2.0f;
                f10 = 1.0f;
            }
            float f18 = uwVar.y1;
            if (f18 > 0.0f && f18 < f10) {
                paint2.setColor(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (!uwVar.r3 && uwVar.s3) {
                    rect.set(0, Z, getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(uwVar.y1 * f13));
                    H(canvas, 0.0f, this.l0, paint2, true);
                }
                iw iwVar3 = uwVar.Y;
                if (iwVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                    int height = kVar.getHeight();
                    iwVar3.setTranslationY(uwVar.i4() + (i10 - (height + (uwVar.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.d2) uwVar).inPreviewMode;
            if (!z11) {
                if (uwVar.v3 > 0.0f) {
                    paint2.setColor(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(uwVar.y1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i10 - org.telegram.messenger.g0.L(uwVar.y1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint, true);
                }
                uwVar.y3 = 0.0f;
                uwVar.x3 = 0.0f;
                float min = uwVar.y3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!uwVar.L ? 81.0f : 0.0f)) + uwVar.O, uwVar.v3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!uwVar.L ? 81.0f : 0.0f)));
                uwVar.y3 = min;
                uwVar.x3 = min;
                pvVar = uwVar.G3;
                if (pvVar == null && pvVar.c()) {
                    float f19 = uwVar.G3.e;
                    float f42 = uwVar.y3 - ((uwVar.f4() + uwVar.O) * f19);
                    uwVar.y3 = f42;
                    uwVar.x3 = f42;
                    float i11 = uwVar.H0 ? f10 - Utilities.i(f19 / 0.5f, f10, 0.0f) : f10;
                    jw jwVar = uwVar.A0;
                    if (jwVar != null && jwVar.getVisibility() == 0) {
                        uwVar.y3 -= (f10 - uwVar.r.e) * uwVar.A0.getMeasuredHeight();
                    }
                    iw iwVar4 = uwVar.Y;
                    if (iwVar4 != null) {
                        iwVar4.setTranslationY(uwVar.i4() + org.telegram.messenger.g0.T1(uwVar.O + uwVar.y3, -org.telegram.messenger.g0.L(uwVar.L ? 81.0f : 0.0f), f19));
                    }
                    if (uwVar.E) {
                        float f20 = uwVar.F ? 0.0f : uwVar.O;
                        f12 = -org.telegram.messenger.g0.T1(-f20, f20, uwVar.G3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    uwVar.f0[0].setTranslationY(f12 - (((uwVar.L ? org.telegram.messenger.g0.L(81.0f) + 0.0f : 0.0f) + org.telegram.messenger.g0.L(48.0f)) * uwVar.G3.e));
                    f11 = i11;
                } else {
                    iwVar = uwVar.Y;
                    if (iwVar != null) {
                        iwVar.setTranslationY(org.telegram.messenger.g0.T1(((uwVar.O + uwVar.y3) + uwVar.U) - org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L((uwVar.L ? 81 : 0) + 48), uwVar.y1));
                    }
                    f11 = f10;
                }
                uwVar.e5();
                uw.X2(uwVar, f11);
                super.dispatchDraw(canvas);
                uw.Y2(uwVar, canvas2, i10);
                r0Var = uwVar.L0;
                if (r0Var != null && r0Var.getVisibility() == 0) {
                    if (uwVar.L0.getAlpha() != f10) {
                        uwVar.L0.draw(canvas2);
                    } else if (uwVar.L0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(uwVar.L0.getLeft(), uwVar.L0.getTop(), uwVar.L0.getRight(), uwVar.L0.getBottom(), (int) (uwVar.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(uwVar.L0.getLeft(), uwVar.L0.getTop());
                        uwVar.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!uwVar.X && uwVar.Z2 == 0) {
                    org.telegram.messenger.g0.O(canvas2, this, uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), uwVar.g4, f10);
                }
                uwVar.W = true;
            }
        }
        canvas2 = canvas;
        uwVar.y3 = 0.0f;
        uwVar.x3 = 0.0f;
        float min2 = uwVar.y3 - Math.min((org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!uwVar.L ? 81.0f : 0.0f)) + uwVar.O, uwVar.v3 * (org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(!uwVar.L ? 81.0f : 0.0f)));
        uwVar.y3 = min2;
        uwVar.x3 = min2;
        pvVar = uwVar.G3;
        if (pvVar == null) {
        }
        iwVar = uwVar.Y;
        if (iwVar != null) {
        }
        f11 = f10;
        uwVar.e5();
        uw.X2(uwVar, f11);
        super.dispatchDraw(canvas);
        uw.Y2(uwVar, canvas2, i10);
        r0Var = uwVar.L0;
        if (r0Var != null) {
            if (uwVar.L0.getAlpha() != f10) {
            }
        }
        if (!uwVar.X) {
            org.telegram.messenger.g0.O(canvas2, this, uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6), uwVar.g4, f10);
        }
        uwVar.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.n0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar = this.o0;
        if (view == uwVar.L0) {
            return true;
        }
        if (org.telegram.ui.Components.qt0.f0) {
            return super.drawChild(canvas, view, j10);
        }
        tw[] twVarArr = uwVar.f0;
        if (view == twVarArr[0] || ((twVarArr.length > 1 && view == twVarArr[1]) || view == uwVar.K1 || view == uwVar.A0)) {
            canvas.save();
            if (view != uwVar.K1 && view != uwVar.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f10 = uwVar.X3;
            if (f10 != 1.0f) {
                if (uwVar.Y3) {
                    canvas.translate((1.0f - uwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
                } else {
                    float D = a1.g.D(1.0f, f10, 0.05f, 1.0f);
                    canvas.translate((1.0f - uwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
                    canvas.scale(D, D, 0.0f, (-getY()) + uwVar.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (view != kVar || uwVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        if (uwVar.Y3) {
            canvas.translate((1.0f - uwVar.X3) * org.telegram.messenger.g0.L(40.0f) * (-1), 0.0f);
        } else {
            float D2 = a1.g.D(1.0f, uwVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - uwVar.X3) * (-org.telegram.messenger.g0.L(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            canvas.scale(D2, D2, 0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.e5 e5Var = this.o0.E3;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5 e5Var = this.o0.E3;
        if (e5Var != null) {
            e5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        jw jwVar;
        int actionMasked = motionEvent.getActionMasked();
        uw uwVar = this.o0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar.v()) {
                uwVar.Z0 = true;
            }
        }
        return X() || ((jwVar = uwVar.A0) != null && jwVar.P) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        uw uwVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        mv mvVar;
        mv mvVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        mw mwVar = this;
        int childCount = mwVar.getChildCount();
        int Q = mwVar.Q();
        int i19 = 0;
        mwVar.setBottomClip(0);
        int measuredWidth = mwVar.getMeasuredWidth();
        int measuredHeight = mwVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            uwVar = mwVar.o0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = mwVar.getChildAt(i20);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & org.telegram.messenger.hs.x1;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + mwVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = measuredHeight - measuredHeight2;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt != uwVar.Y || childAt == uwVar.a0 || childAt == (mvVar2 = uwVar.F0)) {
                            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            i18 = kVar.getMeasuredHeight();
                            if (childAt != uwVar.Y && childAt != uwVar.F0 && childAt != uwVar.a0) {
                                i18 += org.telegram.messenger.g0.L(48.0f);
                            }
                            if (uwVar.L && childAt == uwVar.Y) {
                                i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                            }
                            mvVar = uwVar.F0;
                            if (childAt == mvVar && mvVar.getPremiumHint() != null) {
                                uwVar.F0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, uwVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                            }
                            if (childAt == uwVar.Y) {
                                i18 += org.telegram.messenger.g0.L(2.0f);
                            }
                        } else if (childAt == uwVar.D0) {
                            i18 = -org.telegram.messenger.g0.L(uwVar.a);
                        } else if (childAt instanceof kt) {
                            kVar3 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            i18 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof tw) {
                            i18 = i19;
                        } else if (childAt == uwVar.K1 || childAt == uwVar.L1 || childAt == uwVar.A0) {
                            kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            i18 = org.telegram.messenger.g0.L(48.0f) + kVar2.getMeasuredHeight() + i18;
                        } else if (mvVar2 != null && mvVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
                    } else {
                        i16 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt != uwVar.Y) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                    i18 = kVar.getMeasuredHeight();
                    if (childAt != uwVar.Y) {
                        i18 += org.telegram.messenger.g0.L(48.0f);
                    }
                    if (uwVar.L) {
                        i18 = org.telegram.messenger.g0.L(81.0f) + i18;
                    }
                    mvVar = uwVar.F0;
                    if (childAt == mvVar) {
                        uwVar.F0.getPremiumHint().layout(i15, org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2), i15 + measuredWidth2, uwVar.F0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.camera.q.D(54.0f, i18, measuredHeight2));
                    }
                    if (childAt == uwVar.Y) {
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
                if (childAt != uwVar.Y) {
                }
                kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                i18 = kVar.getMeasuredHeight();
                if (childAt != uwVar.Y) {
                }
                if (uwVar.L) {
                }
                mvVar = uwVar.F0;
                if (childAt == mvVar) {
                }
                if (childAt == uwVar.Y) {
                }
                childAt.layout(i15, i18, measuredWidth2 + i15, measuredHeight2 + i18);
            }
            i20++;
            i19 = 0;
            mwVar = this;
        }
        cw cwVar = uwVar.D0;
        if (cwVar != null) {
            cwVar.setKeyboardHeight(Q);
        }
        R();
        uwVar.k5();
        uwVar.e5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        uw uwVar = this.o0;
        int i11 = uwVar.a;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.q0 q0Var = uwVar.n0;
        if (q0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        measureChildWithMargins(kVar, i3, 0, i10, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof kt) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i10);
                        int L = org.telegram.messenger.g0.L(10.0f);
                        int L2 = org.telegram.messenger.g0.L(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof tw) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = org.telegram.messenger.g0.L(2.0f) + size2;
                        if (uwVar.G3.c()) {
                            if (uwVar.x) {
                                L3 = org.telegram.messenger.g0.L(50.0f) + L3;
                            }
                            if (uwVar.L) {
                                L3 = org.telegram.messenger.g0.L(81.0f) + L3;
                            }
                            L3 = org.telegram.messenger.g0.L(48.0f) + L3;
                        }
                        int i13 = L3 + uwVar.Q;
                        if (uwVar.w3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i14 = uwVar.Z3 ? (int) (i13 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i14);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), i13 + i14), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        cw cwVar = uwVar.D0;
                        if (childAt == cwVar) {
                            cwVar.setTranslationY(uwVar.J0);
                            uwVar.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i11) + View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
                            uwVar.S3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = org.telegram.messenger.g0.Q;
                            kVar3 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            rect.set(0, (org.telegram.messenger.g0.L(i11) + kVar3.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            gv gvVar = uwVar.C1;
                            if (gvVar == null || !gvVar.s0(childAt)) {
                                if (childAt == uwVar.G3) {
                                    int size4 = View.MeasureSpec.getSize(i10);
                                    int i15 = uwVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    uwVar.G3.setTransitionPaddingBottom(i15);
                                    childAt.measure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), size4 + i15), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i3, 0, i10, 0);
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
        if (z10 != this.m0) {
            post(new lw(this, 1));
            this.m0 = z10;
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
        jw jwVar;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i3;
        int i10;
        kh.f fVar;
        uw uwVar = this.o0;
        q4Var = ((org.telegram.ui.ActionBar.d2) uwVar).parentLayout;
        Object[] objArr = 0;
        if (q4Var != null && (jwVar = uwVar.A0) != null && !jwVar.n && !uwVar.k2 && !uwVar.G3.c()) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) uwVar).parentLayout;
            if (!((ActionBarLayout) q4Var2).i()) {
                q4Var3 = ((org.telegram.ui.ActionBar.d2) uwVar).parentLayout;
                if (!((ActionBarLayout) q4Var3).y()) {
                    q4Var4 = ((org.telegram.ui.ActionBar.d2) uwVar).parentLayout;
                    if (!((ActionBarLayout) q4Var4).n && (motionEvent == null || uwVar.n3 || (motionEvent.getY() > Y() + Z() && ((fVar = uwVar.z1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < uwVar.z1.getY())))) {
                        if (uwVar.S0 != 3) {
                            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                            if (org.telegram.messenger.az.m(i3) != 5) {
                                i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                                if (org.telegram.messenger.az.m(i10) == 2) {
                                    tw twVar = uwVar.f0[0];
                                    if (twVar != null) {
                                        int i11 = twVar.d.h;
                                        if (i11 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            if (this.k0 == null) {
                                this.k0 = VelocityTracker.obtain();
                            }
                            this.k0.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            uwVar.n3 = true;
                            this.h0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.i0 = x10;
                            if (uwVar.j3) {
                                if (x10 < uwVar.f0[0].getTranslationX() + uwVar.f0[0].getMeasuredWidth()) {
                                    uwVar.k3 = uwVar.f0[0].getTranslationX();
                                } else {
                                    tw[] twVarArr = uwVar.f0;
                                    tw twVar2 = twVarArr[0];
                                    tw twVar3 = twVarArr[1];
                                    twVarArr[0] = twVar3;
                                    twVarArr[1] = twVar2;
                                    uwVar.j3 = false;
                                    uwVar.k3 = twVar3.getTranslationX();
                                    uwVar.A0.g(1.0f, uwVar.f0[0].h);
                                    uwVar.A0.g(uwVar.k3 / r10[0].getMeasuredWidth(), uwVar.f0[1].h);
                                    uwVar.d5(true);
                                    uwVar.f0[0].d.getClass();
                                    uwVar.f0[1].d.getClass();
                                }
                            } else if (x10 < uwVar.f0[1].getTranslationX() + uwVar.f0[1].getMeasuredWidth()) {
                                tw[] twVarArr2 = uwVar.f0;
                                tw twVar4 = twVarArr2[0];
                                tw twVar5 = twVarArr2[1];
                                twVarArr2[0] = twVar5;
                                twVarArr2[1] = twVar4;
                                uwVar.j3 = true;
                                uwVar.k3 = twVar5.getTranslationX();
                                uwVar.A0.g(1.0f, uwVar.f0[0].h);
                                uwVar.A0.g((-uwVar.k3) / r10[0].getMeasuredWidth(), uwVar.f0[1].h);
                                uwVar.d5(true);
                                uwVar.f0[0].d.getClass();
                                uwVar.f0[1].d.getClass();
                            } else {
                                uwVar.k3 = uwVar.f0[0].getTranslationX();
                            }
                            uwVar.h3.removeAllListeners();
                            uwVar.h3.cancel();
                            uwVar.i3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            uwVar.k3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !uwVar.n3 && !uwVar.o3 && uwVar.A0.getVisibility() == 0) {
                            this.h0 = motionEvent.getPointerId(0);
                            uwVar.o3 = true;
                            this.i0 = (int) motionEvent.getX();
                            this.j0 = (int) motionEvent.getY();
                            this.k0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.h0) {
                            int x11 = (int) ((motionEvent.getX() - this.i0) + uwVar.k3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.j0);
                            if (uwVar.n3 && (((z10 = uwVar.j3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!a0(motionEvent, x11 < 0)) {
                                    uwVar.o3 = true;
                                    uwVar.n3 = false;
                                    uwVar.f0[0].setTranslationX(0.0f);
                                    uwVar.f0[1].setTranslationX(uwVar.j3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    uwVar.A0.g(0.0f, uwVar.f0[1].h);
                                }
                            }
                            if (uwVar.o3 && !uwVar.n3) {
                                float a12 = org.telegram.messenger.g0.a1(true, 0.3f);
                                int x12 = (int) (motionEvent.getX() - this.i0);
                                if (Math.abs(x12) >= a12 && Math.abs(x12) > abs) {
                                    a0(motionEvent, x11 < 0);
                                }
                            } else if (uwVar.n3) {
                                uwVar.f0[0].setTranslationX(x11);
                                if (uwVar.j3) {
                                    uwVar.f0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    uwVar.f0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / uwVar.f0[0].getMeasuredWidth();
                                tw twVar6 = uwVar.f0[1];
                                if (twVar6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    uwVar.A0.i(uwVar.f0[1].h);
                                    org.telegram.messenger.g0.i3(new lw(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                uwVar.A0.g(abs2, twVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.h0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.k0.computeCurrentVelocity(1000, uwVar.m3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f10 = 0.0f;
                                f11 = 0.0f;
                            } else {
                                f10 = this.k0.getXVelocity();
                                f11 = this.k0.getYVelocity();
                                if (!uwVar.n3 && Math.abs(f10) >= 3000.0f && Math.abs(f10) > Math.abs(f11)) {
                                    a0(motionEvent, f10 < 0.0f);
                                }
                            }
                            if (uwVar.n3) {
                                float x13 = uwVar.f0[0].getX();
                                uwVar.h3 = new AnimatorSet();
                                if (uwVar.f0[1].F) {
                                    uwVar.l3 = true;
                                } else if (uwVar.k3 == 0.0f) {
                                    uwVar.l3 = Math.abs(x13) < ((float) uwVar.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f10) < 3500.0f || Math.abs(f10) < Math.abs(f11));
                                } else if (Math.abs(f10) > 1500.0f) {
                                    boolean z11 = uwVar.j3 ? false : false;
                                    uwVar.l3 = z11;
                                } else if (uwVar.j3) {
                                    uwVar.l3 = uwVar.f0[1].getX() > ((float) (uwVar.f0[0].getMeasuredWidth() >> 1));
                                } else {
                                    uwVar.l3 = uwVar.f0[0].getX() < ((float) (uwVar.f0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = uwVar.l3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (uwVar.j3) {
                                        uwVar.h3.playTogether(ObjectAnimator.ofFloat(uwVar.f0[0], (Property<tw, Float>) property, 0.0f), ObjectAnimator.ofFloat(uwVar.f0[1], (Property<tw, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        uwVar.h3.playTogether(ObjectAnimator.ofFloat(uwVar.f0[0], (Property<tw, Float>) property, 0.0f), ObjectAnimator.ofFloat(uwVar.f0[1], (Property<tw, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = uwVar.f0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (uwVar.j3) {
                                        uwVar.h3.playTogether(ObjectAnimator.ofFloat(uwVar.f0[0], (Property<tw, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(uwVar.f0[1], (Property<tw, Float>) property, 0.0f));
                                    } else {
                                        uwVar.h3.playTogether(ObjectAnimator.ofFloat(uwVar.f0[0], (Property<tw, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(uwVar.f0[1], (Property<tw, Float>) property, 0.0f));
                                    }
                                }
                                uwVar.h3.setInterpolator(uw.A4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f12 = measuredWidth2 / 2;
                                float I = (org.telegram.messenger.g0.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f12) + f12;
                                uwVar.h3.setDuration(Math.max(org.telegram.messenger.hs.g2, Math.min(Math.abs(f10) > 0.0f ? Math.round(Math.abs(I / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                uwVar.h3.addListener(new org.telegram.ui.Cells.w9(this, 26));
                                uwVar.h3.start();
                                uwVar.i3 = true;
                                uwVar.n3 = false;
                            } else {
                                uwVar.o3 = false;
                                kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                                kVar.setEnabled(true);
                                uwVar.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.k0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.k0 = null;
                            }
                        }
                        return uwVar.n3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        uw uwVar = this.o0;
        if (uwVar.o3 && !uwVar.n3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
