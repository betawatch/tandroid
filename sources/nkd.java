// default package

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nkd extends ui0 {
    public final Context C;
    public volatile byte D;
    public volatile bcd E;
    public volatile d7a F;
    public volatile ScheduledExecutorService G;

    public nkd(f8e f8eVar, Context context, sk skVar) {
        super(f8eVar, context, skVar);
        this.D = (byte) 0;
        this.C = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bpd D(int i) {
        if (!I()) {
            yid.h("BillingClientTesting", "Billing Override Service is not ready.");
            E(94, 28, sld.a(-1, "Billing Override Service connection is disconnected."));
            return new qod(0);
        }
        ohd ohdVar = new ohd();
        ohdVar.b = this;
        ohdVar.a = i;
        j9f j9fVar = new j9f();
        j9fVar.c = new gif();
        jgf jgfVar = new jgf(j9fVar);
        j9fVar.b = jgfVar;
        j9fVar.a = ohd.class;
        try {
            ohdVar.a(j9fVar);
            j9fVar.a = "billingOverrideService.getBillingOverride";
            return jgfVar;
        } catch (Exception e) {
            c8e c8eVar = new c8e(e);
            g3f g3fVar = a7f.f;
            vef vefVar = jgfVar.b;
            if (g3fVar.d(vefVar, null, c8eVar)) {
                a7f.d(vefVar);
            }
            return jgfVar;
        }
    }

    public final void E(int i, int i2, fj0 fj0Var) {
        int i3 = ald.a;
        gje b = ald.b(i, i2, fj0Var, null, fme.b);
        Objects.requireNonNull(b, "ApiFailure should not be null");
        this.h.v(b);
    }

    public final void F(int i, gu2 gu2Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        bpd D = D(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (this.G == null) {
                this.G = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = this.G;
        }
        if (!D.isDone()) {
            wqd wqdVar = new wqd();
            wqdVar.n = D;
            zka zkaVar = new zka();
            zkaVar.b = wqdVar;
            wqdVar.r = scheduledExecutorService.schedule(zkaVar, 28500L, timeUnit);
            D.c(zkaVar, cnd.a);
            D = wqdVar;
        }
        ow7 ow7Var = new ow7(this, i, gu2Var, runnable);
        D.c(new tnd(D, ow7Var, (byte) 0), e());
    }

    public final synchronized boolean I() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override // ui0
    public final void a(du2 du2Var, eu2 eu2Var) {
        F(4, new un4(du2Var, eu2Var), new rz1(this, du2Var, eu2Var, false, (byte) 8));
    }

    @Override // ui0
    public final fj0 b(Activity activity, ej0 ej0Var) {
        int i = 0;
        try {
            i = ((Integer) D(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            E(nm7.m1, 28, sld.p);
            yid.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            E(95, 28, sld.p);
            yid.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (i > 0) {
            fj0 a = sld.a(i, "Billing override value was set by a license tester.");
            E(93, 2, a);
            C(a);
            return a;
        }
        try {
            return super.b(activity, ej0Var);
        } catch (Exception e3) {
            fj0 fj0Var = sld.f;
            E(nm7.n1, 2, fj0Var);
            yid.i("BillingClientTesting", "An internal error occurred.", e3);
            return fj0Var;
        }
    }

    @Override // ui0
    public final void c(oo8 oo8Var, xg0 xg0Var) {
        F(7, new un4((Object) xg0Var, (byte) 2), new rz1(this, oo8Var, xg0Var, false, (byte) 7));
    }

    @Override // ui0
    public final void d(cj0 cj0Var) {
        synchronized (this) {
            if (I()) {
                yid.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i = ald.a;
                gke c = ald.c(26, fme.b);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                rhb rhbVar = this.h;
                rhbVar.getClass();
                try {
                    rhbVar.L(c, (nne) rhbVar.b);
                } catch (Throwable th) {
                    yid.i("BillingLogger", "Unable to log.", th);
                }
            } else {
                int i2 = 1;
                if (this.D == 1) {
                    yid.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    yid.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    E(38, 26, sld.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.D = (byte) 1;
                    yid.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new d7a(this, (byte) 2);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    Context context = this.C;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i2 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                yid.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.F, 1)) {
                                    yid.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    yid.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i2 = 39;
                        }
                    }
                    this.D = (byte) 0;
                    yid.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    E(i2, 26, sld.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        l(cj0Var);
    }

    public nkd(f8e f8eVar, Context context, cj0 cj0Var, sk skVar) {
        super(f8eVar, context, cj0Var, skVar);
        this.D = (byte) 0;
        this.C = context;
    }
}
