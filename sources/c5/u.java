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
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u implements ServiceConnection {
    public final c a;
    public final com.google.android.gms.internal.play_billing.m b;
    public final com.google.android.gms.internal.play_billing.m c;
    public final /* synthetic */ b d;

    public u(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.a = cVar;
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
            long j10 = (a2 - mVar.d) + mVar.c;
            mVar.c = j10;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
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
        long j11 = (a10 - mVar2.d) + mVar2.c;
        mVar2.c = j11;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
    }

    public final void b(g gVar, int i10, String str, boolean z10) {
        try {
            j3 s10 = k3.s();
            int i11 = gVar.a;
            s10.c();
            k3.r((k3) s10.b, i11);
            String str2 = gVar.c;
            s10.c();
            k3.o((k3) s10.b, str2);
            s10.c();
            k3.q((k3) s10.b, i10);
            if (str != null) {
                s10.c();
                k3.n((k3) s10.b, str);
            }
            Long a2 = a(z10);
            b bVar = this.d;
            if (!z10) {
                z3 p5 = a4.p();
                p5.c();
                a4.n((a4) p5.b, (k3) s10.a());
                if (a2 != null) {
                    long longValue = a2.longValue();
                    p5.c();
                    a4.o((a4) p5.b, longValue);
                }
                bVar.h.y0((a4) p5.a());
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
            bVar.h((g3) u10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(g gVar) {
        b bVar = this.d;
        synchronized (bVar.a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                try {
                    this.a.a(gVar);
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
            b bVar = this.d;
            if (b.q(bVar)) {
                hf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.b, zs.v1);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.s0((g3) u10.a());
            } else {
                bVar.h.x0(l3.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        b bVar3 = this.d;
        synchronized (bVar3.a) {
            if (bVar3.b != 3 && bVar3.b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.a.b();
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
        b bVar = this.d;
        synchronized (bVar.a) {
            try {
                if (bVar.b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.b;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    aVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.c ? (com.google.android.gms.internal.play_billing.c) queryLocalInterface : new com.google.android.gms.internal.play_billing.a(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                }
                bVar.i = aVar;
                if (b.f(new t(this, 0), 30000L, new androidx.activity.i(this, 10), bVar.r(), bVar.e()) == null) {
                    g u10 = bVar.u();
                    bVar.j(25, u10);
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
            b bVar = this.d;
            if (b.q(bVar)) {
                hf.b bVar2 = bVar.h;
                f3 u10 = g3.u();
                u10.c();
                g3.t((g3) u10.b, 6);
                j3 s10 = k3.s();
                s10.c();
                k3.q((k3) s10.b, zs.u1);
                u10.d(s10);
                c4 r10 = d4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.s0((g3) u10.a());
            } else {
                bVar.h.z0(b4.n());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.c;
        mVar.c = 0L;
        mVar.b = false;
        mVar.a();
        b bVar3 = this.d;
        synchronized (bVar3.a) {
            try {
                if (bVar3.b == 3) {
                    return;
                }
                bVar3.k(0);
                try {
                    this.a.b();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }
}
