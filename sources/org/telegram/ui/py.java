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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class py extends org.telegram.ui.Components.aw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final /* synthetic */ wy E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py(Context context, wy wyVar) {
        super(context, null);
        this.E0 = wyVar;
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
    
        if (org.telegram.ui.ActionBar.j6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.aw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            wy wyVar = this.E0;
            if (wyVar.m4 != null) {
                i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) wyVar).resourceProvider;
                if (dh.c.c(i10, f6Var)) {
                    f6Var2 = ((org.telegram.ui.ActionBar.p2) wyVar).resourceProvider;
                    if (f6Var2 != null) {
                        f6Var3 = ((org.telegram.ui.ActionBar.p2) wyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    wyVar.m4.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
        gy gyVar;
        org.telegram.ui.Components.vl0 p5;
        wy wyVar = this.E0;
        if (wyVar.p3 && (gyVar = wyVar.C0) != null && gyVar.getVisibility() == 0) {
            gy gyVar2 = wyVar.C0;
            View[] viewArr = gyVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.v81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + gyVar2.getY());
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
        wy wyVar = this.E0;
        if (!wyVar.g3) {
            return false;
        }
        if (!wyVar.j3) {
            if (Math.abs(wyVar.e0[1].getTranslationX()) < 1.0f) {
                wyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (wyVar.h3 ? -1 : 1));
                wyVar.e0[1].setTranslationX(0.0f);
                wy.f1(wyVar, true);
                animatorSet = wyVar.f3;
                if (animatorSet != null) {
                }
                wyVar.g3 = false;
            }
            return wyVar.g3;
        }
        if (Math.abs(wyVar.e0[0].getTranslationX()) < 1.0f) {
            wyVar.e0[0].setTranslationX(0.0f);
            wyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (wyVar.h3 ? 1 : -1));
            wy.f1(wyVar, true);
            animatorSet = wyVar.f3;
            if (animatorSet != null) {
                animatorSet.cancel();
                wyVar.f3 = null;
            }
            wyVar.g3 = false;
        }
        return wyVar.g3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.l lVar;
        wy wyVar = this.E0;
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        float height = lVar.getHeight();
        qx qxVar = wyVar.F3;
        float f7 = (qxVar == null || !qxVar.c()) ? 0.0f : wyVar.F3.e;
        if (wyVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, wyVar.t3, (1.0f - f7) * (1.0f - wyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - wyVar.x1) * (1.0f - wyVar.t3) * AndroidUtilities.dp(48.0f), height + wyVar.T);
    }

    public final int b0() {
        wy wyVar = this.E0;
        float f7 = wyVar.N;
        qx qxVar = wyVar.F3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, wyVar.x1, org.telegram.messenger.a2.A(1.0f, (qxVar == null || !qxVar.c()) ? 0.0f : wyVar.F3.e, 1.0f - wyVar.t3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        wy wyVar = this.E0;
        uw uwVar = wyVar.z0;
        int i10 = uwVar.j0.get(uwVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        wyVar.m3 = false;
        wyVar.l3 = true;
        this.y0 = (int) (motionEvent.getX() + wyVar.i3);
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        lVar.setEnabled(false);
        wyVar.z0.setEnabled(false);
        vy vyVar = wyVar.e0[1];
        vyVar.h = i10;
        vyVar.setVisibility(0);
        wyVar.h3 = z10;
        wy.f1(wyVar, false);
        wyVar.R4(true);
        if (z10) {
            wyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        wyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
        qx qxVar;
        my myVar;
        float f11;
        bi.nc ncVar;
        float f12;
        my myVar2;
        org.telegram.ui.ActionBar.l lVar;
        qx qxVar2;
        wy wyVar = this.E0;
        Paint paint = wyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && wyVar.l4 != null) {
            wyVar.m3();
        }
        if (wyVar.Q && (((qxVar2 = wyVar.F3) == null || !qxVar2.c()) && wyVar.t3 == 0.0f)) {
            wyVar.Q = false;
            int i10 = (wyVar.Z3() && wyVar.e0[0].s == 0) ? 1 : 0;
            sy syVar = wyVar.e0[0].a;
            if (wyVar.R) {
                if (!wyVar.b1) {
                    if (i10 == 0) {
                        wyVar.R = false;
                    }
                    if (wyVar.R) {
                        s4.c1 L = syVar.L(0, false);
                        if (L == null) {
                            wyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= syVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                wyVar.R = false;
                            } else if (view.getTop() >= syVar.getPaddingTop()) {
                                wyVar.R = false;
                            }
                        }
                        if (wyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.c1 L2 = syVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = syVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -wyVar.T3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    wyVar.C4(f13);
                } else {
                    wyVar.C4(0.0f);
                }
            } else {
                wyVar.C4(-wyVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.p2) wyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        wyVar.F3.setCurrentTop(i11);
        boolean z12 = wyVar.r3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = wyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            } else if (f15 == 0.0f && (myVar2 = wyVar.X) != null) {
                myVar2.setTranslationY(wyVar.W3() + wyVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(wyVar.x1 * 2.0f));
            float f16 = wyVar.x1;
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
            float f17 = wyVar.x1;
            if (f17 > 0.0f && f17 < f7) {
                paint2.setColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (!wyVar.p3 && wyVar.q3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(wyVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                my myVar3 = wyVar.X;
                if (myVar3 != null) {
                    lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                    int height = lVar.getHeight();
                    myVar3.setTranslationY(wyVar.W3() + (i11 - (height + (wyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 1.0f;
            f10 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.p2) wyVar).inPreviewMode;
            if (!z11) {
                if (wyVar.t3 > 0.0f) {
                    paint2.setColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(wyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(wyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                wyVar.w3 = 0.0f;
                wyVar.v3 = 0.0f;
                float min = wyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!wyVar.K ? 81.0f : 0.0f)) + wyVar.N, wyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!wyVar.K ? 81.0f : 0.0f)));
                wyVar.w3 = min;
                wyVar.v3 = min;
                qxVar = wyVar.F3;
                if (qxVar == null && qxVar.c()) {
                    float f18 = wyVar.F3.e;
                    float T3 = wyVar.w3 - ((wyVar.T3() + wyVar.N) * f18);
                    wyVar.w3 = T3;
                    wyVar.v3 = T3;
                    float clamp = wyVar.G0 ? f7 - Utilities.clamp(f18 / 0.5f, f7, 0.0f) : 1.0f;
                    uw uwVar = wyVar.z0;
                    if (uwVar != null && uwVar.getVisibility() == 0) {
                        wyVar.w3 -= (f7 - wyVar.r.e) * wyVar.z0.getMeasuredHeight();
                    }
                    my myVar4 = wyVar.X;
                    if (myVar4 != null) {
                        myVar4.setTranslationY(wyVar.W3() + AndroidUtilities.lerp(wyVar.N + wyVar.w3, -AndroidUtilities.dp(wyVar.K ? 81.0f : 0.0f), f18));
                    }
                    if (wyVar.y) {
                        boolean z13 = wyVar.E;
                        float f19 = z13 ? 0.0f : wyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !wyVar.w) ? 0.0f : 50.0f), f19, wyVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    wyVar.e0[0].setTranslationY(f12 - (((wyVar.K ? AndroidUtilities.dp(f10) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * wyVar.F3.e));
                    f11 = clamp;
                } else {
                    myVar = wyVar.X;
                    if (myVar != null) {
                        myVar.setTranslationY(AndroidUtilities.lerp(((wyVar.N + wyVar.w3) + wyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((wyVar.K ? 81 : 0) + 48), wyVar.x1));
                    }
                    f11 = 1.0f;
                }
                wyVar.S4();
                wy.N2(wyVar, f11);
                super.dispatchDraw(canvas);
                wy.O2(wyVar, canvas2, i11);
                ncVar = wyVar.K0;
                if (ncVar != null && ncVar.getVisibility() == 0) {
                    if (wyVar.K0.getAlpha() != f7) {
                        wyVar.K0.draw(canvas2);
                    } else if (wyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(wyVar.K0.getLeft(), wyVar.K0.getTop(), wyVar.K0.getRight(), wyVar.K0.getBottom(), (int) (wyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(wyVar.K0.getLeft(), wyVar.K0.getTop());
                        wyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!wyVar.W && wyVar.X2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), wyVar.g4);
                }
                wyVar.V = true;
            }
        }
        canvas2 = canvas;
        wyVar.w3 = 0.0f;
        wyVar.v3 = 0.0f;
        float min2 = wyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!wyVar.K ? 81.0f : 0.0f)) + wyVar.N, wyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!wyVar.K ? 81.0f : 0.0f)));
        wyVar.w3 = min2;
        wyVar.v3 = min2;
        qxVar = wyVar.F3;
        if (qxVar == null) {
        }
        myVar = wyVar.X;
        if (myVar != null) {
        }
        f11 = 1.0f;
        wyVar.S4();
        wy.N2(wyVar, f11);
        super.dispatchDraw(canvas);
        wy.O2(wyVar, canvas2, i11);
        ncVar = wyVar.K0;
        if (ncVar != null) {
            if (wyVar.K0.getAlpha() != f7) {
            }
        }
        if (!wyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), wyVar.g4);
        }
        wyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        wy wyVar = this.E0;
        if (view == wyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.aw0.v0) {
            return super.drawChild(canvas, view, j3);
        }
        vy[] vyVarArr = wyVar.e0;
        if (view == vyVarArr[0] || ((vyVarArr.length > 1 && view == vyVarArr[1]) || view == wyVar.J1 || view == wyVar.z0)) {
            canvas.save();
            if (view != wyVar.J1 && view != wyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = wyVar.X3;
            if (f7 != 1.0f) {
                if (wyVar.Y3) {
                    canvas.translate((1.0f - wyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - wyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(a2, a2, 0.0f, (-getY()) + wyVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        if (view != lVar || wyVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (wyVar.Y3) {
            canvas.translate((1.0f - wyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float a10 = com.google.android.gms.internal.vision.e2.a(1.0f, wyVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - wyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            canvas.scale(a10, a10, 0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + (lVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
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
        org.telegram.ui.Components.n5 n5Var = this.E0.D3;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n5 n5Var = this.E0.D3;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        uw uwVar;
        int actionMasked = motionEvent.getActionMasked();
        wy wyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            if (lVar.s()) {
                wyVar.Y0 = true;
            }
        }
        return Z() || ((uwVar = wyVar.z0) != null && uwVar.O) || onTouchEvent(motionEvent);
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
        wy wyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        nx nxVar;
        nx nxVar2;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        py pyVar = this;
        int childCount = pyVar.getChildCount();
        int R = pyVar.R();
        pyVar.setBottomClip(0);
        int measuredWidth = pyVar.getMeasuredWidth();
        int measuredHeight = pyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            wyVar = pyVar.E0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = pyVar.getChildAt(i20);
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
                            i19 = layoutParams.topMargin + pyVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != wyVar.X || childAt == wyVar.Z || childAt == (nxVar2 = wyVar.E0)) {
                            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                            i19 = lVar.getMeasuredHeight();
                            if (childAt != wyVar.X && childAt != wyVar.E0 && childAt != wyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (wyVar.K && childAt == wyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            nxVar = wyVar.E0;
                            if (childAt == nxVar && nxVar.getPremiumHint() != null) {
                                wyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.em.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, wyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.em.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == wyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == wyVar.C0) {
                            i19 = -AndroidUtilities.dp(wyVar.a);
                        } else if (childAt instanceof dv) {
                            lVar3 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                            i19 = lVar3.getMeasuredHeight();
                        } else if (childAt instanceof vy) {
                            i19 = 0;
                        } else if (childAt == wyVar.J1 || childAt == wyVar.K1 || childAt == wyVar.z0) {
                            lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + lVar2.getMeasuredHeight() + i19;
                        } else if (nxVar2 != null && nxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != wyVar.X) {
                    }
                    lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                    i19 = lVar.getMeasuredHeight();
                    if (childAt != wyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (wyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    nxVar = wyVar.E0;
                    if (childAt == nxVar) {
                        wyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.em.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, wyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.em.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == wyVar.X) {
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
                if (childAt != wyVar.X) {
                }
                lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                i19 = lVar.getMeasuredHeight();
                if (childAt != wyVar.X) {
                }
                if (wyVar.K) {
                }
                nxVar = wyVar.E0;
                if (childAt == nxVar) {
                }
                if (childAt == wyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            pyVar = this;
        }
        gy gyVar = wyVar.C0;
        if (gyVar != null) {
            gyVar.setKeyboardHeight(R);
        }
        S();
        wyVar.X4();
        wyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        wy wyVar = this.E0;
        int i12 = wyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.m0;
        if (w0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            lVar5 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            layoutParams.topMargin = lVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar2 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                if (childAt != lVar2) {
                    if (childAt instanceof dv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        lVar4 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - lVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof vy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (wyVar.F3.c()) {
                            if (wyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (wyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + wyVar.P;
                        if (wyVar.u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = wyVar.Z3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        gy gyVar = wyVar.C0;
                        if (childAt == gyVar) {
                            gyVar.setTranslationY(wyVar.I0);
                            wyVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            wyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            lVar3 = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + lVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            gx gxVar = wyVar.B1;
                            if (gxVar == null || !gxVar.u0(childAt)) {
                                if (childAt == wyVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = wyVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    wyVar.F3.setTransitionPaddingBottom(i16);
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
            post(new oy(this, 1));
            this.C0 = z10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x03ad, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r3 == 8) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var;
        uw uwVar;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.ActionBar.f5 f5Var3;
        org.telegram.ui.ActionBar.f5 f5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.l lVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        gh.g gVar;
        wy wyVar = this.E0;
        f5Var = ((org.telegram.ui.ActionBar.p2) wyVar).parentLayout;
        Object[] objArr = 0;
        if (f5Var != null && (uwVar = wyVar.z0) != null && !uwVar.n && !wyVar.j2 && !wyVar.F3.c()) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) wyVar).parentLayout;
            if (!((ActionBarLayout) f5Var2).j()) {
                f5Var3 = ((org.telegram.ui.ActionBar.p2) wyVar).parentLayout;
                if (!((ActionBarLayout) f5Var3).y()) {
                    f5Var4 = ((org.telegram.ui.ActionBar.p2) wyVar).parentLayout;
                    if (!((ActionBarLayout) f5Var4).n && (motionEvent == null || wyVar.l3 || (motionEvent.getY() > a0() + b0() && ((gVar = wyVar.y1) == null || gVar.getVisibility() != 0 || motionEvent.getY() < wyVar.y1.getY())))) {
                        if (wyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.p2) wyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    vy vyVar = wyVar.e0[0];
                                    if (vyVar != null) {
                                        int i12 = vyVar.d.h;
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
                            wyVar.l3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (wyVar.h3) {
                                if (x10 < wyVar.e0[0].getTranslationX() + wyVar.e0[0].getMeasuredWidth()) {
                                    wyVar.i3 = wyVar.e0[0].getTranslationX();
                                } else {
                                    vy[] vyVarArr = wyVar.e0;
                                    vy vyVar2 = vyVarArr[0];
                                    vy vyVar3 = vyVarArr[1];
                                    vyVarArr[0] = vyVar3;
                                    vyVarArr[1] = vyVar2;
                                    wyVar.h3 = false;
                                    wyVar.i3 = vyVar3.getTranslationX();
                                    wyVar.z0.g(1.0f, wyVar.e0[0].h);
                                    wyVar.z0.g(wyVar.i3 / r11[0].getMeasuredWidth(), wyVar.e0[1].h);
                                    wyVar.R4(true);
                                    wyVar.e0[0].d.getClass();
                                    wyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < wyVar.e0[1].getTranslationX() + wyVar.e0[1].getMeasuredWidth()) {
                                vy[] vyVarArr2 = wyVar.e0;
                                vy vyVar4 = vyVarArr2[0];
                                vy vyVar5 = vyVarArr2[1];
                                vyVarArr2[0] = vyVar5;
                                vyVarArr2[1] = vyVar4;
                                wyVar.h3 = true;
                                wyVar.i3 = vyVar5.getTranslationX();
                                wyVar.z0.g(1.0f, wyVar.e0[0].h);
                                wyVar.z0.g((-wyVar.i3) / r11[0].getMeasuredWidth(), wyVar.e0[1].h);
                                wyVar.R4(true);
                                wyVar.e0[0].d.getClass();
                                wyVar.e0[1].d.getClass();
                            } else {
                                wyVar.i3 = wyVar.e0[0].getTranslationX();
                            }
                            wyVar.f3.removeAllListeners();
                            wyVar.f3.cancel();
                            wyVar.g3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            wyVar.i3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !wyVar.l3 && !wyVar.m3 && wyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            wyVar.m3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + wyVar.i3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (wyVar.l3 && (((z10 = wyVar.h3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    wyVar.m3 = true;
                                    wyVar.l3 = false;
                                    wyVar.e0[0].setTranslationX(0.0f);
                                    wyVar.e0[1].setTranslationX(wyVar.h3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    wyVar.z0.g(0.0f, wyVar.e0[1].h);
                                }
                            }
                            if (wyVar.m3 && !wyVar.l3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (wyVar.l3) {
                                wyVar.e0[0].setTranslationX(x11);
                                if (wyVar.h3) {
                                    wyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    wyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / wyVar.e0[0].getMeasuredWidth();
                                vy vyVar6 = wyVar.e0[1];
                                if (vyVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    wyVar.z0.i(wyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new oy(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                wyVar.z0.g(abs2, vyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, wyVar.k3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!wyVar.l3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (wyVar.l3) {
                                float x13 = wyVar.e0[0].getX();
                                wyVar.f3 = new AnimatorSet();
                                if (wyVar.e0[1].E) {
                                    wyVar.j3 = true;
                                } else if (wyVar.i3 == 0.0f) {
                                    wyVar.j3 = Math.abs(x13) < ((float) wyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = wyVar.h3 ? false : false;
                                    wyVar.j3 = z11;
                                } else if (wyVar.h3) {
                                    wyVar.j3 = wyVar.e0[1].getX() > ((float) (wyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    wyVar.j3 = wyVar.e0[0].getX() < ((float) (wyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = wyVar.j3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (wyVar.h3) {
                                        wyVar.f3.playTogether(ObjectAnimator.ofFloat(wyVar.e0[0], (Property<vy, Float>) property, 0.0f), ObjectAnimator.ofFloat(wyVar.e0[1], (Property<vy, Float>) property, r13.getMeasuredWidth()));
                                    } else {
                                        wyVar.f3.playTogether(ObjectAnimator.ofFloat(wyVar.e0[0], (Property<vy, Float>) property, 0.0f), ObjectAnimator.ofFloat(wyVar.e0[1], (Property<vy, Float>) property, -r13.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = wyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (wyVar.h3) {
                                        wyVar.f3.playTogether(ObjectAnimator.ofFloat(wyVar.e0[0], (Property<vy, Float>) property, -r12.getMeasuredWidth()), ObjectAnimator.ofFloat(wyVar.e0[1], (Property<vy, Float>) property, 0.0f));
                                    } else {
                                        wyVar.f3.playTogether(ObjectAnimator.ofFloat(wyVar.e0[0], (Property<vy, Float>) property, r12.getMeasuredWidth()), ObjectAnimator.ofFloat(wyVar.e0[1], (Property<vy, Float>) property, 0.0f));
                                    }
                                }
                                wyVar.f3.setInterpolator(wy.z4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                wyVar.f3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r7) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                wyVar.f3.addListener(new org.telegram.ui.Components.voip.v2(this, 8));
                                wyVar.f3.start();
                                wyVar.g3 = true;
                                wyVar.l3 = false;
                            } else {
                                wyVar.m3 = false;
                                lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
                                lVar.setEnabled(true);
                                wyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return wyVar.l3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        wy wyVar = this.E0;
        if (wyVar.m3 && !wyVar.l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
