package n2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.h4;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.k4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.internal.play_billing.w0;
import f7.b6;
import f7.d7;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends b {
    public final Context C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile df.a F;
    public volatile ScheduledExecutorService G;

    public y(ya.b bVar, Context context, a9.c cVar) {
        super(bVar, context, cVar);
        this.D = 0;
        this.C = context;
    }

    public final t0 E(int i9) {
        if (!J()) {
            com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service is not ready.");
            F(94, 28, b0.a(-1, "Billing Override Service connection is disconnected."));
            return new r0(0);
        }
        w wVar = new w(this, i9, 0);
        h4 h4Var = new h4();
        h4Var.c = new k4();
        j4 j4Var = new j4(h4Var);
        h4Var.b = j4Var;
        h4Var.a = w.class;
        try {
            wVar.i(h4Var);
            h4Var.a = "billingOverrideService.getBillingOverride";
            return j4Var;
        } catch (Exception e10) {
            g2 g2Var = new g2(e10);
            b6 b6Var = g4.f;
            i4 i4Var = j4Var.b;
            if (b6Var.d(i4Var, null, g2Var)) {
                g4.c(i4Var);
            }
            return j4Var;
        }
    }

    public final void F(int i9, int i10, g gVar) {
        int i11 = z.a;
        g3 b10 = z.b(i9, i10, gVar, null, m3.b);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.h.w(b10);
    }

    public final void G(int i9, q0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        t0 E = E(i9);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.G;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!E.isDone()) {
            w0 w0Var = new w0();
            w0Var.n = E;
            u0 u0Var = new u0();
            u0Var.a = w0Var;
            w0Var.r = scheduledExecutorService.schedule(u0Var, 28500L, timeUnit);
            E.a(u0Var, p0.a);
            E = w0Var;
        }
        d5.w wVar = new d5.w();
        wVar.a = i9;
        wVar.b = aVar;
        wVar.c = runnable;
        wVar.d = this;
        E.a(new q0(E, wVar), e());
    }

    public final synchronized boolean J() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override // n2.b, n2.a
    public final void a(final d7 d7Var, final h hVar) {
        G(4, new q0.a() { // from class: n2.v
            @Override // q0.a
            public final void accept(Object obj) {
                String str = d7Var.a;
                hVar.a((g) obj, str);
            }
        }, new q1(this, d7Var, hVar, false, 10));
    }

    @Override // n2.b, n2.a
    public final g b(Activity activity, f fVar) {
        int i9 = 0;
        try {
            i9 = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            F(102, 28, b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(95, 28, b0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (i9 > 0) {
            g a2 = b0.a(i9, "Billing override value was set by a license tester.");
            F(93, 2, a2);
            D(a2);
            return a2;
        }
        try {
            return super.b(activity, fVar);
        } catch (Exception e12) {
            g gVar = b0.f;
            F(103, 2, gVar);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An internal error occurred.", e12);
            return gVar;
        }
    }

    @Override // n2.b, n2.a
    public final void c(p pVar, org.telegram.messenger.d dVar) {
        G(7, new u(dVar, 0), new q1(this, pVar, dVar, false, 9));
    }

    @Override // n2.b, n2.a
    public final void d(BillingController billingController) {
        synchronized (this) {
            if (J()) {
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i9 = z.a;
                i3 c10 = z.c(26, m3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                g5.b bVar = this.h;
                bVar.getClass();
                try {
                    bVar.F(c10, (p3) bVar.b);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
                }
            } else {
                int i10 = 1;
                if (this.D == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else {
                    int i11 = 3;
                    if (this.D == 3) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                        F(38, 26, b0.a(-1, "Billing Override Service connection is disconnected."));
                    } else {
                        this.D = 1;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.F = new df.a(this, i11);
                        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                        Context context = this.C;
                        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            i10 = 41;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    if (context.bindService(intent2, this.F, 1)) {
                                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                    } else {
                                        com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                    }
                                }
                                i10 = 39;
                            }
                        }
                        this.D = 0;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                        F(i10, 26, b0.a(2, "Billing Override Service unavailable on device."));
                    }
                }
            }
        }
        l(billingController);
    }

    public y(ya.b bVar, Context context, n nVar, a9.c cVar) {
        super(bVar, context, nVar, cVar);
        this.D = 0;
        this.C = context;
    }
}
