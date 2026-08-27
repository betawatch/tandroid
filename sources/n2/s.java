package n2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s implements ServiceConnection {
    public final c a;
    public final com.google.android.gms.internal.play_billing.m b;
    public final com.google.android.gms.internal.play_billing.m c;
    public final /* synthetic */ b d;

    public s(b bVar, c cVar) {
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
        long a3 = mVar2.a.a();
        if (!mVar2.b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        mVar2.b = false;
        long j11 = (a3 - mVar2.d) + mVar2.c;
        mVar2.c = j11;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
    }

    public final void b(g gVar, int i10, String str, boolean z10) {
        try {
            i3 s10 = j3.s();
            int i11 = gVar.a;
            s10.c();
            j3.r((j3) s10.b, i11);
            String str2 = gVar.c;
            s10.c();
            j3.o((j3) s10.b, str2);
            s10.c();
            j3.q((j3) s10.b, i10);
            if (str != null) {
                s10.c();
                j3.n((j3) s10.b, str);
            }
            Long a2 = a(z10);
            b bVar = this.d;
            if (!z10) {
                y3 p6 = z3.p();
                p6.c();
                z3.n((z3) p6.b, (j3) s10.a());
                if (a2 != null) {
                    long longValue = a2.longValue();
                    p6.c();
                    z3.o((z3) p6.b, longValue);
                }
                bVar.h.B((z3) p6.a());
                return;
            }
            b4 r10 = c4.r();
            r10.d(false);
            r10.e();
            if (a2 != null) {
                long longValue2 = a2.longValue();
                r10.c();
                c4.p((c4) r10.b, longValue2);
            }
            e3 u10 = f3.u();
            u10.d(s10);
            u10.c();
            f3.t((f3) u10.b, 6);
            u10.e(r10);
            bVar.h((f3) u10.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
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
                    this.a.onBillingSetupFinished(gVar);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                g5.b bVar2 = bVar.h;
                e3 u10 = f3.u();
                u10.c();
                f3.t((f3) u10.b, 6);
                i3 s10 = j3.s();
                s10.c();
                j3.q((j3) s10.b, 110);
                u10.d(s10);
                b4 r10 = c4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.w((f3) u10.a());
            } else {
                bVar.h.A(k3.n());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
        b bVar3 = this.d;
        synchronized (bVar3.a) {
            if (bVar3.b != 3 && bVar3.b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
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
                if (b.f(new e7.p(this, 8), 30000L, new m.i3(this, 2), bVar.r(), bVar.e()) == null) {
                    g u10 = bVar.u();
                    bVar.j(25, u10);
                    c(u10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                g5.b bVar2 = bVar.h;
                e3 u10 = f3.u();
                u10.c();
                f3.t((f3) u10.b, 6);
                i3 s10 = j3.s();
                s10.c();
                j3.q((j3) s10.b, 109);
                u10.d(s10);
                b4 r10 = c4.r();
                r10.d(false);
                r10.e();
                u10.e(r10);
                bVar2.w((f3) u10.a());
            } else {
                bVar.h.C(a4.n());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
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
                    this.a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } finally {
            }
        }
    }
}
