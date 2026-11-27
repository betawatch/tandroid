// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nj3 extends wma {
    public final Paint g0;
    public int h0;
    public int i0;
    public int j0;
    public VelocityTracker k0;
    public final Rect l0;
    public boolean m0;
    public final dj2 n0;
    public final /* synthetic */ uj3 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj3(uj3 uj3Var, Context context) {
        super(context, null);
        this.o0 = uj3Var;
        this.g0 = new Paint(1);
        this.l0 = new Rect();
        this.n0 = new dj2(new aj3(this, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r13.a() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r13 = jn7.H2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r13 = jn7.s3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (aob.I.o() == false) goto L17;
     */
    @Override // wma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int i;
        vnb vnbVar;
        vnb vnbVar2;
        int i2;
        vnb vnbVar3;
        if (Build.VERSION.SDK_INT >= 29 && xea.f()) {
            uj3 uj3Var = this.o0;
            if (uj3Var.r4 != null) {
                i = ((e) uj3Var).currentAccount;
                vnbVar = ((e) uj3Var).resourceProvider;
                if (dtd.d(i, vnbVar)) {
                    vnbVar2 = ((e) uj3Var).resourceProvider;
                    if (vnbVar2 != null) {
                        vnbVar3 = ((e) uj3Var).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f);
                    uj3Var.r4.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(i2);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
        }
        canvas.drawRect(rect, paint);
    }

    @Override // wma
    public final void J(Canvas canvas, ArrayList arrayList) {
        bj3 bj3Var;
        d79 n;
        uj3 uj3Var = this.o0;
        if (uj3Var.s3 && (bj3Var = uj3Var.D0) != null && bj3Var.getVisibility() == 0) {
            bj3 bj3Var2 = uj3Var.D0;
            View[] viewArr = bj3Var2.e;
            for (int i = 0; i < viewArr.length; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0 && (n = vic.n(viewArr[i])) != null) {
                    for (int i2 = 0; i2 < n.getChildCount(); i2++) {
                        View childAt = n.getChildAt(i2);
                        if (childAt.getY() < hl.L(100.0f) + hl.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i].getX(), childAt.getY() + n.getY() + viewArr[i].getY() + bj3Var2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // wma
    public final void K() {
        vy4 vy4Var;
        xea.f();
        vy4Var = ((e) this.o0).glassEngine;
        vy4Var.g();
    }

    @Override // wma
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        uj3 uj3Var = this.o0;
        if (!uj3Var.j3) {
            return false;
        }
        boolean z = uj3Var.m3;
        tj3[] tj3VarArr = uj3Var.f0;
        if (!z) {
            if (Math.abs(tj3VarArr[1].getTranslationX()) < 1.0f) {
                uj3Var.f0[0].setTranslationX(r0.getMeasuredWidth() * (uj3Var.k3 ? -1 : 1));
                uj3Var.f0[1].setTranslationX(0.0f);
                uj3Var.j5(true);
                animatorSet = uj3Var.i3;
                if (animatorSet != null) {
                }
                uj3Var.j3 = false;
            }
            return uj3Var.j3;
        }
        if (Math.abs(tj3VarArr[0].getTranslationX()) < 1.0f) {
            uj3Var.f0[0].setTranslationX(0.0f);
            uj3Var.f0[1].setTranslationX(r0[0].getMeasuredWidth() * (uj3Var.k3 ? 1 : -1));
            uj3Var.j5(true);
            animatorSet = uj3Var.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
                uj3Var.i3 = null;
            }
            uj3Var.j3 = false;
        }
        return uj3Var.j3;
    }

    public final int Y() {
        a aVar;
        uj3 uj3Var = this.o0;
        aVar = ((e) uj3Var).actionBar;
        float height = aVar.getHeight();
        li3 li3Var = uj3Var.H3;
        float f = (li3Var == null || !li3Var.c()) ? 0.0f : uj3Var.H3.e;
        if (uj3Var.L) {
            height = qd4.A(1.0f, uj3Var.w3, (1.0f - f) * (1.0f - uj3Var.z1) * hl.L(81.0f), height);
        }
        return (int) qd4.A(1.0f, f, (1.0f - uj3Var.z1) * (1.0f - uj3Var.w3) * hl.L(48.0f), height + uj3Var.U);
    }

    public final int Z() {
        uj3 uj3Var = this.o0;
        float f = uj3Var.O;
        li3 li3Var = uj3Var.H3;
        return (int) qd4.A(1.0f, uj3Var.z1, qd4.z(1.0f, (li3Var == null || !li3Var.c()) ? 0.0f : uj3Var.H3.e, 1.0f - uj3Var.w3, f), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z) {
        a aVar;
        uj3 uj3Var = this.o0;
        ij3 ij3Var = uj3Var.A0;
        int i = ij3Var.l0.get(ij3Var.L + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        uj3Var.p3 = false;
        uj3Var.o3 = true;
        this.i0 = (int) (motionEvent.getX() + uj3Var.l3);
        aVar = ((e) uj3Var).actionBar;
        aVar.setEnabled(false);
        uj3Var.A0.setEnabled(false);
        tj3 tj3Var = uj3Var.f0[1];
        tj3Var.h = i;
        tj3Var.setVisibility(0);
        uj3Var.k3 = z;
        uj3Var.j5(false);
        uj3Var.n5(true);
        tj3[] tj3VarArr = uj3Var.f0;
        if (z) {
            tj3VarArr[1].setTranslationX(tj3VarArr[0].getMeasuredWidth());
            return true;
        }
        tj3VarArr[1].setTranslationX(-tj3VarArr[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r1 == 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200  */
    @Override // wma, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        vy4 vy4Var;
        boolean z;
        float f;
        boolean z2;
        Canvas canvas2;
        li3 li3Var;
        hj3 hj3Var;
        float f2;
        tb tbVar;
        float alpha;
        float f3;
        hj3 hj3Var2;
        float f4;
        a aVar;
        li3 li3Var2;
        uj3 uj3Var = this.o0;
        Paint paint = uj3Var.h1;
        vy4Var = ((e) uj3Var).glassEngine;
        vy4Var.g();
        if (uj3Var.R && (((li3Var2 = uj3Var.H3) == null || !li3Var2.c()) && uj3Var.w3 == 0.0f)) {
            uj3Var.R = false;
            int i = (uj3Var.y3() && uj3Var.f0[0].s == 0) ? 1 : 0;
            qj3 qj3Var = uj3Var.f0[0].a;
            boolean z3 = uj3Var.S;
            if (z3) {
                if (!uj3Var.d1) {
                    if (i == 0) {
                        uj3Var.S = false;
                        z3 = false;
                    }
                    if (z3) {
                        f89 M = qj3Var.M(0, false);
                        if (M == null) {
                            uj3Var.S = false;
                        } else {
                            View view = M.a;
                            if (view.getBottom() <= qj3Var.getPaddingTop() - hl.L(81.0f)) {
                                uj3Var.S = false;
                            } else if (view.getTop() >= qj3Var.getPaddingTop()) {
                                uj3Var.S = false;
                            }
                        }
                        if (uj3Var.S) {
                        }
                    }
                }
                i = 0;
            }
            f89 M2 = qj3Var.M(i, false);
            if (M2 != null) {
                float paddingTop = qj3Var.getPaddingTop() - M2.a.getTop();
                if (paddingTop >= 0.0f) {
                    float f5 = -paddingTop;
                    float f6 = -uj3Var.q3();
                    if (f5 < f6) {
                        f5 = f6;
                    } else if (f5 > 0.0f) {
                        f5 = 0.0f;
                    }
                    uj3Var.W4(f5);
                } else {
                    uj3Var.W4(0.0f);
                }
            } else {
                uj3Var.W4(-uj3Var.q3());
            }
        }
        int Y = Y();
        z = ((e) uj3Var).inPreviewMode;
        int Z = z ? hl.m : Z();
        int i2 = Z + Y;
        uj3Var.H3.setCurrentTop(i2);
        boolean z4 = uj3Var.u3;
        Rect rect = this.l0;
        Paint paint2 = this.g0;
        if (z4) {
            float f7 = uj3Var.z1;
            if (f7 == 1.0f) {
                paint2.setColor(uj3Var.getThemedColor(aob.d6));
            } else if (f7 == 0.0f && (hj3Var2 = uj3Var.Y) != null) {
                hj3Var2.setTranslationY(uj3Var.u3() + uj3Var.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i2 - hl.L(uj3Var.z1 * 2.0f));
            float f8 = uj3Var.z1;
            if (f8 < 0.0f) {
                if (f8 == 1.0f) {
                    paint = paint2;
                }
                f4 = 2.0f;
                f = 1.0f;
                H(canvas, 0.0f, this.l0, paint, true);
            } else {
                f4 = 2.0f;
                f = 1.0f;
            }
            float f9 = uj3Var.z1;
            if (f9 > 0.0f && f9 < f) {
                paint2.setColor(uj3Var.getThemedColor(aob.d6));
                if (!uj3Var.s3 && uj3Var.t3) {
                    rect.set(0, Z, getMeasuredWidth(), i2 - hl.L(uj3Var.z1 * f4));
                    H(canvas, 0.0f, this.l0, paint2, true);
                }
                hj3 hj3Var3 = uj3Var.Y;
                if (hj3Var3 != null) {
                    aVar = ((e) uj3Var).actionBar;
                    int height = aVar.getHeight();
                    hj3Var3.setTranslationY(uj3Var.u3() + (i2 - (height + (uj3Var.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f = 1.0f;
            z2 = ((e) uj3Var).inPreviewMode;
            if (!z2) {
                if (uj3Var.w3 > 0.0f) {
                    paint2.setColor(uj3Var.getThemedColor(aob.d6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i2 - hl.L(uj3Var.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i2 - hl.L(uj3Var.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.l0, paint, true);
                }
                uj3Var.z3 = 0.0f;
                uj3Var.y3 = 0.0f;
                float min = 0.0f - Math.min((hl.L(48.0f) + hl.L(!uj3Var.L ? 81.0f : 0.0f)) + uj3Var.O, uj3Var.w3 * (hl.L(48.0f) + hl.L(!uj3Var.L ? 81.0f : 0.0f)));
                uj3Var.z3 = min;
                uj3Var.y3 = min;
                li3Var = uj3Var.H3;
                if (li3Var == null && li3Var.c()) {
                    float f10 = uj3Var.H3.e;
                    float q3 = uj3Var.z3 - ((uj3Var.q3() + uj3Var.O) * f10);
                    uj3Var.z3 = q3;
                    uj3Var.y3 = q3;
                    float i3 = uj3Var.H0 ? f - Utilities.i(f10 / 0.5f, f, 0.0f) : f;
                    ij3 ij3Var = uj3Var.A0;
                    if (ij3Var != null && ij3Var.getVisibility() == 0) {
                        uj3Var.z3 -= (f - uj3Var.r.e) * uj3Var.A0.getMeasuredHeight();
                    }
                    hj3 hj3Var4 = uj3Var.Y;
                    if (hj3Var4 != null) {
                        hj3Var4.setTranslationY(uj3Var.u3() + hl.R1(uj3Var.O + uj3Var.z3, -hl.L(uj3Var.L ? 81.0f : 0.0f), f10));
                    }
                    if (uj3Var.E) {
                        float f11 = uj3Var.F ? 0.0f : uj3Var.O;
                        f3 = -hl.R1(-f11, f11, uj3Var.H3.e);
                    } else {
                        f3 = 0.0f;
                    }
                    uj3Var.f0[0].setTranslationY(f3 - (((uj3Var.L ? hl.L(81.0f) + 0.0f : 0.0f) + hl.L(48.0f)) * uj3Var.H3.e));
                    f2 = i3;
                } else {
                    hj3Var = uj3Var.Y;
                    if (hj3Var != null) {
                        hj3Var.setTranslationY(hl.R1(((uj3Var.O + uj3Var.z3) + uj3Var.U) - hl.L(4.0f), -hl.L((uj3Var.L ? 81 : 0) + 48), uj3Var.z1));
                    }
                    f2 = f;
                }
                uj3Var.o5();
                uj3Var.D5(f2);
                super.dispatchDraw(canvas);
                uj3Var.l3(canvas2, i2);
                tbVar = uj3Var.L0;
                if (tbVar != null && tbVar.getVisibility() == 0) {
                    alpha = uj3Var.L0.getAlpha();
                    tb tbVar2 = uj3Var.L0;
                    if (alpha != f) {
                        tbVar2.draw(canvas2);
                    } else if (tbVar2.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(uj3Var.L0.getLeft(), uj3Var.L0.getTop(), uj3Var.L0.getRight(), uj3Var.L0.getBottom(), (int) (uj3Var.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(uj3Var.L0.getLeft(), uj3Var.L0.getTop());
                        uj3Var.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!uj3Var.X && uj3Var.a3 == 0) {
                    hl.O(canvas2, this, uj3Var.getThemedColor(aob.d6), uj3Var.m4, f);
                }
                uj3Var.W = true;
            }
        }
        canvas2 = canvas;
        uj3Var.z3 = 0.0f;
        uj3Var.y3 = 0.0f;
        float min2 = 0.0f - Math.min((hl.L(48.0f) + hl.L(!uj3Var.L ? 81.0f : 0.0f)) + uj3Var.O, uj3Var.w3 * (hl.L(48.0f) + hl.L(!uj3Var.L ? 81.0f : 0.0f)));
        uj3Var.z3 = min2;
        uj3Var.y3 = min2;
        li3Var = uj3Var.H3;
        if (li3Var == null) {
        }
        hj3Var = uj3Var.Y;
        if (hj3Var != null) {
        }
        f2 = f;
        uj3Var.o5();
        uj3Var.D5(f2);
        super.dispatchDraw(canvas);
        uj3Var.l3(canvas2, i2);
        tbVar = uj3Var.L0;
        if (tbVar != null) {
            alpha = uj3Var.L0.getAlpha();
            tb tbVar22 = uj3Var.L0;
            if (alpha != f) {
            }
        }
        if (!uj3Var.X) {
            hl.O(canvas2, this, uj3Var.getThemedColor(aob.d6), uj3Var.m4, f);
        }
        uj3Var.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.n0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        uj3 uj3Var = this.o0;
        if (view == uj3Var.L0) {
            return true;
        }
        if (wma.f0) {
            return super.drawChild(canvas, view, j);
        }
        tj3[] tj3VarArr = uj3Var.f0;
        if (view == tj3VarArr[0] || ((tj3VarArr.length > 1 && view == tj3VarArr[1]) || view == uj3Var.L1 || view == uj3Var.A0)) {
            canvas.save();
            if (view != uj3Var.L1 && view != uj3Var.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f = uj3Var.d4;
            if (f != 1.0f) {
                if (uj3Var.e4) {
                    canvas.translate((1.0f - uj3Var.d4) * hl.L(40.0f) * (-1), 0.0f);
                } else {
                    float B = qu6.B(1.0f, f, 0.05f, 1.0f);
                    canvas.translate((1.0f - uj3Var.d4) * (-hl.L(4.0f)), 0.0f);
                    canvas.scale(B, B, 0.0f, (-getY()) + uj3Var.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        aVar = ((e) uj3Var).actionBar;
        if (view != aVar || uj3Var.d4 == 1.0f) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        if (uj3Var.e4) {
            canvas.translate((1.0f - uj3Var.d4) * hl.L(40.0f) * (-1), 0.0f);
        } else {
            float B2 = qu6.B(1.0f, uj3Var.d4, 0.05f, 1.0f);
            canvas.translate((1.0f - uj3Var.d4) * (-hl.L(4.0f)), 0.0f);
            aVar2 = ((e) uj3Var).actionBar;
            canvas.scale(B2, B2, 0.0f, (a.getCurrentActionBarHeight() / 2.0f) + (aVar2.getOccupyStatusBar() ? hl.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ul ulVar = this.o0.F3;
        if (ulVar != null) {
            ulVar.a();
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ul ulVar = this.o0.F3;
        if (ulVar != null) {
            ulVar.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        ij3 ij3Var;
        int actionMasked = motionEvent.getActionMasked();
        uj3 uj3Var = this.o0;
        if (actionMasked == 1 || actionMasked == 3) {
            aVar = ((e) uj3Var).actionBar;
            if (aVar.z()) {
                uj3Var.a1 = true;
            }
        }
        return X() || ((ij3Var = uj3Var.A0) != null && ij3Var.Q) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0079  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uj3 uj3Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar;
        ii3 ii3Var;
        ii3 ii3Var2;
        a aVar2;
        a aVar3;
        nj3 nj3Var = this;
        int childCount = nj3Var.getChildCount();
        int Q = nj3Var.Q();
        int i11 = 0;
        nj3Var.setBottomClip(0);
        int measuredWidth = nj3Var.getMeasuredWidth();
        int measuredHeight = nj3Var.getMeasuredHeight();
        int i12 = 0;
        while (true) {
            uj3Var = nj3Var.o0;
            if (i12 >= childCount) {
                break;
            }
            View childAt = nj3Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i13 = layoutParams.gravity;
                if (i13 == -1) {
                    i13 = 51;
                }
                int i14 = i13 & jn7.w1;
                int i15 = i13 & 7;
                if (i15 == 1) {
                    i5 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i15 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i14 == 16) {
                        if (i14 == 48) {
                            i10 = layoutParams.topMargin + nj3Var.getPaddingTop();
                        } else if (i14 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = measuredHeight - measuredHeight2;
                            i9 = layoutParams.bottomMargin;
                        }
                        if (childAt != uj3Var.Y || childAt == uj3Var.a0 || childAt == (ii3Var2 = uj3Var.F0)) {
                            aVar = ((e) uj3Var).actionBar;
                            i10 = aVar.getMeasuredHeight();
                            if (childAt != uj3Var.Y && childAt != uj3Var.F0 && childAt != uj3Var.a0) {
                                i10 += hl.L(48.0f);
                            }
                            if (uj3Var.L && childAt == uj3Var.Y) {
                                i10 = hl.L(81.0f) + i10;
                            }
                            ii3Var = uj3Var.F0;
                            if (childAt == ii3Var && ii3Var.getPremiumHint() != null) {
                                uj3Var.F0.getPremiumHint().layout(i7, c00.A(54.0f, i10, measuredHeight2), i7 + measuredWidth2, uj3Var.F0.getPremiumHint().getMeasuredHeight() + c00.A(54.0f, i10, measuredHeight2));
                            }
                            if (childAt == uj3Var.Y) {
                                i10 += hl.L(2.0f);
                            }
                        } else if (childAt == uj3Var.D0) {
                            i10 = -hl.L(uj3Var.a);
                        } else if (childAt instanceof d93) {
                            aVar3 = ((e) uj3Var).actionBar;
                            i10 = aVar3.getMeasuredHeight();
                        } else if (childAt instanceof tj3) {
                            i10 = i11;
                        } else if (childAt == uj3Var.L1 || childAt == uj3Var.M1 || childAt == uj3Var.A0) {
                            aVar2 = ((e) uj3Var).actionBar;
                            i10 = hl.L(48.0f) + aVar2.getMeasuredHeight() + i10;
                        } else if (ii3Var2 != null && ii3Var2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                    } else {
                        i8 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (childAt != uj3Var.Y) {
                    }
                    aVar = ((e) uj3Var).actionBar;
                    i10 = aVar.getMeasuredHeight();
                    if (childAt != uj3Var.Y) {
                        i10 += hl.L(48.0f);
                    }
                    if (uj3Var.L) {
                        i10 = hl.L(81.0f) + i10;
                    }
                    ii3Var = uj3Var.F0;
                    if (childAt == ii3Var) {
                        uj3Var.F0.getPremiumHint().layout(i7, c00.A(54.0f, i10, measuredHeight2), i7 + measuredWidth2, uj3Var.F0.getPremiumHint().getMeasuredHeight() + c00.A(54.0f, i10, measuredHeight2));
                    }
                    if (childAt == uj3Var.Y) {
                    }
                    childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                } else {
                    i5 = measuredWidth - measuredWidth2;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i14 == 16) {
                }
                i10 = i8 - i9;
                if (childAt != uj3Var.Y) {
                }
                aVar = ((e) uj3Var).actionBar;
                i10 = aVar.getMeasuredHeight();
                if (childAt != uj3Var.Y) {
                }
                if (uj3Var.L) {
                }
                ii3Var = uj3Var.F0;
                if (childAt == ii3Var) {
                }
                if (childAt == uj3Var.Y) {
                }
                childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
            }
            i12++;
            i11 = 0;
            nj3Var = this;
        }
        bj3 bj3Var = uj3Var.D0;
        if (bj3Var != null) {
            bj3Var.setKeyboardHeight(Q);
        }
        R();
        uj3Var.u5();
        uj3Var.o5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        uj3 uj3Var = this.o0;
        byte b = uj3Var.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = size2 > size;
        setMeasuredDimension(size, size2);
        s7 s7Var = uj3Var.n0;
        if (s7Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s7Var.getLayoutParams();
            aVar5 = ((e) uj3Var).actionBar;
            layoutParams.topMargin = aVar5.getOccupyStatusBar() ? hl.m : 0;
            layoutParams.height = a.getCurrentActionBarHeight();
        }
        aVar = ((e) uj3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar2 = ((e) uj3Var).actionBar;
                if (childAt != aVar2) {
                    if (childAt instanceof d93) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i2);
                        int L = hl.L(10.0f);
                        int L2 = hl.L(2.0f) + size3;
                        aVar4 = ((e) uj3Var).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - aVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof tj3) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = hl.L(2.0f) + size2;
                        if (uj3Var.H3.c()) {
                            if (uj3Var.x) {
                                L3 = hl.L(50.0f) + L3;
                            }
                            if (uj3Var.L) {
                                L3 = hl.L(81.0f) + L3;
                            }
                            L3 = hl.L(48.0f) + L3;
                        }
                        int i4 = L3 + uj3Var.Q;
                        if (uj3Var.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i5 = uj3Var.f4 ? (int) (i4 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i5);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), i4 + i5), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        bj3 bj3Var = uj3Var.D0;
                        if (childAt == bj3Var) {
                            bj3Var.setTranslationY(uj3Var.J0);
                            uj3Var.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(hl.L(b) + View.MeasureSpec.getSize(i2), TLObject.FLAG_30);
                            uj3Var.c3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = hl.Q;
                            aVar3 = ((e) uj3Var).actionBar;
                            rect.set(0, (hl.L(b) + aVar3.getMeasuredHeight()) - hl.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            bi3 bi3Var = uj3Var.D1;
                            if (bi3Var == null || !bi3Var.V0(childAt)) {
                                if (childAt == uj3Var.H3) {
                                    int size4 = View.MeasureSpec.getSize(i2);
                                    int i6 = uj3Var.f4 ? (int) (size4 * 0.05f) : 0;
                                    uj3Var.H3.setTransitionPaddingBottom(i6);
                                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(10.0f), size4 + i6), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i, 0, i2, 0);
                                }
                            } else if (!hl.E) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (hl.O1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(320.0f), getPaddingTop() + (size2 - hl.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - hl.m), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z != this.m0) {
            post(new mj3(this, (byte) 1));
            this.m0 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r3 == 8) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wk5 wk5Var;
        ij3 ij3Var;
        wk5 wk5Var2;
        wk5 wk5Var3;
        wk5 wk5Var4;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        int i;
        int i2;
        z92 z92Var;
        uj3 uj3Var = this.o0;
        wk5Var = ((e) uj3Var).parentLayout;
        Object[] objArr = 0;
        if (wk5Var != null && (ij3Var = uj3Var.A0) != null && !ij3Var.n && !uj3Var.l2 && !uj3Var.H3.c()) {
            wk5Var2 = ((e) uj3Var).parentLayout;
            if (!((ActionBarLayout) wk5Var2).h()) {
                wk5Var3 = ((e) uj3Var).parentLayout;
                if (!((ActionBarLayout) wk5Var3).w()) {
                    wk5Var4 = ((e) uj3Var).parentLayout;
                    if (!((ActionBarLayout) wk5Var4).n && (motionEvent == null || uj3Var.o3 || (motionEvent.getY() > Y() + Z() && ((z92Var = uj3Var.A1) == null || z92Var.getVisibility() != 0 || motionEvent.getY() < uj3Var.A1.getY())))) {
                        if (uj3Var.T0 != 3) {
                            i = ((e) uj3Var).currentAccount;
                            if (xea.m(i) != 5) {
                                i2 = ((e) uj3Var).currentAccount;
                                if (xea.m(i2) == 2) {
                                    tj3 tj3Var = uj3Var.f0[0];
                                    if (tj3Var != null) {
                                        int i3 = tj3Var.d.h;
                                        if (i3 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            VelocityTracker velocityTracker = this.k0;
                            if (velocityTracker == null) {
                                velocityTracker = VelocityTracker.obtain();
                                this.k0 = velocityTracker;
                            }
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            uj3Var.o3 = true;
                            this.h0 = motionEvent.getPointerId(0);
                            int x = (int) motionEvent.getX();
                            this.i0 = x;
                            boolean z2 = uj3Var.k3;
                            tj3[] tj3VarArr = uj3Var.f0;
                            float f3 = x;
                            if (z2) {
                                float translationX = uj3Var.f0[0].getTranslationX() + tj3VarArr[0].getMeasuredWidth();
                                tj3[] tj3VarArr2 = uj3Var.f0;
                                if (f3 < translationX) {
                                    uj3Var.l3 = tj3VarArr2[0].getTranslationX();
                                } else {
                                    tj3 tj3Var2 = tj3VarArr2[0];
                                    tj3 tj3Var3 = tj3VarArr2[1];
                                    tj3VarArr2[0] = tj3Var3;
                                    tj3VarArr2[1] = tj3Var2;
                                    uj3Var.k3 = false;
                                    uj3Var.l3 = tj3Var3.getTranslationX();
                                    uj3Var.A0.j(1.0f, uj3Var.f0[0].h);
                                    uj3Var.A0.j(uj3Var.l3 / r10[0].getMeasuredWidth(), uj3Var.f0[1].h);
                                    uj3Var.n5(true);
                                    uj3Var.f0[0].d.getClass();
                                    uj3Var.f0[1].d.getClass();
                                }
                            } else {
                                float translationX2 = uj3Var.f0[1].getTranslationX() + tj3VarArr[1].getMeasuredWidth();
                                tj3[] tj3VarArr3 = uj3Var.f0;
                                if (f3 < translationX2) {
                                    tj3 tj3Var4 = tj3VarArr3[0];
                                    tj3 tj3Var5 = tj3VarArr3[1];
                                    tj3VarArr3[0] = tj3Var5;
                                    tj3VarArr3[1] = tj3Var4;
                                    uj3Var.k3 = true;
                                    uj3Var.l3 = tj3Var5.getTranslationX();
                                    uj3Var.A0.j(1.0f, uj3Var.f0[0].h);
                                    uj3Var.A0.j((-uj3Var.l3) / r10[0].getMeasuredWidth(), uj3Var.f0[1].h);
                                    uj3Var.n5(true);
                                    uj3Var.f0[0].d.getClass();
                                    uj3Var.f0[1].d.getClass();
                                } else {
                                    uj3Var.l3 = tj3VarArr3[0].getTranslationX();
                                }
                            }
                            uj3Var.i3.removeAllListeners();
                            uj3Var.i3.cancel();
                            uj3Var.j3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            uj3Var.l3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !uj3Var.o3 && !uj3Var.p3 && uj3Var.A0.getVisibility() == 0) {
                            this.h0 = motionEvent.getPointerId(0);
                            uj3Var.p3 = true;
                            this.i0 = (int) motionEvent.getX();
                            this.j0 = (int) motionEvent.getY();
                            this.k0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.h0) {
                            int x2 = (int) ((motionEvent.getX() - this.i0) + uj3Var.l3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.j0);
                            if (uj3Var.o3 && (!uj3Var.k3 ? x2 < 0 : x2 > 0)) {
                                if (!a0(motionEvent, x2 < 0)) {
                                    uj3Var.p3 = true;
                                    uj3Var.o3 = false;
                                    uj3Var.f0[0].setTranslationX(0.0f);
                                    uj3Var.f0[1].setTranslationX(uj3Var.k3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    uj3Var.A0.j(0.0f, uj3Var.f0[1].h);
                                }
                            }
                            if (uj3Var.p3 && !uj3Var.o3) {
                                float Z0 = hl.Z0(true, 0.3f);
                                int x3 = (int) (motionEvent.getX() - this.i0);
                                if (Math.abs(x3) >= Z0 && Math.abs(x3) > abs) {
                                    a0(motionEvent, x2 < 0);
                                }
                            } else if (uj3Var.o3) {
                                uj3Var.f0[0].setTranslationX(x2);
                                boolean z3 = uj3Var.k3;
                                tj3[] tj3VarArr4 = uj3Var.f0;
                                if (z3) {
                                    tj3VarArr4[1].setTranslationX(tj3VarArr4[0].getMeasuredWidth() + x2);
                                } else {
                                    tj3VarArr4[1].setTranslationX(x2 - tj3VarArr4[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x2) / uj3Var.f0[0].getMeasuredWidth();
                                tj3 tj3Var6 = uj3Var.f0[1];
                                if (tj3Var6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    uj3Var.A0.n(uj3Var.f0[1].h);
                                    hl.d3(new mj3(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                uj3Var.A0.j(abs2, tj3Var6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.h0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.k0.computeCurrentVelocity(1000, uj3Var.n3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f = 0.0f;
                                f2 = 0.0f;
                            } else {
                                f = this.k0.getXVelocity();
                                f2 = this.k0.getYVelocity();
                                if (!uj3Var.o3 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                                    a0(motionEvent, f < 0.0f);
                                }
                            }
                            if (uj3Var.o3) {
                                float x4 = uj3Var.f0[0].getX();
                                uj3Var.i3 = new AnimatorSet();
                                if (uj3Var.f0[1].F) {
                                    uj3Var.m3 = true;
                                    z = true;
                                } else if (uj3Var.l3 != 0.0f) {
                                    float abs3 = Math.abs(f);
                                    boolean z4 = uj3Var.k3;
                                    if (abs3 > 1500.0f) {
                                        z = !z4 ? f >= 0.0f : f <= 0.0f;
                                        uj3Var.m3 = z;
                                    } else {
                                        tj3[] tj3VarArr5 = uj3Var.f0;
                                        if (z4) {
                                            z = tj3VarArr5[1].getX() > ((float) (uj3Var.f0[0].getMeasuredWidth() >> 1));
                                            uj3Var.m3 = z;
                                        } else {
                                            z = tj3VarArr5[0].getX() < ((float) (uj3Var.f0[0].getMeasuredWidth() >> 1));
                                            uj3Var.m3 = z;
                                        }
                                    }
                                } else {
                                    z = Math.abs(x4) < ((float) uj3Var.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                                    uj3Var.m3 = z;
                                }
                                Property property = View.TRANSLATION_X;
                                if (z) {
                                    measuredWidth = Math.abs(x4);
                                    boolean z5 = uj3Var.k3;
                                    AnimatorSet animatorSet = uj3Var.i3;
                                    if (z5) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(uj3Var.f0[0], (Property<tj3, Float>) property, 0.0f), ObjectAnimator.ofFloat(uj3Var.f0[1], (Property<tj3, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(uj3Var.f0[0], (Property<tj3, Float>) property, 0.0f), ObjectAnimator.ofFloat(uj3Var.f0[1], (Property<tj3, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = uj3Var.f0[0].getMeasuredWidth() - Math.abs(x4);
                                    uj3Var.F5(uj3Var.f0[1].h, true);
                                    boolean z6 = uj3Var.k3;
                                    AnimatorSet animatorSet2 = uj3Var.i3;
                                    if (z6) {
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(uj3Var.f0[0], (Property<tj3, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(uj3Var.f0[1], (Property<tj3, Float>) property, 0.0f));
                                    } else {
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(uj3Var.f0[0], (Property<tj3, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(uj3Var.f0[1], (Property<tj3, Float>) property, 0.0f));
                                    }
                                }
                                uj3Var.i3.setInterpolator(uj3.G4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f4 = measuredWidth2 / 2;
                                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f4) + f4;
                                uj3Var.i3.setDuration(Math.max(jn7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r5) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                uj3Var.i3.addListener(new cn2(this, (byte) 9));
                                uj3Var.i3.start();
                                uj3Var.j3 = true;
                                uj3Var.o3 = false;
                            } else {
                                uj3Var.p3 = false;
                                aVar = ((e) uj3Var).actionBar;
                                aVar.setEnabled(true);
                                uj3Var.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker2 = this.k0;
                            if (velocityTracker2 != null) {
                                velocityTracker2.recycle();
                                this.k0 = null;
                            }
                        }
                        return uj3Var.o3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        uj3 uj3Var = this.o0;
        if (uj3Var.p3 && !uj3Var.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
