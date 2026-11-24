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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gk3 extends ela {
    public final Paint m0;
    public int n0;
    public int o0;
    public int p0;
    public VelocityTracker q0;
    public final Rect r0;
    public boolean s0;
    public final vj2 t0;
    public final /* synthetic */ nk3 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk3(nk3 nk3Var, Context context) {
        super(context, null);
        this.u0 = nk3Var;
        this.m0 = new Paint(1);
        this.r0 = new Rect();
        this.t0 = new vj2(new fk3(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r13.a() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r13 = nm7.H2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r13 = nm7.s3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (cmb.I.o() == false) goto L17;
     */
    @Override // ela
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        int i;
        ylb ylbVar;
        ylb ylbVar2;
        int i2;
        ylb ylbVar3;
        if (Build.VERSION.SDK_INT >= 29 && gda.f()) {
            nk3 nk3Var = this.u0;
            if (nk3Var.r4 != null) {
                i = ((d) nk3Var).currentAccount;
                ylbVar = ((d) nk3Var).resourceProvider;
                if (qqd.d(i, ylbVar)) {
                    ylbVar2 = ((d) nk3Var).resourceProvider;
                    if (ylbVar2 != null) {
                        ylbVar3 = ((d) nk3Var).resourceProvider;
                    }
                    canvas.save();
                    canvas.translate(0.0f, -f);
                    nk3Var.r4.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
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

    @Override // ela
    public final void J(Canvas canvas, ArrayList arrayList) {
        sj3 sj3Var;
        r59 n;
        nk3 nk3Var = this.u0;
        if (nk3Var.s3 && (sj3Var = nk3Var.D0) != null && sj3Var.getVisibility() == 0) {
            sj3 sj3Var2 = nk3Var.D0;
            View[] viewArr = sj3Var2.e;
            for (int i = 0; i < viewArr.length; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0 && (n = wgc.n(viewArr[i])) != null) {
                    for (int i2 = 0; i2 < n.getChildCount(); i2++) {
                        View childAt = n.getChildAt(i2);
                        if (childAt.getY() < gm.L(100.0f) + gm.L(203.0f)) {
                            int save = canvas.save();
                            canvas.translate(viewArr[i].getX(), childAt.getY() + n.getY() + viewArr[i].getY() + sj3Var2.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }
    }

    @Override // ela
    public final void K() {
        sy4 sy4Var;
        super.K();
        sy4Var = ((d) this.u0).glassEngine;
        sy4Var.g();
    }

    @Override // ela
    public final boolean N() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X() {
        AnimatorSet animatorSet;
        nk3 nk3Var = this.u0;
        if (!nk3Var.j3) {
            return false;
        }
        boolean z = nk3Var.m3;
        mk3[] mk3VarArr = nk3Var.f0;
        if (!z) {
            if (Math.abs(mk3VarArr[1].getTranslationX()) < 1.0f) {
                nk3Var.f0[0].setTranslationX(r0.getMeasuredWidth() * (nk3Var.k3 ? -1 : 1));
                nk3Var.f0[1].setTranslationX(0.0f);
                nk3Var.j5(true);
                animatorSet = nk3Var.i3;
                if (animatorSet != null) {
                }
                nk3Var.j3 = false;
            }
            return nk3Var.j3;
        }
        if (Math.abs(mk3VarArr[0].getTranslationX()) < 1.0f) {
            nk3Var.f0[0].setTranslationX(0.0f);
            nk3Var.f0[1].setTranslationX(r0[0].getMeasuredWidth() * (nk3Var.k3 ? 1 : -1));
            nk3Var.j5(true);
            animatorSet = nk3Var.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
                nk3Var.i3 = null;
            }
            nk3Var.j3 = false;
        }
        return nk3Var.j3;
    }

    public final int Y() {
        a aVar;
        nk3 nk3Var = this.u0;
        aVar = ((d) nk3Var).actionBar;
        float height = aVar.getHeight();
        dj3 dj3Var = nk3Var.H3;
        float f = (dj3Var == null || !dj3Var.c()) ? 0.0f : nk3Var.H3.e;
        if (nk3Var.L) {
            height = td4.A(1.0f, nk3Var.w3, (1.0f - f) * (1.0f - nk3Var.z1) * gm.L(81.0f), height);
        }
        return (int) td4.A(1.0f, f, (1.0f - nk3Var.z1) * (1.0f - nk3Var.w3) * gm.L(48.0f), height + nk3Var.U);
    }

    public final int Z() {
        nk3 nk3Var = this.u0;
        float f = nk3Var.O;
        dj3 dj3Var = nk3Var.H3;
        return (int) td4.A(1.0f, nk3Var.z1, td4.z(1.0f, (dj3Var == null || !dj3Var.c()) ? 0.0f : nk3Var.H3.e, 1.0f - nk3Var.w3, f), -getY());
    }

    public final boolean a0(MotionEvent motionEvent, boolean z) {
        a aVar;
        nk3 nk3Var = this.u0;
        ak3 ak3Var = nk3Var.A0;
        int i = ak3Var.k0.get(ak3Var.L + (z ? 1 : -1), -1);
        if (i < 0) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        nk3Var.p3 = false;
        nk3Var.o3 = true;
        this.o0 = (int) (motionEvent.getX() + nk3Var.l3);
        aVar = ((d) nk3Var).actionBar;
        aVar.setEnabled(false);
        nk3Var.A0.setEnabled(false);
        mk3 mk3Var = nk3Var.f0[1];
        mk3Var.h = i;
        mk3Var.setVisibility(0);
        nk3Var.k3 = z;
        nk3Var.j5(false);
        nk3Var.n5(true);
        mk3[] mk3VarArr = nk3Var.f0;
        if (z) {
            mk3VarArr[1].setTranslationX(mk3VarArr[0].getMeasuredWidth());
            return true;
        }
        mk3VarArr[1].setTranslationX(-mk3VarArr[0].getMeasuredWidth());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r1 == 1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200  */
    @Override // ela, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        sy4 sy4Var;
        boolean z;
        float f;
        boolean z2;
        Canvas canvas2;
        dj3 dj3Var;
        zj3 zj3Var;
        float f2;
        sb sbVar;
        float alpha;
        float f3;
        zj3 zj3Var2;
        float f4;
        a aVar;
        dj3 dj3Var2;
        nk3 nk3Var = this.u0;
        Paint paint = nk3Var.h1;
        sy4Var = ((d) nk3Var).glassEngine;
        sy4Var.g();
        if (nk3Var.R && (((dj3Var2 = nk3Var.H3) == null || !dj3Var2.c()) && nk3Var.w3 == 0.0f)) {
            nk3Var.R = false;
            int i = (nk3Var.y3() && nk3Var.f0[0].s == 0) ? 1 : 0;
            jk3 jk3Var = nk3Var.f0[0].a;
            boolean z3 = nk3Var.S;
            if (z3) {
                if (!nk3Var.d1) {
                    if (i == 0) {
                        nk3Var.S = false;
                        z3 = false;
                    }
                    if (z3) {
                        u69 L = jk3Var.L(0, false);
                        if (L == null) {
                            nk3Var.S = false;
                        } else {
                            View view = L.a;
                            if (view.getBottom() <= jk3Var.getPaddingTop() - gm.L(81.0f)) {
                                nk3Var.S = false;
                            } else if (view.getTop() >= jk3Var.getPaddingTop()) {
                                nk3Var.S = false;
                            }
                        }
                        if (nk3Var.S) {
                        }
                    }
                }
                i = 0;
            }
            u69 L2 = jk3Var.L(i, false);
            if (L2 != null) {
                float paddingTop = jk3Var.getPaddingTop() - L2.a.getTop();
                if (paddingTop >= 0.0f) {
                    float f5 = -paddingTop;
                    float f6 = -nk3Var.q3();
                    if (f5 < f6) {
                        f5 = f6;
                    } else if (f5 > 0.0f) {
                        f5 = 0.0f;
                    }
                    nk3Var.W4(f5);
                } else {
                    nk3Var.W4(0.0f);
                }
            } else {
                nk3Var.W4(-nk3Var.q3());
            }
        }
        int Y = Y();
        z = ((d) nk3Var).inPreviewMode;
        int Z = z ? gm.m : Z();
        int i2 = Z + Y;
        nk3Var.H3.setCurrentTop(i2);
        boolean z4 = nk3Var.u3;
        Rect rect = this.r0;
        Paint paint2 = this.m0;
        if (z4) {
            float f7 = nk3Var.z1;
            if (f7 == 1.0f) {
                paint2.setColor(nk3Var.getThemedColor(cmb.c6));
            } else if (f7 == 0.0f && (zj3Var2 = nk3Var.Y) != null) {
                zj3Var2.setTranslationY(nk3Var.u3() + nk3Var.O);
            }
            rect.set(0, Z, getMeasuredWidth(), i2 - gm.L(nk3Var.z1 * 2.0f));
            float f8 = nk3Var.z1;
            if (f8 < 0.0f) {
                if (f8 == 1.0f) {
                    paint = paint2;
                }
                f4 = 2.0f;
                f = 1.0f;
                H(canvas, 0.0f, this.r0, paint, true);
            } else {
                f4 = 2.0f;
                f = 1.0f;
            }
            float f9 = nk3Var.z1;
            if (f9 > 0.0f && f9 < f) {
                paint2.setColor(nk3Var.getThemedColor(cmb.c6));
                if (!nk3Var.s3 && nk3Var.t3) {
                    rect.set(0, Z, getMeasuredWidth(), i2 - gm.L(nk3Var.z1 * f4));
                    H(canvas, 0.0f, this.r0, paint2, true);
                }
                zj3 zj3Var3 = nk3Var.Y;
                if (zj3Var3 != null) {
                    aVar = ((d) nk3Var).actionBar;
                    int height = aVar.getHeight();
                    zj3Var3.setTranslationY(nk3Var.u3() + (i2 - (height + (nk3Var.A0 != null ? r3.getMeasuredHeight() : 0))));
                }
            }
        } else {
            f = 1.0f;
            z2 = ((d) nk3Var).inPreviewMode;
            if (!z2) {
                if (nk3Var.w3 > 0.0f) {
                    paint2.setColor(nk3Var.getThemedColor(cmb.c6));
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i2 - gm.L(nk3Var.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.r0, paint2, true);
                } else {
                    rect.set(0, Math.max(0, Z), getMeasuredWidth(), i2 - gm.L(nk3Var.z1 * 2.0f));
                    canvas2 = canvas;
                    H(canvas2, 0.0f, this.r0, paint, true);
                }
                nk3Var.z3 = 0.0f;
                nk3Var.y3 = 0.0f;
                float min = nk3Var.z3 - Math.min((gm.L(48.0f) + gm.L(!nk3Var.L ? 81.0f : 0.0f)) + nk3Var.O, nk3Var.w3 * (gm.L(48.0f) + gm.L(!nk3Var.L ? 81.0f : 0.0f)));
                nk3Var.z3 = min;
                nk3Var.y3 = min;
                dj3Var = nk3Var.H3;
                if (dj3Var == null && dj3Var.c()) {
                    float f10 = nk3Var.H3.e;
                    float q3 = nk3Var.z3 - ((nk3Var.q3() + nk3Var.O) * f10);
                    nk3Var.z3 = q3;
                    nk3Var.y3 = q3;
                    float i3 = nk3Var.H0 ? f - Utilities.i(f10 / 0.5f, f, 0.0f) : f;
                    ak3 ak3Var = nk3Var.A0;
                    if (ak3Var != null && ak3Var.getVisibility() == 0) {
                        nk3Var.z3 -= (f - nk3Var.r.e) * nk3Var.A0.getMeasuredHeight();
                    }
                    zj3 zj3Var4 = nk3Var.Y;
                    if (zj3Var4 != null) {
                        zj3Var4.setTranslationY(nk3Var.u3() + gm.R1(nk3Var.O + nk3Var.z3, -gm.L(nk3Var.L ? 81.0f : 0.0f), f10));
                    }
                    if (nk3Var.E) {
                        float f11 = nk3Var.F ? 0.0f : nk3Var.O;
                        f3 = -gm.R1(-f11, f11, nk3Var.H3.e);
                    } else {
                        f3 = 0.0f;
                    }
                    nk3Var.f0[0].setTranslationY(f3 - (((nk3Var.L ? gm.L(81.0f) + 0.0f : 0.0f) + gm.L(48.0f)) * nk3Var.H3.e));
                    f2 = i3;
                } else {
                    zj3Var = nk3Var.Y;
                    if (zj3Var != null) {
                        zj3Var.setTranslationY(gm.R1(((nk3Var.O + nk3Var.z3) + nk3Var.U) - gm.L(4.0f), -gm.L((nk3Var.L ? 81 : 0) + 48), nk3Var.z1));
                    }
                    f2 = f;
                }
                nk3Var.o5();
                nk3Var.D5(f2);
                super.dispatchDraw(canvas);
                nk3Var.l3(canvas2, i2);
                sbVar = nk3Var.L0;
                if (sbVar != null && sbVar.getVisibility() == 0) {
                    alpha = nk3Var.L0.getAlpha();
                    sb sbVar2 = nk3Var.L0;
                    if (alpha != f) {
                        sbVar2.draw(canvas2);
                    } else if (sbVar2.getAlpha() != 0.0f) {
                        Canvas canvas3 = canvas2;
                        canvas3.saveLayerAlpha(nk3Var.L0.getLeft(), nk3Var.L0.getTop(), nk3Var.L0.getRight(), nk3Var.L0.getBottom(), (int) (nk3Var.L0.getAlpha() * 255.0f), 31);
                        canvas2 = canvas3;
                        canvas2.translate(nk3Var.L0.getLeft(), nk3Var.L0.getTop());
                        nk3Var.L0.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (!nk3Var.X && nk3Var.a3 == 0) {
                    gm.O(canvas2, this, nk3Var.getThemedColor(cmb.c6), nk3Var.m4, f);
                }
                nk3Var.W = true;
            }
        }
        canvas2 = canvas;
        nk3Var.z3 = 0.0f;
        nk3Var.y3 = 0.0f;
        float min2 = nk3Var.z3 - Math.min((gm.L(48.0f) + gm.L(!nk3Var.L ? 81.0f : 0.0f)) + nk3Var.O, nk3Var.w3 * (gm.L(48.0f) + gm.L(!nk3Var.L ? 81.0f : 0.0f)));
        nk3Var.z3 = min2;
        nk3Var.y3 = min2;
        dj3Var = nk3Var.H3;
        if (dj3Var == null) {
        }
        zj3Var = nk3Var.Y;
        if (zj3Var != null) {
        }
        f2 = f;
        nk3Var.o5();
        nk3Var.D5(f2);
        super.dispatchDraw(canvas);
        nk3Var.l3(canvas2, i2);
        sbVar = nk3Var.L0;
        if (sbVar != null) {
            alpha = nk3Var.L0.getAlpha();
            sb sbVar22 = nk3Var.L0;
            if (alpha != f) {
            }
        }
        if (!nk3Var.X) {
            gm.O(canvas2, this, nk3Var.getThemedColor(cmb.c6), nk3Var.m4, f);
        }
        nk3Var.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.t0.a(this, motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        nk3 nk3Var = this.u0;
        if (view == nk3Var.L0) {
            return true;
        }
        if (ela.l0) {
            return super.drawChild(canvas, view, j);
        }
        mk3[] mk3VarArr = nk3Var.f0;
        if (view == mk3VarArr[0] || ((mk3VarArr.length > 1 && view == mk3VarArr[1]) || view == nk3Var.L1 || view == nk3Var.A0)) {
            canvas.save();
            if (view != nk3Var.L1 && view != nk3Var.A0) {
                canvas.clipRect(0.0f, (-getY()) + Z() + Y(), getMeasuredWidth(), getMeasuredHeight());
            }
            float f = nk3Var.d4;
            if (f != 1.0f) {
                if (nk3Var.e4) {
                    canvas.translate((1.0f - nk3Var.d4) * gm.L(40.0f) * (-1), 0.0f);
                } else {
                    float B = kt6.B(1.0f, f, 0.05f, 1.0f);
                    canvas.translate((1.0f - nk3Var.d4) * (-gm.L(4.0f)), 0.0f);
                    canvas.scale(B, B, 0.0f, (-getY()) + nk3Var.O + Y());
                }
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        aVar = ((d) nk3Var).actionBar;
        if (view != aVar || nk3Var.d4 == 1.0f) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        if (nk3Var.e4) {
            canvas.translate((1.0f - nk3Var.d4) * gm.L(40.0f) * (-1), 0.0f);
        } else {
            float B2 = kt6.B(1.0f, nk3Var.d4, 0.05f, 1.0f);
            canvas.translate((1.0f - nk3Var.d4) * (-gm.L(4.0f)), 0.0f);
            aVar2 = ((d) nk3Var).actionBar;
            canvas.scale(B2, B2, 0.0f, (a.getCurrentActionBarHeight() / 2.0f) + (aVar2.getOccupyStatusBar() ? gm.m : 0));
        }
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tm tmVar = this.u0.F3;
        if (tmVar != null) {
            tmVar.a();
        }
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tm tmVar = this.u0.F3;
        if (tmVar != null) {
            tmVar.b();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        ak3 ak3Var;
        int actionMasked = motionEvent.getActionMasked();
        nk3 nk3Var = this.u0;
        if (actionMasked == 1 || actionMasked == 3) {
            aVar = ((d) nk3Var).actionBar;
            if (aVar.y()) {
                nk3Var.a1 = true;
            }
        }
        return X() || ((ak3Var = nk3Var.A0) != null && ak3Var.P) || onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0079  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        nk3 nk3Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar;
        aj3 aj3Var;
        aj3 aj3Var2;
        a aVar2;
        a aVar3;
        gk3 gk3Var = this;
        int childCount = gk3Var.getChildCount();
        int Q = gk3Var.Q();
        int i11 = 0;
        gk3Var.setBottomClip(0);
        int measuredWidth = gk3Var.getMeasuredWidth();
        int measuredHeight = gk3Var.getMeasuredHeight();
        int i12 = 0;
        while (true) {
            nk3Var = gk3Var.u0;
            if (i12 >= childCount) {
                break;
            }
            View childAt = gk3Var.getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i13 = layoutParams.gravity;
                if (i13 == -1) {
                    i13 = 51;
                }
                int i14 = i13 & nm7.w1;
                int i15 = i13 & 7;
                if (i15 == 1) {
                    i5 = ((measuredWidth - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i15 != 5) {
                    i7 = layoutParams.leftMargin;
                    if (i14 == 16) {
                        if (i14 == 48) {
                            i10 = layoutParams.topMargin + gk3Var.getPaddingTop();
                        } else if (i14 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = measuredHeight - measuredHeight2;
                            i9 = layoutParams.bottomMargin;
                        }
                        if (childAt != nk3Var.Y || childAt == nk3Var.a0 || childAt == (aj3Var2 = nk3Var.F0)) {
                            aVar = ((d) nk3Var).actionBar;
                            i10 = aVar.getMeasuredHeight();
                            if (childAt != nk3Var.Y && childAt != nk3Var.F0 && childAt != nk3Var.a0) {
                                i10 += gm.L(48.0f);
                            }
                            if (nk3Var.L && childAt == nk3Var.Y) {
                                i10 = gm.L(81.0f) + i10;
                            }
                            aj3Var = nk3Var.F0;
                            if (childAt == aj3Var && aj3Var.getPremiumHint() != null) {
                                nk3Var.F0.getPremiumHint().layout(i7, b10.z(54.0f, i10, measuredHeight2), i7 + measuredWidth2, nk3Var.F0.getPremiumHint().getMeasuredHeight() + b10.z(54.0f, i10, measuredHeight2));
                            }
                            if (childAt == nk3Var.Y) {
                                i10 += gm.L(2.0f);
                            }
                        } else if (childAt == nk3Var.D0) {
                            i10 = -gm.L(nk3Var.a);
                        } else if (childAt instanceof w93) {
                            aVar3 = ((d) nk3Var).actionBar;
                            i10 = aVar3.getMeasuredHeight();
                        } else if (childAt instanceof mk3) {
                            i10 = i11;
                        } else if (childAt == nk3Var.L1 || childAt == nk3Var.M1 || childAt == nk3Var.A0) {
                            aVar2 = ((d) nk3Var).actionBar;
                            i10 = gm.L(48.0f) + aVar2.getMeasuredHeight() + i10;
                        } else if (aj3Var2 != null && aj3Var2.getPremiumHint() == childAt) {
                        }
                        childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                    } else {
                        i8 = ((measuredHeight - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    if (childAt != nk3Var.Y) {
                    }
                    aVar = ((d) nk3Var).actionBar;
                    i10 = aVar.getMeasuredHeight();
                    if (childAt != nk3Var.Y) {
                        i10 += gm.L(48.0f);
                    }
                    if (nk3Var.L) {
                        i10 = gm.L(81.0f) + i10;
                    }
                    aj3Var = nk3Var.F0;
                    if (childAt == aj3Var) {
                        nk3Var.F0.getPremiumHint().layout(i7, b10.z(54.0f, i10, measuredHeight2), i7 + measuredWidth2, nk3Var.F0.getPremiumHint().getMeasuredHeight() + b10.z(54.0f, i10, measuredHeight2));
                    }
                    if (childAt == nk3Var.Y) {
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
                if (childAt != nk3Var.Y) {
                }
                aVar = ((d) nk3Var).actionBar;
                i10 = aVar.getMeasuredHeight();
                if (childAt != nk3Var.Y) {
                }
                if (nk3Var.L) {
                }
                aj3Var = nk3Var.F0;
                if (childAt == aj3Var) {
                }
                if (childAt == nk3Var.Y) {
                }
                childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
            }
            i12++;
            i11 = 0;
            gk3Var = this;
        }
        sj3 sj3Var = nk3Var.D0;
        if (sj3Var != null) {
            sj3Var.setKeyboardHeight(Q);
        }
        R();
        nk3Var.u5();
        nk3Var.o5();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        nk3 nk3Var = this.u0;
        byte b = nk3Var.a;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = size2 > size;
        setMeasuredDimension(size, size2);
        r7 r7Var = nk3Var.n0;
        if (r7Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r7Var.getLayoutParams();
            aVar5 = ((d) nk3Var).actionBar;
            layoutParams.topMargin = aVar5.getOccupyStatusBar() ? gm.m : 0;
            layoutParams.height = a.getCurrentActionBarHeight();
        }
        aVar = ((d) nk3Var).actionBar;
        measureChildWithMargins(aVar, i, 0, i2, 0);
        int Q = Q();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                aVar2 = ((d) nk3Var).actionBar;
                if (childAt != aVar2) {
                    if (childAt instanceof w93) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int size3 = View.MeasureSpec.getSize(i2);
                        int L = gm.L(10.0f);
                        int L2 = gm.L(2.0f) + size3;
                        aVar4 = ((d) nk3Var).actionBar;
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(L, L2 - aVar4.getMeasuredHeight()), TLObject.FLAG_30));
                    } else if (childAt instanceof mk3) {
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                        int L3 = gm.L(2.0f) + size2;
                        if (nk3Var.H3.c()) {
                            if (nk3Var.x) {
                                L3 = gm.L(50.0f) + L3;
                            }
                            if (nk3Var.L) {
                                L3 = gm.L(81.0f) + L3;
                            }
                            L3 = gm.L(48.0f) + L3;
                        }
                        int i4 = L3 + nk3Var.Q;
                        if (nk3Var.x3 == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i5 = nk3Var.f4 ? (int) (i4 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i5);
                        childAt.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), i4 + i5), TLObject.FLAG_30));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    } else {
                        sj3 sj3Var = nk3Var.D0;
                        if (childAt == sj3Var) {
                            sj3Var.setTranslationY(nk3Var.J0);
                            nk3Var.D0.s0.setKeyboardHeight(Q);
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                            int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(gm.L(b) + View.MeasureSpec.getSize(i2), TLObject.FLAG_30);
                            nk3Var.c3(true);
                            childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            Rect rect = gm.Q;
                            aVar3 = ((d) nk3Var).actionBar;
                            rect.set(0, (gm.L(b) + aVar3.getMeasuredHeight()) - gm.L(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else {
                            ti3 ti3Var = nk3Var.D1;
                            if (ti3Var == null || !ti3Var.S0(childAt)) {
                                if (childAt == nk3Var.H3) {
                                    int size4 = View.MeasureSpec.getSize(i2);
                                    int i6 = nk3Var.f4 ? (int) (size4 * 0.05f) : 0;
                                    nk3Var.H3.setTransitionPaddingBottom(i6);
                                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(10.0f), size4 + i6), TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt, i, 0, i2, 0);
                                }
                            } else if (!gm.E) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (gm.O1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(320.0f), getPaddingTop() + (size2 - gm.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - gm.m), TLObject.FLAG_30));
                            }
                        }
                    }
                }
            }
        }
        if (z != this.s0) {
            post(new ek3(this, (byte) 1));
            this.s0 = z;
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
        tk5 tk5Var;
        ak3 ak3Var;
        tk5 tk5Var2;
        tk5 tk5Var3;
        tk5 tk5Var4;
        float f;
        float f2;
        a aVar;
        boolean z;
        float measuredWidth;
        int i;
        int i2;
        va2 va2Var;
        nk3 nk3Var = this.u0;
        tk5Var = ((d) nk3Var).parentLayout;
        Object[] objArr = 0;
        if (tk5Var != null && (ak3Var = nk3Var.A0) != null && !ak3Var.n && !nk3Var.l2 && !nk3Var.H3.c()) {
            tk5Var2 = ((d) nk3Var).parentLayout;
            if (!((ActionBarLayout) tk5Var2).h()) {
                tk5Var3 = ((d) nk3Var).parentLayout;
                if (!((ActionBarLayout) tk5Var3).w()) {
                    tk5Var4 = ((d) nk3Var).parentLayout;
                    if (!((ActionBarLayout) tk5Var4).n && (motionEvent == null || nk3Var.o3 || (motionEvent.getY() > Y() + Z() && ((va2Var = nk3Var.A1) == null || va2Var.getVisibility() != 0 || motionEvent.getY() < nk3Var.A1.getY())))) {
                        if (nk3Var.T0 != 3) {
                            i = ((d) nk3Var).currentAccount;
                            if (gda.m(i) != 5) {
                                i2 = ((d) nk3Var).currentAccount;
                                if (gda.m(i2) == 2) {
                                    mk3 mk3Var = nk3Var.f0[0];
                                    if (mk3Var != null) {
                                        int i3 = mk3Var.d.h;
                                        if (i3 != 7) {
                                        }
                                    }
                                }
                            }
                        }
                        if (motionEvent != null) {
                            VelocityTracker velocityTracker = this.q0;
                            if (velocityTracker == null) {
                                velocityTracker = VelocityTracker.obtain();
                                this.q0 = velocityTracker;
                            }
                            velocityTracker.addMovement(motionEvent);
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && X()) {
                            nk3Var.o3 = true;
                            this.n0 = motionEvent.getPointerId(0);
                            int x = (int) motionEvent.getX();
                            this.o0 = x;
                            boolean z2 = nk3Var.k3;
                            mk3[] mk3VarArr = nk3Var.f0;
                            float f3 = x;
                            if (z2) {
                                float translationX = nk3Var.f0[0].getTranslationX() + mk3VarArr[0].getMeasuredWidth();
                                mk3[] mk3VarArr2 = nk3Var.f0;
                                if (f3 < translationX) {
                                    nk3Var.l3 = mk3VarArr2[0].getTranslationX();
                                } else {
                                    mk3 mk3Var2 = mk3VarArr2[0];
                                    mk3 mk3Var3 = mk3VarArr2[1];
                                    mk3VarArr2[0] = mk3Var3;
                                    mk3VarArr2[1] = mk3Var2;
                                    nk3Var.k3 = false;
                                    nk3Var.l3 = mk3Var3.getTranslationX();
                                    nk3Var.A0.h(1.0f, nk3Var.f0[0].h);
                                    nk3Var.A0.h(nk3Var.l3 / r10[0].getMeasuredWidth(), nk3Var.f0[1].h);
                                    nk3Var.n5(true);
                                    nk3Var.f0[0].d.getClass();
                                    nk3Var.f0[1].d.getClass();
                                }
                            } else {
                                float translationX2 = nk3Var.f0[1].getTranslationX() + mk3VarArr[1].getMeasuredWidth();
                                mk3[] mk3VarArr3 = nk3Var.f0;
                                if (f3 < translationX2) {
                                    mk3 mk3Var4 = mk3VarArr3[0];
                                    mk3 mk3Var5 = mk3VarArr3[1];
                                    mk3VarArr3[0] = mk3Var5;
                                    mk3VarArr3[1] = mk3Var4;
                                    nk3Var.k3 = true;
                                    nk3Var.l3 = mk3Var5.getTranslationX();
                                    nk3Var.A0.h(1.0f, nk3Var.f0[0].h);
                                    nk3Var.A0.h((-nk3Var.l3) / r10[0].getMeasuredWidth(), nk3Var.f0[1].h);
                                    nk3Var.n5(true);
                                    nk3Var.f0[0].d.getClass();
                                    nk3Var.f0[1].d.getClass();
                                } else {
                                    nk3Var.l3 = mk3VarArr3[0].getTranslationX();
                                }
                            }
                            nk3Var.i3.removeAllListeners();
                            nk3Var.i3.cancel();
                            nk3Var.j3 = false;
                        } else if (motionEvent != null && motionEvent.getAction() == 0) {
                            nk3Var.l3 = 0.0f;
                        }
                        if (motionEvent != null && motionEvent.getAction() == 0 && !nk3Var.o3 && !nk3Var.p3 && nk3Var.A0.getVisibility() == 0) {
                            this.n0 = motionEvent.getPointerId(0);
                            nk3Var.p3 = true;
                            this.o0 = (int) motionEvent.getX();
                            this.p0 = (int) motionEvent.getY();
                            this.q0.clear();
                        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.n0) {
                            int x2 = (int) ((motionEvent.getX() - this.o0) + nk3Var.l3);
                            int abs = Math.abs(((int) motionEvent.getY()) - this.p0);
                            if (nk3Var.o3 && (!nk3Var.k3 ? x2 < 0 : x2 > 0)) {
                                if (!a0(motionEvent, x2 < 0)) {
                                    nk3Var.p3 = true;
                                    nk3Var.o3 = false;
                                    nk3Var.f0[0].setTranslationX(0.0f);
                                    nk3Var.f0[1].setTranslationX(nk3Var.k3 ? r6[0].getMeasuredWidth() : -r6[0].getMeasuredWidth());
                                    nk3Var.A0.h(0.0f, nk3Var.f0[1].h);
                                }
                            }
                            if (nk3Var.p3 && !nk3Var.o3) {
                                float Z0 = gm.Z0(true, 0.3f);
                                int x3 = (int) (motionEvent.getX() - this.o0);
                                if (Math.abs(x3) >= Z0 && Math.abs(x3) > abs) {
                                    a0(motionEvent, x2 < 0);
                                }
                            } else if (nk3Var.o3) {
                                nk3Var.f0[0].setTranslationX(x2);
                                boolean z3 = nk3Var.k3;
                                mk3[] mk3VarArr4 = nk3Var.f0;
                                if (z3) {
                                    mk3VarArr4[1].setTranslationX(mk3VarArr4[0].getMeasuredWidth() + x2);
                                } else {
                                    mk3VarArr4[1].setTranslationX(x2 - mk3VarArr4[0].getMeasuredWidth());
                                }
                                float abs2 = Math.abs(x2) / nk3Var.f0[0].getMeasuredWidth();
                                mk3 mk3Var6 = nk3Var.f0[1];
                                if (mk3Var6.F && abs2 > 0.3f) {
                                    dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    nk3Var.A0.l(nk3Var.f0[1].h);
                                    gm.d3(new ek3(this, objArr == true ? 1 : 0), 200L);
                                    return false;
                                }
                                nk3Var.A0.h(abs2, mk3Var6.h);
                            }
                        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.n0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                            this.q0.computeCurrentVelocity(1000, nk3Var.n3);
                            if (motionEvent == null || motionEvent.getAction() == 3) {
                                f = 0.0f;
                                f2 = 0.0f;
                            } else {
                                f = this.q0.getXVelocity();
                                f2 = this.q0.getYVelocity();
                                if (!nk3Var.o3 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                                    a0(motionEvent, f < 0.0f);
                                }
                            }
                            if (nk3Var.o3) {
                                float x4 = nk3Var.f0[0].getX();
                                nk3Var.i3 = new AnimatorSet();
                                if (nk3Var.f0[1].F) {
                                    nk3Var.m3 = true;
                                    z = true;
                                } else if (nk3Var.l3 != 0.0f) {
                                    float abs3 = Math.abs(f);
                                    boolean z4 = nk3Var.k3;
                                    if (abs3 > 1500.0f) {
                                        z = !z4 ? f >= 0.0f : f <= 0.0f;
                                        nk3Var.m3 = z;
                                    } else {
                                        mk3[] mk3VarArr5 = nk3Var.f0;
                                        if (z4) {
                                            z = mk3VarArr5[1].getX() > ((float) (nk3Var.f0[0].getMeasuredWidth() >> 1));
                                            nk3Var.m3 = z;
                                        } else {
                                            z = mk3VarArr5[0].getX() < ((float) (nk3Var.f0[0].getMeasuredWidth() >> 1));
                                            nk3Var.m3 = z;
                                        }
                                    }
                                } else {
                                    z = Math.abs(x4) < ((float) nk3Var.f0[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                                    nk3Var.m3 = z;
                                }
                                Property property = View.TRANSLATION_X;
                                if (z) {
                                    measuredWidth = Math.abs(x4);
                                    boolean z5 = nk3Var.k3;
                                    AnimatorSet animatorSet = nk3Var.i3;
                                    if (z5) {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(nk3Var.f0[0], (Property<mk3, Float>) property, 0.0f), ObjectAnimator.ofFloat(nk3Var.f0[1], (Property<mk3, Float>) property, r12.getMeasuredWidth()));
                                    } else {
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(nk3Var.f0[0], (Property<mk3, Float>) property, 0.0f), ObjectAnimator.ofFloat(nk3Var.f0[1], (Property<mk3, Float>) property, -r12.getMeasuredWidth()));
                                    }
                                } else {
                                    measuredWidth = nk3Var.f0[0].getMeasuredWidth() - Math.abs(x4);
                                    nk3Var.F5(nk3Var.f0[1].h, true);
                                    boolean z6 = nk3Var.k3;
                                    AnimatorSet animatorSet2 = nk3Var.i3;
                                    if (z6) {
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(nk3Var.f0[0], (Property<mk3, Float>) property, -r9.getMeasuredWidth()), ObjectAnimator.ofFloat(nk3Var.f0[1], (Property<mk3, Float>) property, 0.0f));
                                    } else {
                                        animatorSet2.playTogether(ObjectAnimator.ofFloat(nk3Var.f0[0], (Property<mk3, Float>) property, r9.getMeasuredWidth()), ObjectAnimator.ofFloat(nk3Var.f0[1], (Property<mk3, Float>) property, 0.0f));
                                    }
                                }
                                nk3Var.i3.setInterpolator(nk3.G4);
                                int measuredWidth2 = getMeasuredWidth();
                                float f4 = measuredWidth2 / 2;
                                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f4) + f4;
                                nk3Var.i3.setDuration(Math.max(nm7.f2, Math.min(Math.abs(f) > 0.0f ? Math.round(Math.abs(I / r5) * 1000.0f) << 2 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                                nk3Var.i3.addListener(new kh2(this, (byte) 11));
                                nk3Var.i3.start();
                                nk3Var.j3 = true;
                                nk3Var.o3 = false;
                            } else {
                                nk3Var.p3 = false;
                                aVar = ((d) nk3Var).actionBar;
                                aVar.setEnabled(true);
                                nk3Var.A0.setEnabled(true);
                            }
                            VelocityTracker velocityTracker2 = this.q0;
                            if (velocityTracker2 != null) {
                                velocityTracker2.recycle();
                                this.q0 = null;
                            }
                        }
                        return nk3Var.o3;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        nk3 nk3Var = this.u0;
        if (nk3Var.p3 && !nk3Var.o3) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
