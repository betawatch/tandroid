// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class idf extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ ej0 c;

    public idf(ej0 ej0Var, boolean z) {
        this.c = ej0Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (!this.a) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        idf idfVar;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    idfVar = this;
                    context.registerReceiver(idfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    idfVar = this;
                    context.registerReceiver(idfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                idfVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, fj0 fj0Var, int i, fme fmeVar, long j, boolean z) {
        qzd d;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ej0 ej0Var = this.c;
            if (byteArray == null) {
                ((rhb) ej0Var.d).x(ald.b(23, i, fj0Var, null, fmeVar), j, z);
                return;
            }
            rhb rhbVar = (rhb) ej0Var.d;
            byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = qzd.a;
            synchronized (qzd.class) {
                try {
                    int i3 = qzd.a;
                    kce kceVar = kce.c;
                    d = t1e.d();
                    int i4 = qzd.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rhbVar.x(gje.n(byteArray2, d), j, z);
        } catch (Throwable unused) {
            yid.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        fme fmeVar;
        fj0 e;
        long j;
        ArrayList arrayList;
        fj0 fj0Var;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        fme fmeVar2 = fme.d;
        fme fmeVar3 = fme.c;
        fme fmeVar4 = fme.e;
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                fmeVar = fmeVar3;
            }
            fmeVar = fme.b;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                fmeVar = fmeVar4;
            }
            fmeVar = fme.b;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                fmeVar = fmeVar2;
            }
            fmeVar = fme.b;
        }
        int i = (fmeVar.equals(fmeVar2) || fmeVar.equals(fmeVar4)) ? 2 : fmeVar.equals(fmeVar3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        ej0 ej0Var = this.c;
        if (extras == null) {
            yid.h("BillingBroadcastManager", "Bundle is null.");
            rhb rhbVar = (rhb) ej0Var.d;
            fj0 fj0Var2 = sld.f;
            rhbVar.v(ald.b(11, i, fj0Var2, null, fmeVar));
            cj0 cj0Var = (cj0) ej0Var.c;
            if (cj0Var != null) {
                cj0Var.m(fj0Var2, null, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = yid.a;
            g1 a = fj0.a();
            a.a = yid.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                yid.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    yid.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a.b = intValue;
                    a.c = yid.f("BillingBroadcastManager", intent.getExtras());
                    e = a.a();
                } else {
                    yid.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a.b = intValue;
            a.c = yid.f("BillingBroadcastManager", intent.getExtras());
            e = a.a();
        } else {
            e = yid.e("BillingBroadcastManager", intent);
        }
        long j2 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!fmeVar.equals(fmeVar3) && !fmeVar.equals(fmeVar2)) {
            if (fmeVar.equals(fmeVar4)) {
                if (e.a != 0) {
                    c(extras, e, i, fmeVar, j2, z);
                    cj0 cj0Var2 = (cj0) ej0Var.c;
                    tgd tgdVar = fhd.b;
                    cj0Var2.m(e, ojd.e, null);
                    return;
                }
                ej0Var.getClass();
                yid.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                rhb rhbVar2 = (rhb) ej0Var.d;
                fj0 fj0Var3 = sld.f;
                rhbVar2.x(ald.b(77, i, fj0Var3, null, fmeVar), j2, z);
                cj0 cj0Var3 = (cj0) ej0Var.c;
                tgd tgdVar2 = fhd.b;
                cj0Var3.m(fj0Var3, ojd.e, null);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            Purchase j3 = yid.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j3 == null) {
                yid.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
                if (e.a != 0) {
                    rhb rhbVar3 = (rhb) ej0Var.d;
                    gke c = ald.c(i, fmeVar);
                    rhbVar3.getClass();
                    try {
                        oje ojeVar = (oje) c.g();
                        ipe ipeVar = (ipe) c.n().g();
                        ipeVar.b();
                        hqe.n((hqe) ipeVar.b, z);
                        ojeVar.b();
                        gke.p((gke) ojeVar.b, (hqe) ipeVar.a());
                        gke gkeVar = (gke) ojeVar.a();
                        nne nneVar = (nne) rhbVar3.b;
                        if (j2 != j) {
                            cne cneVar = (cne) nneVar.g();
                            cneVar.b();
                            nne.r((nne) cneVar.b, j2);
                            nneVar = (nne) cneVar.a();
                        }
                        rhbVar3.L(gkeVar, nneVar);
                    } catch (Throwable th) {
                        yid.i("BillingLogger", "Unable to log.", th);
                    }
                    fj0Var = e;
                } else {
                    fj0Var = e;
                    c(extras, fj0Var, i, fmeVar, j2, z);
                }
                ((cj0) ej0Var.c).m(fj0Var, arrayList, null);
            }
            arrayList2.add(j3);
        } else {
            j = 0;
            yid.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i3 = 0; i3 < stringArrayList.size() && i3 < stringArrayList2.size(); i3++) {
                Purchase j4 = yid.j(stringArrayList.get(i3), stringArrayList2.get(i3));
                if (j4 != null) {
                    arrayList2.add(j4);
                }
            }
        }
        arrayList = arrayList2;
        if (e.a != 0) {
        }
        ((cj0) ej0Var.c).m(fj0Var, arrayList, null);
    }
}
