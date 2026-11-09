package org.telegram.ui.Components;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class rt implements ti.m, r0.m, yr0, ue.a, jg.y1, q5.b, x2.d1, com.google.android.gms.common.api.internal.p, tg.l1, sg.u0, v4.i1, androidx.lifecycle.s0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ rt(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.i1
    public int A() {
        return ((v4.n0) this.b).G();
    }

    @Override // ti.m
    public View D() {
        return ((wt) this.b).K1;
    }

    @Override // ti.m
    public boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.yr0
    public void G() {
        ((zs0) this.b).I.a(-1);
    }

    @Override // org.telegram.ui.Components.yr0
    public org.telegram.ui.ActionBar.z0 H(String str) {
        org.telegram.ui.ActionBar.f5 f5Var = ((zs0) this.b).I;
        return f5Var.d(0, 0, null, str, true, true, f5Var.m0);
    }

    @Override // ue.a
    public void H0() {
        ((t41) this.b).h.c(false);
    }

    @Override // ti.m
    public int I() {
        return ((wt) this.b).L1;
    }

    @Override // ti.m
    public boolean K() {
        return false;
    }

    @Override // ti.m
    public /* synthetic */ boolean L() {
        return false;
    }

    @Override // ti.m
    public /* synthetic */ e2.c1 M() {
        return null;
    }

    @Override // v4.i1
    public int N() {
        v4.n0 n0Var = (v4.n0) this.b;
        return n0Var.n - n0Var.C();
    }

    @Override // ue.a
    public void O(float f10, float f11) {
        Runnable runnable = ((t41) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ti.m
    public /* synthetic */ boolean P() {
        return false;
    }

    @Override // ti.m
    public void Q() {
        wt wtVar = (wt) this.b;
        wtVar.J1 = null;
        wtVar.K0();
    }

    @Override // ti.m
    public /* synthetic */ boolean R(boolean z9, float f10, rm0 rm0Var) {
        return false;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        kk0 kk0Var = (kk0) this.b;
        kk0Var.w.setPadding(I0.a, I0.b, I0.c, I0.d);
        kk0Var.s.requestLayout();
        return r0.k1.b;
    }

    @Override // ti.m
    public void T() {
        ((wt) this.b).L0();
    }

    @Override // ti.m
    public int U() {
        return ((wt) this.b).M1;
    }

    @Override // ue.a
    public boolean U0(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((t41) this.b).g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override // ti.m
    public float V() {
        return 0.0f;
    }

    @Override // v4.i1
    public View W(int i7) {
        return ((v4.n0) this.b).q(i7);
    }

    @Override // tg.l1
    public void X(float f10) {
        org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.b;
        sg.l0.e(wp0Var.y1).k(String.valueOf(sg.h.a.indexOf(wp0Var.F0.getCurrentBrush())), f10);
        sg.i1 i1Var = wp0Var.t1;
        i1Var.c = f10;
        wp0Var.s0(i1Var, null);
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // sg.u0
    public void Y() {
        tg.o0 o0Var = (tg.o0) this.b;
        o0Var.b.a.f();
        o0Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((org.telegram.ui.vp0) o0Var).K;
        Drawable[] drawableArr = PhotoViewer.Y8;
        photoViewer.U2(true, true);
    }

    @Override // v4.i1
    public int a0(View view) {
        return v4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.c cVar = (s6.c) ((s6.e) obj).n();
                q6.p pVar = (q6.p) this.b;
                Parcel j12 = cVar.j1();
                n7.a.b(j12, pVar);
                try {
                    cVar.b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            default:
                j8.c cVar2 = (j8.c) this.b;
                u7.x xVar = (u7.x) ((u7.k) obj).n();
                u7.f fVar = new u7.f(1, (TaskCompletionSource) obj2);
                Parcel p12 = xVar.p1();
                int i7 = u7.d.a;
                p12.writeInt(1);
                cVar2.writeToParcel(p12, 0);
                u7.d.c(p12, fVar);
                p12.writeString(null);
                xVar.t1(p12, 63);
                return;
        }
    }

    @Override // ti.m
    public void b() {
        m71 m71Var = ((wt) this.b).j1;
        if (m71Var == null || !m71Var.x) {
            return;
        }
        m71Var.a.g0();
        m71Var.n();
        m71Var.f0.d(true, true);
    }

    @Override // org.telegram.ui.Components.yr0
    public org.telegram.ui.ActionBar.z0 b0(int i7, Runnable runnable, String str, boolean z9, boolean z10) {
        zs0 zs0Var = (zs0) this.b;
        org.telegram.ui.ActionBar.z0 e10 = zs0Var.I.e(0, i7, str);
        if (z9) {
            int i10 = org.telegram.ui.ActionBar.l6.p7;
            e10.d(zs0Var.s0(i10), zs0Var.s0(i10));
        }
        e10.setOnClickListener(new la0(this, z10, runnable));
        return e10;
    }

    @Override // ue.a
    public /* synthetic */ boolean c1(View view, float f10, float f11) {
        return false;
    }

    @Override // x2.d1
    public void d(x2.e1 e1Var) {
        r2.j jVar = (r2.j) this.b;
        jVar.G.d(jVar);
    }

    @Override // sg.u0
    public void d0() {
        ((tg.o0) this.b).x.setViewHidden(true);
    }

    @Override // ti.m
    public boolean e0() {
        return false;
    }

    public void g0(v4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i7 = aVar.a;
        if (i7 == 1) {
            recyclerView.y.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i7 == 2) {
            recyclerView.y.Y(recyclerView, aVar.b, aVar.d);
        } else if (i7 == 4) {
            recyclerView.y.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.y.X(recyclerView, aVar.b, aVar.d);
        }
    }

    @Override // fd.a
    public Object get() {
        return new org.telegram.ui.ky0((Context) ((e.a) this.b).a, new nb.a(28), new w7.s(27, false), 4);
    }

    @Override // ti.m
    public long getDuration() {
        return 0L;
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // ti.m
    public boolean h() {
        return false;
    }

    public ClipDescription h0() {
        return ((t0.h) this.b).getDescription();
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 i(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public void i0(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int B = recyclerView.e.B();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < B; i14++) {
            View A = recyclerView.e.A(i14);
            v4.d1 U = RecyclerView.U(A);
            if (U != null && !U.r() && (i12 = U.c) >= i7 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((v4.o0) A.getLayoutParams()).c = true;
            }
        }
        v4.v0 v0Var = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) v0Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            v4.d1 d1Var = (v4.d1) arrayList2.get(size);
            if (d1Var != null && (i11 = d1Var.c) >= i7 && i11 < i13) {
                d1Var.a(2);
                v0Var.f(size);
            }
        }
        recyclerView.y0 = true;
    }

    @Override // ti.m
    public /* synthetic */ int j() {
        return 0;
    }

    @Override // ue.a
    public /* synthetic */ boolean j0() {
        return true;
    }

    @Override // v4.i1
    public int k(View view) {
        return v4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).topMargin;
    }

    public void k0(int i7, int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int B = recyclerView.e.B();
        for (int i11 = 0; i11 < B; i11++) {
            v4.d1 U = RecyclerView.U(recyclerView.e.A(i11));
            if (U != null && !U.r() && U.c >= i7) {
                U.n(i10, false);
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            v4.d1 d1Var = (v4.d1) arrayList.get(i12);
            if (d1Var != null && d1Var.c >= i7) {
                d1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // ti.m
    public long l() {
        return 0L;
    }

    public void l0(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int B = recyclerView.e.B();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < B; i19++) {
            v4.d1 U = RecyclerView.U(recyclerView.e.A(i19));
            if (U != null && (i17 = U.c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.u0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            v4.d1 d1Var = (v4.d1) arrayList.get(i20);
            if (d1Var != null && (i16 = d1Var.c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    d1Var.n(i10 - i7, false);
                } else {
                    d1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.x0 = true;
    }

    public void m0() {
        r2.j jVar = (r2.j) this.b;
        int i7 = jVar.H - 1;
        jVar.H = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.p pVar : jVar.J) {
            pVar.l();
            i10 += pVar.Y.a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.p pVar2 : jVar.J) {
            pVar2.l();
            int i12 = pVar2.Y.a;
            int i13 = 0;
            while (i13 < i12) {
                pVar2.l();
                m1VarArr[i11] = pVar2.Y.a(i13);
                i13++;
                i11++;
            }
        }
        jVar.I = new x2.q1(m1VarArr);
        jVar.G.a(jVar);
    }

    @Override // sg.u0
    public void n() {
        tg.o0 o0Var = (tg.o0) this.b;
        o0Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new fi.v3(o0Var, 24)).setInterpolator(xq.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n0(MotionEvent motionEvent) {
        boolean z9;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        c10 c10Var;
        boolean z10;
        b10 b10Var = (b10) this.b;
        int i7 = b10.w;
        c10 c10Var2 = b10Var.f;
        android.support.v4.media.session.q qVar = b10Var.e;
        int action = motionEvent.getAction();
        if (b10Var.v == null) {
            b10Var.v = VelocityTracker.obtain();
        }
        b10Var.v.addMovement(motionEvent);
        int i10 = action & org.telegram.messenger.qs.e4;
        boolean z11 = i10 == 6;
        int actionIndex = z11 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 = motionEvent.getX(i11) + f10;
                f11 = motionEvent.getY(i11) + f11;
            }
        }
        float f12 = z11 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i10 == 0) {
            if (b10Var.g != null && c10Var2.a()) {
                boolean hasMessages = qVar.hasMessages(3);
                if (hasMessages) {
                    qVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = b10Var.m;
                if (motionEvent4 != null && (motionEvent3 = b10Var.n) != null && hasMessages && b10Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < b10Var.b) {
                        b10Var.o = true;
                        z9 = b10Var.g.onDoubleTap(b10Var.m) | b10Var.g.onDoubleTapEvent(motionEvent);
                        b10Var.p = f13;
                        b10Var.r = f13;
                        b10Var.q = f14;
                        b10Var.s = f14;
                        motionEvent2 = b10Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        b10Var.m = MotionEvent.obtain(motionEvent);
                        b10Var.k = true;
                        b10Var.l = true;
                        b10Var.h = true;
                        b10Var.j = false;
                        b10Var.i = false;
                        if (b10Var.t) {
                            qVar.removeMessages(2);
                            qVar.sendEmptyMessageAtTime(2, b10Var.m.getDownTime() + i7 + b10Var.u);
                        }
                        qVar.sendEmptyMessageAtTime(1, b10Var.m.getDownTime() + i7);
                        return c10Var2.onDown(motionEvent) | z9;
                    }
                }
                qVar.sendEmptyMessageDelayed(3, 220L);
            }
            z9 = false;
            b10Var.p = f13;
            b10Var.r = f13;
            b10Var.q = f14;
            b10Var.s = f14;
            motionEvent2 = b10Var.m;
            if (motionEvent2 != null) {
            }
            b10Var.m = MotionEvent.obtain(motionEvent);
            b10Var.k = true;
            b10Var.l = true;
            b10Var.h = true;
            b10Var.j = false;
            b10Var.i = false;
            if (b10Var.t) {
            }
            qVar.sendEmptyMessageAtTime(1, b10Var.m.getDownTime() + i7);
            return c10Var2.onDown(motionEvent) | z9;
        }
        if (i10 == 1) {
            b10Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (b10Var.o) {
                onFling = b10Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (b10Var.j) {
                    qVar.removeMessages(3);
                    b10Var.j = false;
                } else if (b10Var.k) {
                    boolean onSingleTapUp = c10Var2.onSingleTapUp(motionEvent);
                    if (b10Var.i && (c10Var = b10Var.g) != null) {
                        c10Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = b10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, b10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > b10Var.c || Math.abs(xVelocity) > b10Var.c) {
                        onFling = c10Var2.onFling(b10Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = b10Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            b10Var.n = obtain;
            VelocityTracker velocityTracker2 = b10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                b10Var.v = null;
            }
            b10Var.o = false;
            b10Var.i = false;
            qVar.removeMessages(1);
            qVar.removeMessages(2);
            return onFling;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                b10Var.v.recycle();
                b10Var.v = null;
                b10Var.o = false;
                b10Var.h = false;
                b10Var.k = false;
                b10Var.l = false;
                b10Var.i = false;
                if (b10Var.j) {
                    b10Var.j = false;
                    return false;
                }
            } else if (i10 == 5) {
                b10Var.p = f13;
                b10Var.r = f13;
                b10Var.q = f14;
                b10Var.s = f14;
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                b10Var.o = false;
                b10Var.k = false;
                b10Var.l = false;
                b10Var.i = false;
                if (b10Var.j) {
                    b10Var.j = false;
                    return false;
                }
            } else if (i10 == 6) {
                b10Var.p = f13;
                b10Var.r = f13;
                b10Var.q = f14;
                b10Var.s = f14;
                b10Var.v.computeCurrentVelocity(1000, b10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = b10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = b10Var.v.getYVelocity(pointerId2);
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    if (i12 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        if ((b10Var.v.getYVelocity(pointerId3) * yVelocity2) + (b10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            b10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!b10Var.j) {
            float f15 = b10Var.p - f13;
            float f16 = b10Var.q - f14;
            if (b10Var.o) {
                return b10Var.g.onDoubleTapEvent(motionEvent);
            }
            if (b10Var.k) {
                int i13 = (int) (f13 - b10Var.r);
                int i14 = (int) (f14 - b10Var.s);
                int i15 = (i14 * i14) + (i13 * i13);
                if (i15 > b10Var.a) {
                    z10 = c10Var2.onScroll(b10Var.m, motionEvent, f15, f16);
                    b10Var.p = f13;
                    b10Var.q = f14;
                    b10Var.k = false;
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    qVar.removeMessages(2);
                } else {
                    z10 = false;
                }
                if (i15 > b10Var.a) {
                    b10Var.l = false;
                }
                return z10;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = c10Var2.onScroll(b10Var.m, motionEvent, f15, f16);
                b10Var.p = f13;
                b10Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    public void o0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + q0());
    }

    @Override // ue.a
    public /* synthetic */ boolean o1() {
        return false;
    }

    public void p0(long j3) {
        long q02 = q0();
        if (q02 != j3) {
            if (q02 != -1) {
                if (q02 != -2) {
                    return;
                } else {
                    q02 = -2;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(q02);
            throw new IOException(t6.toString());
        }
    }

    @Override // jg.y1
    public void q(int i7) {
        org.telegram.ui.Wallet.v9 v9Var = (org.telegram.ui.Wallet.v9) this.b;
        if (v9Var.r || i7 != v9Var.J) {
            return;
        }
        v9Var.j0(v9Var.N.getText().toString().trim());
    }

    public long q0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // ti.m
    public boolean r() {
        wt wtVar = (wt) this.b;
        return (wtVar.K1 == wtVar.i1 && wtVar.u1 && "inapp".equals(org.telegram.messenger.qp.s1(wtVar.a).A3)) ? false : true;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 t(Class cls, y1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (y1.c cVar : (y1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // ue.a
    public void t0() {
        ((t41) this.b).h.c(true);
    }

    @Override // ti.m
    public /* synthetic */ boolean u() {
        return false;
    }

    @Override // ti.m
    public void v(Rect rect) {
        rect.setEmpty();
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // ti.m
    public /* synthetic */ View x(LaunchActivity launchActivity) {
        return null;
    }

    @Override // sg.u0
    public boolean z() {
        return true;
    }

    public rt(boolean z9) {
        this.a = 8;
        this.b = new AtomicBoolean(z9);
    }

    public rt(int i7) {
        this.a = i7;
        switch (i7) {
            case 10:
                this.b = new ArrayDeque(16);
                break;
            case 27:
                break;
            default:
                this.b = h9.i0.p();
                break;
        }
    }

    public rt(y1.c[] initializers) {
        this.a = 26;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    @Override // tg.l1
    public float get() {
        org.telegram.ui.wp0 wp0Var = (org.telegram.ui.wp0) this.b;
        int i7 = wp0Var.y1;
        sg.h currentBrush = wp0Var.F0.getCurrentBrush();
        if (currentBrush == null) {
            return sg.l0.e(i7).i;
        }
        return sg.l0.e(i7).f(String.valueOf(sg.h.a.indexOf(currentBrush)), currentBrush.d());
    }

    public rt(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 15;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.b = new org.telegram.ui.ky0(uri, clipDescription, uri2, 15);
        }
    }

    public rt(Context context, c10 c10Var) {
        this.a = 1;
        this.b = new b10(context, c10Var);
    }

    @Override // ti.m
    public /* synthetic */ void B(View view) {
    }

    @Override // ti.m
    public void C(SurfaceTexture surfaceTexture) {
    }

    @Override // ti.m
    public /* synthetic */ void J(float f10) {
    }

    @Override // ti.m
    public /* synthetic */ void S(View view) {
    }

    @Override // ti.m
    public void c(long j3) {
    }

    @Override // ti.m
    public /* synthetic */ void e(View view) {
    }

    @Override // ti.m
    public /* synthetic */ void f0(int i7) {
    }

    @Override // ti.m
    public void g(ti.p pVar) {
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }

    @Override // ti.m
    public /* synthetic */ void y(View view) {
    }

    @Override // ti.m
    public /* synthetic */ void F() {
    }

    @Override // ti.m
    public void f() {
    }

    @Override // sg.u0
    public /* synthetic */ void o() {
    }

    @Override // sg.u0
    public void p() {
    }

    @Override // ti.m
    public /* synthetic */ void Z(int i7, ArrayList arrayList) {
    }

    @Override // ue.a
    public /* synthetic */ void s(float f10, float f11) {
    }

    @Override // ti.m
    public /* synthetic */ void c0(Canvas canvas, int i7, int i10) {
    }

    @Override // ue.a
    public /* synthetic */ void l1(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void m(View view, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void w(View view, float f10, float f11) {
    }
}
