// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class oa6 extends cja implements ti7 {
    public final /* synthetic */ byte m0 = 1;
    public final zw8 n0;
    public boolean o0;
    public final /* synthetic */ d p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa6(qa6 qa6Var, Context context) {
        super(context, null);
        this.p0 = qa6Var;
        this.o0 = true;
        this.n0 = new zw8((byte) 3);
    }

    public final void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        dmc dmcVar = ((hmc) this.p0).t0;
        if (dmcVar != null) {
            dmcVar.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Finally extract failed */
    public final int a0(q5c q5cVar, int i) {
        int[] iArr = {0};
        vdb vdbVar = new vdb(iArr, (byte) 10);
        this.o0 = true;
        q5cVar.j(vdbVar);
        try {
            q5cVar.scrollBy(0, i);
            ArrayList arrayList = q5cVar.x0;
            if (arrayList != null) {
                arrayList.remove(vdbVar);
            }
            this.o0 = false;
            return iArr[0];
        } catch (Throwable th) {
            ArrayList arrayList2 = q5cVar.x0;
            if (arrayList2 != null) {
                arrayList2.remove(vdbVar);
            }
            this.o0 = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dmc dmcVar;
        mmc mmcVar;
        float f;
        float f2;
        joc jocVar;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        joc jocVar2;
        float f3;
        Iterator it;
        byte b;
        switch (this.m0) {
            case 1:
                hmc hmcVar = (hmc) this.p0;
                koc kocVar = hmcVar.k0;
                int i2 = 1;
                if (kocVar != null) {
                    aoc aocVar = kocVar.C1;
                    LinkedHashMap linkedHashMap = kocVar.f;
                    aoc aocVar2 = kocVar.B1;
                    boolean z4 = false;
                    if (!kocVar.b && ((mmcVar = kocVar.c.E) == null || !mmcVar.a || kocVar.q0 || kocVar.r0)) {
                        if (kocVar.b1 || kocVar.t0 || !kocVar.A()) {
                            z4 = kocVar.q0;
                        } else {
                            if (kocVar.i1) {
                                kocVar.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                kocVar.removeCallbacks(aocVar2);
                                kocVar.removeCallbacks(aocVar);
                                kocVar.h0 = null;
                                kocVar.p0 = false;
                                kocVar.j0 = false;
                                kocVar.o0 = false;
                                kocVar.n0 = false;
                                kocVar.r0 = false;
                                kocVar.q0 = false;
                                kocVar.w0 = motionEvent.getPointerId(0);
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float[] fArr = {x, y};
                                kocVar.s.mapPoints(fArr);
                                joc jocVar3 = kocVar.i0;
                                if (jocVar3 == null || jocVar3.H != 2) {
                                    i = 1;
                                } else {
                                    float P = (kocVar.P(jocVar3) * 0.5f) + gl.L(9.0f);
                                    double radians = Math.toRadians(jocVar3.i.a);
                                    int i3 = -1;
                                    while (true) {
                                        i = i2;
                                        if (i3 <= i2) {
                                            float f4 = i3 * P;
                                            double d = radians;
                                            float[] L = kocVar.L((((float) Math.cos(d)) * f4) + jocVar3.e.a + jocVar3.n.a, (f4 * ((float) Math.sin(d))) + jocVar3.f.a + jocVar3.o.a);
                                            if (Utilities.t(x, y, L[0], L[i == true ? 1 : 0]) < gl.L(22.0f)) {
                                                z2 = i == true ? 1 : 0;
                                                z3 = i;
                                            } else {
                                                i3 += 2;
                                                i2 = i == true ? 1 : 0;
                                                radians = d;
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                                z3 = i;
                                kocVar.j0 = z2;
                                if (z2) {
                                    jocVar2 = kocVar.i0;
                                } else {
                                    float f5 = fArr[0];
                                    float f6 = fArr[z3];
                                    Iterator it2 = linkedHashMap.values().iterator();
                                    joc jocVar4 = null;
                                    while (it2.hasNext()) {
                                        joc jocVar5 = (joc) it2.next();
                                        if (jocVar5.H != 2 || Utilities.t(f5, f6, jocVar5.e.a, jocVar5.f.a) >= kocVar.P(jocVar5) * 0.44f) {
                                            f3 = f6;
                                            it = it2;
                                        } else {
                                            if (jocVar4 != null) {
                                                f3 = f6;
                                                it = it2;
                                                if (jocVar5.I <= jocVar4.I) {
                                                }
                                            } else {
                                                f3 = f6;
                                                it = it2;
                                            }
                                            jocVar4 = jocVar5;
                                        }
                                        f6 = f3;
                                        it2 = it;
                                    }
                                    jocVar2 = jocVar4;
                                }
                                kocVar.h0 = jocVar2;
                                if (!kocVar.j0 && jocVar2 != kocVar.i0) {
                                    kocVar.i0 = null;
                                    kocVar.f0();
                                }
                                joc jocVar6 = kocVar.h0;
                                kocVar.v0 = jocVar6 != null ? z3 : false;
                                if (jocVar6 == null) {
                                    Iterator it3 = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            joc jocVar7 = (joc) it3.next();
                                            RectF Z = kocVar.Z(jocVar7);
                                            if (Z != null && Z.contains(x, y)) {
                                                if (koc.b(jocVar7)) {
                                                    kocVar.s0 = (Math.abs(x - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y - Z.centerY()) >= Z.height() * 0.35f) ? false : z3;
                                                    kocVar.h0 = jocVar7;
                                                }
                                            }
                                        }
                                    }
                                }
                                joc jocVar8 = kocVar.h0;
                                if (jocVar8 == null || !((b = jocVar8.H) == 0 || b == 2)) {
                                    kocVar.h0 = null;
                                } else {
                                    kocVar.y0 = x;
                                    kocVar.z0 = y;
                                    SystemClock.uptimeMillis();
                                    joc jocVar9 = kocVar.h0;
                                    kocVar.L0 = jocVar9.H;
                                    kocVar.H0 = jocVar9.e.b;
                                    kocVar.I0 = jocVar9.f.b;
                                    kocVar.K0 = jocVar9.i.b;
                                    kocVar.J0 = jocVar9.h.b;
                                    VelocityTracker velocityTracker = kocVar.P0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    kocVar.P0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    if (kocVar.j0) {
                                        kocVar.C0 = Float.NaN;
                                        kocVar.F0 = Float.NaN;
                                        kocVar.D0 = 0.0f;
                                        joc jocVar10 = kocVar.h0;
                                        kocVar.E0 = jocVar10.i.b;
                                        kocVar.M0 = false;
                                        long j = kocVar.O0 + 1;
                                        kocVar.O0 = j;
                                        jocVar10.I = j;
                                        kocVar.M(jocVar10, x, y);
                                    } else {
                                        kocVar.postDelayed(aocVar2, kocVar.v0 ? 450L : 500L);
                                    }
                                    if (kocVar.v0) {
                                        boolean z5 = z3;
                                        kocVar.q0 = z5;
                                        kocVar.getParent().requestDisallowInterceptTouchEvent(z5);
                                        kocVar.f0();
                                        z4 = z5;
                                    } else {
                                        kocVar.r0 = z3;
                                        kocVar.postDelayed(aocVar, 170L);
                                    }
                                }
                                z4 = false;
                            } else {
                                if (kocVar.q0 || kocVar.r0) {
                                    VelocityTracker velocityTracker2 = kocVar.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(kocVar.w0);
                                    boolean z6 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == kocVar.w0;
                                    if (findPointerIndex >= 0) {
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        if (kocVar.r0) {
                                            if (actionMasked != 2 || Utilities.t(x2, y2, kocVar.y0, kocVar.z0) <= ViewConfiguration.get(kocVar.getContext()).getScaledTouchSlop()) {
                                                z = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z6) {
                                                    kocVar.a();
                                                }
                                            } else if (kocVar.s0 && kocVar.h0.H == 0) {
                                                kocVar.r0 = false;
                                                kocVar.q0 = true;
                                                kocVar.removeCallbacks(aocVar);
                                                ((oa6) kocVar.d.b).X();
                                                kocVar.getParent().requestDisallowInterceptTouchEvent(true);
                                                kocVar.W(kocVar.h0, x2, y2);
                                                kocVar.q(kocVar.h0, x2, y2);
                                                kocVar.f0();
                                            } else {
                                                z = false;
                                                kocVar.a();
                                            }
                                            z4 = z;
                                        } else {
                                            if (actionMasked == 2 && (jocVar = kocVar.h0) != null) {
                                                if (kocVar.o0 || kocVar.j0) {
                                                    kocVar.M(jocVar, x2, y2);
                                                } else if (Utilities.t(x2, y2, kocVar.y0, kocVar.z0) > ViewConfiguration.get(kocVar.getContext()).getScaledTouchSlop()) {
                                                    kocVar.removeCallbacks(aocVar2);
                                                    if (!kocVar.n0 && (kocVar.v0 || kocVar.h0.H == 0)) {
                                                        kocVar.W(kocVar.h0, x2, y2);
                                                    }
                                                    if (kocVar.n0) {
                                                        kocVar.q(kocVar.h0, x2, y2);
                                                    }
                                                }
                                                kocVar.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z6) {
                                                VelocityTracker velocityTracker3 = kocVar.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f = kocVar.P0.getXVelocity(kocVar.w0);
                                                    f2 = kocVar.P0.getYVelocity(kocVar.w0);
                                                } else {
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                kocVar.w(f, f2, actionMasked == 3);
                                            }
                                        }
                                    } else if (kocVar.r0) {
                                        kocVar.a();
                                    } else {
                                        kocVar.w(0.0f, 0.0f, true);
                                    }
                                    z4 = true;
                                }
                                z4 = false;
                            }
                        }
                    }
                    if (z4) {
                        return true;
                    }
                }
                dmc dmcVar2 = hmcVar.t0;
                if (dmcVar2 != null) {
                    dmcVar2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (dmcVar = hmcVar.t0) != null) {
                    kbc kbcVar = dmcVar.i;
                    va vaVar = dmcVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(kbcVar);
                        dmcVar.c.post(kbcVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        switch (this.m0) {
            case 1:
                return this.n0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // si7
    public final void k(int i, View view) {
        byte b = this.m0;
        zw8 zw8Var = this.n0;
        switch (b) {
            case 0:
                zw8Var.b = 0;
                break;
            default:
                if (i == 1) {
                    zw8Var.c = 0;
                } else {
                    zw8Var.b = 0;
                }
                dmc dmcVar = ((hmc) this.p0).t0;
                if (dmcVar != null) {
                    kbc kbcVar = dmcVar.i;
                    va vaVar = dmcVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(kbcVar);
                        dmcVar.c.post(kbcVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // ti7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ja6 ja6Var;
        q5c q0;
        byte b = this.m0;
        d dVar = this.p0;
        switch (b) {
            case 0:
                qa6 qa6Var = (qa6) dVar;
                try {
                    if (view == qa6Var.R && (ja6Var = qa6Var.R0) != null && ja6Var.isAttachedToWindow()) {
                        o39 currentListView = qa6Var.R0.getCurrentListView();
                        int top = qa6Var.R0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i4;
                            currentListView.scrollBy(0, i4);
                            break;
                        }
                    }
                } catch (Throwable th) {
                    fa4.g(th, true);
                    gl.c3(new tp5(this, (byte) 18));
                    return;
                }
                break;
            default:
                hmc hmcVar = (hmc) dVar;
                if (!this.o0 && i4 != 0 && (q0 = hmcVar.q0()) != null) {
                    if (view != hmcVar.a || !hmcVar.u0()) {
                        if (view == q0 && i4 < 0) {
                            iArr[1] = a0(hmcVar.a, i4) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = a0(q0, i4) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // si7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        switch (this.m0) {
            case 0:
                break;
            default:
                l(view, i, i2, i3, i4, i5, new int[2]);
                break;
        }
    }

    @Override // si7
    public final boolean n(View view, View view2, int i, int i2) {
        switch (this.m0) {
            case 0:
                if (((qa6) this.p0).R0 != null && i == 2) {
                    break;
                }
                break;
            default:
                if ((i & 2) != 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.m0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                qa6 qa6Var = (qa6) this.p0;
                if (!z) {
                    qa6Var.M0(true);
                    break;
                } else {
                    qa6Var.m0(this.o0);
                    this.o0 = false;
                    break;
                }
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.m0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i2) * 0.75f);
                hmc hmcVar = (hmc) this.p0;
                if (hmcVar.r != size) {
                    hmcVar.r = size;
                    vlc vlcVar = hmcVar.e;
                    if (vlcVar != null) {
                        vlcVar.requestLayout();
                    }
                    tlc tlcVar = hmcVar.f;
                    if (tlcVar != null) {
                        tlcVar.requestLayout();
                    }
                }
                super.onMeasure(i, i2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        dmc dmcVar;
        switch (this.m0) {
            case 1:
                hmc hmcVar = (hmc) this.p0;
                if (view != hmcVar.q0() || (dmcVar = hmcVar.t0) == null) {
                    return false;
                }
                return dmcVar.a((int) f, (int) f2);
            default:
                return super.onNestedPreFling(view, f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        switch (this.m0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // si7
    public final void q(View view, View view2, int i, int i2) {
        switch (this.m0) {
            case 0:
                this.n0.b = i;
                break;
            default:
                zw8 zw8Var = this.n0;
                if (i2 != 1) {
                    zw8Var.b = i;
                    break;
                } else {
                    zw8Var.c = i;
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    @Override // si7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        ja6 ja6Var;
        pha phaVar;
        boolean z;
        int i4;
        o39 currentListView;
        pha phaVar2;
        q5c q0;
        dmc dmcVar;
        byte b = this.m0;
        d dVar = this.p0;
        switch (b) {
            case 0:
                qa6 qa6Var = (qa6) dVar;
                if (view == qa6Var.R && (ja6Var = qa6Var.R0) != null && ja6Var.isAttachedToWindow()) {
                    phaVar = ((d) qa6Var).simpleActionBar;
                    boolean z2 = false;
                    if (phaVar != null) {
                        phaVar2 = ((d) qa6Var).simpleActionBar;
                        if (phaVar2.G) {
                            z = true;
                            int top = qa6Var.R0.getTop();
                            if (i2 < 0) {
                                if (z) {
                                    o39 currentListView2 = qa6Var.R0.getCurrentListView();
                                    iArr[1] = i2;
                                    if (top > 0) {
                                        iArr[1] = 0;
                                    }
                                    if (currentListView2 != null && (i4 = iArr[1]) > 0) {
                                        currentListView2.scrollBy(0, i4);
                                        break;
                                    }
                                }
                            } else {
                                if (top <= 0 && (currentListView = qa6Var.R0.getCurrentListView()) != null) {
                                    int K0 = ((t26) currentListView.getLayoutManager()).K0();
                                    if (K0 != -1) {
                                        s49 K = currentListView.K(K0);
                                        int top2 = K != null ? K.a.getTop() : -1;
                                        int paddingTop = currentListView.getPaddingTop();
                                        if (top2 != paddingTop || K0 != 0) {
                                            iArr[1] = K0 != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                                            currentListView.scrollBy(0, i2);
                                            z2 = true;
                                        }
                                    }
                                }
                                if (z) {
                                    if (!z2 && top < 0) {
                                        iArr[1] = i2 - Math.max(top, i2);
                                        break;
                                    } else {
                                        iArr[1] = i2;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    int top3 = qa6Var.R0.getTop();
                    if (i2 < 0) {
                    }
                }
                break;
            default:
                hmc hmcVar = (hmc) dVar;
                if (!this.o0 && (q0 = hmcVar.q0()) != null) {
                    if (i2 != 0 && i3 == 0 && ((view == hmcVar.a || view == q0) && (dmcVar = hmcVar.t0) != null && dmcVar.f)) {
                        dmcVar.d = true;
                    }
                    if (view != hmcVar.a || i2 >= 0 || !hmcVar.u0()) {
                        if (view == q0 && i2 > 0) {
                            iArr[1] = a0(hmcVar.a, i2) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = a0(q0, i2) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa6(hmc hmcVar, Context context) {
        super(context, null);
        this.p0 = hmcVar;
        this.n0 = new zw8((byte) 3);
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
