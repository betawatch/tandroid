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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oa0 extends org.telegram.ui.Components.au0 implements r0.l {
    public final /* synthetic */ int g0 = 1;
    public final e2.r0 h0;
    public boolean i0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(org.telegram.ui.Wallet.n6 n6Var, Context context) {
        super(context, null);
        this.j0 = n6Var;
        this.h0 = new e2.r0();
    }

    public void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.j6 j6Var = ((org.telegram.ui.Wallet.n6) this.j0).t0;
        if (j6Var != null) {
            j6Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Finally extract failed */
    public int a0(org.telegram.ui.Components.e51 e51Var, int i7) {
        int[] iArr = {0};
        org.telegram.ui.Components.oa oaVar = new org.telegram.ui.Components.oa(iArr, 25);
        this.i0 = true;
        e51Var.j(oaVar);
        try {
            e51Var.scrollBy(0, i7);
            ArrayList arrayList = e51Var.x0;
            if (arrayList != null) {
                arrayList.remove(oaVar);
            }
            this.i0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = e51Var.x0;
            if (arrayList2 != null) {
                arrayList2.remove(oaVar);
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
        org.telegram.ui.Wallet.j6 j6Var;
        org.telegram.ui.Wallet.s6 s6Var;
        float f10;
        float f11;
        org.telegram.ui.Wallet.q8 q8Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Wallet.q8 q8Var2;
        float f12;
        Iterator it;
        org.telegram.ui.Wallet.q8 q8Var3;
        org.telegram.ui.Wallet.q8 q8Var4;
        int i7;
        switch (this.g0) {
            case 1:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.j0;
                org.telegram.ui.Wallet.r8 r8Var = n6Var.k0;
                int i10 = 1;
                if (r8Var != null) {
                    org.telegram.ui.Wallet.g8 g8Var = r8Var.C1;
                    LinkedHashMap linkedHashMap = r8Var.f;
                    org.telegram.ui.Wallet.g8 g8Var2 = r8Var.B1;
                    boolean z13 = false;
                    if (!r8Var.b && ((s6Var = r8Var.c.E) == null || !s6Var.a || r8Var.q0 || r8Var.r0)) {
                        if (r8Var.b1 || r8Var.t0 || !r8Var.A()) {
                            z13 = r8Var.q0;
                        } else {
                            if (r8Var.i1) {
                                r8Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                r8Var.removeCallbacks(g8Var2);
                                r8Var.removeCallbacks(g8Var);
                                r8Var.h0 = null;
                                r8Var.p0 = false;
                                r8Var.j0 = false;
                                r8Var.o0 = false;
                                r8Var.n0 = false;
                                r8Var.r0 = false;
                                r8Var.q0 = false;
                                r8Var.w0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y10 = motionEvent.getY();
                                float[] fArr = {x10, y10};
                                r8Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.q8 q8Var5 = r8Var.i0;
                                if (q8Var5 != null && q8Var5.H == 2) {
                                    float P = (r8Var.P(q8Var5) * 0.5f) + org.telegram.messenger.g0.L(9.0f);
                                    double radians = Math.toRadians(q8Var5.i.a);
                                    int i11 = -1;
                                    while (i11 <= i10) {
                                        int i12 = i10;
                                        float f13 = i11 * P;
                                        double d = radians;
                                        float[] L = r8Var.L((((float) Math.cos(d)) * f13) + q8Var5.e.a + q8Var5.n.a, (f13 * ((float) Math.sin(d))) + q8Var5.f.a + q8Var5.o.a);
                                        if (Utilities.t(x10, y10, L[0], L[i12 == true ? 1 : 0]) < org.telegram.messenger.g0.L(22.0f)) {
                                            z12 = i12 == true ? 1 : 0;
                                            z11 = i12;
                                            r8Var.j0 = z12;
                                            if (z12) {
                                                float f14 = fArr[0];
                                                float f15 = fArr[z11];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.q8 q8Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.q8 q8Var7 = (org.telegram.ui.Wallet.q8) it2.next();
                                                    if (q8Var7.H != 2 || Utilities.t(f14, f15, q8Var7.e.a, q8Var7.f.a) >= r8Var.P(q8Var7) * 0.44f) {
                                                        f12 = f15;
                                                        it = it2;
                                                    } else {
                                                        if (q8Var6 != null) {
                                                            f12 = f15;
                                                            it = it2;
                                                            if (q8Var7.I <= q8Var6.I) {
                                                            }
                                                        } else {
                                                            f12 = f15;
                                                            it = it2;
                                                        }
                                                        q8Var6 = q8Var7;
                                                    }
                                                    f15 = f12;
                                                    it2 = it;
                                                }
                                                q8Var2 = q8Var6;
                                            } else {
                                                q8Var2 = r8Var.i0;
                                            }
                                            r8Var.h0 = q8Var2;
                                            if (!r8Var.j0 && q8Var2 != r8Var.i0) {
                                                r8Var.i0 = null;
                                                r8Var.f0();
                                            }
                                            q8Var3 = r8Var.h0;
                                            r8Var.v0 = q8Var3 == null ? z11 : false;
                                            if (q8Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.q8 q8Var8 = (org.telegram.ui.Wallet.q8) it3.next();
                                                        RectF Z = r8Var.Z(q8Var8);
                                                        if (Z != null && Z.contains(x10, y10)) {
                                                            if (org.telegram.ui.Wallet.r8.b(q8Var8)) {
                                                                r8Var.s0 = (Math.abs(x10 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y10 - Z.centerY()) >= Z.height() * 0.35f) ? false : z11;
                                                                r8Var.h0 = q8Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            q8Var4 = r8Var.h0;
                                            if (q8Var4 == null && ((i7 = q8Var4.H) == 0 || i7 == 2)) {
                                                r8Var.y0 = x10;
                                                r8Var.z0 = y10;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.q8 q8Var9 = r8Var.h0;
                                                r8Var.L0 = q8Var9.H;
                                                r8Var.H0 = q8Var9.e.b;
                                                r8Var.I0 = q8Var9.f.b;
                                                r8Var.K0 = q8Var9.i.b;
                                                r8Var.J0 = q8Var9.h.b;
                                                VelocityTracker velocityTracker = r8Var.P0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                r8Var.P0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (r8Var.j0) {
                                                    r8Var.C0 = Float.NaN;
                                                    r8Var.F0 = Float.NaN;
                                                    r8Var.D0 = 0.0f;
                                                    org.telegram.ui.Wallet.q8 q8Var10 = r8Var.h0;
                                                    r8Var.E0 = q8Var10.i.b;
                                                    r8Var.M0 = false;
                                                    long j3 = r8Var.O0 + 1;
                                                    r8Var.O0 = j3;
                                                    q8Var10.I = j3;
                                                    r8Var.M(q8Var10, x10, y10);
                                                } else {
                                                    r8Var.postDelayed(g8Var2, r8Var.v0 ? 450L : 500L);
                                                }
                                                if (r8Var.v0) {
                                                    boolean z14 = z11;
                                                    r8Var.q0 = z14;
                                                    r8Var.getParent().requestDisallowInterceptTouchEvent(z14);
                                                    r8Var.f0();
                                                    z13 = z14;
                                                } else {
                                                    r8Var.r0 = z11;
                                                    r8Var.postDelayed(g8Var, 170L);
                                                }
                                            } else {
                                                r8Var.h0 = null;
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
                                r8Var.j0 = z12;
                                if (z12) {
                                }
                                r8Var.h0 = q8Var2;
                                if (!r8Var.j0) {
                                    r8Var.i0 = null;
                                    r8Var.f0();
                                }
                                q8Var3 = r8Var.h0;
                                r8Var.v0 = q8Var3 == null ? z11 : false;
                                if (q8Var3 == null) {
                                }
                                q8Var4 = r8Var.h0;
                                if (q8Var4 == null) {
                                }
                                r8Var.h0 = null;
                                z13 = false;
                            } else {
                                if (r8Var.q0 || r8Var.r0) {
                                    VelocityTracker velocityTracker2 = r8Var.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(r8Var.w0);
                                    boolean z15 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == r8Var.w0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y11 = motionEvent.getY(findPointerIndex);
                                        if (r8Var.r0) {
                                            if (actionMasked != 2 || Utilities.t(x11, y11, r8Var.y0, r8Var.z0) <= ViewConfiguration.get(r8Var.getContext()).getScaledTouchSlop()) {
                                                z10 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                    r8Var.a();
                                                }
                                            } else if (r8Var.s0 && r8Var.h0.H == 0) {
                                                r8Var.r0 = false;
                                                r8Var.q0 = true;
                                                r8Var.removeCallbacks(g8Var);
                                                ((oa0) r8Var.d.b).X();
                                                r8Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                r8Var.W(r8Var.h0, x11, y11);
                                                r8Var.q(r8Var.h0, x11, y11);
                                                r8Var.f0();
                                            } else {
                                                z10 = false;
                                                r8Var.a();
                                            }
                                            z13 = z10;
                                        } else {
                                            if (actionMasked == 2 && (q8Var = r8Var.h0) != null) {
                                                if (r8Var.o0 || r8Var.j0) {
                                                    r8Var.M(q8Var, x11, y11);
                                                } else if (Utilities.t(x11, y11, r8Var.y0, r8Var.z0) > ViewConfiguration.get(r8Var.getContext()).getScaledTouchSlop()) {
                                                    r8Var.removeCallbacks(g8Var2);
                                                    if (!r8Var.n0 && (r8Var.v0 || r8Var.h0.H == 0)) {
                                                        r8Var.W(r8Var.h0, x11, y11);
                                                    }
                                                    if (r8Var.n0) {
                                                        r8Var.q(r8Var.h0, x11, y11);
                                                    }
                                                }
                                                r8Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                VelocityTracker velocityTracker3 = r8Var.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f10 = r8Var.P0.getXVelocity(r8Var.w0);
                                                    f11 = r8Var.P0.getYVelocity(r8Var.w0);
                                                } else {
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                r8Var.w(f10, f11, actionMasked == 3);
                                            }
                                        }
                                    } else if (r8Var.r0) {
                                        r8Var.a();
                                    } else {
                                        r8Var.w(0.0f, 0.0f, true);
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
                org.telegram.ui.Wallet.j6 j6Var2 = n6Var.t0;
                if (j6Var2 != null) {
                    j6Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (j6Var = n6Var.t0) != null) {
                    org.telegram.ui.Wallet.m mVar = j6Var.i;
                    bi.d6 d6Var = j6Var.c;
                    if (d6Var != null) {
                        d6Var.removeCallbacks(mVar);
                        j6Var.c.post(mVar);
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
    public final void k(int i7, View view) {
        switch (this.g0) {
            case 0:
                this.h0.a = 0;
                break;
            default:
                e2.r0 r0Var = this.h0;
                if (i7 == 1) {
                    r0Var.b = 0;
                } else {
                    r0Var.a = 0;
                }
                org.telegram.ui.Wallet.j6 j6Var = ((org.telegram.ui.Wallet.n6) this.j0).t0;
                if (j6Var != null) {
                    org.telegram.ui.Wallet.m mVar = j6Var.i;
                    bi.d6 d6Var = j6Var.c;
                    if (d6Var != null) {
                        d6Var.removeCallbacks(mVar);
                        j6Var.c.post(mVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ja0 ja0Var;
        org.telegram.ui.Components.e51 B0;
        switch (this.g0) {
            case 0:
                pa0 pa0Var = (pa0) this.j0;
                try {
                    if (view == pa0Var.R && (ja0Var = pa0Var.R0) != null && ja0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.ck0 currentListView = pa0Var.R0.getCurrentListView();
                        int top = pa0Var.R0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i12;
                            currentListView.scrollBy(0, i12);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.g3(new lz(this, 20));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.j0;
                if (!this.i0 && i12 != 0 && (B0 = n6Var.B0()) != null) {
                    if (view != n6Var.a || !n6Var.E0()) {
                        if (view == B0 && i12 < 0) {
                            iArr[1] = a0(n6Var.a, i12) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = a0(B0, i12) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
        switch (this.g0) {
            case 0:
                break;
            default:
                l(view, i7, i10, i11, i12, i13, new int[2]);
                break;
        }
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        switch (this.g0) {
            case 0:
                if (((pa0) this.j0).R0 == null || i7 != 2) {
                }
                break;
            default:
                if ((i7 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.au0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.g0) {
            case 0:
                pa0 pa0Var = (pa0) this.j0;
                super.onLayout(z10, i7, i10, i11, i12);
                if (!z10) {
                    pa0Var.N0(true);
                    break;
                } else {
                    pa0Var.s0(this.i0);
                    this.i0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.g0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i10) * 0.75f);
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.j0;
                if (n6Var.r != size) {
                    n6Var.r = size;
                    org.telegram.ui.Wallet.b6 b6Var = n6Var.e;
                    if (b6Var != null) {
                        b6Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.y5 y5Var = n6Var.f;
                    if (y5Var != null) {
                        y5Var.requestLayout();
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
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.g0) {
            case 1:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.j0;
                if (view != n6Var.B0() || (j6Var = n6Var.t0) == null) {
                    return false;
                }
                return j6Var.a((int) f10, (int) f11);
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
    public final void r(View view, View view2, int i7, int i10) {
        switch (this.g0) {
            case 0:
                this.h0.a = i7;
                break;
            default:
                e2.r0 r0Var = this.h0;
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
        org.telegram.ui.ActionBar.a5 a5Var;
        boolean z10;
        int i12;
        org.telegram.ui.Components.ck0 currentListView;
        org.telegram.ui.ActionBar.a5 a5Var2;
        org.telegram.ui.Components.e51 B0;
        org.telegram.ui.Wallet.j6 j6Var;
        switch (this.g0) {
            case 0:
                pa0 pa0Var = (pa0) this.j0;
                if (view == pa0Var.R && (ja0Var = pa0Var.R0) != null && ja0Var.isAttachedToWindow()) {
                    a5Var = ((org.telegram.ui.ActionBar.h2) pa0Var).simpleActionBar;
                    boolean z11 = false;
                    if (a5Var != null) {
                        a5Var2 = ((org.telegram.ui.ActionBar.h2) pa0Var).simpleActionBar;
                        if (a5Var2.G) {
                            z10 = true;
                            int top = pa0Var.R0.getTop();
                            if (i10 < 0) {
                                if (z10) {
                                    org.telegram.ui.Components.ck0 currentListView2 = pa0Var.R0.getCurrentListView();
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
                                if (top <= 0 && (currentListView = pa0Var.R0.getCurrentListView()) != null) {
                                    int L0 = ((v4.c0) currentListView.getLayoutManager()).L0();
                                    if (L0 != -1) {
                                        v4.f1 K = currentListView.K(L0);
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
                    int top3 = pa0Var.R0.getTop();
                    if (i10 < 0) {
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.j0;
                if (!this.i0 && (B0 = n6Var.B0()) != null) {
                    if (i10 != 0 && i11 == 0 && ((view == n6Var.a || view == B0) && (j6Var = n6Var.t0) != null && j6Var.f)) {
                        j6Var.d = true;
                    }
                    if (view != n6Var.a || i10 >= 0 || !n6Var.E0()) {
                        if (view == B0 && i10 > 0) {
                            iArr[1] = a0(n6Var.a, i10) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = a0(B0, i10) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(pa0 pa0Var, Context context) {
        super(context, null);
        this.j0 = pa0Var;
        this.i0 = true;
        this.h0 = new e2.r0();
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
