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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class my extends org.telegram.ui.Components.sw0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final ne.b D0;
    public final /* synthetic */ ty E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my(Context context, ty tyVar) {
        super(context, null);
        this.E0 = tyVar;
        this.w0 = new Paint(1);
        this.B0 = new Rect();
        this.D0 = new ne.b(new g(this, 15));
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
    
        if (org.telegram.ui.ActionBar.i6.I.q() == false) goto L18;
     */
    @Override // org.telegram.ui.Components.sw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var3;
        if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
            ty tyVar = this.E0;
            if (tyVar.l4 != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) tyVar).resourceProvider;
                if (eh.b.c(i10, e6Var)) {
                    e6Var2 = ((org.telegram.ui.ActionBar.n2) tyVar).resourceProvider;
                    if (e6Var2 != null) {
                        e6Var3 = ((org.telegram.ui.ActionBar.n2) tyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    tyVar.l4.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.sw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        dy dyVar;
        org.telegram.ui.Components.qm0 p5;
        ty tyVar = this.E0;
        if (tyVar.p3 && (dyVar = tyVar.C0) != null && dyVar.getVisibility() == 0) {
            dy dyVar2 = tyVar.C0;
            View[] viewArr = dyVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.o91.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + dyVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.sw0
    public final void M() {
        super.M();
        this.E0.j3();
    }

    @Override // org.telegram.ui.Components.sw0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        ty tyVar = this.E0;
        if (!tyVar.g3) {
            return false;
        }
        if (!tyVar.j3) {
            if (Math.abs(tyVar.e0[1].getTranslationX()) < 1.0f) {
                tyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (tyVar.h3 ? -1 : 1));
                tyVar.e0[1].setTranslationX(0.0f);
                ty.c1(tyVar, true);
                animatorSet = tyVar.f3;
                if (animatorSet != null) {
                }
                tyVar.g3 = false;
            }
            return tyVar.g3;
        }
        if (Math.abs(tyVar.e0[0].getTranslationX()) < 1.0f) {
            tyVar.e0[0].setTranslationX(0.0f);
            tyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (tyVar.h3 ? 1 : -1));
            ty.c1(tyVar, true);
            animatorSet = tyVar.f3;
            if (animatorSet != null) {
                animatorSet.cancel();
                tyVar.f3 = null;
            }
            tyVar.g3 = false;
        }
        return tyVar.g3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        ty tyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        float height = kVar.getHeight();
        nx nxVar = tyVar.F3;
        float f7 = (nxVar == null || !nxVar.c()) ? 0.0f : tyVar.F3.e;
        if (tyVar.K) {
            height = com.google.android.gms.internal.vision.e2.y(1.0f, tyVar.t3, (1.0f - f7) * (1.0f - tyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.y(1.0f, f7, (1.0f - tyVar.x1) * (1.0f - tyVar.t3) * AndroidUtilities.dp(48.0f), height + tyVar.T);
    }

    public final int b0() {
        ty tyVar = this.E0;
        float f7 = tyVar.N;
        nx nxVar = tyVar.F3;
        return (int) com.google.android.gms.internal.vision.e2.y(1.0f, tyVar.x1, org.telegram.messenger.q.z(1.0f, (nxVar == null || !nxVar.c()) ? 0.0f : tyVar.F3.e, 1.0f - tyVar.t3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        ty tyVar = this.E0;
        qw qwVar = tyVar.z0;
        int i10 = qwVar.j0.get(qwVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        tyVar.m3 = false;
        tyVar.l3 = true;
        this.y0 = (int) (motionEvent.getX() + tyVar.i3);
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        kVar.setEnabled(false);
        tyVar.z0.setEnabled(false);
        sy syVar = tyVar.e0[1];
        syVar.h = i10;
        syVar.setVisibility(0);
        tyVar.h3 = z10;
        ty.c1(tyVar, false);
        tyVar.O4(true);
        if (z10) {
            tyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        tyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r1 == 1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208  */
    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        nx nxVar;
        jy jyVar;
        float f11;
        ci.bb bbVar;
        float f12;
        jy jyVar2;
        org.telegram.ui.ActionBar.k kVar;
        nx nxVar2;
        ty tyVar = this.E0;
        Paint paint = tyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && tyVar.k4 != null) {
            tyVar.j3();
        }
        if (tyVar.Q && (((nxVar2 = tyVar.F3) == null || !nxVar2.c()) && tyVar.t3 == 0.0f)) {
            tyVar.Q = false;
            int i10 = (tyVar.W3() && tyVar.e0[0].s == 0) ? 1 : 0;
            py pyVar = tyVar.e0[0].a;
            if (tyVar.R) {
                if (!tyVar.b1) {
                    if (i10 == 0) {
                        tyVar.R = false;
                    }
                    if (tyVar.R) {
                        s4.d1 L = pyVar.L(0, false);
                        if (L == null) {
                            tyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= pyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                tyVar.R = false;
                            } else if (view.getTop() >= pyVar.getPaddingTop()) {
                                tyVar.R = false;
                            }
                        }
                        if (tyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.d1 L2 = pyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = pyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -tyVar.Q3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    tyVar.z4(f13);
                } else {
                    tyVar.z4(0.0f);
                }
            } else {
                tyVar.z4(-tyVar.Q3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.n2) tyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        tyVar.F3.setCurrentTop(i11);
        boolean z12 = tyVar.r3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = tyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            } else if (f15 == 0.0f && (jyVar2 = tyVar.X) != null) {
                jyVar2.setTranslationY(tyVar.T3() + tyVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(tyVar.x1 * 2.0f));
            float f16 = tyVar.x1;
            if (f16 < 0.0f) {
                if (f16 == 1.0f) {
                    paint = paint2;
                }
                f7 = 81.0f;
                f10 = 1.0f;
                J(canvas, 0.0f, this.B0, paint, true);
            } else {
                f7 = 81.0f;
                f10 = 1.0f;
            }
            float f17 = tyVar.x1;
            if (f17 > 0.0f && f17 < f10) {
                paint2.setColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                if (!tyVar.p3 && tyVar.q3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(tyVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                jy jyVar3 = tyVar.X;
                if (jyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                    int height = kVar.getHeight();
                    jyVar3.setTranslationY(tyVar.T3() + (i11 - (height + (tyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 81.0f;
            f10 = 1.0f;
            z11 = ((org.telegram.ui.ActionBar.n2) tyVar).inPreviewMode;
            if (!z11) {
                if (tyVar.t3 > 0.0f) {
                    paint2.setColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(tyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(tyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                tyVar.w3 = 0.0f;
                tyVar.v3 = 0.0f;
                float min = tyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!tyVar.K ? f7 : 0.0f)) + tyVar.N, tyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!tyVar.K ? f7 : 0.0f)));
                tyVar.w3 = min;
                tyVar.v3 = min;
                nxVar = tyVar.F3;
                if (nxVar == null && nxVar.c()) {
                    float f18 = tyVar.F3.e;
                    float Q3 = tyVar.w3 - ((tyVar.Q3() + tyVar.N) * f18);
                    tyVar.w3 = Q3;
                    tyVar.v3 = Q3;
                    float clamp = tyVar.G0 ? f10 - Utilities.clamp(f18 / 0.5f, f10, 0.0f) : f10;
                    qw qwVar = tyVar.z0;
                    if (qwVar != null && qwVar.getVisibility() == 0) {
                        tyVar.w3 -= (f10 - tyVar.r.e) * tyVar.z0.getMeasuredHeight();
                    }
                    jy jyVar4 = tyVar.X;
                    if (jyVar4 != null) {
                        jyVar4.setTranslationY(tyVar.T3() + AndroidUtilities.lerp(tyVar.N + tyVar.w3, -AndroidUtilities.dp(tyVar.K ? f7 : 0.0f), f18));
                    }
                    if (tyVar.y) {
                        boolean z13 = tyVar.E;
                        float f19 = z13 ? 0.0f : tyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !tyVar.w) ? 0.0f : 50.0f), f19, tyVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    tyVar.e0[0].setTranslationY(f12 - (((tyVar.K ? AndroidUtilities.dp(f7) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * tyVar.F3.e));
                    f11 = clamp;
                } else {
                    jyVar = tyVar.X;
                    if (jyVar != null) {
                        jyVar.setTranslationY(AndroidUtilities.lerp(((tyVar.N + tyVar.w3) + tyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((tyVar.K ? 81 : 0) + 48), tyVar.x1));
                    }
                    f11 = f10;
                }
                tyVar.P4();
                ty.K2(tyVar, f11);
                super.dispatchDraw(canvas);
                ty.L2(tyVar, canvas2, i11);
                bbVar = tyVar.K0;
                if (bbVar != null && bbVar.getVisibility() == 0) {
                    if (tyVar.K0.getAlpha() != f10) {
                        tyVar.K0.draw(canvas2);
                    } else if (tyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(tyVar.K0.getLeft(), tyVar.K0.getTop(), tyVar.K0.getRight(), tyVar.K0.getBottom(), (int) (tyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(tyVar.K0.getLeft(), tyVar.K0.getTop());
                        tyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!tyVar.W && tyVar.X2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6), tyVar.f4);
                }
                tyVar.V = true;
            }
        }
        canvas2 = canvas;
        tyVar.w3 = 0.0f;
        tyVar.v3 = 0.0f;
        float min2 = tyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!tyVar.K ? f7 : 0.0f)) + tyVar.N, tyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!tyVar.K ? f7 : 0.0f)));
        tyVar.w3 = min2;
        tyVar.v3 = min2;
        nxVar = tyVar.F3;
        if (nxVar == null) {
        }
        jyVar = tyVar.X;
        if (jyVar != null) {
        }
        f11 = f10;
        tyVar.P4();
        ty.K2(tyVar, f11);
        super.dispatchDraw(canvas);
        ty.L2(tyVar, canvas2, i11);
        bbVar = tyVar.K0;
        if (bbVar != null) {
            if (tyVar.K0.getAlpha() != f10) {
            }
        }
        if (!tyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6), tyVar.f4);
        }
        tyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ty tyVar = this.E0;
        if (view == tyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.sw0.v0) {
            return super.drawChild(canvas, view, j3);
        }
        sy[] syVarArr = tyVar.e0;
        if (view == syVarArr[0] || ((syVarArr.length > 1 && view == syVarArr[1]) || view == tyVar.J1 || view == tyVar.z0)) {
            canvas.save();
            if (view != tyVar.J1 && view != tyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = tyVar.W3;
            if (f7 != 1.0f) {
                if (tyVar.X3) {
                    canvas.translate((1.0f - tyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - tyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(b10, b10, 0.0f, (-getY()) + tyVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (view != kVar || tyVar.W3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (tyVar.X3) {
            canvas.translate((1.0f - tyVar.W3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, tyVar.W3, 0.05f, 1.0f);
            canvas.translate((1.0f - tyVar.W3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
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

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.q5 q5Var = this.E0.D3;
        if (q5Var != null) {
            q5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q5 q5Var = this.E0.D3;
        if (q5Var != null) {
            q5Var.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        qw qwVar;
        int actionMasked = motionEvent.getActionMasked();
        ty tyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            if (kVar.t()) {
                tyVar.Y0 = true;
            }
        }
        return Z() || ((qwVar = tyVar.z0) != null && qwVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ty tyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        kx kxVar;
        kx kxVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        my myVar = this;
        int childCount = myVar.getChildCount();
        int R = myVar.R();
        int i20 = 0;
        myVar.setBottomClip(0);
        int measuredWidth = myVar.getMeasuredWidth();
        int measuredHeight = myVar.getMeasuredHeight();
        int i21 = 0;
        while (true) {
            tyVar = myVar.E0;
            if (i21 >= childCount) {
                break;
            }
            View childAt = myVar.getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & 112;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i14 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i19 = layoutParams.topMargin + myVar.getPaddingTop();
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != tyVar.X || childAt == tyVar.Z || childAt == (kxVar2 = tyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != tyVar.X && childAt != tyVar.E0 && childAt != tyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (tyVar.K && childAt == tyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            kxVar = tyVar.E0;
                            if (childAt == kxVar && kxVar.getPremiumHint() != null) {
                                tyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.bi.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, tyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.bi.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == tyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == tyVar.C0) {
                            i19 = -AndroidUtilities.dp(tyVar.a);
                        } else if (childAt instanceof av) {
                            kVar3 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof sy) {
                            i19 = i20;
                        } else if (childAt == tyVar.J1 || childAt == tyVar.K1 || childAt == tyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (kxVar2 != null && kxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != tyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != tyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (tyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    kxVar = tyVar.E0;
                    if (childAt == kxVar) {
                        tyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.bi.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, tyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.bi.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == tyVar.X) {
                    }
                    childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                } else {
                    i14 = measuredWidth - measuredWidth2;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != tyVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != tyVar.X) {
                }
                if (tyVar.K) {
                }
                kxVar = tyVar.E0;
                if (childAt == kxVar) {
                }
                if (childAt == tyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i21++;
            i20 = 0;
            myVar = this;
        }
        dy dyVar = tyVar.C0;
        if (dyVar != null) {
            dyVar.setKeyboardHeight(R);
        }
        S();
        tyVar.U4();
        tyVar.P4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        ty tyVar = this.E0;
        int i12 = tyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.v0 v0Var = tyVar.m0;
        if (v0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof av) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof sy) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (tyVar.F3.c()) {
                            if (tyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (tyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + tyVar.P;
                        if (tyVar.u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = tyVar.Y3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        dy dyVar = tyVar.C0;
                        if (childAt == dyVar) {
                            dyVar.setTranslationY(tyVar.I0);
                            tyVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            tyVar.D3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            dx dxVar = tyVar.B1;
                            if (dxVar == null || !dxVar.s0(childAt)) {
                                if (childAt == tyVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = tyVar.Y3 ? (int) (size4 * 0.05f) : 0;
                                    tyVar.F3.setTransitionPaddingBottom(i16);
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
            post(new ly(this, 1));
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
        org.telegram.ui.ActionBar.d5 d5Var;
        qw qwVar;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.d5 d5Var3;
        org.telegram.ui.ActionBar.d5 d5Var4;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        float measuredWidth;
        boolean z10;
        int i10;
        int i11;
        hh.f fVar;
        ty tyVar = this.E0;
        d5Var = ((org.telegram.ui.ActionBar.n2) tyVar).parentLayout;
        Object[] objArr = 0;
        if (d5Var != null && (qwVar = tyVar.z0) != null && !qwVar.n && !tyVar.j2 && !tyVar.F3.c()) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) tyVar).parentLayout;
            if (!((ActionBarLayout) d5Var2).j()) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) tyVar).parentLayout;
                if (!((ActionBarLayout) d5Var3).y()) {
                    d5Var4 = ((org.telegram.ui.ActionBar.n2) tyVar).parentLayout;
                    if (!((ActionBarLayout) d5Var4).n && (motionEvent == null || tyVar.l3 || (motionEvent.getY() > a0() + b0() && ((fVar = tyVar.y1) == null || fVar.getVisibility() != 0 || motionEvent.getY() < tyVar.y1.getY())))) {
                        if (tyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    sy syVar = tyVar.e0[0];
                                    if (syVar != null) {
                                        int i12 = syVar.d.h;
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
                            tyVar.l3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (tyVar.h3) {
                                if (x10 < tyVar.e0[0].getTranslationX() + tyVar.e0[0].getMeasuredWidth()) {
                                    tyVar.i3 = tyVar.e0[0].getTranslationX();
                                } else {
                                    sy[] syVarArr = tyVar.e0;
                                    sy syVar2 = syVarArr[0];
                                    sy syVar3 = syVarArr[1];
                                    syVarArr[0] = syVar3;
                                    syVarArr[1] = syVar2;
                                    tyVar.h3 = false;
                                    tyVar.i3 = syVar3.getTranslationX();
                                    tyVar.z0.g(1.0f, tyVar.e0[0].h);
                                    tyVar.z0.g(tyVar.i3 / r10[0].getMeasuredWidth(), tyVar.e0[1].h);
                                    tyVar.O4(true);
                                    tyVar.e0[0].d.getClass();
                                    tyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < tyVar.e0[1].getTranslationX() + tyVar.e0[1].getMeasuredWidth()) {
                                sy[] syVarArr2 = tyVar.e0;
                                sy syVar4 = syVarArr2[0];
                                sy syVar5 = syVarArr2[1];
                                syVarArr2[0] = syVar5;
                                syVarArr2[1] = syVar4;
                                tyVar.h3 = true;
                                tyVar.i3 = syVar5.getTranslationX();
                                tyVar.z0.g(1.0f, tyVar.e0[0].h);
                                tyVar.z0.g((-tyVar.i3) / r10[0].getMeasuredWidth(), tyVar.e0[1].h);
                                tyVar.O4(true);
                                tyVar.e0[0].d.getClass();
                                tyVar.e0[1].d.getClass();
                            } else {
                                tyVar.i3 = tyVar.e0[0].getTranslationX();
                            }
                            tyVar.f3.removeAllListeners();
                            tyVar.f3.cancel();
                            tyVar.g3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            tyVar.i3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !tyVar.l3 && !tyVar.m3 && tyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            tyVar.m3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + tyVar.i3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (tyVar.l3 && (((z10 = tyVar.h3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    tyVar.m3 = true;
                                    tyVar.l3 = false;
                                    tyVar.e0[0].setTranslationX(0.0f);
                                    tyVar.e0[1].setTranslationX(tyVar.h3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    tyVar.z0.g(0.0f, tyVar.e0[1].h);
                                }
                            }
                            if (tyVar.m3 && !tyVar.l3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (tyVar.l3) {
                                tyVar.e0[0].setTranslationX(x11);
                                if (tyVar.h3) {
                                    tyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    tyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / tyVar.e0[0].getMeasuredWidth();
                                sy syVar6 = tyVar.e0[1];
                                if (syVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    tyVar.z0.i(tyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new ly(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                tyVar.z0.g(abs2, syVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, tyVar.k3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!tyVar.l3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (tyVar.l3) {
                                float x13 = tyVar.e0[0].getX();
                                tyVar.f3 = new AnimatorSet();
                                if (tyVar.e0[1].E) {
                                    tyVar.j3 = true;
                                } else if (tyVar.i3 == 0.0f) {
                                    tyVar.j3 = Math.abs(x13) < ((float) tyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = tyVar.h3 ? false : false;
                                    tyVar.j3 = z11;
                                } else if (tyVar.h3) {
                                    tyVar.j3 = tyVar.e0[1].getX() > ((float) (tyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    tyVar.j3 = tyVar.e0[0].getX() < ((float) (tyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = tyVar.j3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (tyVar.h3) {
                                        tyVar.f3.playTogether(ObjectAnimator.ofFloat(tyVar.e0[0], (Property<sy, Float>) property, 0.0f), ObjectAnimator.ofFloat(tyVar.e0[1], (Property<sy, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        tyVar.f3.playTogether(ObjectAnimator.ofFloat(tyVar.e0[0], (Property<sy, Float>) property, 0.0f), ObjectAnimator.ofFloat(tyVar.e0[1], (Property<sy, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = tyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (tyVar.h3) {
                                        tyVar.f3.playTogether(ObjectAnimator.ofFloat(tyVar.e0[0], (Property<sy, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(tyVar.e0[1], (Property<sy, Float>) property, 0.0f));
                                    } else {
                                        tyVar.f3.playTogether(ObjectAnimator.ofFloat(tyVar.e0[0], (Property<sy, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(tyVar.e0[1], (Property<sy, Float>) property, 0.0f));
                                    }
                                }
                                tyVar.f3.setInterpolator(ty.y4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                tyVar.f3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                tyVar.f3.addListener(new org.telegram.ui.Components.i91(this, 19));
                                tyVar.f3.start();
                                tyVar.g3 = true;
                                tyVar.l3 = false;
                            } else {
                                tyVar.m3 = false;
                                kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                                kVar.setEnabled(true);
                                tyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return tyVar.l3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ty tyVar = this.E0;
        if (tyVar.m3 && !tyVar.l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
