package c5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import java.util.ArrayList;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h0 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ g c;

    public h0(g gVar, boolean z10) {
        this.c = gVar;
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
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        h0 h0Var;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    h0Var = this;
                    context.registerReceiver(h0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    h0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                h0Var.a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, h hVar, int i10, m3 m3Var, long j3, boolean z10) {
        o1 d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((pf.b) ((f0) this.c.d)).n0(e0.b(23, i10, hVar, null, m3Var), j3, z10);
                return;
            }
            f0 f0Var = (f0) this.c.d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i11 = o1.a;
            synchronized (o1.class) {
                int i12 = o1.a;
                q2 q2Var = q2.c;
                d = s1.d();
                int i13 = o1.a;
            }
            ((pf.b) f0Var).n0(g3.n(byteArray, d), j3, z10);
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
        m3 m3Var;
        h e7;
        long j3;
        ArrayList arrayList;
        h hVar;
        p3 p3Var;
        int intValue;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        m3 m3Var2 = m3.d;
        m3 m3Var3 = m3.c;
        m3 m3Var4 = m3.e;
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                m3Var = m3Var3;
            }
            m3Var = m3.b;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                m3Var = m3Var4;
            }
            m3Var = m3.b;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                m3Var = m3Var2;
            }
            m3Var = m3.b;
        }
        int i10 = (m3Var.equals(m3Var2) || m3Var.equals(m3Var4)) ? 2 : m3Var.equals(m3Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        g gVar = this.c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Bundle is null.");
            f0 f0Var = (f0) gVar.d;
            h hVar2 = g0.f;
            ((pf.b) f0Var).l0(e0.b(11, i10, hVar2, null, m3Var));
            q qVar = (q) gVar.c;
            if (qVar != null) {
                qVar.onPurchasesUpdated(hVar2, null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i11 = com.google.android.gms.internal.play_billing.u.a;
            c3.a a2 = h.a();
            a2.b = com.google.android.gms.internal.play_billing.u.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.u.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a2.c = intValue;
                    a2.a = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
                    e7 = a2.a();
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a2.c = intValue;
            a2.a = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
            e7 = a2.a();
        } else {
            e7 = com.google.android.gms.internal.play_billing.u.e("BillingBroadcastManager", intent);
        }
        long j10 = extras.getLong("billingClientTransactionId", 0L);
        boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!m3Var.equals(m3Var3) && !m3Var.equals(m3Var2)) {
            if (m3Var.equals(m3Var4)) {
                if (e7.a != 0) {
                    c(extras, e7, i10, m3Var, j10, z10);
                    q qVar2 = (q) gVar.c;
                    com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                    qVar2.onPurchasesUpdated(e7, com.google.android.gms.internal.play_billing.v.e);
                    return;
                }
                gVar.getClass();
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                f0 f0Var2 = (f0) gVar.d;
                h hVar3 = g0.f;
                ((pf.b) f0Var2).n0(e0.b(77, i10, hVar3, null, m3Var), j10, z10);
                q qVar3 = (q) gVar.c;
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                qVar3.onPurchasesUpdated(hVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j3 = 0;
            Purchase j11 = com.google.android.gms.internal.play_billing.u.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j11 == null) {
                com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
                if (e7.a != 0) {
                    f0 f0Var3 = (f0) gVar.d;
                    i3 c10 = e0.c(i10, m3Var);
                    pf.b bVar = (pf.b) f0Var3;
                    bVar.getClass();
                    try {
                        h3 h3Var = (h3) c10.g();
                        t3 t3Var = (t3) c10.n().g();
                        t3Var.c();
                        v3.n((v3) t3Var.b, z10);
                        h3Var.c();
                        i3.p((i3) h3Var.b, (v3) t3Var.a());
                        i3 i3Var = (i3) h3Var.a();
                        if (j10 == j3) {
                            p3Var = (p3) bVar.b;
                        } else {
                            o3 o3Var = (o3) ((p3) bVar.b).g();
                            o3Var.c();
                            p3.r((p3) o3Var.b, j10);
                            p3Var = (p3) o3Var.a();
                        }
                        bVar.t0(i3Var, p3Var);
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    }
                    hVar = e7;
                } else {
                    hVar = e7;
                    c(extras, hVar, i10, m3Var, j10, z10);
                }
                ((q) gVar.c).onPurchasesUpdated(hVar, arrayList);
            }
            arrayList2.add(j11);
        } else {
            j3 = 0;
            com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i12 = 0; i12 < stringArrayList.size() && i12 < stringArrayList2.size(); i12++) {
                Purchase j12 = com.google.android.gms.internal.play_billing.u.j(stringArrayList.get(i12), stringArrayList2.get(i12));
                if (j12 != null) {
                    arrayList2.add(j12);
                }
            }
        }
        arrayList = arrayList2;
        if (e7.a != 0) {
        }
        ((q) gVar.c).onPurchasesUpdated(hVar, arrayList);
    }
}
