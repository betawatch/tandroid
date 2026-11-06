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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class oa0 extends org.telegram.ui.Components.rt0 implements r0.l {
    public final /* synthetic */ int f0 = 1;
    public final e2.r0 g0;
    public boolean h0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(org.telegram.ui.Wallet.y5 y5Var, Context context) {
        super(context, null);
        this.i0 = y5Var;
        this.g0 = new e2.r0();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.u5 u5Var = ((org.telegram.ui.Wallet.y5) this.i0).q0;
        if (u5Var != null) {
            u5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Y() {
        org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.i0;
        bi.t tVar = y5Var.n0;
        return tVar != null && (tVar.getParent() instanceof View) && ((View) y5Var.n0.getParent()).getTop() <= y5Var.a.getPaddingTop();
    }

    /* JADX WARN: Finally extract failed */
    public int b0(org.telegram.ui.Components.q41 q41Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.ui uiVar = new org.telegram.ui.Components.ui(iArr, 22);
        this.h0 = true;
        q41Var.j(uiVar);
        try {
            q41Var.scrollBy(0, i7);
            ArrayList arrayList = q41Var.w0;
            if (arrayList != null) {
                arrayList.remove(uiVar);
            }
            this.h0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = q41Var.w0;
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
        org.telegram.ui.Wallet.u5 u5Var;
        org.telegram.ui.Wallet.c6 c6Var;
        float f10;
        float f11;
        org.telegram.ui.Wallet.b8 b8Var;
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Wallet.b8 b8Var2;
        float f12;
        Iterator it;
        org.telegram.ui.Wallet.b8 b8Var3;
        org.telegram.ui.Wallet.b8 b8Var4;
        int i7;
        switch (this.f0) {
            case 1:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.i0;
                org.telegram.ui.Wallet.c8 c8Var = y5Var.j0;
                int i10 = 1;
                if (c8Var != null) {
                    org.telegram.ui.Wallet.u7 u7Var = c8Var.B1;
                    LinkedHashMap linkedHashMap = c8Var.f;
                    org.telegram.ui.Wallet.u7 u7Var2 = c8Var.A1;
                    boolean z12 = false;
                    if (!c8Var.b && ((c6Var = c8Var.c.D) == null || !c6Var.a || c8Var.p0 || c8Var.q0)) {
                        if (c8Var.a1 || c8Var.s0 || !c8Var.A()) {
                            z12 = c8Var.p0;
                        } else {
                            if (c8Var.h1) {
                                c8Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                c8Var.removeCallbacks(u7Var2);
                                c8Var.removeCallbacks(u7Var);
                                c8Var.g0 = null;
                                c8Var.o0 = false;
                                c8Var.i0 = false;
                                c8Var.n0 = false;
                                c8Var.m0 = false;
                                c8Var.q0 = false;
                                c8Var.p0 = false;
                                c8Var.v0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                float[] fArr = {x10, y10};
                                c8Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.b8 b8Var5 = c8Var.h0;
                                if (b8Var5 != null && b8Var5.H == 2) {
                                    float P = (c8Var.P(b8Var5) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
                                    double radians = Math.toRadians(b8Var5.i.a);
                                    int i11 = -1;
                                    while (i11 <= i10) {
                                        int i12 = i10;
                                        float f13 = i11 * P;
                                        double d = radians;
                                        float[] L = c8Var.L((((float) Math.cos(d)) * f13) + b8Var5.e.a + b8Var5.n.a, (f13 * ((float) Math.sin(d))) + b8Var5.f.a + b8Var5.o.a);
                                        if (Utilities.t(x10, y10, L[0], L[i12 == true ? 1 : 0]) < org.telegram.messenger.g0.L(22.0f)) {
                                            z11 = i12 == true ? 1 : 0;
                                            z10 = i12;
                                            c8Var.i0 = z11;
                                            if (z11) {
                                                float f14 = fArr[0];
                                                float f15 = fArr[z10];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.b8 b8Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.b8 b8Var7 = (org.telegram.ui.Wallet.b8) it2.next();
                                                    if (b8Var7.H != 2 || Utilities.t(f14, f15, b8Var7.e.a, b8Var7.f.a) >= c8Var.P(b8Var7) * 0.44f) {
                                                        f12 = f15;
                                                        it = it2;
                                                    } else {
                                                        if (b8Var6 != null) {
                                                            f12 = f15;
                                                            it = it2;
                                                            if (b8Var7.I <= b8Var6.I) {
                                                            }
                                                        } else {
                                                            f12 = f15;
                                                            it = it2;
                                                        }
                                                        b8Var6 = b8Var7;
                                                    }
                                                    f15 = f12;
                                                    it2 = it;
                                                }
                                                b8Var2 = b8Var6;
                                            } else {
                                                b8Var2 = c8Var.h0;
                                            }
                                            c8Var.g0 = b8Var2;
                                            if (!c8Var.i0 && b8Var2 != c8Var.h0) {
                                                c8Var.h0 = null;
                                                c8Var.f0();
                                            }
                                            b8Var3 = c8Var.g0;
                                            c8Var.u0 = b8Var3 == null ? z10 : false;
                                            if (b8Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.b8 b8Var8 = (org.telegram.ui.Wallet.b8) it3.next();
                                                        RectF Z = c8Var.Z(b8Var8);
                                                        if (Z != null && Z.contains(x10, y10)) {
                                                            if (org.telegram.ui.Wallet.c8.b(b8Var8)) {
                                                                c8Var.r0 = (Math.abs(x10 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y10 - Z.centerY()) >= Z.height() * 0.35f) ? false : z10;
                                                                c8Var.g0 = b8Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            b8Var4 = c8Var.g0;
                                            if (b8Var4 == null && ((i7 = b8Var4.H) == 0 || i7 == 2)) {
                                                c8Var.x0 = x10;
                                                c8Var.y0 = y10;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.b8 b8Var9 = c8Var.g0;
                                                c8Var.K0 = b8Var9.H;
                                                c8Var.G0 = b8Var9.e.b;
                                                c8Var.H0 = b8Var9.f.b;
                                                c8Var.J0 = b8Var9.i.b;
                                                c8Var.I0 = b8Var9.h.b;
                                                VelocityTracker velocityTracker = c8Var.O0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                c8Var.O0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (c8Var.i0) {
                                                    c8Var.B0 = Float.NaN;
                                                    c8Var.E0 = Float.NaN;
                                                    c8Var.C0 = 0.0f;
                                                    org.telegram.ui.Wallet.b8 b8Var10 = c8Var.g0;
                                                    c8Var.D0 = b8Var10.i.b;
                                                    c8Var.L0 = false;
                                                    long j3 = c8Var.N0 + 1;
                                                    c8Var.N0 = j3;
                                                    b8Var10.I = j3;
                                                    c8Var.M(b8Var10, x10, y10);
                                                } else {
                                                    c8Var.postDelayed(u7Var2, c8Var.u0 ? 450L : 500L);
                                                }
                                                if (c8Var.u0) {
                                                    boolean z13 = z10;
                                                    c8Var.p0 = z13;
                                                    c8Var.getParent().requestDisallowInterceptTouchEvent(z13);
                                                    c8Var.f0();
                                                    z12 = z13;
                                                } else {
                                                    c8Var.q0 = z10;
                                                    c8Var.postDelayed(u7Var, 170L);
                                                }
                                            } else {
                                                c8Var.g0 = null;
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
                                c8Var.i0 = z11;
                                if (z11) {
                                }
                                c8Var.g0 = b8Var2;
                                if (!c8Var.i0) {
                                    c8Var.h0 = null;
                                    c8Var.f0();
                                }
                                b8Var3 = c8Var.g0;
                                c8Var.u0 = b8Var3 == null ? z10 : false;
                                if (b8Var3 == null) {
                                }
                                b8Var4 = c8Var.g0;
                                if (b8Var4 == null) {
                                }
                                c8Var.g0 = null;
                                z12 = false;
                            } else {
                                if (c8Var.p0 || c8Var.q0) {
                                    VelocityTracker velocityTracker2 = c8Var.O0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(c8Var.v0);
                                    boolean z14 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == c8Var.v0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y11 = motionEvent.getY(findPointerIndex);
                                        if (c8Var.q0) {
                                            if (actionMasked != 2 || Utilities.t(x11, y11, c8Var.x0, c8Var.y0) <= ViewConfiguration.get(c8Var.getContext()).getScaledTouchSlop()) {
                                                z9 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                    c8Var.a();
                                                }
                                            } else if (c8Var.r0 && c8Var.g0.H == 0) {
                                                c8Var.q0 = false;
                                                c8Var.p0 = true;
                                                c8Var.removeCallbacks(u7Var);
                                                ((oa0) c8Var.d.a).X();
                                                c8Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                c8Var.W(c8Var.g0, x11, y11);
                                                c8Var.q(c8Var.g0, x11, y11);
                                                c8Var.f0();
                                            } else {
                                                z9 = false;
                                                c8Var.a();
                                            }
                                            z12 = z9;
                                        } else {
                                            if (actionMasked == 2 && (b8Var = c8Var.g0) != null) {
                                                if (c8Var.n0 || c8Var.i0) {
                                                    c8Var.M(b8Var, x11, y11);
                                                } else if (Utilities.t(x11, y11, c8Var.x0, c8Var.y0) > ViewConfiguration.get(c8Var.getContext()).getScaledTouchSlop()) {
                                                    c8Var.removeCallbacks(u7Var2);
                                                    if (!c8Var.m0 && (c8Var.u0 || c8Var.g0.H == 0)) {
                                                        c8Var.W(c8Var.g0, x11, y11);
                                                    }
                                                    if (c8Var.m0) {
                                                        c8Var.q(c8Var.g0, x11, y11);
                                                    }
                                                }
                                                c8Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z14) {
                                                VelocityTracker velocityTracker3 = c8Var.O0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f10 = c8Var.O0.getXVelocity(c8Var.v0);
                                                    f11 = c8Var.O0.getYVelocity(c8Var.v0);
                                                } else {
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                c8Var.w(f10, f11, actionMasked == 3);
                                            }
                                        }
                                    } else if (c8Var.q0) {
                                        c8Var.a();
                                    } else {
                                        c8Var.w(0.0f, 0.0f, true);
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
                org.telegram.ui.Wallet.u5 u5Var2 = y5Var.q0;
                if (u5Var2 != null) {
                    u5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (u5Var = y5Var.q0) != null) {
                    org.telegram.ui.Wallet.l lVar = u5Var.i;
                    fi.w3 w3Var = u5Var.c;
                    if (w3Var != null) {
                        w3Var.removeCallbacks(lVar);
                        u5Var.c.post(lVar);
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
                org.telegram.ui.Wallet.u5 u5Var = ((org.telegram.ui.Wallet.y5) this.i0).q0;
                if (u5Var != null) {
                    org.telegram.ui.Wallet.l lVar = u5Var.i;
                    fi.w3 w3Var = u5Var.c;
                    if (w3Var != null) {
                        w3Var.removeCallbacks(lVar);
                        u5Var.c.post(lVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ja0 ja0Var;
        org.telegram.ui.Components.q41 y02;
        switch (this.f0) {
            case 0:
                pa0 pa0Var = (pa0) this.i0;
                try {
                    if (view == pa0Var.Q && (ja0Var = pa0Var.L0) != null && ja0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.pj0 currentListView = pa0Var.L0.getCurrentListView();
                        int top = pa0Var.L0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new hz(this, 20));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.i0;
                if (!this.h0 && i12 != 0 && (y02 = y5Var.y0()) != null) {
                    if (view != y5Var.a || !Y()) {
                        if (view == y02 && i12 < 0) {
                            iArr[1] = b0(y5Var.a, i12) + iArr[1];
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
                if (((pa0) this.i0).L0 == null || i7 != 2) {
                }
                break;
            default:
                if ((i7 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f0) {
            case 0:
                pa0 pa0Var = (pa0) this.i0;
                super.onLayout(z9, i7, i10, i11, i12);
                if (!z9) {
                    pa0Var.K0(true);
                    break;
                } else {
                    pa0Var.s0(this.h0);
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
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.i0;
                if (y5Var.r != size) {
                    y5Var.r = size;
                    org.telegram.ui.Wallet.m5 m5Var = y5Var.e;
                    if (m5Var != null) {
                        m5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.j5 j5Var = y5Var.f;
                    if (j5Var != null) {
                        j5Var.requestLayout();
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
        org.telegram.ui.Wallet.u5 u5Var;
        switch (this.f0) {
            case 1:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.i0;
                if (view != y5Var.y0() || (u5Var = y5Var.q0) == null) {
                    return false;
                }
                return u5Var.a((int) f10, (int) f11);
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
        ja0 ja0Var;
        org.telegram.ui.ActionBar.y4 y4Var;
        boolean z9;
        int i12;
        org.telegram.ui.Components.pj0 currentListView;
        org.telegram.ui.ActionBar.y4 y4Var2;
        org.telegram.ui.Components.q41 y02;
        org.telegram.ui.Wallet.u5 u5Var;
        switch (this.f0) {
            case 0:
                pa0 pa0Var = (pa0) this.i0;
                if (view == pa0Var.Q && (ja0Var = pa0Var.L0) != null && ja0Var.isAttachedToWindow()) {
                    y4Var = ((org.telegram.ui.ActionBar.f2) pa0Var).simpleActionBar;
                    boolean z10 = false;
                    if (y4Var != null) {
                        y4Var2 = ((org.telegram.ui.ActionBar.f2) pa0Var).simpleActionBar;
                        if (y4Var2.F) {
                            z9 = true;
                            int top = pa0Var.L0.getTop();
                            if (i10 < 0) {
                                if (z9) {
                                    org.telegram.ui.Components.pj0 currentListView2 = pa0Var.L0.getCurrentListView();
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
                                if (top <= 0 && (currentListView = pa0Var.L0.getCurrentListView()) != null) {
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
                    int top3 = pa0Var.L0.getTop();
                    if (i10 < 0) {
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.i0;
                if (!this.h0 && (y02 = y5Var.y0()) != null) {
                    if (i10 != 0 && i11 == 0 && ((view == y5Var.a || view == y02) && (u5Var = y5Var.q0) != null && u5Var.f)) {
                        u5Var.d = true;
                    }
                    if (view != y5Var.a || i10 >= 0 || !Y()) {
                        if (view == y02 && i10 > 0) {
                            iArr[1] = b0(y5Var.a, i10) + iArr[1];
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
    public oa0(pa0 pa0Var, Context context) {
        super(context, null);
        this.i0 = pa0Var;
        this.h0 = true;
        this.g0 = new e2.r0();
    }

    private final void a0(View view) {
    }

    private final void Z(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
