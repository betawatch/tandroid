package f5;

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
import org.telegram.messenger.r1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a0 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ e c;

    public a0(e eVar, boolean z9) {
        this.c = eVar;
        this.b = z9;
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
        a0 a0Var;
        try {
            try {
                if (this.a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    a0Var = this;
                    context.registerReceiver(a0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.b ? 4 : 2);
                } else {
                    a0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                a0Var.a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void c(Bundle bundle, f fVar, int i7, m3 m3Var, long j3, boolean z9) {
        o1 a10;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((q4.q) ((y) this.c.d)).j(x.b(23, i7, fVar, null, m3Var), j3, z9);
                return;
            }
            y yVar = (y) this.c.d;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i10 = o1.a;
            synchronized (o1.class) {
                int i11 = o1.a;
                q2 q2Var = q2.c;
                a10 = s1.a();
                int i12 = o1.a;
            }
            ((q4.q) yVar).j(g3.n(byteArray, a10), j3, z9);
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        m3 m3Var;
        f e10;
        long j3;
        ArrayList arrayList;
        f fVar;
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
        int i7 = (m3Var.equals(m3Var2) || m3Var.equals(m3Var4)) ? 2 : m3Var.equals(m3Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        e eVar = this.c;
        if (extras == null) {
            com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Bundle is null.");
            y yVar = (y) eVar.d;
            f fVar2 = z.f;
            ((q4.q) yVar).h(x.b(11, i7, fVar2, null, m3Var));
            n nVar = (n) eVar.c;
            if (nVar != null) {
                ((r1) nVar).n(fVar2, null, null);
                return;
            }
            return;
        }
        if (i7 == 2) {
            int i10 = com.google.android.gms.internal.play_billing.u.a;
            f3.a a10 = f.a();
            a10.b = com.google.android.gms.internal.play_billing.u.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    com.google.android.gms.internal.play_billing.u.g("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                    a10.c = intValue;
                    a10.a = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
                    e10 = a10.a();
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            intValue = 0;
            a10.c = intValue;
            a10.a = com.google.android.gms.internal.play_billing.u.f("BillingBroadcastManager", intent.getExtras());
            e10 = a10.a();
        } else {
            e10 = com.google.android.gms.internal.play_billing.u.e("BillingBroadcastManager", intent);
        }
        long j10 = extras.getLong("billingClientTransactionId", 0L);
        boolean z9 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!m3Var.equals(m3Var3) && !m3Var.equals(m3Var2)) {
            if (m3Var.equals(m3Var4)) {
                if (e10.a != 0) {
                    c(extras, e10, i7, m3Var, j10, z9);
                    n nVar2 = (n) eVar.c;
                    com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                    ((r1) nVar2).n(e10, com.google.android.gms.internal.play_billing.v.e, null);
                    return;
                }
                eVar.getClass();
                com.google.android.gms.internal.play_billing.u.h("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                y yVar2 = (y) eVar.d;
                f fVar3 = z.f;
                ((q4.q) yVar2).j(x.b(77, i7, fVar3, null, m3Var), j10, z9);
                n nVar3 = (n) eVar.c;
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                ((r1) nVar3).n(fVar3, com.google.android.gms.internal.play_billing.v.e, null);
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
                if (e10.a != 0) {
                    y yVar3 = (y) eVar.d;
                    i3 c10 = x.c(i7, m3Var);
                    q4.q qVar = (q4.q) yVar3;
                    qVar.getClass();
                    try {
                        h3 h3Var = (h3) c10.g();
                        t3 t3Var = (t3) c10.n().g();
                        t3Var.c();
                        v3.n((v3) t3Var.b, z9);
                        h3Var.c();
                        i3.p((i3) h3Var.b, (v3) t3Var.a());
                        i3 i3Var = (i3) h3Var.a();
                        if (j10 == j3) {
                            p3Var = (p3) qVar.b;
                        } else {
                            o3 o3Var = (o3) ((p3) qVar.b).g();
                            o3Var.c();
                            p3.r((p3) o3Var.b, j10);
                            p3Var = (p3) o3Var.a();
                        }
                        qVar.q(i3Var, p3Var);
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    }
                    fVar = e10;
                } else {
                    fVar = e10;
                    c(extras, fVar, i7, m3Var, j10, z9);
                }
                ((r1) ((n) eVar.c)).n(fVar, arrayList, null);
            }
            arrayList2.add(j11);
        } else {
            j3 = 0;
            com.google.android.gms.internal.play_billing.u.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i11 = 0; i11 < stringArrayList.size() && i11 < stringArrayList2.size(); i11++) {
                Purchase j12 = com.google.android.gms.internal.play_billing.u.j(stringArrayList.get(i11), stringArrayList2.get(i11));
                if (j12 != null) {
                    arrayList2.add(j12);
                }
            }
        }
        arrayList = arrayList2;
        if (e10.a != 0) {
        }
        ((r1) ((n) eVar.c)).n(fVar, arrayList, null);
    }
}
