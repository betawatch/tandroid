package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.u3;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ f c;

    public c0(f fVar, boolean z10) {
        this.c = fVar;
        this.b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        c0 c0Var;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    c0Var = this;
                    context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    c0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c0Var.a = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void c(Bundle bundle, g gVar, int i10, l3 l3Var, long j10, boolean z10) {
        n1 c10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((g5.b) ((z) this.c.d)).y(y.b(23, i10, gVar, null, l3Var), j10, z10);
                return;
            }
            z zVar = (z) this.c.d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i11 = n1.a;
            synchronized (n1.class) {
                int i12 = n1.a;
                p2 p2Var = p2.c;
                c10 = r1.c();
                int i13 = n1.a;
            }
            ((g5.b) zVar).y(f3.n(byteArray, c10), j10, z10);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0237  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        l3 l3Var;
        g e9;
        long j10;
        ArrayList arrayList;
        g gVar;
        o3 o3Var;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        l3 l3Var2 = l3.d;
        l3 l3Var3 = l3.c;
        l3 l3Var4 = l3.e;
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                l3Var = l3Var3;
            }
            l3Var = l3.b;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                l3Var = l3Var4;
            }
            l3Var = l3.b;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                l3Var = l3Var2;
            }
            l3Var = l3.b;
        }
        int i10 = (l3Var.equals(l3Var2) || l3Var.equals(l3Var4)) ? 2 : l3Var.equals(l3Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        f fVar = this.c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Bundle is null.");
            z zVar = (z) fVar.d;
            g gVar2 = a0.f;
            ((g5.b) zVar).w(y.b(11, i10, gVar2, null, l3Var));
            n nVar = (n) fVar.c;
            if (nVar != null) {
                nVar.onPurchasesUpdated(gVar2, null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i11 = com.google.android.gms.internal.play_billing.u.a;
            j3.a a2 = g.a();
            a2.a = com.google.android.gms.internal.play_billing.u.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.u.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a2.b = intValue;
                    a2.c = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
                    e9 = a2.a();
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a2.b = intValue;
            a2.c = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
            e9 = a2.a();
        } else {
            e9 = com.google.android.gms.internal.play_billing.u.e("BillingBroadcastManager", intent);
        }
        long j11 = extras.getLong("billingClientTransactionId", 0L);
        boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!l3Var.equals(l3Var3) && !l3Var.equals(l3Var2)) {
            if (l3Var.equals(l3Var4)) {
                if (e9.a != 0) {
                    c(extras, e9, i10, l3Var, j11, z10);
                    n nVar2 = (n) fVar.c;
                    com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                    nVar2.onPurchasesUpdated(e9, com.google.android.gms.internal.play_billing.v.e);
                    return;
                }
                fVar.getClass();
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                z zVar2 = (z) fVar.d;
                g gVar3 = a0.f;
                ((g5.b) zVar2).y(y.b(77, i10, gVar3, null, l3Var), j11, z10);
                n nVar3 = (n) fVar.c;
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                nVar3.onPurchasesUpdated(gVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j10 = 0;
            Purchase j12 = com.google.android.gms.internal.play_billing.u.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j12 == null) {
                com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
                if (e9.a != 0) {
                    z zVar3 = (z) fVar.d;
                    h3 c10 = y.c(i10, l3Var);
                    g5.b bVar = (g5.b) zVar3;
                    bVar.getClass();
                    try {
                        g3 g3Var = (g3) c10.g();
                        s3 s3Var = (s3) c10.n().g();
                        s3Var.c();
                        u3.n((u3) s3Var.b, z10);
                        g3Var.c();
                        h3.p((h3) g3Var.b, (u3) s3Var.a());
                        h3 h3Var = (h3) g3Var.a();
                        if (j11 == j10) {
                            o3Var = (o3) bVar.b;
                        } else {
                            n3 n3Var = (n3) ((o3) bVar.b).g();
                            n3Var.c();
                            o3.r((o3) n3Var.b, j11);
                            o3Var = (o3) n3Var.a();
                        }
                        bVar.E(h3Var, o3Var);
                    } catch (Throwable th) {
                        com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th);
                    }
                    gVar = e9;
                } else {
                    gVar = e9;
                    c(extras, gVar, i10, l3Var, j11, z10);
                }
                ((n) fVar.c).onPurchasesUpdated(gVar, arrayList);
            }
            arrayList2.add(j12);
        } else {
            j10 = 0;
            com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i12 = 0; i12 < stringArrayList.size() && i12 < stringArrayList2.size(); i12++) {
                Purchase j13 = com.google.android.gms.internal.play_billing.u.j(stringArrayList.get(i12), stringArrayList2.get(i12));
                if (j13 != null) {
                    arrayList2.add(j13);
                }
            }
        }
        arrayList = arrayList2;
        if (e9.a != 0) {
        }
        ((n) fVar.c).onPurchasesUpdated(gVar, arrayList);
    }
}
