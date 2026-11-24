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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nc6 extends ela implements vk7 {
    public final /* synthetic */ byte m0 = 1;
    public final az8 n0;
    public boolean o0;
    public final /* synthetic */ d p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc6(pc6 pc6Var, Context context) {
        super(context, null);
        this.p0 = pc6Var;
        this.o0 = true;
        this.n0 = new az8((byte) 3);
    }

    public final void X() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        coc cocVar = ((goc) this.p0).t0;
        if (cocVar != null) {
            cocVar.e(obtain);
        }
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Finally extract failed */
    public final int a0(q7c q7cVar, int i) {
        int[] iArr = {0};
        k2b k2bVar = new k2b(iArr, (byte) 11);
        this.o0 = true;
        q7cVar.j(k2bVar);
        try {
            q7cVar.scrollBy(0, i);
            ArrayList arrayList = q7cVar.x0;
            if (arrayList != null) {
                arrayList.remove(k2bVar);
            }
            this.o0 = false;
            return iArr[0];
        } catch (Throwable th) {
            ArrayList arrayList2 = q7cVar.x0;
            if (arrayList2 != null) {
                arrayList2.remove(k2bVar);
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
        coc cocVar;
        moc mocVar;
        float f;
        float f2;
        lqc lqcVar;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        lqc lqcVar2;
        float f3;
        Iterator it;
        byte b;
        switch (this.m0) {
            case 1:
                goc gocVar = (goc) this.p0;
                mqc mqcVar = gocVar.k0;
                int i2 = 1;
                if (mqcVar != null) {
                    cqc cqcVar = mqcVar.C1;
                    LinkedHashMap linkedHashMap = mqcVar.f;
                    cqc cqcVar2 = mqcVar.B1;
                    boolean z4 = false;
                    if (!mqcVar.b && ((mocVar = mqcVar.c.E) == null || !mocVar.a || mqcVar.q0 || mqcVar.r0)) {
                        if (mqcVar.b1 || mqcVar.t0 || !mqcVar.A()) {
                            z4 = mqcVar.q0;
                        } else {
                            if (mqcVar.i1) {
                                mqcVar.f0();
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                mqcVar.removeCallbacks(cqcVar2);
                                mqcVar.removeCallbacks(cqcVar);
                                mqcVar.h0 = null;
                                mqcVar.p0 = false;
                                mqcVar.j0 = false;
                                mqcVar.o0 = false;
                                mqcVar.n0 = false;
                                mqcVar.r0 = false;
                                mqcVar.q0 = false;
                                mqcVar.w0 = motionEvent.getPointerId(0);
                                float x = motionEvent.getX();
                                float y = motionEvent.getY();
                                float[] fArr = {x, y};
                                mqcVar.s.mapPoints(fArr);
                                lqc lqcVar3 = mqcVar.i0;
                                if (lqcVar3 == null || lqcVar3.H != 2) {
                                    i = 1;
                                } else {
                                    float P = (mqcVar.P(lqcVar3) * 0.5f) + gm.L(9.0f);
                                    double radians = Math.toRadians(lqcVar3.i.a);
                                    int i3 = -1;
                                    while (true) {
                                        i = i2;
                                        if (i3 <= i2) {
                                            float f4 = i3 * P;
                                            double d = radians;
                                            float[] L = mqcVar.L((((float) Math.cos(d)) * f4) + lqcVar3.e.a + lqcVar3.n.a, (f4 * ((float) Math.sin(d))) + lqcVar3.f.a + lqcVar3.o.a);
                                            if (Utilities.t(x, y, L[0], L[i == true ? 1 : 0]) < gm.L(22.0f)) {
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
                                mqcVar.j0 = z2;
                                if (z2) {
                                    lqcVar2 = mqcVar.i0;
                                } else {
                                    float f5 = fArr[0];
                                    float f6 = fArr[z3];
                                    Iterator it2 = linkedHashMap.values().iterator();
                                    lqc lqcVar4 = null;
                                    while (it2.hasNext()) {
                                        lqc lqcVar5 = (lqc) it2.next();
                                        if (lqcVar5.H != 2 || Utilities.t(f5, f6, lqcVar5.e.a, lqcVar5.f.a) >= mqcVar.P(lqcVar5) * 0.44f) {
                                            f3 = f6;
                                            it = it2;
                                        } else {
                                            if (lqcVar4 != null) {
                                                f3 = f6;
                                                it = it2;
                                                if (lqcVar5.I <= lqcVar4.I) {
                                                }
                                            } else {
                                                f3 = f6;
                                                it = it2;
                                            }
                                            lqcVar4 = lqcVar5;
                                        }
                                        f6 = f3;
                                        it2 = it;
                                    }
                                    lqcVar2 = lqcVar4;
                                }
                                mqcVar.h0 = lqcVar2;
                                if (!mqcVar.j0 && lqcVar2 != mqcVar.i0) {
                                    mqcVar.i0 = null;
                                    mqcVar.f0();
                                }
                                lqc lqcVar6 = mqcVar.h0;
                                mqcVar.v0 = lqcVar6 != null ? z3 : false;
                                if (lqcVar6 == null) {
                                    Iterator it3 = linkedHashMap.values().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            lqc lqcVar7 = (lqc) it3.next();
                                            RectF Z = mqcVar.Z(lqcVar7);
                                            if (Z != null && Z.contains(x, y)) {
                                                if (mqc.b(lqcVar7)) {
                                                    mqcVar.s0 = (Math.abs(x - Z.centerX()) >= Z.width() * 0.35f || Math.abs(y - Z.centerY()) >= Z.height() * 0.35f) ? false : z3;
                                                    mqcVar.h0 = lqcVar7;
                                                }
                                            }
                                        }
                                    }
                                }
                                lqc lqcVar8 = mqcVar.h0;
                                if (lqcVar8 == null || !((b = lqcVar8.H) == 0 || b == 2)) {
                                    mqcVar.h0 = null;
                                } else {
                                    mqcVar.y0 = x;
                                    mqcVar.z0 = y;
                                    SystemClock.uptimeMillis();
                                    lqc lqcVar9 = mqcVar.h0;
                                    mqcVar.L0 = lqcVar9.H;
                                    mqcVar.H0 = lqcVar9.e.b;
                                    mqcVar.I0 = lqcVar9.f.b;
                                    mqcVar.K0 = lqcVar9.i.b;
                                    mqcVar.J0 = lqcVar9.h.b;
                                    VelocityTracker velocityTracker = mqcVar.P0;
                                    if (velocityTracker != null) {
                                        velocityTracker.recycle();
                                    }
                                    VelocityTracker obtain = VelocityTracker.obtain();
                                    mqcVar.P0 = obtain;
                                    obtain.addMovement(motionEvent);
                                    if (mqcVar.j0) {
                                        mqcVar.C0 = Float.NaN;
                                        mqcVar.F0 = Float.NaN;
                                        mqcVar.D0 = 0.0f;
                                        lqc lqcVar10 = mqcVar.h0;
                                        mqcVar.E0 = lqcVar10.i.b;
                                        mqcVar.M0 = false;
                                        long j = mqcVar.O0 + 1;
                                        mqcVar.O0 = j;
                                        lqcVar10.I = j;
                                        mqcVar.M(lqcVar10, x, y);
                                    } else {
                                        mqcVar.postDelayed(cqcVar2, mqcVar.v0 ? 450L : 500L);
                                    }
                                    if (mqcVar.v0) {
                                        boolean z5 = z3;
                                        mqcVar.q0 = z5;
                                        mqcVar.getParent().requestDisallowInterceptTouchEvent(z5);
                                        mqcVar.f0();
                                        z4 = z5;
                                    } else {
                                        mqcVar.r0 = z3;
                                        mqcVar.postDelayed(cqcVar, 170L);
                                    }
                                }
                                z4 = false;
                            } else {
                                if (mqcVar.q0 || mqcVar.r0) {
                                    VelocityTracker velocityTracker2 = mqcVar.P0;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    int findPointerIndex = motionEvent.findPointerIndex(mqcVar.w0);
                                    boolean z6 = actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == mqcVar.w0;
                                    if (findPointerIndex >= 0) {
                                        float x2 = motionEvent.getX(findPointerIndex);
                                        float y2 = motionEvent.getY(findPointerIndex);
                                        if (mqcVar.r0) {
                                            if (actionMasked != 2 || Utilities.t(x2, y2, mqcVar.y0, mqcVar.z0) <= ViewConfiguration.get(mqcVar.getContext()).getScaledTouchSlop()) {
                                                z = false;
                                                if (actionMasked == 1 || actionMasked == 3 || z6) {
                                                    mqcVar.a();
                                                }
                                            } else if (mqcVar.s0 && mqcVar.h0.H == 0) {
                                                mqcVar.r0 = false;
                                                mqcVar.q0 = true;
                                                mqcVar.removeCallbacks(cqcVar);
                                                ((nc6) mqcVar.d.b).X();
                                                mqcVar.getParent().requestDisallowInterceptTouchEvent(true);
                                                mqcVar.W(mqcVar.h0, x2, y2);
                                                mqcVar.q(mqcVar.h0, x2, y2);
                                                mqcVar.f0();
                                            } else {
                                                z = false;
                                                mqcVar.a();
                                            }
                                            z4 = z;
                                        } else {
                                            if (actionMasked == 2 && (lqcVar = mqcVar.h0) != null) {
                                                if (mqcVar.o0 || mqcVar.j0) {
                                                    mqcVar.M(lqcVar, x2, y2);
                                                } else if (Utilities.t(x2, y2, mqcVar.y0, mqcVar.z0) > ViewConfiguration.get(mqcVar.getContext()).getScaledTouchSlop()) {
                                                    mqcVar.removeCallbacks(cqcVar2);
                                                    if (!mqcVar.n0 && (mqcVar.v0 || mqcVar.h0.H == 0)) {
                                                        mqcVar.W(mqcVar.h0, x2, y2);
                                                    }
                                                    if (mqcVar.n0) {
                                                        mqcVar.q(mqcVar.h0, x2, y2);
                                                    }
                                                }
                                                mqcVar.f0();
                                            }
                                            if (actionMasked == 1 || actionMasked == 3 || z6) {
                                                VelocityTracker velocityTracker3 = mqcVar.P0;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(1000);
                                                    f = mqcVar.P0.getXVelocity(mqcVar.w0);
                                                    f2 = mqcVar.P0.getYVelocity(mqcVar.w0);
                                                } else {
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                mqcVar.w(f, f2, actionMasked == 3);
                                            }
                                        }
                                    } else if (mqcVar.r0) {
                                        mqcVar.a();
                                    } else {
                                        mqcVar.w(0.0f, 0.0f, true);
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
                coc cocVar2 = gocVar.t0;
                if (cocVar2 != null) {
                    cocVar2.e(motionEvent);
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (cocVar = gocVar.t0) != null) {
                    f8c f8cVar = cocVar.i;
                    va vaVar = cocVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(f8cVar);
                        cocVar.c.post(f8cVar);
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

    @Override // uk7
    public final void k(int i, View view) {
        byte b = this.m0;
        az8 az8Var = this.n0;
        switch (b) {
            case 0:
                az8Var.b = 0;
                break;
            default:
                if (i == 1) {
                    az8Var.c = 0;
                } else {
                    az8Var.b = 0;
                }
                coc cocVar = ((goc) this.p0).t0;
                if (cocVar != null) {
                    f8c f8cVar = cocVar.i;
                    va vaVar = cocVar.c;
                    if (vaVar != null) {
                        vaVar.removeCallbacks(f8cVar);
                        cocVar.c.post(f8cVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // vk7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ic6 ic6Var;
        q7c r0;
        byte b = this.m0;
        d dVar = this.p0;
        switch (b) {
            case 0:
                pc6 pc6Var = (pc6) dVar;
                try {
                    if (view == pc6Var.R && (ic6Var = pc6Var.R0) != null && ic6Var.isAttachedToWindow()) {
                        r59 currentListView = pc6Var.R0.getCurrentListView();
                        int top = pc6Var.R0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i4;
                            currentListView.scrollBy(0, i4);
                            break;
                        }
                    }
                } catch (Throwable th) {
                    fc4.g(th, true);
                    gm.c3(new kg5(this, (byte) 25));
                    return;
                }
                break;
            default:
                goc gocVar = (goc) dVar;
                if (!this.o0 && i4 != 0 && (r0 = gocVar.r0()) != null) {
                    if (view != gocVar.a || !gocVar.v0()) {
                        if (view == r0 && i4 < 0) {
                            iArr[1] = a0(gocVar.a, i4) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = a0(r0, i4) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // uk7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
        switch (this.m0) {
            case 0:
                break;
            default:
                l(view, i, i2, i3, i4, i5, new int[2]);
                break;
        }
    }

    @Override // uk7
    public final boolean n(View view, View view2, int i, int i2) {
        switch (this.m0) {
            case 0:
                if (((pc6) this.p0).R0 != null && i == 2) {
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

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.m0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                pc6 pc6Var = (pc6) this.p0;
                if (!z) {
                    pc6Var.N0(true);
                    break;
                } else {
                    pc6Var.n0(this.o0);
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
                goc gocVar = (goc) this.p0;
                if (gocVar.r != size) {
                    gocVar.r = size;
                    unc uncVar = gocVar.e;
                    if (uncVar != null) {
                        uncVar.requestLayout();
                    }
                    snc sncVar = gocVar.f;
                    if (sncVar != null) {
                        sncVar.requestLayout();
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
        coc cocVar;
        switch (this.m0) {
            case 1:
                goc gocVar = (goc) this.p0;
                if (view != gocVar.r0() || (cocVar = gocVar.t0) == null) {
                    return false;
                }
                return cocVar.a((int) f, (int) f2);
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

    @Override // uk7
    public final void q(View view, View view2, int i, int i2) {
        switch (this.m0) {
            case 0:
                this.n0.b = i;
                break;
            default:
                az8 az8Var = this.n0;
                if (i2 != 1) {
                    az8Var.b = i;
                    break;
                } else {
                    az8Var.c = i;
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    @Override // uk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        ic6 ic6Var;
        rja rjaVar;
        boolean z;
        int i4;
        r59 currentListView;
        rja rjaVar2;
        q7c r0;
        coc cocVar;
        byte b = this.m0;
        d dVar = this.p0;
        switch (b) {
            case 0:
                pc6 pc6Var = (pc6) dVar;
                if (view == pc6Var.R && (ic6Var = pc6Var.R0) != null && ic6Var.isAttachedToWindow()) {
                    rjaVar = ((d) pc6Var).simpleActionBar;
                    boolean z2 = false;
                    if (rjaVar != null) {
                        rjaVar2 = ((d) pc6Var).simpleActionBar;
                        if (rjaVar2.G) {
                            z = true;
                            int top = pc6Var.R0.getTop();
                            if (i2 < 0) {
                                if (z) {
                                    r59 currentListView2 = pc6Var.R0.getCurrentListView();
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
                                if (top <= 0 && (currentListView = pc6Var.R0.getCurrentListView()) != null) {
                                    int K0 = ((u46) currentListView.getLayoutManager()).K0();
                                    if (K0 != -1) {
                                        u69 K = currentListView.K(K0);
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
                    int top3 = pc6Var.R0.getTop();
                    if (i2 < 0) {
                    }
                }
                break;
            default:
                goc gocVar = (goc) dVar;
                if (!this.o0 && (r0 = gocVar.r0()) != null) {
                    if (i2 != 0 && i3 == 0 && ((view == gocVar.a || view == r0) && (cocVar = gocVar.t0) != null && cocVar.f)) {
                        cocVar.d = true;
                    }
                    if (view != gocVar.a || i2 >= 0 || !gocVar.v0()) {
                        if (view == r0 && i2 > 0) {
                            iArr[1] = a0(gocVar.a, i2) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = a0(r0, i2) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc6(goc gocVar, Context context) {
        super(context, null);
        this.p0 = gocVar;
        this.n0 = new az8((byte) 3);
    }

    private final void Z(View view) {
    }

    private final void Y(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
