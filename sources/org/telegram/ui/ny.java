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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ny extends org.telegram.ui.Components.ov0 {
    public VelocityTracker A0;
    public final Rect B0;
    public boolean C0;
    public final me.b D0;
    public final /* synthetic */ uy E0;
    public final Paint w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny(Context context, uy uyVar) {
        super(context, null);
        this.E0 = uyVar;
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
    @Override // org.telegram.ui.Components.ov0
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
            uy uyVar = this.E0;
            if (uyVar.m4 != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
                if (fh.b.c(i10, f6Var)) {
                    f6Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
                    if (f6Var2 != null) {
                        f6Var3 = ((org.telegram.ui.ActionBar.n2) uyVar).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    uyVar.m4.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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

    @Override // org.telegram.ui.Components.ov0
    public final void L(Canvas canvas, ArrayList arrayList) {
        ey eyVar;
        org.telegram.ui.Components.ll0 p5;
        uy uyVar = this.E0;
        if (uyVar.p3 && (eyVar = uyVar.C0) != null && eyVar.getVisibility() == 0) {
            ey eyVar2 = uyVar.C0;
            View[] viewArr = eyVar2.e;
            for (int i10 = 0; i10 < viewArr.length; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0 && (p5 = org.telegram.ui.Components.i81.p(viewArr[i10])) != null) {
                    for (int i11 = 0; i11 < p5.getChildCount(); i11++) {
                        View childAt = p5.getChildAt(i11);
                        if (childAt.getY() < AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i10].getX(), childAt.getY() + p5.getY() + viewArr[i10].getY() + eyVar2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.ov0
    public final void M() {
        super.M();
        this.E0.m3();
    }

    @Override // org.telegram.ui.Components.ov0
    public final boolean O() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z() {
        AnimatorSet animatorSet;
        uy uyVar = this.E0;
        if (!uyVar.g3) {
            return false;
        }
        if (!uyVar.j3) {
            if (Math.abs(uyVar.e0[1].getTranslationX()) < 1.0f) {
                uyVar.e0[0].setTranslationX(r1.getMeasuredWidth() * (uyVar.h3 ? -1 : 1));
                uyVar.e0[1].setTranslationX(0.0f);
                uy.f1(uyVar, true);
                animatorSet = uyVar.f3;
                if (animatorSet != null) {
                }
                uyVar.g3 = false;
            }
            return uyVar.g3;
        }
        if (Math.abs(uyVar.e0[0].getTranslationX()) < 1.0f) {
            uyVar.e0[0].setTranslationX(0.0f);
            uyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() * (uyVar.h3 ? 1 : -1));
            uy.f1(uyVar, true);
            animatorSet = uyVar.f3;
            if (animatorSet != null) {
                animatorSet.cancel();
                uyVar.f3 = null;
            }
            uyVar.g3 = false;
        }
        return uyVar.g3;
    }

    public final int a0() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.E0;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        float height = kVar.getHeight();
        ox oxVar = uyVar.F3;
        float f7 = (oxVar == null || !oxVar.c()) ? 0.0f : uyVar.F3.e;
        if (uyVar.K) {
            height = com.google.android.gms.internal.vision.e2.z(1.0f, uyVar.t3, (1.0f - f7) * (1.0f - uyVar.x1) * AndroidUtilities.dp(81.0f), height);
        }
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, f7, (1.0f - uyVar.x1) * (1.0f - uyVar.t3) * AndroidUtilities.dp(48.0f), height + uyVar.T);
    }

    public final int b0() {
        uy uyVar = this.E0;
        float f7 = uyVar.N;
        ox oxVar = uyVar.F3;
        return (int) com.google.android.gms.internal.vision.e2.z(1.0f, uyVar.x1, org.telegram.messenger.w1.A(1.0f, (oxVar == null || !oxVar.c()) ? 0.0f : uyVar.F3.e, 1.0f - uyVar.t3, f7), -getY());
    }

    public final boolean c0(MotionEvent motionEvent, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.E0;
        sw swVar = uyVar.z0;
        int i10 = swVar.j0.get(swVar.K + (z10 ? 1 : -1), -1);
        if (i10 < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        uyVar.m3 = false;
        uyVar.l3 = true;
        this.y0 = (int) (motionEvent.getX() + uyVar.i3);
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        kVar.setEnabled(false);
        uyVar.z0.setEnabled(false);
        ty tyVar = uyVar.e0[1];
        tyVar.h = i10;
        tyVar.setVisibility(0);
        uyVar.h3 = z10;
        uy.f1(uyVar, false);
        uyVar.R4(true);
        if (z10) {
            uyVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            return true;
        }
        uyVar.e0[1].setTranslationX(-r7[0].getMeasuredWidth());
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
    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float f10;
        boolean z11;
        Canvas canvas2;
        ox oxVar;
        ky kyVar;
        float f11;
        di.eb ebVar;
        float f12;
        ky kyVar2;
        org.telegram.ui.ActionBar.k kVar;
        ox oxVar2;
        uy uyVar = this.E0;
        Paint paint = uyVar.f1;
        if (Build.VERSION.SDK_INT >= 31 && uyVar.l4 != null) {
            uyVar.m3();
        }
        if (uyVar.Q && (((oxVar2 = uyVar.F3) == null || !oxVar2.c()) && uyVar.t3 == 0.0f)) {
            uyVar.Q = false;
            int i10 = (uyVar.Z3() && uyVar.e0[0].s == 0) ? 1 : 0;
            qy qyVar = uyVar.e0[0].a;
            if (uyVar.R) {
                if (!uyVar.b1) {
                    if (i10 == 0) {
                        uyVar.R = false;
                    }
                    if (uyVar.R) {
                        s4.c1 L = qyVar.L(0, false);
                        if (L == null) {
                            uyVar.R = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= qyVar.getPaddingTop() - AndroidUtilities.dp(81.0f)) {
                                uyVar.R = false;
                            } else if (view.getTop() >= qyVar.getPaddingTop()) {
                                uyVar.R = false;
                            }
                        }
                        if (uyVar.R) {
                        }
                    }
                }
                i10 = 0;
            }
            s4.c1 L2 = qyVar.L(i10, false);
            if (L2 != null) {
                float paddingTop = qyVar.getPaddingTop() - L2.a.getY();
                if (paddingTop >= 0.0f) {
                    float f13 = -paddingTop;
                    float f14 = -uyVar.T3();
                    if (f13 < f14) {
                        f13 = f14;
                    } else if (f13 > 0.0f) {
                        f13 = 0.0f;
                    }
                    uyVar.C4(f13);
                } else {
                    uyVar.C4(0.0f);
                }
            } else {
                uyVar.C4(-uyVar.T3());
            }
        }
        int a02 = a0();
        z10 = ((org.telegram.ui.ActionBar.n2) uyVar).inPreviewMode;
        int b02 = z10 ? AndroidUtilities.statusBarHeight : b0();
        int i11 = b02 + a02;
        uyVar.F3.setCurrentTop(i11);
        boolean z12 = uyVar.r3;
        Rect rect = this.B0;
        Paint paint2 = this.w0;
        if (z12) {
            float f15 = uyVar.x1;
            if (f15 == 1.0f) {
                paint2.setColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            } else if (f15 == 0.0f && (kyVar2 = uyVar.X) != null) {
                kyVar2.setTranslationY(uyVar.W3() + uyVar.N);
            }
            rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(uyVar.x1 * 2.0f));
            float f16 = uyVar.x1;
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
            float f17 = uyVar.x1;
            if (f17 > 0.0f && f17 < f7) {
                paint2.setColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (!uyVar.p3 && uyVar.q3) {
                    rect.set(0, b02, getMeasuredWidth(), i11 - AndroidUtilities.dp(uyVar.x1 * 2.0f));
                    J(canvas, 0.0f, this.B0, paint2, true);
                }
                ky kyVar3 = uyVar.X;
                if (kyVar3 != null) {
                    kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    int height = kVar.getHeight();
                    kyVar3.setTranslationY(uyVar.W3() + (i11 - (height + (uyVar.z0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f7 = 1.0f;
            f10 = 81.0f;
            z11 = ((org.telegram.ui.ActionBar.n2) uyVar).inPreviewMode;
            if (!z11) {
                if (uyVar.t3 > 0.0f) {
                    paint2.setColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(uyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, b02), getMeasuredWidth(), i11 - AndroidUtilities.dp(uyVar.x1 * 2.0f));
                    canvas2 = canvas;
                    J(canvas2, 0.0f, this.B0, paint, true);
                }
                uyVar.w3 = 0.0f;
                uyVar.v3 = 0.0f;
                float min = uyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!uyVar.K ? 81.0f : 0.0f)) + uyVar.N, uyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!uyVar.K ? 81.0f : 0.0f)));
                uyVar.w3 = min;
                uyVar.v3 = min;
                oxVar = uyVar.F3;
                if (oxVar == null && oxVar.c()) {
                    float f18 = uyVar.F3.e;
                    float T3 = uyVar.w3 - ((uyVar.T3() + uyVar.N) * f18);
                    uyVar.w3 = T3;
                    uyVar.v3 = T3;
                    float clamp = uyVar.G0 ? f7 - Utilities.clamp(f18 / 0.5f, f7, 0.0f) : 1.0f;
                    sw swVar = uyVar.z0;
                    if (swVar != null && swVar.getVisibility() == 0) {
                        uyVar.w3 -= (f7 - uyVar.r.e) * uyVar.z0.getMeasuredHeight();
                    }
                    ky kyVar4 = uyVar.X;
                    if (kyVar4 != null) {
                        kyVar4.setTranslationY(uyVar.W3() + AndroidUtilities.lerp(uyVar.N + uyVar.w3, -AndroidUtilities.dp(uyVar.K ? 81.0f : 0.0f), f18));
                    }
                    if (uyVar.y) {
                        boolean z13 = uyVar.E;
                        float f19 = z13 ? 0.0f : uyVar.N;
                        f12 = -AndroidUtilities.lerp((-f19) + AndroidUtilities.dp((z13 || !uyVar.w) ? 0.0f : 50.0f), f19, uyVar.F3.e);
                    } else {
                        f12 = 0.0f;
                    }
                    uyVar.e0[0].setTranslationY(f12 - (((uyVar.K ? AndroidUtilities.dp(f10) + 0.0f : 0.0f) + AndroidUtilities.dp(48.0f)) * uyVar.F3.e));
                    f11 = clamp;
                } else {
                    kyVar = uyVar.X;
                    if (kyVar != null) {
                        kyVar.setTranslationY(AndroidUtilities.lerp(((uyVar.N + uyVar.w3) + uyVar.T) - AndroidUtilities.dp(4.0f), -AndroidUtilities.dp((uyVar.K ? 81 : 0) + 48), uyVar.x1));
                    }
                    f11 = 1.0f;
                }
                uyVar.S4();
                uy.N2(uyVar, f11);
                super.dispatchDraw(canvas);
                uy.O2(uyVar, canvas2, i11);
                ebVar = uyVar.K0;
                if (ebVar != null && ebVar.getVisibility() == 0) {
                    if (uyVar.K0.getAlpha() != f7) {
                        uyVar.K0.draw(canvas2);
                    } else if (uyVar.K0.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(uyVar.K0.getLeft(), uyVar.K0.getTop(), uyVar.K0.getRight(), uyVar.K0.getBottom(), (int) (uyVar.K0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(uyVar.K0.getLeft(), uyVar.K0.getTop());
                        uyVar.K0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!uyVar.W && uyVar.X2 == 0) {
                    AndroidUtilities.drawNavigationBarProtection(canvas2, this, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), uyVar.g4);
                }
                uyVar.V = true;
            }
        }
        canvas2 = canvas;
        uyVar.w3 = 0.0f;
        uyVar.v3 = 0.0f;
        float min2 = uyVar.w3 - Math.min((AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!uyVar.K ? 81.0f : 0.0f)) + uyVar.N, uyVar.t3 * (AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(!uyVar.K ? 81.0f : 0.0f)));
        uyVar.w3 = min2;
        uyVar.v3 = min2;
        oxVar = uyVar.F3;
        if (oxVar == null) {
        }
        kyVar = uyVar.X;
        if (kyVar != null) {
        }
        f11 = 1.0f;
        uyVar.S4();
        uy.N2(uyVar, f11);
        super.dispatchDraw(canvas);
        uy.O2(uyVar, canvas2, i11);
        ebVar = uyVar.K0;
        if (ebVar != null) {
            if (uyVar.K0.getAlpha() != f7) {
            }
        }
        if (!uyVar.W) {
            AndroidUtilities.drawNavigationBarProtection(canvas2, this, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6), uyVar.g4);
        }
        uyVar.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.D0.a(motionEvent, this) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.E0;
        if (view == uyVar.K0) {
            return true;
        }
        if (org.telegram.ui.Components.ov0.v0) {
            return super.drawChild(canvas, view, j3);
        }
        ty[] tyVarArr = uyVar.e0;
        if (view == tyVarArr[0] || ((tyVarArr.length > 1 && view == tyVarArr[1]) || view == uyVar.J1 || view == uyVar.z0)) {
            canvas.save();
            if (view != uyVar.J1 && view != uyVar.z0) {
                canvas.clipRect(0.0f, (-getY()) + b0() + a0(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f7 = uyVar.X3;
            if (f7 != 1.0f) {
                if (uyVar.Y3) {
                    canvas.translate((1.0f - uyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
                } else {
                    float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 0.05f, 1.0f);
                    canvas.translate((1.0f - uyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
                    canvas.scale(b10, b10, 0.0f, (-getY()) + uyVar.N + a0());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (view != kVar || uyVar.X3 == 1.0f) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        if (uyVar.Y3) {
            canvas.translate((1.0f - uyVar.X3) * AndroidUtilities.dp(40.0f) * (-1), 0.0f);
        } else {
            float b11 = com.google.android.gms.internal.vision.e2.b(1.0f, uyVar.X3, 0.05f, 1.0f);
            canvas.translate((1.0f - uyVar.X3) * (-AndroidUtilities.dp(4.0f)), 0.0f);
            kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
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

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.o5 o5Var = this.E0.D3;
        if (o5Var != null) {
            o5Var.a();
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
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
        sw swVar;
        int actionMasked = motionEvent.getActionMasked();
        uy uyVar = this.E0;
        if (actionMasked == 1 || actionMasked == 3) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar.s()) {
                uyVar.Y0 = true;
            }
        }
        return Z() || ((swVar = uyVar.z0) != null && swVar.O) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        uy uyVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        lx lxVar;
        lx lxVar2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        ny nyVar = this;
        int childCount = nyVar.getChildCount();
        int R = nyVar.R();
        nyVar.setBottomClip(0);
        int measuredWidth = nyVar.getMeasuredWidth();
        int measuredHeight = nyVar.getMeasuredHeight();
        int i20 = 0;
        while (true) {
            uyVar = nyVar.E0;
            if (i20 >= childCount) {
                break;
            }
            View childAt = nyVar.getChildAt(i20);
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
                            i19 = layoutParams.topMargin + nyVar.getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = measuredHeight - measuredHeight2;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != uyVar.X || childAt == uyVar.Z || childAt == (lxVar2 = uyVar.E0)) {
                            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            i19 = kVar.getMeasuredHeight();
                            if (childAt != uyVar.X && childAt != uyVar.E0 && childAt != uyVar.Z) {
                                i19 += AndroidUtilities.dp(48.0f);
                            }
                            if (uyVar.K && childAt == uyVar.X) {
                                i19 = AndroidUtilities.dp(81.0f) + i19;
                            }
                            lxVar = uyVar.E0;
                            if (childAt == lxVar && lxVar.getPremiumHint() != null) {
                                uyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.vl.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, uyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.vl.D(54.0f, i19, measuredHeight2));
                            }
                            if (childAt == uyVar.X) {
                                i19 += AndroidUtilities.dp(2.0f);
                            }
                        } else if (childAt == uyVar.C0) {
                            i19 = -AndroidUtilities.dp(uyVar.a);
                        } else if (childAt instanceof cv) {
                            kVar3 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            i19 = kVar3.getMeasuredHeight();
                        } else if (childAt instanceof ty) {
                            i19 = 0;
                        } else if (childAt == uyVar.J1 || childAt == uyVar.K1 || childAt == uyVar.z0) {
                            kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            i19 = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight() + i19;
                        } else if (lxVar2 != null && lxVar2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
                    } else {
                        i17 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != uyVar.X) {
                    }
                    kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i19 = kVar.getMeasuredHeight();
                    if (childAt != uyVar.X) {
                        i19 += AndroidUtilities.dp(48.0f);
                    }
                    if (uyVar.K) {
                        i19 = AndroidUtilities.dp(81.0f) + i19;
                    }
                    lxVar = uyVar.E0;
                    if (childAt == lxVar) {
                        uyVar.E0.getPremiumHint().layout(i16, org.telegram.messenger.vl.D(54.0f, i19, measuredHeight2), i16 + measuredWidth2, uyVar.E0.getPremiumHint().getMeasuredHeight() + org.telegram.messenger.vl.D(54.0f, i19, measuredHeight2));
                    }
                    if (childAt == uyVar.X) {
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
                if (childAt != uyVar.X) {
                }
                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                i19 = kVar.getMeasuredHeight();
                if (childAt != uyVar.X) {
                }
                if (uyVar.K) {
                }
                lxVar = uyVar.E0;
                if (childAt == lxVar) {
                }
                if (childAt == uyVar.X) {
                }
                childAt.layout(i16, i19, measuredWidth2 + i16, measuredHeight2 + i19);
            }
            i20++;
            nyVar = this;
        }
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.setKeyboardHeight(R);
        }
        S();
        uyVar.X4();
        uyVar.S4();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        uy uyVar = this.E0;
        int i12 = uyVar.a;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        setMeasuredDimension(size, size2);
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.m0;
        if (v0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v0Var.getLayoutParams();
            kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            layoutParams.topMargin = kVar5.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        int R = R();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                if (childAt != kVar2) {
                    if (childAt instanceof cv) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i11);
                        int dp = AndroidUtilities.dp(10.0f);
                        int dp2 = AndroidUtilities.dp(2.0f) + size3;
                        kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(dp, dp2 - kVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof ty) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int dp3 = AndroidUtilities.dp(2.0f) + size2;
                        if (uyVar.F3.c()) {
                            if (uyVar.w) {
                                dp3 = AndroidUtilities.dp(50.0f) + dp3;
                            }
                            if (uyVar.K) {
                                dp3 = AndroidUtilities.dp(81.0f) + dp3;
                            }
                            dp3 = AndroidUtilities.dp(48.0f) + dp3;
                        }
                        int i14 = dp3 + uyVar.P;
                        if (uyVar.u3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i15 = uyVar.Z3 ? (int) (i14 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i15);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i14 + i15), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        ey eyVar = uyVar.C0;
                        if (childAt == eyVar) {
                            eyVar.setTranslationY(uyVar.I0);
                            uyVar.C0.p0.setKeyboardHeight(R);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12) + View.MeasureSpec.getSize(i11), TLObject.FLAG_30);
                            uyVar.G3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            kVar3 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                            rect.set(0, (AndroidUtilities.dp(i12) + kVar3.getMeasuredHeight()) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ex exVar = uyVar.B1;
                            if (exVar == null || !exVar.u0(childAt)) {
                                if (childAt == uyVar.F3) {
                                    int size4 = View.MeasureSpec.getSize(i11);
                                    int i16 = uyVar.Z3 ? (int) (size4 * 0.05f) : 0;
                                    uyVar.F3.setTransitionPaddingBottom(i16);
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
            post(new my(this, 1));
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
        sw swVar;
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
        ih.g gVar;
        uy uyVar = this.E0;
        d5Var = ((org.telegram.ui.ActionBar.n2) uyVar).parentLayout;
        Object[] objArr = 0;
        if (d5Var != null && (swVar = uyVar.z0) != null && !swVar.n && !uyVar.j2 && !uyVar.F3.c()) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) uyVar).parentLayout;
            if (!((ActionBarLayout) d5Var2).j()) {
                d5Var3 = ((org.telegram.ui.ActionBar.n2) uyVar).parentLayout;
                if (!((ActionBarLayout) d5Var3).y()) {
                    d5Var4 = ((org.telegram.ui.ActionBar.n2) uyVar).parentLayout;
                    if (!((ActionBarLayout) d5Var4).n && (motionEvent == null || uyVar.l3 || (motionEvent.getY() > a0() + b0() && ((gVar = uyVar.y1) == null || gVar.getVisibility() != 0 || motionEvent.getY() < uyVar.y1.getY())))) {
                        if (uyVar.R0 != 3) {
                            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                            if (SharedConfig.getChatSwipeAction(i10) != 5) {
                                i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                if (SharedConfig.getChatSwipeAction(i11) == 2) {
                                    ty tyVar = uyVar.e0[0];
                                    if (tyVar != null) {
                                        int i12 = tyVar.d.h;
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
                            uyVar.l3 = true;
                            this.x0 = motionEvent.getPointerId(0);
                            int x10 = (int) motionEvent.getX();
                            this.y0 = x10;
                            if (uyVar.h3) {
                                if (x10 < uyVar.e0[0].getTranslationX() + uyVar.e0[0].getMeasuredWidth()) {
                                    uyVar.i3 = uyVar.e0[0].getTranslationX();
                                } else {
                                    ty[] tyVarArr = uyVar.e0;
                                    ty tyVar2 = tyVarArr[0];
                                    ty tyVar3 = tyVarArr[1];
                                    tyVarArr[0] = tyVar3;
                                    tyVarArr[1] = tyVar2;
                                    uyVar.h3 = false;
                                    uyVar.i3 = tyVar3.getTranslationX();
                                    uyVar.z0.g(1.0f, uyVar.e0[0].h);
                                    uyVar.z0.g(uyVar.i3 / r10[0].getMeasuredWidth(), uyVar.e0[1].h);
                                    uyVar.R4(true);
                                    uyVar.e0[0].d.getClass();
                                    uyVar.e0[1].d.getClass();
                                }
                            } else if (x10 < uyVar.e0[1].getTranslationX() + uyVar.e0[1].getMeasuredWidth()) {
                                ty[] tyVarArr2 = uyVar.e0;
                                ty tyVar4 = tyVarArr2[0];
                                ty tyVar5 = tyVarArr2[1];
                                tyVarArr2[0] = tyVar5;
                                tyVarArr2[1] = tyVar4;
                                uyVar.h3 = true;
                                uyVar.i3 = tyVar5.getTranslationX();
                                uyVar.z0.g(1.0f, uyVar.e0[0].h);
                                uyVar.z0.g((-uyVar.i3) / r10[0].getMeasuredWidth(), uyVar.e0[1].h);
                                uyVar.R4(true);
                                uyVar.e0[0].d.getClass();
                                uyVar.e0[1].d.getClass();
                            } else {
                                uyVar.i3 = uyVar.e0[0].getTranslationX();
                            }
                            uyVar.f3.removeAllListeners();
                            uyVar.f3.cancel();
                            uyVar.g3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            uyVar.i3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !uyVar.l3 && !uyVar.m3 && uyVar.z0.getVisibility() == 0) {
                            this.x0 = motionEvent.getPointerId(0);
                            uyVar.m3 = true;
                            this.y0 = (int) motionEvent.getX();
                            this.z0 = (int) motionEvent.getY();
                            this.A0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.x0) {
                            int x11 = (int) ((motionEvent.getX() - this.y0) + uyVar.i3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.z0);
                            if (uyVar.l3 && (((z10 = uyVar.h3) && x11 > 0) || (!z10 && x11 < 0))) {
                                if (!c0(motionEvent, x11 < 0)) {
                                    uyVar.m3 = true;
                                    uyVar.l3 = false;
                                    uyVar.e0[0].setTranslationX(0.0f);
                                    uyVar.e0[1].setTranslationX(uyVar.h3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    uyVar.z0.g(0.0f, uyVar.e0[1].h);
                                }
                            }
                            if (uyVar.m3 && !uyVar.l3) {
                                float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                                int x12 = (int) (motionEvent.getX() - this.y0);
                                if (Math.abs(x12) >= pixelsInCM && Math.abs(x12) > abs) {
                                    c0(motionEvent, x11 < 0);
                                }
                            } else if (uyVar.l3) {
                                uyVar.e0[0].setTranslationX(x11);
                                if (uyVar.h3) {
                                    uyVar.e0[1].setTranslationX(r1[0].getMeasuredWidth() + x11);
                                } else {
                                    uyVar.e0[1].setTranslationX(x11 - r1[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x11) / uyVar.e0[0].getMeasuredWidth();
                                ty tyVar6 = uyVar.e0[1];
                                if (tyVar6.E && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    uyVar.z0.i(uyVar.e0[1].h);
                                    AndroidUtilities.runOnUIThread(new my(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                uyVar.z0.g(abs2, tyVar6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.A0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, uyVar.k3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f7 = 0.0f;
                                f10 = 0.0f;
                            } else {
                                f7 = this.A0.getXVelocity();
                                f10 = this.A0.getYVelocity();
                                if (!uyVar.l3 && Math.abs(f7) >= 3000.0f && Math.abs(f7) > Math.abs(f10)) {
                                    c0(motionEvent, f7 < 0.0f);
                                }
                            }
                            if (uyVar.l3) {
                                float x13 = uyVar.e0[0].getX();
                                uyVar.f3 = new AnimatorSet();
                                if (uyVar.e0[1].E) {
                                    uyVar.j3 = true;
                                } else if (uyVar.i3 == 0.0f) {
                                    uyVar.j3 = Math.abs(x13) < ((float) uyVar.e0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f7) < 3500.0f || Math.abs(f7) < Math.abs(f10));
                                } else if (Math.abs(f7) > 1500.0f) {
                                    boolean z11 = uyVar.h3 ? false : false;
                                    uyVar.j3 = z11;
                                } else if (uyVar.h3) {
                                    uyVar.j3 = uyVar.e0[1].getX() > ((float) (uyVar.e0[0].getMeasuredWidth() >> 1));
                                } else {
                                    uyVar.j3 = uyVar.e0[0].getX() < ((float) (uyVar.e0[0].getMeasuredWidth() >> 1));
                                }
                                boolean z12 = uyVar.j3;
                                Property property = View.TRANSLATION_X;
                                if (z12) {
                                    measuredWidth = Math.abs(x13);
                                    if (uyVar.h3) {
                                        uyVar.f3.playTogether(ObjectAnimator.ofFloat(uyVar.e0[0], (Property<ty, Float>) property, 0.0f), ObjectAnimator.ofFloat(uyVar.e0[1], (Property<ty, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        uyVar.f3.playTogether(ObjectAnimator.ofFloat(uyVar.e0[0], (Property<ty, Float>) property, 0.0f), ObjectAnimator.ofFloat(uyVar.e0[1], (Property<ty, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = uyVar.e0[0].getMeasuredWidth() - Math.abs(x13);
                                    if (uyVar.h3) {
                                        uyVar.f3.playTogether(ObjectAnimator.ofFloat(uyVar.e0[0], (Property<ty, Float>) property, -r11.getMeasuredWidth()), ObjectAnimator.ofFloat(uyVar.e0[1], (Property<ty, Float>) property, 0.0f));
                                    } else {
                                        uyVar.f3.playTogether(ObjectAnimator.ofFloat(uyVar.e0[0], (Property<ty, Float>) property, r11.getMeasuredWidth()), ObjectAnimator.ofFloat(uyVar.e0[1], (Property<ty, Float>) property, 0.0f));
                                    }
                                }
                                uyVar.f3.setInterpolator(uy.z4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f11 = measuredWidth2 / 2;
                                float distanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f11) + f11;
                                uyVar.f3.setDuration(Math.max(ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(Math.abs(f7) > 0.0f ? Math.round(Math.abs(distanceInfluenceForSnapDuration / r6) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                uyVar.f3.addListener(new org.telegram.ui.Components.k61(this, 21));
                                uyVar.f3.start();
                                uyVar.g3 = true;
                                uyVar.l3 = false;
                            } else {
                                uyVar.m3 = false;
                                kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                                kVar.setEnabled(true);
                                uyVar.z0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker = this.A0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.A0 = null;
                            }
                        }
                        return uyVar.l3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        uy uyVar = this.E0;
        if (uyVar.m3 && !uyVar.l3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }
}
