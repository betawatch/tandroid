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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.Components.qt0 implements r0.l {
    public final /* synthetic */ int g0 = 1;
    public final d2.t0 h0;
    public boolean i0;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(org.telegram.ui.Wallet.w5 w5Var, Context context) {
        super(context, null);
        this.j0 = w5Var;
        this.h0 = new d2.t0();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.j0).r0;
        if (s5Var != null) {
            s5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.j0;
        ci.q qVar = w5Var.o0;
        return qVar != null && (qVar.getParent() instanceof View) && ((View) w5Var.o0.getParent()).getTop() <= w5Var.a.getPaddingTop();
    }

    /* JADX WARN: Finally extract failed */
    public int b0(org.telegram.ui.Components.l41 l41Var, int i3) {
        int[] iArr = {0};
        org.telegram.ui.Components.ji jiVar = new org.telegram.ui.Components.ji(iArr, 24);
        this.i0 = true;
        l41Var.j(jiVar);
        try {
            l41Var.scrollBy(0, i3);
            ArrayList arrayList = l41Var.x0;
            if (arrayList != null) {
                arrayList.remove(jiVar);
            }
            this.i0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = l41Var.x0;
            if (arrayList2 != null) {
                arrayList2.remove(jiVar);
            }
            this.i0 = false;
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
        org.telegram.ui.Wallet.a8 a8Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Wallet.a8 a8Var2;
        float f12;
        Iterator it;
        org.telegram.ui.Wallet.a8 a8Var3;
        org.telegram.ui.Wallet.a8 a8Var4;
        int i3;
        switch (this.g0) {
            case 1:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.j0;
                org.telegram.ui.Wallet.b8 b8Var = w5Var.k0;
                int i10 = 1;
                if (b8Var != null) {
                    org.telegram.ui.Wallet.t7 t7Var = b8Var.C1;
                    LinkedHashMap linkedHashMap = b8Var.f;
                    org.telegram.ui.Wallet.t7 t7Var2 = b8Var.B1;
                    boolean z13 = false;
                    if (!b8Var.b && ((a6Var = b8Var.c.E) == null || !a6Var.a || b8Var.q0 || b8Var.r0)) {
                        if (b8Var.b1 || b8Var.t0 || !b8Var.A()) {
                            z13 = b8Var.q0;
                        } else {
                            if (b8Var.i1) {
                                b8Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                b8Var.removeCallbacks(t7Var2);
                                b8Var.removeCallbacks(t7Var);
                                b8Var.h0 = null;
                                b8Var.p0 = false;
                                b8Var.j0 = false;
                                b8Var.o0 = false;
                                b8Var.n0 = false;
                                b8Var.r0 = false;
                                b8Var.q0 = false;
                                b8Var.w0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y9 = motionEvent.getY();
                                float[] fArr = {x10, y9};
                                b8Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.a8 a8Var5 = b8Var.i0;
                                if (a8Var5 != null && a8Var5.H == 2) {
                                    float P = (b8Var.P(a8Var5) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
                                    double radians = Math.toRadians(a8Var5.i.a);
                                    int i11 = -1;
                                    while (i11 <= i10) {
                                        int i12 = i10;
                                        float f13 = i11 * P;
                                        double d = radians;
                                        float[] L = b8Var.L((((float) Math.cos(d)) * f13) + a8Var5.e.a + a8Var5.n.a, (f13 * ((float) Math.sin(d))) + a8Var5.f.a + a8Var5.o.a);
                                        if (Utilities.t(x10, y9, L[0], L[i12 == true ? 1 : 0]) < org.telegram.messenger.g0.L(22.0f)) {
                                            z12 = i12 == true ? 1 : 0;
                                            z11 = i12;
                                            b8Var.j0 = z12;
                                            if (z12) {
                                                float f14 = fArr[0];
                                                float f15 = fArr[z11];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.a8 a8Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.a8 a8Var7 = (org.telegram.ui.Wallet.a8) it2.next();
                                                    if (a8Var7.H != 2 || Utilities.t(f14, f15, a8Var7.e.a, a8Var7.f.a) >= b8Var.P(a8Var7) * 0.44f) {
                                                        f12 = f15;
                                                        it = it2;
                                                    } else {
                                                        if (a8Var6 != null) {
                                                            f12 = f15;
                                                            it = it2;
                                                            if (a8Var7.I <= a8Var6.I) {
                                                            }
                                                        } else {
                                                            f12 = f15;
                                                            it = it2;
                                                        }
                                                        a8Var6 = a8Var7;
                                                    }
                                                    f15 = f12;
                                                    it2 = it;
                                                }
                                                a8Var2 = a8Var6;
                                            } else {
                                                a8Var2 = b8Var.i0;
                                            }
                                            b8Var.h0 = a8Var2;
                                            if (!b8Var.j0 && a8Var2 != b8Var.i0) {
                                                b8Var.i0 = null;
                                                b8Var.f0();
                                            }
                                            a8Var3 = b8Var.h0;
                                            b8Var.v0 = a8Var3 == null ? z11 : false;
                                            if (a8Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.a8 a8Var8 = (org.telegram.ui.Wallet.a8) it3.next();
                                                        RectF Z = b8Var.Z(a8Var8);
                                                        if (Z != null && Z.contains(x10, y9)) {
                                                            if (org.telegram.ui.Wallet.b8.b(a8Var8)) {
                                                                b8Var.s0 = (Math.abs(x10 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y9 - Z.centerY()) >= Z.height() * 0.35f) ? false : z11;
                                                                b8Var.h0 = a8Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            a8Var4 = b8Var.h0;
                                            if (a8Var4 == null && ((i3 = a8Var4.H) == 0 || i3 == 2)) {
                                                b8Var.y0 = x10;
                                                b8Var.z0 = y9;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.a8 a8Var9 = b8Var.h0;
                                                b8Var.L0 = a8Var9.H;
                                                b8Var.H0 = a8Var9.e.b;
                                                b8Var.I0 = a8Var9.f.b;
                                                b8Var.K0 = a8Var9.i.b;
                                                b8Var.J0 = a8Var9.h.b;
                                                VelocityTracker velocityTracker = b8Var.P0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                b8Var.P0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (b8Var.j0) {
                                                    b8Var.C0 = Float.NaN;
                                                    b8Var.F0 = Float.NaN;
                                                    b8Var.D0 = 0.0f;
                                                    org.telegram.ui.Wallet.a8 a8Var10 = b8Var.h0;
                                                    b8Var.E0 = a8Var10.i.b;
                                                    b8Var.M0 = false;
                                                    long j10 = b8Var.O0 + 1;
                                                    b8Var.O0 = j10;
                                                    a8Var10.I = j10;
                                                    b8Var.M(a8Var10, x10, y9);
                                                } else {
                                                    b8Var.postDelayed(t7Var2, b8Var.v0 ? 450L : 500L);
                                                }
                                                if (b8Var.v0) {
                                                    boolean z14 = z11;
                                                    b8Var.q0 = z14;
                                                    b8Var.getParent().requestDisallowInterceptTouchEvent(z14);
                                                    b8Var.f0();
                                                    z13 = z14;
                                                } else {
                                                    b8Var.r0 = z11;
                                                    b8Var.postDelayed(t7Var, 170L);
                                                }
                                            } else {
                                                b8Var.h0 = null;
                                            }
                                            z13 = false;
                                        } else {
                                            i11 += 2;
                                            i10 = i12 == true ? 1 : 0;
                                            radians = d;
                                        }
                                    }
                                }
                                z11 = i10;
                                z12 = false;
                                b8Var.j0 = z12;
                                if (z12) {
                                }
                                b8Var.h0 = a8Var2;
                                if (!b8Var.j0) {
                                    b8Var.i0 = null;
                                    b8Var.f0();
                                }
                                a8Var3 = b8Var.h0;
                                b8Var.v0 = a8Var3 == null ? z11 : false;
                                if (a8Var3 == null) {
                                }
                                a8Var4 = b8Var.h0;
                                if (a8Var4 == null) {
                                }
                                b8Var.h0 = null;
                                z13 = false;
                            } else {
                                if (b8Var.q0 || b8Var.r0) {
                                    VelocityTracker velocityTracker2 = b8Var.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(b8Var.w0);
                                    boolean z15 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == b8Var.w0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (b8Var.r0) {
                                            if (actionMasked != 2 || Utilities.t(x11, y10, b8Var.y0, b8Var.z0) <= ViewConfiguration.get(b8Var.getContext()).getScaledTouchSlop()) {
                                                z10 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                    b8Var.a();
                                                }
                                            } else if (b8Var.s0 && b8Var.h0.H == 0) {
                                                b8Var.r0 = false;
                                                b8Var.q0 = true;
                                                b8Var.removeCallbacks(t7Var);
                                                ((ka0) b8Var.d.b).X();
                                                b8Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                b8Var.W(b8Var.h0, x11, y10);
                                                b8Var.q(b8Var.h0, x11, y10);
                                                b8Var.f0();
                                            } else {
                                                z10 = false;
                                                b8Var.a();
                                            }
                                            z13 = z10;
                                        } else {
                                            if (actionMasked == 2 && (a8Var = b8Var.h0) != null) {
                                                if (b8Var.o0 || b8Var.j0) {
                                                    b8Var.M(a8Var, x11, y10);
                                                } else if (Utilities.t(x11, y10, b8Var.y0, b8Var.z0) > ViewConfiguration.get(b8Var.getContext()).getScaledTouchSlop()) {
                                                    b8Var.removeCallbacks(t7Var2);
                                                    if (!b8Var.n0 && (b8Var.v0 || b8Var.h0.H == 0)) {
                                                        b8Var.W(b8Var.h0, x11, y10);
                                                    }
                                                    if (b8Var.n0) {
                                                        b8Var.q(b8Var.h0, x11, y10);
                                                    }
                                                }
                                                b8Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                VelocityTracker velocityTracker3 = b8Var.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f10 = b8Var.P0.getXVelocity(b8Var.w0);
                                                    f11 = b8Var.P0.getYVelocity(b8Var.w0);
                                                } else {
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                b8Var.w(f10, f11, actionMasked == 3);
                                            }
                                        }
                                    } else if (b8Var.r0) {
                                        b8Var.a();
                                    } else {
                                        b8Var.w(0.0f, 0.0f, true);
                                    }
                                    z13 = true;
                                }
                                z13 = false;
                            }
                        }
                    }
                    if (z13) {
                        return true;
                    }
                }
                org.telegram.ui.Wallet.s5 s5Var2 = w5Var.r0;
                if (s5Var2 != null) {
                    s5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (s5Var = w5Var.r0) != null) {
                    org.telegram.ui.Wallet.l lVar = s5Var.i;
                    ai.h4 h4Var = s5Var.c;
                    if (h4Var != null) {
                        h4Var.removeCallbacks(lVar);
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
        switch (this.g0) {
            case 1:
                return this.h0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.k
    public final void m(int i3, View view) {
        switch (this.g0) {
            case 0:
                this.h0.a = 0;
                break;
            default:
                d2.t0 t0Var = this.h0;
                if (i3 == 1) {
                    t0Var.b = 0;
                } else {
                    t0Var.a = 0;
                }
                org.telegram.ui.Wallet.s5 s5Var = ((org.telegram.ui.Wallet.w5) this.j0).r0;
                if (s5Var != null) {
                    org.telegram.ui.Wallet.l lVar = s5Var.i;
                    ai.h4 h4Var = s5Var.c;
                    if (h4Var != null) {
                        h4Var.removeCallbacks(lVar);
                        s5Var.c.post(lVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        fa0 fa0Var;
        org.telegram.ui.Components.l41 y02;
        switch (this.g0) {
            case 0:
                la0 la0Var = (la0) this.j0;
                try {
                    if (view == la0Var.R && (fa0Var = la0Var.M0) != null && fa0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.tj0 currentListView = la0Var.M0.getCurrentListView();
                        int top = la0Var.M0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new fz(this, 19));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.j0;
                if (!this.i0 && i12 != 0 && (y02 = w5Var.y0()) != null) {
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
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
        switch (this.g0) {
            case 0:
                break;
            default:
                n(view, i3, i10, i11, i12, i13, new int[2]);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.g0) {
            case 0:
                la0 la0Var = (la0) this.j0;
                super.onLayout(z10, i3, i10, i11, i12);
                if (!z10) {
                    la0Var.K0(true);
                    break;
                } else {
                    la0Var.s0(this.i0);
                    this.i0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.j0;
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
                super.onMeasure(i3, i10);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.g0) {
            case 1:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.j0;
                if (view != w5Var.y0() || (s5Var = w5Var.r0) == null) {
                    return false;
                }
                return s5Var.a((int) f10, (int) f11);
            default:
                return super.onNestedPreFling(view, f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.g0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.k
    public final boolean p(View view, View view2, int i3, int i10) {
        switch (this.g0) {
            case 0:
                if (((la0) this.j0).M0 == null || i3 != 2) {
                }
                break;
            default:
                if ((i3 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // r0.k
    public final void s(View view, View view2, int i3, int i10) {
        switch (this.g0) {
            case 0:
                this.h0.a = i3;
                break;
            default:
                d2.t0 t0Var = this.h0;
                if (i10 != 1) {
                    t0Var.a = i3;
                    break;
                } else {
                    t0Var.b = i3;
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
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        fa0 fa0Var;
        org.telegram.ui.ActionBar.y4 y4Var;
        boolean z10;
        int i12;
        org.telegram.ui.Components.tj0 currentListView;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.Components.l41 y02;
        org.telegram.ui.Wallet.s5 s5Var;
        switch (this.g0) {
            case 0:
                la0 la0Var = (la0) this.j0;
                if (view == la0Var.R && (fa0Var = la0Var.M0) != null && fa0Var.isAttachedToWindow()) {
                    y4Var = ((org.telegram.ui.ActionBar.d2) la0Var).simpleActionBar;
                    boolean z11 = false;
                    if (y4Var != null) {
                        y4Var2 = ((org.telegram.ui.ActionBar.d2) la0Var).simpleActionBar;
                        if (y4Var2.G) {
                            z10 = true;
                            int top = la0Var.M0.getTop();
                            if (i10 < 0) {
                                if (z10) {
                                    org.telegram.ui.Components.tj0 currentListView2 = la0Var.M0.getCurrentListView();
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
                                if (top <= 0 && (currentListView = la0Var.M0.getCurrentListView()) != null) {
                                    int L0 = ((u4.b0) currentListView.getLayoutManager()).L0();
                                    if (L0 != -1) {
                                        u4.d1 K = currentListView.K(L0);
                                        int top2 = K != null ? K.a.getTop() : -1;
                                        int paddingTop = currentListView.getPaddingTop();
                                        if (top2 != paddingTop || L0 != 0) {
                                            iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
                                            currentListView.scrollBy(0, i10);
                                            z11 = true;
                                        }
                                    }
                                }
                                if (z10) {
                                    if (!z11 && top < 0) {
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
                    z10 = false;
                    int top3 = la0Var.M0.getTop();
                    if (i10 < 0) {
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.j0;
                if (!this.i0 && (y02 = w5Var.y0()) != null) {
                    if (i10 != 0 && i11 == 0 && ((view == w5Var.a || view == y02) && (s5Var = w5Var.r0) != null && s5Var.f)) {
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
    public ka0(la0 la0Var, Context context) {
        super(context, null);
        this.j0 = la0Var;
        this.i0 = true;
        this.h0 = new d2.t0();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
