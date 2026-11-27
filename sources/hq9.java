// default package

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class hq9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rr9 b;

    public /* synthetic */ hq9(rr9 rr9Var, byte b) {
        this.a = b;
        this.b = rr9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        qr9 qr9Var;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 1;
        rr9 rr9Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new hq9(rr9Var, b3));
                break;
            case 1:
                kq9.a0.remove(rr9Var);
                break;
            case 2:
                xz0 xz0Var = rr9Var.e;
                ArrayDeque arrayDeque = rr9Var.j;
                if (!rr9Var.h && rr9Var.f != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    qr9 qr9Var2 = rr9Var.g;
                    boolean z = qr9Var2 != null && qr9Var2.b();
                    long j2 = -1;
                    if (z) {
                        rr9Var.p = -1L;
                    } else {
                        j2 = rr9Var.p;
                        if (j2 < 0) {
                            rr9Var.p = elapsedRealtime;
                            j2 = elapsedRealtime;
                        }
                    }
                    boolean z2 = z || elapsedRealtime - j2 < 1500;
                    if (z2 != rr9Var.o) {
                        rr9Var.o = z2;
                        rr9Var.q = elapsedRealtime;
                        rr9Var.c("video ".concat(z2 ? "on" : "off"));
                        rr9Var.f.r1((!z2 || (qr9Var = rr9Var.g) == null) ? null : qr9Var.getSurface());
                        xz0Var.getClass();
                        xz0Var.E = z2 ? (byte) 2 : (byte) 1;
                    }
                    int l0 = rr9Var.f.l0();
                    if (l0 > 1) {
                        int i = l0 - 1;
                        rr9Var.f.P(0, i);
                        for (int i2 = 0; i2 < i && !arrayDeque.isEmpty(); i2++) {
                            arrayDeque.pollFirst();
                        }
                    }
                    int l02 = rr9Var.f.l0();
                    Iterator it = arrayDeque.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Long l = (Long) it.next();
                            int i4 = i3 + 1;
                            if (i3 == l02) {
                                j = Math.max(0L, rr9Var.f.k()) + l.longValue();
                            } else {
                                i3 = i4;
                            }
                        } else {
                            j = -1;
                        }
                    }
                    boolean z3 = rr9Var.f.h() == 3 && rr9Var.f.s();
                    long j3 = rr9Var.q;
                    boolean z4 = j3 >= 0 && elapsedRealtime - j3 < 500;
                    if (j >= 0 && (z3 || !z4)) {
                        xz0Var.p = j;
                        boolean z5 = xz0Var.q;
                        xz0Var.q = z3;
                        if (z3 && !xz0Var.t) {
                            xz0Var.t = true;
                            xz0Var.B();
                        }
                        if (xz0Var.c == 4 || xz0Var.g >= 0 || xz0Var.f < 0) {
                            xz0Var.E();
                        } else {
                            if (z3) {
                                xz0Var.u = false;
                            } else if (xz0Var.t && !xz0Var.h && !xz0Var.u) {
                                xz0Var.h = true;
                                xz0Var.i++;
                                mz0 mz0Var = xz0Var.a;
                                StringBuilder o = ik8.o(j, "stall at ", ", buffered to ");
                                o.append(xz0Var.f);
                                mz0Var.c(o.toString());
                                xz0Var.E();
                                xz0Var.j();
                                xz0Var.w();
                            }
                            if (z3 && !z5 && xz0Var.h) {
                                xz0Var.h = false;
                            }
                            xz0Var.E();
                            xz0Var.j();
                            xz0Var.w();
                        }
                    }
                    rr9Var.b.postDelayed(rr9Var.n, 100L);
                    break;
                }
                break;
            default:
                if (!rr9Var.h) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(ig8.c.a, 144179200);
                    ec3.a(jn7.d3, 0, "bufferForPlaybackMs", "0");
                    ec3.a(jn7.d3, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    ec3.a(1000, jn7.d3, "minBufferMs", "bufferForPlaybackMs");
                    ec3.a(1000, jn7.d3, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    ec3.a(30000, 1000, "maxBufferMs", "minBufferMs");
                    ec3.a(jn7.d3, 0, "bufferForPlaybackMs", "0");
                    ec3.a(jn7.d3, 0, "bufferForPlaybackAfterRebufferMs", "0");
                    ec3.a(1000, jn7.d3, "minBufferMs", "bufferForPlaybackMs");
                    ec3.a(1000, jn7.d3, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                    ec3.a(30000, 1000, "maxBufferMs", "minBufferMs");
                    ec3 ec3Var = new ec3(new cf0(), 1000, 1000, 30000, 30000, jn7.d3, jn7.d3, jn7.d3, jn7.d3, true, hashMap);
                    Context context = a.b;
                    f64 f64Var = new f64(context, new hc3(new or9(a.b), b2), new b00(context, b3));
                    Looper looper = rr9Var.a.getLooper();
                    yve.p(!f64Var.A);
                    looper.getClass();
                    f64Var.i = looper;
                    f64Var.b(ec3Var);
                    s64 a = f64Var.a();
                    rr9Var.f = a;
                    a.i0(new oz(3, 0, 1, 1, false, 0, true), false);
                    rr9Var.f.R(rr9Var.i);
                    rr9Var.f.m.a(new c30(rr9Var, r4));
                    qr9 qr9Var3 = rr9Var.g;
                    if (qr9Var3 != null && rr9Var.o) {
                        rr9Var.f.r1(qr9Var3.getSurface());
                    }
                    rr9Var.f.V(true);
                    xz0 xz0Var2 = rr9Var.e;
                    if (xz0Var2.c == 0) {
                        xz0Var2.a.c("start");
                        xz0Var2.y();
                    }
                    rr9Var.b.postDelayed(rr9Var.n, 100L);
                    break;
                }
                break;
        }
    }
}
