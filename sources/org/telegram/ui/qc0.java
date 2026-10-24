package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qc0 extends org.telegram.ui.Components.ow0 implements r0.m {
    public final /* synthetic */ int w0 = 1;
    public final b2.u0 x0;
    public boolean y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(org.telegram.ui.Wallet.o5 o5Var, Context context) {
        super(context, null);
        this.z0 = o5Var;
        this.x0 = new b2.u0();
    }

    @Override // r0.l
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        ic0 ic0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        org.telegram.ui.Components.j71 t02;
        org.telegram.ui.Wallet.k5 k5Var;
        switch (this.w0) {
            case 0:
                sc0 sc0Var = (sc0) this.z0;
                if (viewGroup == sc0Var.U && (ic0Var = sc0Var.K0) != null && ic0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.o2) sc0Var).actionBar;
                    boolean z10 = kVar.n0;
                    int top = sc0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (z10) {
                            org.telegram.ui.Components.mm0 currentListView2 = sc0Var.K0.getCurrentListView();
                            iArr[1] = i11;
                            if (top > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                                currentListView2.scrollBy(0, i13);
                                break;
                            }
                        }
                    } else {
                        if (top <= 0 && (currentListView = sc0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
                                int top2 = K != null ? K.a.getTop() : -1;
                                int paddingTop = currentListView.getPaddingTop();
                                if (top2 != paddingTop || L0 != 0) {
                                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                break;
                            } else {
                                iArr[1] = i11;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.z0;
                if (!this.y0 && (t02 = o5Var.t0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == o5Var.a || viewGroup == t02) && (k5Var = o5Var.p0) != null && k5Var.f)) {
                        k5Var.d = true;
                    }
                    if (viewGroup != o5Var.a || i11 >= 0 || !Z()) {
                        if (viewGroup == t02 && i11 > 0) {
                            iArr[1] = c0(o5Var.a, i11) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = c0(t02, i11) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public void K(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                sc0 sc0Var = (sc0) this.z0;
                if (sc0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, sc0Var.U.getY());
                    sc0Var.K0.R(canvas, arrayList);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    public void Y() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        org.telegram.ui.Wallet.k5 k5Var = ((org.telegram.ui.Wallet.o5) this.z0).p0;
        if (k5Var != null) {
            k5Var.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean Z() {
        org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.z0;
        ai.r rVar = o5Var.m0;
        return rVar != null && (rVar.getParent() instanceof View) && ((View) o5Var.m0.getParent()).getTop() <= o5Var.a.getPaddingTop();
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.w0) {
            case 0:
                break;
            default:
                h(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    public int c0(org.telegram.ui.Components.j71 j71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kv kvVar = new org.telegram.ui.Components.kv(iArr, 15);
        this.y0 = true;
        j71Var.j(kvVar);
        try {
            j71Var.scrollBy(0, i10);
            ArrayList arrayList = j71Var.w0;
            if (arrayList != null) {
                arrayList.remove(kvVar);
            }
            this.y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = j71Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(kvVar);
            }
            this.y0 = false;
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
        org.telegram.ui.Wallet.k5 k5Var;
        org.telegram.ui.Wallet.s5 s5Var;
        float f7;
        float f10;
        org.telegram.ui.Wallet.s7 s7Var;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Wallet.s7 s7Var2;
        float f11;
        Iterator it;
        org.telegram.ui.Wallet.s7 s7Var3;
        org.telegram.ui.Wallet.s7 s7Var4;
        int i10;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.z0;
                org.telegram.ui.Wallet.t7 t7Var = o5Var.i0;
                int i11 = 1;
                if (t7Var != null) {
                    org.telegram.ui.Wallet.l7 l7Var = t7Var.B1;
                    LinkedHashMap linkedHashMap = t7Var.f;
                    org.telegram.ui.Wallet.l7 l7Var2 = t7Var.A1;
                    boolean z13 = false;
                    if (!t7Var.b && ((s5Var = t7Var.c.y) == null || !s5Var.a || t7Var.p0 || t7Var.q0)) {
                        if (t7Var.a1 || t7Var.s0 || !t7Var.A()) {
                            z13 = t7Var.p0;
                        } else {
                            if (t7Var.h1) {
                                t7Var.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                t7Var.removeCallbacks(l7Var2);
                                t7Var.removeCallbacks(l7Var);
                                t7Var.g0 = null;
                                t7Var.o0 = false;
                                t7Var.i0 = false;
                                t7Var.n0 = false;
                                t7Var.m0 = false;
                                t7Var.q0 = false;
                                t7Var.p0 = false;
                                t7Var.v0 = motionEvent.getPointerId(0);
                                float x10 = motionEvent.getX();
                                float y3 = motionEvent.getY();
                                float[] fArr = {x10, y3};
                                t7Var.s.mapPoints(fArr);
                                org.telegram.ui.Wallet.s7 s7Var5 = t7Var.h0;
                                if (s7Var5 != null && s7Var5.H == 2) {
                                    float P = (t7Var.P(s7Var5) * 0.5f) + AndroidUtilities.dp(9.0f);
                                    double radians = Math.toRadians(s7Var5.i.a);
                                    int i12 = -1;
                                    while (i12 <= i11) {
                                        int i13 = i11;
                                        float f12 = i12 * P;
                                        double d = radians;
                                        float[] L = t7Var.L((((float) Math.cos(d)) * f12) + s7Var5.e.a + s7Var5.n.a, (f12 * ((float) Math.sin(d))) + s7Var5.f.a + s7Var5.o.a);
                                        if (Utilities.dist(x10, y3, L[0], L[i13 == true ? 1 : 0]) < AndroidUtilities.dp(22.0f)) {
                                            z12 = i13 == true ? 1 : 0;
                                            z11 = i13;
                                            t7Var.i0 = z12;
                                            if (z12) {
                                                float f13 = fArr[0];
                                                float f14 = fArr[z11];
                                                Iterator it2 = linkedHashMap.values().iterator();
                                                org.telegram.ui.Wallet.s7 s7Var6 = null;
                                                while (it2.hasNext()) {
                                                    org.telegram.ui.Wallet.s7 s7Var7 = (org.telegram.ui.Wallet.s7) it2.next();
                                                    if (s7Var7.H != 2 || Utilities.dist(f13, f14, s7Var7.e.a, s7Var7.f.a) >= t7Var.P(s7Var7) * 0.44f) {
                                                        f11 = f14;
                                                        it = it2;
                                                    } else {
                                                        if (s7Var6 != null) {
                                                            f11 = f14;
                                                            it = it2;
                                                            if (s7Var7.I <= s7Var6.I) {
                                                            }
                                                        } else {
                                                            f11 = f14;
                                                            it = it2;
                                                        }
                                                        s7Var6 = s7Var7;
                                                    }
                                                    f14 = f11;
                                                    it2 = it;
                                                }
                                                s7Var2 = s7Var6;
                                            } else {
                                                s7Var2 = t7Var.h0;
                                            }
                                            t7Var.g0 = s7Var2;
                                            if (!t7Var.i0 && s7Var2 != t7Var.h0) {
                                                t7Var.h0 = null;
                                                t7Var.f0();
                                            }
                                            s7Var3 = t7Var.g0;
                                            t7Var.u0 = s7Var3 == null ? z11 : false;
                                            if (s7Var3 == null) {
                                                Iterator it3 = linkedHashMap.values().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        org.telegram.ui.Wallet.s7 s7Var8 = (org.telegram.ui.Wallet.s7) it3.next();
                                                        RectF Z = t7Var.Z(s7Var8);
                                                        if (Z != null && Z.contains(x10, y3)) {
                                                            if (org.telegram.ui.Wallet.t7.b(s7Var8)) {
                                                                t7Var.r0 = (Math.abs(x10 - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y3 - Z.centerY()) >= Z.height() * 0.35f) ? false : z11;
                                                                t7Var.g0 = s7Var8;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            s7Var4 = t7Var.g0;
                                            if (s7Var4 == null && ((i10 = s7Var4.H) == 0 || i10 == 2)) {
                                                t7Var.x0 = x10;
                                                t7Var.y0 = y3;
                                                SystemClock.uptimeMillis();
                                                org.telegram.ui.Wallet.s7 s7Var9 = t7Var.g0;
                                                t7Var.K0 = s7Var9.H;
                                                t7Var.G0 = s7Var9.e.b;
                                                t7Var.H0 = s7Var9.f.b;
                                                t7Var.J0 = s7Var9.i.b;
                                                t7Var.I0 = s7Var9.h.b;
                                                VelocityTracker velocityTracker = t7Var.O0;
                                                if (velocityTracker != null) {
                                                    velocityTracker.recycle();
                                                }
                                                VelocityTracker obtain = VelocityTracker.obtain();
                                                t7Var.O0 = obtain;
                                                obtain.addMovement(motionEvent);
                                                if (t7Var.i0) {
                                                    t7Var.B0 = Float.NaN;
                                                    t7Var.E0 = Float.NaN;
                                                    t7Var.C0 = 0.0f;
                                                    org.telegram.ui.Wallet.s7 s7Var10 = t7Var.g0;
                                                    t7Var.D0 = s7Var10.i.b;
                                                    t7Var.L0 = false;
                                                    long j10 = t7Var.N0 + 1;
                                                    t7Var.N0 = j10;
                                                    s7Var10.I = j10;
                                                    t7Var.M(s7Var10, x10, y3);
                                                } else {
                                                    t7Var.postDelayed(l7Var2, t7Var.u0 ? 450L : 500L);
                                                }
                                                if (t7Var.u0) {
                                                    boolean z14 = z11;
                                                    t7Var.p0 = z14;
                                                    t7Var.getParent().requestDisallowInterceptTouchEvent(z14);
                                                    t7Var.f0();
                                                    z13 = z14;
                                                } else {
                                                    t7Var.q0 = z11;
                                                    t7Var.postDelayed(l7Var, 170L);
                                                }
                                            } else {
                                                t7Var.g0 = null;
                                            }
                                            z13 = false;
                                        } else {
                                            i12 += 2;
                                            i11 = i13 == true ? 1 : 0;
                                            radians = d;
                                        }
                                    }
                                }
                                z11 = i11;
                                z12 = false;
                                t7Var.i0 = z12;
                                if (z12) {
                                }
                                t7Var.g0 = s7Var2;
                                if (!t7Var.i0) {
                                    t7Var.h0 = null;
                                    t7Var.f0();
                                }
                                s7Var3 = t7Var.g0;
                                t7Var.u0 = s7Var3 == null ? z11 : false;
                                if (s7Var3 == null) {
                                }
                                s7Var4 = t7Var.g0;
                                if (s7Var4 == null) {
                                }
                                t7Var.g0 = null;
                                z13 = false;
                            } else {
                                if (t7Var.p0 || t7Var.q0) {
                                    VelocityTracker velocityTracker2 = t7Var.O0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(t7Var.v0);
                                    boolean z15 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == t7Var.v0;
                                    if (findPointerIndex >= 0) {
                                        float x11 = motionEvent.getX(findPointerIndex);
                                        float y10 = motionEvent.getY(findPointerIndex);
                                        if (t7Var.q0) {
                                            if (actionMasked != 2 || Utilities.dist(x11, y10, t7Var.x0, t7Var.y0) <= ViewConfiguration.get(t7Var.getContext()).getScaledTouchSlop()) {
                                                z10 = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                    t7Var.a();
                                                }
                                            } else if (t7Var.r0 && t7Var.g0.H == 0) {
                                                t7Var.q0 = false;
                                                t7Var.p0 = true;
                                                t7Var.removeCallbacks(l7Var);
                                                ((qc0) t7Var.d.b).Y();
                                                t7Var.getParent().requestDisallowInterceptTouchEvent(true);
                                                t7Var.W(t7Var.g0, x11, y10);
                                                t7Var.q(t7Var.g0, x11, y10);
                                                t7Var.f0();
                                            } else {
                                                z10 = false;
                                                t7Var.a();
                                            }
                                            z13 = z10;
                                        } else {
                                            if (actionMasked == 2 && (s7Var = t7Var.g0) != null) {
                                                if (t7Var.n0 || t7Var.i0) {
                                                    t7Var.M(s7Var, x11, y10);
                                                } else if (Utilities.dist(x11, y10, t7Var.x0, t7Var.y0) > ViewConfiguration.get(t7Var.getContext()).getScaledTouchSlop()) {
                                                    t7Var.removeCallbacks(l7Var2);
                                                    if (!t7Var.m0 && (t7Var.u0 || t7Var.g0.H == 0)) {
                                                        t7Var.W(t7Var.g0, x11, y10);
                                                    }
                                                    if (t7Var.m0) {
                                                        t7Var.q(t7Var.g0, x11, y10);
                                                    }
                                                }
                                                t7Var.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z15) {
                                                VelocityTracker velocityTracker3 = t7Var.O0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                                    f7 = t7Var.O0.getXVelocity(t7Var.v0);
                                                    f10 = t7Var.O0.getYVelocity(t7Var.v0);
                                                } else {
                                                    f7 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                t7Var.w(f7, f10, actionMasked == 3);
                                            }
                                        }
                                    } else if (t7Var.q0) {
                                        t7Var.a();
                                    } else {
                                        t7Var.w(0.0f, 0.0f, true);
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
                org.telegram.ui.Wallet.k5 k5Var2 = o5Var.p0;
                if (k5Var2 != null) {
                    k5Var2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (k5Var = o5Var.p0) != null) {
                    org.telegram.ui.Wallet.m mVar = k5Var.i;
                    org.telegram.ui.Components.d71 d71Var = k5Var.c;
                    if (d71Var != null) {
                        d71Var.removeCallbacks(mVar);
                        k5Var.c.post(mVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                sc0 sc0Var = (sc0) this.z0;
                kVar = ((org.telegram.ui.ActionBar.o2) sc0Var).actionBar;
                if (view == kVar) {
                    h5Var = ((org.telegram.ui.ActionBar.o2) sc0Var).parentLayout;
                    if (h5Var != null) {
                        h5Var2 = ((org.telegram.ui.ActionBar.o2) sc0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.o2) sc0Var).actionBar;
                        ((ActionBarLayout) h5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        switch (this.w0) {
            case 1:
                return this.x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        ic0 ic0Var;
        org.telegram.ui.Components.j71 t02;
        switch (this.w0) {
            case 0:
                sc0 sc0Var = (sc0) this.z0;
                try {
                    if (viewGroup == sc0Var.U && (ic0Var = sc0Var.K0) != null && ic0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.mm0 currentListView = sc0Var.K0.getCurrentListView();
                        int top = sc0Var.K0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new fz(this, 19));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.z0;
                if (!this.y0 && i13 != 0 && (t02 = o5Var.t0()) != null) {
                    if (viewGroup != o5Var.a || !Z()) {
                        if (viewGroup == t02 && i13 < 0) {
                            iArr[1] = c0(o5Var.a, i13) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = c0(t02, i13) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        switch (this.w0) {
            case 0:
                this.x0.a = 0;
                break;
            default:
                b2.u0 u0Var = this.x0;
                if (i10 == 1) {
                    u0Var.b = 0;
                } else {
                    u0Var.a = 0;
                }
                org.telegram.ui.Wallet.k5 k5Var = ((org.telegram.ui.Wallet.o5) this.z0).p0;
                if (k5Var != null) {
                    org.telegram.ui.Wallet.m mVar = k5Var.i;
                    org.telegram.ui.Components.d71 d71Var = k5Var.c;
                    if (d71Var != null) {
                        d71Var.removeCallbacks(mVar);
                        k5Var.c.post(mVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                if (((sc0) this.z0).K0 == null || i10 != 2) {
                }
                break;
            default:
                if ((i10 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.w0) {
            case 0:
                sc0 sc0Var = (sc0) this.z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    sc0Var.A0(true);
                    break;
                } else {
                    sc0Var.k0(this.y0);
                    this.y0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.z0;
                if (o5Var.n != size) {
                    o5Var.n = size;
                    org.telegram.ui.Wallet.a5 a5Var = o5Var.d;
                    if (a5Var != null) {
                        a5Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.x4 x4Var = o5Var.e;
                    if (x4Var != null) {
                        x4Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.k5 k5Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.z0;
                if (view != o5Var.t0() || (k5Var = o5Var.p0) == null) {
                    return false;
                }
                return k5Var.a((int) f7, (int) f10);
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.w0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                this.x0.a = i10;
                break;
            default:
                b2.u0 u0Var = this.x0;
                if (i11 != 1) {
                    u0Var.a = i10;
                    break;
                } else {
                    u0Var.b = i10;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(sc0 sc0Var, Context context) {
        super(context, null);
        this.z0 = sc0Var;
        this.y0 = true;
        this.x0 = new b2.u0();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
