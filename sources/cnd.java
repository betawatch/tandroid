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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class cnd extends vh0 {
    public final Context C;
    public volatile byte D;
    public volatile sed E;
    public volatile t8a F;
    public volatile ScheduledExecutorService G;

    public cnd(sae saeVar, Context context, tj tjVar) {
        super(saeVar, context, tjVar);
        this.D = (byte) 0;
        this.C = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final prd D(int i) {
        if (!I()) {
            old.h("BillingClientTesting", "Billing Override Service is not ready.");
            E(94, 28, hod.a(-1, "Billing Override Service connection is disconnected."));
            return new erd(0);
        }
        ekd ekdVar = new ekd();
        ekdVar.b = this;
        ekdVar.a = i;
        ybf ybfVar = new ybf();
        ybfVar.c = new vkf();
        yif yifVar = new yif(ybfVar);
        ybfVar.b = yifVar;
        ybfVar.a = ekd.class;
        try {
            ekdVar.a(ybfVar);
            ybfVar.a = "billingOverrideService.getBillingOverride";
            return yifVar;
        } catch (Exception e) {
            pae paeVar = new pae(e);
            x5f x5fVar = p9f.f;
            khf khfVar = yifVar.b;
            if (x5fVar.d(khfVar, null, paeVar)) {
                p9f.d(khfVar);
            }
            return yifVar;
        }
    }

    public final void E(int i, int i2, gi0 gi0Var) {
        int i3 = pnd.a;
        wle b = pnd.b(i, i2, gi0Var, null, uoe.b);
        Objects.requireNonNull(b, "ApiFailure should not be null");
        this.h.h(b);
    }

    public final void F(int i, pt2 pt2Var, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        prd D = D(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (this.G == null) {
                this.G = Executors.newSingleThreadScheduledExecutor();
            }
            scheduledExecutorService = this.G;
        }
        if (!D.isDone()) {
            jtd jtdVar = new jtd();
            jtdVar.n = D;
            bva bvaVar = new bva();
            bvaVar.b = jtdVar;
            jtdVar.r = scheduledExecutorService.schedule(bvaVar, 28500L, timeUnit);
            D.c(bvaVar, rpd.a);
            D = jtdVar;
        }
        ux7 ux7Var = new ux7(this, i, pt2Var, runnable);
        D.c(new iqd(D, ux7Var, (byte) 0), e());
    }

    public final synchronized boolean I() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override // vh0
    public final void a(mt2 mt2Var, nt2 nt2Var) {
        F(4, new yn4(mt2Var, nt2Var), new uy1(this, mt2Var, nt2Var, false, (byte) 8));
    }

    @Override // vh0
    public final gi0 b(Activity activity, fi0 fi0Var) {
        int i = 0;
        try {
            i = ((Integer) D(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            E(jn7.m1, 28, hod.p);
            old.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            E(95, 28, hod.p);
            old.i("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (i > 0) {
            gi0 a = hod.a(i, "Billing override value was set by a license tester.");
            E(93, 2, a);
            C(a);
            return a;
        }
        try {
            return super.b(activity, fi0Var);
        } catch (Exception e3) {
            gi0 gi0Var = hod.f;
            E(jn7.n1, 2, gi0Var);
            old.i("BillingClientTesting", "An internal error occurred.", e3);
            return gi0Var;
        }
    }

    @Override // vh0
    public final void c(k09 k09Var, tg0 tg0Var) {
        F(7, new yn4((Object) tg0Var, (byte) 2), new uy1(this, k09Var, tg0Var, false, (byte) 7));
    }

    @Override // vh0
    public final void d(di0 di0Var) {
        synchronized (this) {
            if (I()) {
                old.g("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i = pnd.a;
                wme c = pnd.c(26, uoe.b);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                zhc zhcVar = this.h;
                zhcVar.getClass();
                try {
                    zhcVar.r(c, (cqe) zhcVar.b);
                } catch (Throwable th) {
                    old.i("BillingLogger", "Unable to log.", th);
                }
            } else {
                int i2 = 1;
                if (this.D == 1) {
                    old.h("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.D == 3) {
                    old.h("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    E(38, 26, hod.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.D = (byte) 1;
                    old.g("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.F = new t8a(this, (byte) 2);
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
                                old.h("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (context.bindService(intent2, this.F, 1)) {
                                    old.g("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    old.h("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i2 = 39;
                        }
                    }
                    this.D = (byte) 0;
                    old.g("BillingClientTesting", "Billing Override Service unavailable on device.");
                    E(i2, 26, hod.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        l(di0Var);
    }

    public cnd(sae saeVar, Context context, di0 di0Var, tj tjVar) {
        super(saeVar, context, di0Var, tjVar);
        this.D = (byte) 0;
        this.C = context;
    }
}
