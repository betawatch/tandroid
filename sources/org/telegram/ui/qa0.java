package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qa0 extends org.telegram.ui.Components.tt0 implements r0.l {
    public final /* synthetic */ int f0 = 1;
    public final e2.r0 g0;
    public boolean h0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(org.telegram.ui.Wallet.w5 w5Var, Context context) {
        super(context, null);
        this.i0 = w5Var;
        this.g0 = new e2.r0();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.i0).q0;
        if (s5Var != null) {
            s5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.i0;
        bi.t tVar = w5Var.n0;
        return tVar != null && (tVar.getParent() instanceof View) && ((View) w5Var.n0.getParent()).getTop() <= w5Var.a.getPaddingTop();
    }

    /* JADX WARN: Finally extract failed */
    public int b0(org.telegram.ui.Components.r41 r41Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.ui uiVar = new org.telegram.ui.Components.ui(iArr, 22);
        this.h0 = true;
        r41Var.j(uiVar);
        try {
            r41Var.scrollBy(0, i7);
            ArrayList arrayList = r41Var.w0;
            if (arrayList != null) {
                arrayList.remove(uiVar);
            }
            this.h0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = r41Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(uiVar);
            }
            this.h0 = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0171  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v6 */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.s5 s5Var;
        org.telegram.ui.Wallet.a6 a6Var;
        float f10;
        float f11;
        org.telegram.ui.Wallet.z7 z7Var;
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Wallet.z7 z7Var2;
        float f12;
        Iterator it;
        org.telegram.ui.Wallet.z7 z7Var3;
        org.telegram.ui.Wallet.z7 z7Var4;
        int i7;
        switch (this.f0) {
            case 1:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.i0;
                org.telegram.ui.Wallet.a8 a8Var = w5Var.j0;
                int i10 = 1;
                if (a8Var != null) {
                    org.telegram.ui.Wallet.s7 s7Var = a8Var.B1;
                    LinkedHashMap linkedHashMap = a8Var.f;
                    org.telegram.ui.Wallet.s7 s7Var2 = a8Var.A1;
                    boolean z12 = false;
                    if (!a8Var.b && ((a6Var = a8Var.c.D) == null || !a6Var.a || a8Var.p0 || a8Var.q0)) {
                        if (a8Var.a1 || a8Var.s0 || !a8Var.A()) {
                            z12 = a8Var.p0;
                        } else {
                            if (a8Var.h1) {
                                a8Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                a8Var.removeCallbacks(s7Var2);
                                a8Var.removeCallbacks(s7Var);
                                a8Var.g0 = null;
                                a8Var.o0 = false;
                                a8Var.i0 = false;
                                a8Var.n0 = false;
                                a8Var.m0 = false;
                                a8Var.q0 = false;
                                a8Var.p0 = false;
                                a8Var.v0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                float[] fArr = {x10, y10};
                                a8Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.z7 z7Var5 = a8Var.h0;
                                if (z7Var5 != null && z7Var5.H == 2) {
                                    float P = (a8Var.P(z7Var5) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
                                    double radians = Math.toRadians(z7Var5.i.a);
                                    int i11 = -1;
                                    while (i11 <= i10) {
                                        int i12 = i10;
                                        float f13 = i11 * P;
                                        double d = radians;
                                        float[] L = a8Var.L((((float) Math.cos(d)) * f13) + z7Var5.e.a + z7Var5.n.a, (f13 * ((float) Math.sin(d))) + z7Var5.f.a + z7Var5.o.a);
                                        if (Utilities.t(x10, y10, L[0], L[i12 == true ? 1 : 0]) < org.telegram.messenger.g0.L(22.0f)) {
                                            z11 = i12 == true ? 1 : 0;
                                            z10 = i12;
                                            a8Var.i0 = z11;
                                            if (z11) {
                                                float f14 = fArr[0];
                                                float f15 = fArr[z10];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.z7 z7Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.z7 z7Var7 = (org.telegram.ui.Wallet.z7) it2.next();
                                                    if (z7Var7.H != 2 || Utilities.t(f14, f15, z7Var7.e.a, z7Var7.f.a) >= a8Var.P(z7Var7) * 0.44f) {
                                                        f12 = f15;
                                                        it = it2;
                                                    } else {
                                                        if (z7Var6 != null) {
                                                            f12 = f15;
                                                            it = it2;
                                                            if (z7Var7.I <= z7Var6.I) {
                                                            }
                                                        } else {
                                                            f12 = f15;
                                                            it = it2;
                                                        }
                                                        z7Var6 = z7Var7;
                                                    }
                                                    f15 = f12;
                                                    it2 = it;
                                                }
                                                z7Var2 = z7Var6;
                                            } else {
                                                z7Var2 = a8Var.h0;
                                            }
                                            a8Var.g0 = z7Var2;
                                            if (!a8Var.i0 && z7Var2 != a8Var.h0) {
                                                a8Var.h0 = null;
                                                a8Var.f0();
                                            }
                                            z7Var3 = a8Var.g0;
                                            a8Var.u0 = z7Var3 == null ? z10 : false;
                                            if (z7Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.z7 z7Var8 = (org.telegram.ui.Wallet.z7) it3.next();
                                                        RectF Z = a8Var.Z(z7Var8);
                                                        if (Z != null && Z.contains(x10, y10)) {
                                                            if (org.telegram.ui.Wallet.a8.b(z7Var8)) {
                                                                a8Var.r0 = (Math.abs(x10 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y10 - Z.centerY()) >= Z.height() * 0.35f) ? false : z10;
                                                                a8Var.g0 = z7Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z7Var4 = a8Var.g0;
                                            if (z7Var4 == null && ((i7 = z7Var4.H) == 0 || i7 == 2)) {
                                                a8Var.x0 = x10;
                                                a8Var.y0 = y10;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.z7 z7Var9 = a8Var.g0;
                                                a8Var.K0 = z7Var9.H;
                                                a8Var.G0 = z7Var9.e.b;
                                                a8Var.H0 = z7Var9.f.b;
                                                a8Var.J0 = z7Var9.i.b;
                                                a8Var.I0 = z7Var9.h.b;
                                                VelocityTracker velocityTracker = a8Var.O0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                a8Var.O0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (a8Var.i0) {
                                                    a8Var.B0 = Float.NaN;
                                                    a8Var.E0 = Float.NaN;
                                                    a8Var.C0 = 0.0f;
                                                    org.telegram.ui.Wallet.z7 z7Var10 = a8Var.g0;
                                                    a8Var.D0 = z7Var10.i.b;
                                                    a8Var.L0 = false;
                                                    long j3 = a8Var.N0 + 1;
                                                    a8Var.N0 = j3;
                                                    z7Var10.I = j3;
                                                    a8Var.M(z7Var10, x10, y10);
                                                } else {
                                                    a8Var.postDelayed(s7Var2, a8Var.u0 ? 450L : 500L);
                                                }
                                                if (a8Var.u0) {
                                                    boolean z13 = z10;
                                                    a8Var.p0 = z13;
                                                    a8Var.getParent().requestDisallowInterceptTouchEvent(z13);
                                                    a8Var.f0();
                                                    z12 = z13;
                                                } else {
                                                    a8Var.q0 = z10;
                                                    a8Var.postDelayed(s7Var, 170L);
                                                }
                                            } else {
                                                a8Var.g0 = null;
                                            }
                                            z12 = false;
                                        } else {
                                            i11 += 2;
                                            i10 = i12 == true ? 1 : 0;
                                            radians = d;
                                        }
                                    }
                                }
                                z10 = i10;
                                z11 = false;
                                a8Var.i0 = z11;
                                if (z11) {
                                }
                                a8Var.g0 = z7Var2;
                                if (!a8Var.i0) {
                                    a8Var.h0 = null;
                                    a8Var.f0();
                                }
                                z7Var3 = a8Var.g0;
                                a8Var.u0 = z7Var3 == null ? z10 : false;
                                if (z7Var3 == null) {
                                }
                                z7Var4 = a8Var.g0;
                                if (z7Var4 == null) {
                                }
                                a8Var.g0 = null;
                                z12 = false;
                            } else {
                                if (a8Var.p0 || a8Var.q0) {
                                    VelocityTracker velocityTracker2 = a8Var.O0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(a8Var.v0);
                                    boolean z14 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == a8Var.v0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y11 = motionEvent.getY(findPointerIndex);
                                        if (a8Var.q0) {
                                            if (actionMasked != 2 || Utilities.t(x11, y11, a8Var.x0, a8Var.y0) <= ViewConfiguration.get(a8Var.getContext()).getScaledTouchSlop()) {
                                                z9 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                    a8Var.a();
                                                }
                                            } else if (a8Var.r0 && a8Var.g0.H == 0) {
                                                a8Var.q0 = false;
                                                a8Var.p0 = true;
                                                a8Var.removeCallbacks(s7Var);
                                                ((qa0) a8Var.d.a).X();
                                                a8Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                a8Var.W(a8Var.g0, x11, y11);
                                                a8Var.q(a8Var.g0, x11, y11);
                                                a8Var.f0();
                                            } else {
                                                z9 = false;
                                                a8Var.a();
                                            }
                                            z12 = z9;
                                        } else {
                                            if (actionMasked == 2 && (z7Var = a8Var.g0) != null) {
                                                if (a8Var.n0 || a8Var.i0) {
                                                    a8Var.M(z7Var, x11, y11);
                                                } else if (Utilities.t(x11, y11, a8Var.x0, a8Var.y0) > ViewConfiguration.get(a8Var.getContext()).getScaledTouchSlop()) {
                                                    a8Var.removeCallbacks(s7Var2);
                                                    if (!a8Var.m0 && (a8Var.u0 || a8Var.g0.H == 0)) {
                                                        a8Var.W(a8Var.g0, x11, y11);
                                                    }
                                                    if (a8Var.m0) {
                                                        a8Var.q(a8Var.g0, x11, y11);
                                                    }
                                                }
                                                a8Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                VelocityTracker velocityTracker3 = a8Var.O0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f10 = a8Var.O0.getXVelocity(a8Var.v0);
                                                    f11 = a8Var.O0.getYVelocity(a8Var.v0);
                                                } else {
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                a8Var.w(f10, f11, actionMasked == 3);
                                            }
                                        }
                                    } else if (a8Var.q0) {
                                        a8Var.a();
                                    } else {
                                        a8Var.w(0.0f, 0.0f, true);
                                    }
                                    z12 = true;
                                }
                                z12 = false;
                            }
                        }
                    }
                    if (z12) {
                        return true;
                    }
                }
                org.telegram.ui.Wallet.s5 s5Var2 = w5Var.q0;
                if (s5Var2 != null) {
                    s5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (s5Var = w5Var.q0) != null) {
                    org.telegram.ui.Wallet.l lVar = s5Var.i;
                    fi.w3 w3Var = s5Var.c;
                    if (w3Var != null) {
                        w3Var.removeCallbacks(lVar);
                        s5Var.c.post(lVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        switch (this.f0) {
            case 1:
                return this.g0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        switch (this.f0) {
            case 0:
                this.g0.a = 0;
                break;
            default:
                e2.r0 r0Var = this.g0;
                if (i7 == 1) {
                    r0Var.b = 0;
                } else {
                    r0Var.a = 0;
                }
                org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.i0).q0;
                if (s5Var != null) {
                    org.telegram.ui.Wallet.l lVar = s5Var.i;
                    fi.w3 w3Var = s5Var.c;
                    if (w3Var != null) {
                        w3Var.removeCallbacks(lVar);
                        s5Var.c.post(lVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        la0 la0Var;
        org.telegram.ui.Components.r41 y02;
        switch (this.f0) {
            case 0:
                ra0 ra0Var = (ra0) this.i0;
                try {
                    if (view == ra0Var.Q && (la0Var = ra0Var.L0) != null && la0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.qj0 currentListView = ra0Var.L0.getCurrentListView();
                        int top = ra0Var.L0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new jz(this, 20));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.i0;
                if (!this.h0 && i12 != 0 && (y02 = w5Var.y0()) != null) {
                    if (view != w5Var.a || !Y()) {
                        if (view == y02 && i12 < 0) {
                            iArr[1] = b0(w5Var.a, i12) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = b0(y02, i12) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        switch (this.f0) {
            case 0:
                break;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                break;
        }
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.f0) {
            case 0:
                if (((ra0) this.i0).L0 == null || i7 != 2) {
                }
                break;
            default:
                if ((i7 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f0) {
            case 0:
                ra0 ra0Var = (ra0) this.i0;
                super.onLayout(z9, i7, i10, i11, i12);
                if (!z9) {
                    ra0Var.K0(true);
                    break;
                } else {
                    ra0Var.s0(this.h0);
                    this.h0 = false;
                    break;
                }
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.f0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.i0;
                if (w5Var.r != size) {
                    w5Var.r = size;
                    org.telegram.ui.Wallet.k5 k5Var = w5Var.e;
                    if (k5Var != null) {
                        k5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.h5 h5Var = w5Var.f;
                    if (h5Var != null) {
                        h5Var.requestLayout();
                    }
                }
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.f0) {
            case 1:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.i0;
                if (view != w5Var.y0() || (s5Var = w5Var.q0) == null) {
                    return false;
                }
                return s5Var.a((int) f10, (int) f11);
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.f0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.f0) {
            case 0:
                this.g0.a = i7;
                break;
            default:
                e2.r0 r0Var = this.g0;
                if (i10 != 1) {
                    r0Var.a = i7;
                    break;
                } else {
                    r0Var.b = i7;
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    @Override // r0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        la0 la0Var;
        org.telegram.ui.ActionBar.y4 y4Var;
        boolean z9;
        int i12;
        org.telegram.ui.Components.qj0 currentListView;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.Components.r41 y02;
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.f0) {
            case 0:
                ra0 ra0Var = (ra0) this.i0;
                if (view == ra0Var.Q && (la0Var = ra0Var.L0) != null && la0Var.isAttachedToWindow()) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) ra0Var).simpleActionBar;
                    boolean z10 = false;
                    if (y4Var != null) {
                        y4Var2 = ((org.telegram.ui.ActionBar.f2) ra0Var).simpleActionBar;
                        if (y4Var2.F) {
                            z9 = true;
                            int top = ra0Var.L0.getTop();
                            if (i10 < 0) {
                                if (z9) {
                                    org.telegram.ui.Components.qj0 currentListView2 = ra0Var.L0.getCurrentListView();
                                    iArr[1] = i10;
                                    if (top > 0) {
                                        iArr[1] = 0;
                                    }
                                    if (currentListView2 != null && (i12 = iArr[1]) > 0) {
                                        currentListView2.scrollBy(0, i12);
                                        break;
                                    }
                                }
                            } else {
                                if (top <= 0 && (currentListView = ra0Var.L0.getCurrentListView()) != null) {
                                    int L0 = ((v4.b0) currentListView.getLayoutManager()).L0();
                                    if (L0 != -1) {
                                        v4.d1 K = currentListView.K(L0);
                                        int top2 = K != null ? K.a.getTop() : -1;
                                        int paddingTop = currentListView.getPaddingTop();
                                        if (top2 != paddingTop || L0 != 0) {
                                            iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
                                            currentListView.scrollBy(0, i10);
                                            z10 = true;
                                        }
                                    }
                                }
                                if (z9) {
                                    if (!z10 && top < 0) {
                                        iArr[1] = i10 - Math.max(top, i10);
                                        break;
                                    } else {
                                        iArr[1] = i10;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z9 = false;
                    int top3 = ra0Var.L0.getTop();
                    if (i10 < 0) {
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.i0;
                if (!this.h0 && (y02 = w5Var.y0()) != null) {
                    if (i10 != 0 && i11 == 0 && ((view == w5Var.a || view == y02) && (s5Var = w5Var.q0) != null && s5Var.f)) {
                        s5Var.d = true;
                    }
                    if (view != w5Var.a || i10 >= 0 || !Y()) {
                        if (view == y02 && i10 > 0) {
                            iArr[1] = b0(w5Var.a, i10) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = b0(y02, i10) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(ra0 ra0Var, Context context) {
        super(context, null);
        this.i0 = ra0Var;
        this.h0 = true;
        this.g0 = new e2.r0();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
