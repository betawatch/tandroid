package c5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class y implements ServiceConnection {
    public final d a;
    public final com.google.android.gms.internal.play_billing.m b;
    public final com.google.android.gms.internal.play_billing.m c;
    public final /* synthetic */ c d;

    public y(c cVar, d dVar) {
        this.d = cVar;
        com.google.android.gms.internal.play_billing.h hVar = cVar.B;
        this.b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.a = dVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.b;
            if (!mVar.b) {
                return null;
            }
            long a2 = mVar.a.a();
            if (!mVar.b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            mVar.b = false;
            long j3 = (a2 - mVar.d) + mVar.c;
            mVar.c = j3;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j3, TimeUnit.NANOSECONDS));
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.c;
        if (!mVar2.b) {
            return null;
        }
        long a10 = mVar2.a.a();
        if (!mVar2.b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        mVar2.b = false;
        long j10 = (a10 - mVar2.d) + mVar2.c;
        mVar2.c = j10;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
    }

    public final void b(h hVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i11 = hVar.a;
            s10.c();
            k3.r((k3) s10.b, i11);
            String str2 = hVar.c;
            s10.c();
            k3.o((k3) s10.b, str2);
            s10.c();
            k3.q((k3) s10.b, i10);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.b, str);
            }
            Long a2 = a(z10);
            c cVar = this.d;
            if (!z10) {
                z3 p5 = a4.p();
                p5.c();
                a4.n((a4) p5.b, (k3) s10.a());
                if (a2 != null) {
                    long longValue = a2.longValue();
                    p5.c();
                    a4.o((a4) p5.b, longValue);
                }
                cVar.h.r0((a4) p5.a());
                return;
            }
            c4 r10 = d4.r();
            r10.d(false);
            r10.e();
            if (a2 != null) {
                long longValue2 = a2.longValue();
                r10.c();
                d4.p((d4) r10.b, longValue2);
            }
            f3 u10 = g3.u();
            u10.d(s10);
            u10.c();
            g3.t((g3) u10.b, 6);
            u10.e(r10);
            cVar.h((g3) u10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(h hVar) {
        c cVar = this.d;
        synchronized (cVar.a) {
            try {
                if (cVar.b == 3) {
                    return;
                }
                try {
                    this.a.onBillingSetupFinished(hVar);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            c cVar = this.d;
            if (c.q(cVar)) {
                pf.b bVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.b, 110);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar.m0((g3) u10.a());
            } else {
                cVar.h.q0(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        c cVar2 = this.d;
        synchronized (cVar2.a) {
            if (cVar2.b != 3 && cVar2.b != 0) {
                cVar2.k(0);
                cVar2.m();
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service connected.");
        c cVar = this.d;
        synchronized (cVar.a) {
            try {
                if (cVar.b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.b;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    aVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c ? (com.google.android.gms.internal.play_billing.c) queryLocalInterface : new com.google.android.gms.internal.play_billing.a(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                }
                cVar.i = aVar;
                if (c.f(new x(this, 0), 30000L, new androidx.activity.i(this, 11), cVar.r(), cVar.e()) == null) {
                    h u10 = cVar.u();
                    cVar.j(25, u10);
                    c(u10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            c cVar = this.d;
            if (c.q(cVar)) {
                pf.b bVar = cVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.b, 109);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar.m0((g3) u10.a());
            } else {
                cVar.h.s0(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.c;
        mVar.c = 0L;
        mVar.b = false;
        mVar.a();
        c cVar2 = this.d;
        synchronized (cVar2.a) {
            try {
                if (cVar2.b == 3) {
                    return;
                }
                cVar2.k(0);
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }
}
