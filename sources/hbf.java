// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hbf extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ ei0 c;

    public hbf(ei0 ei0Var, boolean z) {
        this.c = ei0Var;
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
        hbf hbfVar;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    hbfVar = this;
                    context.registerReceiver(hbfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    hbfVar = this;
                    context.registerReceiver(hbfVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                hbfVar.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, fi0 fi0Var, int i, dke dkeVar, long j, boolean z) {
        nxd d;
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ei0 ei0Var = this.c;
            if (byteArray == null) {
                ((aec) ei0Var.d).k(yid.b(23, i, fi0Var, null, dkeVar), j, z);
                return;
            }
            aec aecVar = (aec) ei0Var.d;
            byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = nxd.a;
            synchronized (nxd.class) {
                try {
                    int i3 = nxd.a;
                    jae jaeVar = jae.c;
                    d = qzd.d();
                    int i4 = nxd.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            aecVar.k(fhe.n(byteArray2, d), j, z);
        } catch (Throwable unused) {
            xgd.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        dke dkeVar;
        fi0 e;
        long j;
        ArrayList arrayList;
        fi0 fi0Var;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        dke dkeVar2 = dke.d;
        dke dkeVar3 = dke.c;
        dke dkeVar4 = dke.e;
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                dkeVar = dkeVar3;
            }
            dkeVar = dke.b;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                dkeVar = dkeVar4;
            }
            dkeVar = dke.b;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                dkeVar = dkeVar2;
            }
            dkeVar = dke.b;
        }
        int i = (dkeVar.equals(dkeVar2) || dkeVar.equals(dkeVar4)) ? 2 : dkeVar.equals(dkeVar3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        ei0 ei0Var = this.c;
        if (extras == null) {
            xgd.h("BillingBroadcastManager", "Bundle is null.");
            aec aecVar = (aec) ei0Var.d;
            fi0 fi0Var2 = qjd.f;
            aecVar.i(yid.b(11, i, fi0Var2, null, dkeVar));
            ci0 ci0Var = (ci0) ei0Var.c;
            if (ci0Var != null) {
                ci0Var.m(fi0Var2, null, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = xgd.a;
            g1 a = fi0.a();
            a.a = xgd.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                xgd.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    xgd.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a.b = intValue;
                    a.c = xgd.f("BillingBroadcastManager", intent.getExtras());
                    e = a.a();
                } else {
                    xgd.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a.b = intValue;
            a.c = xgd.f("BillingBroadcastManager", intent.getExtras());
            e = a.a();
        } else {
            e = xgd.e("BillingBroadcastManager", intent);
        }
        long j2 = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!dkeVar.equals(dkeVar3) && !dkeVar.equals(dkeVar2)) {
            if (dkeVar.equals(dkeVar4)) {
                if (e.a != 0) {
                    c(extras, e, i, dkeVar, j2, z);
                    ci0 ci0Var2 = (ci0) ei0Var.c;
                    sed sedVar = efd.b;
                    ci0Var2.m(e, nhd.e, null);
                    return;
                }
                ei0Var.getClass();
                xgd.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                aec aecVar2 = (aec) ei0Var.d;
                fi0 fi0Var3 = qjd.f;
                aecVar2.k(yid.b(77, i, fi0Var3, null, dkeVar), j2, z);
                ci0 ci0Var3 = (ci0) ei0Var.c;
                sed sedVar2 = efd.b;
                ci0Var3.m(fi0Var3, nhd.e, null);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j = 0;
            Purchase j3 = xgd.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j3 == null) {
                xgd.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
                if (e.a != 0) {
                    aec aecVar3 = (aec) ei0Var.d;
                    fie c = yid.c(i, dkeVar);
                    aecVar3.getClass();
                    try {
                        nhe nheVar = (nhe) c.g();
                        fne fneVar = (fne) c.n().g();
                        fneVar.b();
                        eoe.n((eoe) fneVar.b, z);
                        nheVar.b();
                        fie.p((fie) nheVar.b, (eoe) fneVar.a());
                        fie fieVar = (fie) nheVar.a();
                        lle lleVar = (lle) aecVar3.b;
                        if (j2 != j) {
                            ale aleVar = (ale) lleVar.g();
                            aleVar.b();
                            lle.r((lle) aleVar.b, j2);
                            lleVar = (lle) aleVar.a();
                        }
                        aecVar3.t(fieVar, lleVar);
                    } catch (Throwable th) {
                        xgd.i("BillingLogger", "Unable to log.", th);
                    }
                    fi0Var = e;
                } else {
                    fi0Var = e;
                    c(extras, fi0Var, i, dkeVar, j2, z);
                }
                ((ci0) ei0Var.c).m(fi0Var, arrayList, null);
            }
            arrayList2.add(j3);
        } else {
            j = 0;
            xgd.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i3 = 0; i3 < stringArrayList.size() && i3 < stringArrayList2.size(); i3++) {
                Purchase j4 = xgd.j(stringArrayList.get(i3), stringArrayList2.get(i3));
                if (j4 != null) {
                    arrayList2.add(j4);
                }
            }
        }
        arrayList = arrayList2;
        if (e.a != 0) {
        }
        ((ci0) ei0Var.c).m(fi0Var, arrayList, null);
    }
}
