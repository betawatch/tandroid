package org.telegram.ui.Cells;

import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.messenger.h10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fr0;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class aa implements m1, te.d, ne0, p90, wi.l, r0.m, hs0, ue.a, jg.y1, q5.b, x2.e1, com.google.android.gms.common.api.internal.q, hi.z, tg.q1, u2.m, com.google.android.gms.common.api.internal.n, v0.g, androidx.lifecycle.s0 {
    public static aa c;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ aa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public static aa F2() {
        if (c == null) {
            Point point = org.telegram.messenger.g0.q;
            c = new aa(point.x, point.y);
        }
        return c;
    }

    @Override // wi.l
    public /* synthetic */ boolean A1(boolean z10, float f10, en0 en0Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ j9 B2() {
        return null;
    }

    @Override // wi.l
    public boolean C2() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String D(long j3) {
        return null;
    }

    @Override // ue.a
    public void D0() {
        ((j51) this.b).h.c(true);
    }

    @Override // org.telegram.ui.Components.ne0
    public void E1(RectF rectF) {
        ((ji.q) this.b).l(rectF);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean F0(fj fjVar) {
        return true;
    }

    @Override // te.d
    public /* synthetic */ boolean G() {
        return false;
    }

    public ClipDescription G2() {
        return ((t0.h) this.b).getDescription();
    }

    @Override // te.d
    public /* synthetic */ boolean H(float f10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean H1(r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    public void H2() {
        r2.j jVar = (r2.j) this.b;
        int i7 = jVar.I - 1;
        jVar.I = i7;
        if (i7 > 0) {
            return;
        }
        int i10 = 0;
        for (r2.p pVar : jVar.K) {
            pVar.b();
            i10 += pVar.Z.a;
        }
        e2.m1[] m1VarArr = new e2.m1[i10];
        int i11 = 0;
        for (r2.p pVar2 : jVar.K) {
            pVar2.b();
            int i12 = pVar2.Z.a;
            int i13 = 0;
            while (i13 < i12) {
                pVar2.b();
                m1VarArr[i11] = pVar2.Z.a(i13);
                i13++;
                i11++;
            }
        }
        jVar.J = new x2.r1(m1VarArr);
        jVar.H.V(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean I2(MotionEvent motionEvent) {
        boolean z10;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        boolean onFling;
        n10 n10Var;
        boolean z11;
        m10 m10Var = (m10) this.b;
        int i7 = m10.w;
        n10 n10Var2 = m10Var.f;
        android.support.v4.media.session.q qVar = m10Var.e;
        int action = motionEvent.getAction();
        if (m10Var.v == null) {
            m10Var.v = VelocityTracker.obtain();
        }
        m10Var.v.addMovement(motionEvent);
        int i10 = action & ks.e4;
        boolean z12 = i10 == 6;
        int actionIndex = z12 ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                f10 = motionEvent.getX(i11) + f10;
                f11 = motionEvent.getY(i11) + f11;
            }
        }
        float f12 = z12 ? pointerCount - 1 : pointerCount;
        float f13 = f10 / f12;
        float f14 = f11 / f12;
        if (i10 == 0) {
            if (m10Var.g != null && n10Var2.a()) {
                boolean hasMessages = qVar.hasMessages(3);
                if (hasMessages) {
                    qVar.removeMessages(3);
                }
                MotionEvent motionEvent4 = m10Var.m;
                if (motionEvent4 != null && (motionEvent3 = m10Var.n) != null && hasMessages && m10Var.l && motionEvent.getEventTime() - motionEvent3.getEventTime() <= 220) {
                    int x10 = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                    int y10 = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                    if ((y10 * y10) + (x10 * x10) < m10Var.b) {
                        m10Var.o = true;
                        z10 = m10Var.g.onDoubleTap(m10Var.m) | m10Var.g.onDoubleTapEvent(motionEvent);
                        m10Var.p = f13;
                        m10Var.r = f13;
                        m10Var.q = f14;
                        m10Var.s = f14;
                        motionEvent2 = m10Var.m;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        m10Var.m = MotionEvent.obtain(motionEvent);
                        m10Var.k = true;
                        m10Var.l = true;
                        m10Var.h = true;
                        m10Var.j = false;
                        m10Var.i = false;
                        if (m10Var.t) {
                            qVar.removeMessages(2);
                            qVar.sendEmptyMessageAtTime(2, m10Var.m.getDownTime() + i7 + m10Var.u);
                        }
                        qVar.sendEmptyMessageAtTime(1, m10Var.m.getDownTime() + i7);
                        return n10Var2.onDown(motionEvent) | z10;
                    }
                }
                qVar.sendEmptyMessageDelayed(3, 220L);
            }
            z10 = false;
            m10Var.p = f13;
            m10Var.r = f13;
            m10Var.q = f14;
            m10Var.s = f14;
            motionEvent2 = m10Var.m;
            if (motionEvent2 != null) {
            }
            m10Var.m = MotionEvent.obtain(motionEvent);
            m10Var.k = true;
            m10Var.l = true;
            m10Var.h = true;
            m10Var.j = false;
            m10Var.i = false;
            if (m10Var.t) {
            }
            qVar.sendEmptyMessageAtTime(1, m10Var.m.getDownTime() + i7);
            return n10Var2.onDown(motionEvent) | z10;
        }
        if (i10 == 1) {
            m10Var.h = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            if (m10Var.o) {
                onFling = m10Var.g.onDoubleTapEvent(motionEvent);
            } else {
                if (m10Var.j) {
                    qVar.removeMessages(3);
                    m10Var.j = false;
                } else if (m10Var.k) {
                    boolean onSingleTapUp = n10Var2.onSingleTapUp(motionEvent);
                    if (m10Var.i && (n10Var = m10Var.g) != null) {
                        n10Var.onSingleTapConfirmed(motionEvent);
                    }
                    onFling = onSingleTapUp;
                } else {
                    VelocityTracker velocityTracker = m10Var.v;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, m10Var.d);
                    float yVelocity = velocityTracker.getYVelocity(pointerId);
                    float xVelocity = velocityTracker.getXVelocity(pointerId);
                    if (Math.abs(yVelocity) > m10Var.c || Math.abs(xVelocity) > m10Var.c) {
                        onFling = n10Var2.onFling(m10Var.m, motionEvent, xVelocity, yVelocity);
                    }
                }
                onFling = false;
            }
            MotionEvent motionEvent5 = m10Var.n;
            if (motionEvent5 != null) {
                motionEvent5.recycle();
            }
            m10Var.n = obtain;
            VelocityTracker velocityTracker2 = m10Var.v;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                m10Var.v = null;
            }
            m10Var.o = false;
            m10Var.i = false;
            qVar.removeMessages(1);
            qVar.removeMessages(2);
            return onFling;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                m10Var.v.recycle();
                m10Var.v = null;
                m10Var.o = false;
                m10Var.h = false;
                m10Var.k = false;
                m10Var.l = false;
                m10Var.i = false;
                if (m10Var.j) {
                    m10Var.j = false;
                    return false;
                }
            } else if (i10 == 5) {
                m10Var.p = f13;
                m10Var.r = f13;
                m10Var.q = f14;
                m10Var.s = f14;
                qVar.removeMessages(1);
                qVar.removeMessages(2);
                qVar.removeMessages(3);
                m10Var.o = false;
                m10Var.k = false;
                m10Var.l = false;
                m10Var.i = false;
                if (m10Var.j) {
                    m10Var.j = false;
                    return false;
                }
            } else if (i10 == 6) {
                m10Var.p = f13;
                m10Var.r = f13;
                m10Var.q = f14;
                m10Var.s = f14;
                m10Var.v.computeCurrentVelocity(1000, m10Var.d);
                int actionIndex2 = motionEvent.getActionIndex();
                int pointerId2 = motionEvent.getPointerId(actionIndex2);
                float xVelocity2 = m10Var.v.getXVelocity(pointerId2);
                float yVelocity2 = m10Var.v.getYVelocity(pointerId2);
                for (int i12 = 0; i12 < pointerCount; i12++) {
                    if (i12 != actionIndex2) {
                        int pointerId3 = motionEvent.getPointerId(i12);
                        if ((m10Var.v.getYVelocity(pointerId3) * yVelocity2) + (m10Var.v.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                            m10Var.v.clear();
                            return false;
                        }
                    }
                }
            }
        } else if (!m10Var.j) {
            float f15 = m10Var.p - f13;
            float f16 = m10Var.q - f14;
            if (m10Var.o) {
                return m10Var.g.onDoubleTapEvent(motionEvent);
            }
            if (m10Var.k) {
                int i13 = (int) (f13 - m10Var.r);
                int i14 = (int) (f14 - m10Var.s);
                int i15 = (i14 * i14) + (i13 * i13);
                if (i15 > m10Var.a) {
                    z11 = n10Var2.onScroll(m10Var.m, motionEvent, f15, f16);
                    m10Var.p = f13;
                    m10Var.q = f14;
                    m10Var.k = false;
                    qVar.removeMessages(3);
                    qVar.removeMessages(1);
                    qVar.removeMessages(2);
                } else {
                    z11 = false;
                }
                if (i15 > m10Var.a) {
                    m10Var.l = false;
                }
                return z11;
            }
            if (Math.abs(f15) >= 1.0f || Math.abs(f16) >= 1.0f) {
                boolean onScroll = n10Var2.onScroll(m10Var.m, motionEvent, f15, f16);
                m10Var.p = f13;
                m10Var.q = f14;
                return onScroll;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean J1() {
        return false;
    }

    public void J2() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + L2());
    }

    @Override // wi.l
    public View K0() {
        return ((gu) this.b).O1;
    }

    public void K2(long j3) {
        long L2 = L2();
        if (L2 != j3) {
            if (L2 != -1) {
                if (L2 != -2) {
                    return;
                } else {
                    L2 = -2;
                }
            }
            StringBuilder t6 = a8.p0.t(j3, "expected non-string scope or scope ", " but found ");
            t6.append(L2);
            throw new IOException(t6.toString());
        }
    }

    public long L2() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // hi.z
    public void M1(tg.d dVar) {
        ((vp0) this.b).e0(dVar);
    }

    @Override // hi.z
    public FrameLayout N() {
        return ((vp0) this.b).d2.f0;
    }

    @Override // hi.z
    public long N1() {
        return ((vp0) this.b).getCaptionsTrimStart();
    }

    @Override // wi.l
    public boolean O0() {
        return false;
    }

    @Override // ue.a
    public void P0() {
        ((j51) this.b).h.c(false);
    }

    @Override // wi.l
    public void P1() {
        ((gu) this.b).M0();
    }

    @Override // hi.z
    public org.telegram.ui.ActionBar.i6 Q() {
        return ((vp0) this.b).A1;
    }

    @Override // hi.z
    public FrameLayout Q0() {
        return (vp0) this.b;
    }

    @Override // org.telegram.ui.Cells.m1
    public void Q1(r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ CharacterStyle R1(r1 r1Var) {
        return null;
    }

    @Override // hi.z
    public tg.d S() {
        return ((vp0) this.b).g0();
    }

    @Override // org.telegram.ui.Cells.m1
    public void S1(fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        ba baVar = (ba) this.b;
        f fVar = baVar.E;
        if (baVar.a()) {
            baVar.y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override // v0.g
    public void T(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e10, "e");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(c8.z.a(e10));
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean T1(r1 r1Var, fj fjVar) {
        return false;
    }

    @Override // ue.a
    public void U(float f10, float f11) {
        Runnable runnable = ((j51) this.b).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.hs0
    public void U0() {
        ((it0) this.b).J.a(-1);
    }

    @Override // hi.z
    public void V0(tg.n nVar) {
        ((vp0) this.b).t0(nVar);
    }

    @Override // wi.l
    public int V1() {
        return ((gu) this.b).Q1;
    }

    @Override // jg.y1
    public /* synthetic */ boolean W1(int i7) {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean X(r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.hs0
    public org.telegram.ui.ActionBar.y0 X0(String str) {
        org.telegram.ui.ActionBar.g5 g5Var = ((it0) this.b).J;
        return g5Var.d(0, 0, null, str, true, true, g5Var.n0);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Y() {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h Y0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean Z(r1 r1Var) {
        return false;
    }

    @Override // hi.z
    public long Z0() {
        return ((vp0) this.b).getCaptionsTrimEnd();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean a2(r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        s6.c cVar = (s6.c) ((s6.e) obj).n();
        q6.p pVar = (q6.p) this.b;
        Parcel j12 = cVar.j1();
        n7.a.b(j12, pVar);
        try {
            cVar.b.transact(1, j12, null, 1);
            j12.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            j12.recycle();
            throw th2;
        }
    }

    @Override // wi.l
    public void b() {
        a81 a81Var = ((gu) this.b).n1;
        if (a81Var == null || !a81Var.x) {
            return;
        }
        a81Var.a.g0();
        a81Var.n();
        a81Var.g0.d(true, true);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean b0() {
        return false;
    }

    @Override // wi.l
    public int b1() {
        return ((gu) this.b).P1;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean c1(r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean d() {
        return ((ba) this.b).a();
    }

    @Override // wi.l
    public float d2() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int e0() {
        return 0;
    }

    @Override // wi.l
    public boolean f0() {
        gu guVar = (gu) this.b;
        return (guVar.O1 == guVar.m1 && guVar.y1 && "inapp".equals(mp.u1(guVar.a).D3)) ? false : true;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // u2.m
    public void g(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.b).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void g0(Object obj) {
        LocationResult locationResult = (LocationResult) this.b;
        org.telegram.messenger.pa paVar = ((org.telegram.messenger.x9) obj).a;
        List list = locationResult.a;
        int size = list.size();
        paVar.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean g1(fj fjVar) {
        return c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public void g2(r1 r1Var, int i7, float f10, float f11, boolean z10) {
        ba baVar = (ba) this.b;
        f fVar = baVar.E;
        if (baVar.a()) {
            baVar.y = 0;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 11:
                return new i61((Context) ((org.telegram.ui.ActionBar.i5) this.b).a, new qb.a(28), new pb.b(28), 7);
            default:
                String packageName = ((Context) ((fd.a) this.b).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // wi.l
    public long getDuration() {
        return 0L;
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // u2.m
    public void h(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i7, 0, dVar.i, j3, i10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ jh.a h0() {
        return null;
    }

    @Override // wi.l
    public boolean h1() {
        return false;
    }

    @Override // tg.q1
    public void h2(float f10) {
        tg.t0 t0Var = (tg.t0) this.b;
        sg.j0.e(t0Var.a).k("-1", f10);
        t0Var.e.setBrushSize(f10);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // hi.z
    public tg.d i0() {
        tg.h0 h0Var = ((vp0) this.b).J0;
        for (int i7 = 0; i7 < h0Var.getChildCount(); i7++) {
            if (h0Var.getChildAt(i7) instanceof tg.d) {
                return (tg.d) h0Var.getChildAt(i7);
            }
        }
        return null;
    }

    @Override // wi.l
    public /* synthetic */ boolean i1() {
        return false;
    }

    @Override // x2.e1
    public void i2(x2.f1 f1Var) {
        r2.j jVar = (r2.j) this.b;
        jVar.H.i2(jVar);
    }

    @Override // wi.l
    public boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j0(r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.p90
    public Paint.FontMetricsInt j1() {
        return ((ti) this.b).C2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean j2(r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ String k(r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean k0(r1 r1Var, TLRPC.User user) {
        return false;
    }

    @Override // wi.l
    public /* synthetic */ boolean l0() {
        return false;
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        yk0 yk0Var = (yk0) this.b;
        yk0Var.w.setPadding(I0.a, I0.b, I0.c, I0.d);
        yk0Var.s.requestLayout();
        return r0.l1.b;
    }

    @Override // wi.l
    public long n() {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean n0() {
        return false;
    }

    @Override // wi.l
    public /* synthetic */ e2.c1 n1() {
        return null;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 o(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // wi.l
    public /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.hs0
    public org.telegram.ui.ActionBar.y0 o2(int i7, Runnable runnable, String str, boolean z10, boolean z11) {
        it0 it0Var = (it0) this.b;
        org.telegram.ui.ActionBar.y0 e10 = it0Var.J.e(0, i7, str);
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.n6.p7;
            e10.d(it0Var.s0(i10), it0Var.s0(i10));
        }
        e10.setOnClickListener(new ua0(this, z11, runnable));
        return e10;
    }

    @Override // v0.g
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        zd.m mVar = (zd.m) this.b;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ int p0(r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public void p1(r1 r1Var, int i7) {
        ba baVar = (ba) this.b;
        f fVar = baVar.E;
        if (baVar.a()) {
            baVar.y = 2;
            r1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean p2(r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // ue.a
    public boolean q1(float f10, float f11) {
        int L = org.telegram.messenger.g0.L(9.0f);
        RectF rectF = ((j51) this.b).g;
        float f12 = -L;
        rectF.inset(f12, f12);
        boolean contains = rectF.contains(f10, f11);
        float f13 = L;
        rectF.inset(f13, f13);
        return contains;
    }

    @Override // org.telegram.ui.Cells.m1
    public boolean r0() {
        return d();
    }

    @Override // ue.a
    public /* synthetic */ boolean r1(View view, float f10, float f11) {
        return false;
    }

    @Override // ue.a
    public /* synthetic */ boolean r2() {
        return false;
    }

    @Override // ue.a
    public /* synthetic */ boolean s0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ne0
    public void s1(boolean z10) {
        ((ji.q) this.b).setEditPillHidden(z10);
    }

    @Override // hi.z
    public void s2(long j3) {
        l2.g0 g0Var;
        PhotoViewer photoViewer = ((vp0) this.b).d2;
        h61 h61Var = photoViewer.G2;
        if (h61Var == null || (g0Var = h61Var.d) == null || !g0Var.f0()) {
            return;
        }
        photoViewer.G2.p0(j3);
    }

    @Override // u2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // hi.z
    public long u0() {
        return ((vp0) this.b).getCaptionsVideoPosition();
    }

    @Override // jg.y1
    public /* synthetic */ a0.h u1() {
        return null;
    }

    @Override // jg.y1
    public void v(int i7) {
        org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) this.b;
        if (oaVar.r || i7 != oaVar.K) {
            return;
        }
        oaVar.j0(oaVar.O.getText().toString().trim());
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean v0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override // wi.l
    public void v1() {
        gu guVar = (gu) this.b;
        guVar.N1 = null;
        guVar.L0();
    }

    @Override // org.telegram.ui.Components.ne0
    public ji.q v2() {
        return (ji.q) this.b;
    }

    @Override // hi.z
    public void w(boolean z10) {
        vp0 vp0Var = (vp0) this.b;
        PhotoViewer photoViewer = vp0Var.d2;
        h61 h61Var = photoViewer.G2;
        if (h61Var == null) {
            return;
        }
        if (z10) {
            if (h61Var.d0()) {
                vp0Var.c2 = true;
                photoViewer.n0();
                photoViewer.G2.g0();
                return;
            }
            return;
        }
        if (vp0Var.c2) {
            vp0Var.c2 = false;
            if (photoViewer.H2 || photoViewer.O1()) {
                return;
            }
            photoViewer.G2.h0();
        }
    }

    @Override // wi.l
    public void w0(Rect rect) {
        rect.setEmpty();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Components.p90
    public void x2(int i7, int i10, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.b;
        if (tiVar.b1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.b1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.l(spannableStringBuilder, tiVar.b1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.b1().setText(spannableStringBuilder);
            tiVar.b1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // wi.l
    public /* synthetic */ int y() {
        return 0;
    }

    @Override // wi.l
    public /* synthetic */ View y0(LaunchActivity launchActivity) {
        return null;
    }

    @Override // te.d
    public void y1() {
        ((org.telegram.ui.Components.f9) this.b).a.invalidate();
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 z(Class cls, y1.b bVar) {
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

    @Override // org.telegram.ui.Cells.m1
    public boolean z1(r1 r1Var, int i7) {
        return i7 == ((ba) this.b).y;
    }

    public aa(boolean z10) {
        this.a = 12;
        this.b = new AtomicBoolean(z10);
    }

    public aa(int i7) {
        this.a = i7;
        switch (i7) {
            case 14:
                this.b = new ArrayDeque(16);
                break;
            default:
                this.b = h9.i0.p();
                break;
        }
    }

    public aa(y1.c[] initializers) {
        this.a = 29;
        kotlin.jvm.internal.j.e(initializers, "initializers");
        this.b = initializers;
    }

    public aa(ArrayList arrayList) {
        this.a = 26;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public aa(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = 19;
        if (Build.VERSION.SDK_INT >= 25) {
            this.b = new t0.g(uri, clipDescription, uri2);
        } else {
            this.b = new i61(uri, clipDescription, uri2, 18);
        }
    }

    @Override // tg.q1
    public float get() {
        tg.t0 t0Var = (tg.t0) this.b;
        int i7 = t0Var.a;
        sg.h currentBrush = t0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return sg.j0.e(i7).i;
        }
        return sg.j0.e(i7).f("-1", currentBrush.d());
    }

    public aa(Context context, n10 n10Var) {
        this.a = 5;
        this.b = new m10(context, n10Var);
    }

    public aa(int i7, int i10) {
        this.a = 28;
        this.b = org.telegram.messenger.t0.b.getSharedPreferences(a8.p0.m(i7, i10, "pip_floating_", "_"), 0);
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A(r1 r1Var) {
    }

    @Override // wi.l
    public /* synthetic */ void B0(View view) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C1(r1 r1Var) {
    }

    @Override // wi.l
    public /* synthetic */ void D1(View view) {
    }

    @Override // wi.l
    public /* synthetic */ void D2(int i7) {
    }

    @Override // te.d
    public /* synthetic */ void E(boolean z10) {
    }

    @Override // wi.l
    public void E0(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.p90
    public /* synthetic */ void E2(String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void G0(r1 r1Var) {
    }

    @Override // wi.l
    public void I(wi.o oVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void M(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void N0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O(cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void O1(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void R(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void S0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W(fj fjVar) {
    }

    @Override // wi.l
    public void c(long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void d0(r1 r1Var) {
    }

    @Override // wi.l
    public /* synthetic */ void d1(float f10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void f1(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k2(r1 r1Var) {
    }

    @Override // wi.l
    public /* synthetic */ void l(View view) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m0(int i7) {
    }

    @Override // jg.y1
    public /* synthetic */ void m2(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q0(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q2(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void s(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t(r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t0(String str) {
    }

    @Override // wi.l
    public /* synthetic */ void z0(View view) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void H0() {
    }

    @Override // te.d
    public /* synthetic */ void K() {
    }

    @Override // wi.l
    public /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void U1() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e() {
    }

    @Override // wi.l
    public void f() {
    }

    @Override // u2.m
    public void flush() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void p() {
    }

    @Override // u2.m
    public void shutdown() {
    }

    @Override // u2.m
    public void start() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void u2() {
    }

    @Override // u2.m
    public void w1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void F1(r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void K1(r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void L(r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void W0(r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Y1(r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void b2(r1 r1Var, h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void l2(r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m1(r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // wi.l
    public /* synthetic */ void n2(int i7, ArrayList arrayList) {
    }

    @Override // ue.a
    public /* synthetic */ void u(float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A2(r1 r1Var, int i7, int i10) {
    }

    @Override // ue.a
    public /* synthetic */ void B(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void B1(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.p90
    public /* synthetic */ void G1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void I0(r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void J0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public void M0(r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void P(r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // ue.a
    public /* synthetic */ void X1(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Components.p90
    public /* synthetic */ void a0(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void a1(r1 r1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void o0(r1 r1Var, float f10, float f11) {
    }

    @Override // ue.a
    public /* synthetic */ void r(View view, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void t1(r1 r1Var, float f10, float f11) {
    }

    @Override // wi.l
    public /* synthetic */ void t2(Canvas canvas, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void x0(r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void A0(r1 r1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void C0(r1 r1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void Z1(r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void q(r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void m(r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void w2(r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public /* synthetic */ void c0(r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}
