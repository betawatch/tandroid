package n2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.play_billing.f2;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.f4;
import com.google.android.gms.internal.play_billing.g4;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.h4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.j4;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p0;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.gms.internal.play_billing.w0;
import g7.a6;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x extends b {
    public final Context C;
    public volatile int D;
    public volatile com.google.android.gms.internal.play_billing.g E;
    public volatile ef.a F;
    public volatile ScheduledExecutorService G;

    public x(w9.d dVar, Context context, androidx.emoji2.text.f fVar) {
        super(dVar, context, fVar);
        this.D = 0;
        this.C = context;
    }

    public final t0 E(int i10) {
        if (!J()) {
            com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service is not ready.");
            F(94, 28, a0.a(-1, "Billing Override Service connection is disconnected."));
            return new r0(0);
        }
        v vVar = new v(this, i10, 0);
        g4 g4Var = new g4();
        g4Var.c = new j4();
        i4 i4Var = new i4(g4Var);
        g4Var.b = i4Var;
        g4Var.a = v.class;
        try {
            vVar.k(g4Var);
            g4Var.a = "billingOverrideService.getBillingOverride";
            return i4Var;
        } catch (Exception e9) {
            f2 f2Var = new f2(e9);
            a6 a6Var = f4.f;
            h4 h4Var = i4Var.b;
            if (a6Var.d(h4Var, null, f2Var)) {
                f4.c(h4Var);
            }
            return i4Var;
        }
    }

    public final void F(int i10, int i11, g gVar) {
        int i12 = y.a;
        f3 b10 = y.b(i10, i11, gVar, null, l3.b);
        Objects.requireNonNull(b10, "ApiFailure should not be null");
        this.h.w(b10);
    }

    public final void G(int i10, q0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        t0 E = E(i10);
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
        d5.x xVar = new d5.x();
        xVar.a = i10;
        xVar.b = aVar;
        xVar.c = runnable;
        xVar.d = this;
        E.a(new q0(E, xVar), e());
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
    public final void a(final ec.a aVar, final h hVar) {
        G(4, new q0.a() { // from class: n2.u
            @Override // q0.a
            public final void accept(Object obj) {
                String str = aVar.b;
                hVar.a((g) obj, str);
            }
        }, new q1(this, aVar, hVar, false, 10));
    }

    @Override // n2.b, n2.a
    public final g b(Activity activity, f fVar) {
        int i10 = 0;
        try {
            i10 = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e9) {
            F(102, 28, a0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e9);
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(95, 28, a0.p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
        }
        if (i10 > 0) {
            g a2 = a0.a(i10, "Billing override value was set by a license tester.");
            F(93, 2, a2);
            D(a2);
            return a2;
        }
        try {
            return super.b(activity, fVar);
        } catch (Exception e11) {
            g gVar = a0.f;
            F(103, 2, gVar);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An internal error occurred.", e11);
            return gVar;
        }
    }

    @Override // n2.b, n2.a
    public final void c(n1.d dVar, org.telegram.messenger.d dVar2) {
        G(7, new t(dVar2, 0), new q1(this, dVar, dVar2, false, 9));
    }

    @Override // n2.b, n2.a
    public final void d(BillingController billingController) {
        synchronized (this) {
            if (J()) {
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i10 = y.a;
                h3 c10 = y.c(26, l3.b);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                g5.b bVar = this.h;
                bVar.getClass();
                try {
                    bVar.E(c10, (o3) bVar.b);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
                }
            } else {
                int i11 = 1;
                if (this.D == 1) {
                    com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else {
                    int i12 = 3;
                    if (this.D == 3) {
                        com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                        F(38, 26, a0.a(-1, "Billing Override Service connection is disconnected."));
                    } else {
                        this.D = 1;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Starting Billing Override Service setup.");
                        this.F = new ef.a(this, i12);
                        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                        Context context = this.C;
                        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            i11 = 41;
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
                                i11 = 39;
                            }
                        }
                        this.D = 0;
                        com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                        F(i11, 26, a0.a(2, "Billing Override Service unavailable on device."));
                    }
                }
            }
        }
        l(billingController);
    }

    public x(w9.d dVar, Context context, n nVar, androidx.emoji2.text.f fVar) {
        super(dVar, context, nVar, fVar);
        this.D = 0;
        this.C = context;
    }
}
