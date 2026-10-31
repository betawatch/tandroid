package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                List list = ((x) this.b).e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                z0 z0Var = (z0) this.b;
                a1 a1Var = z0Var.g;
                if (a1Var != null) {
                    z0Var.a.a((r1) z0Var.c.b(a1Var).a(), zs.A3);
                }
                z0Var.e();
                return;
            default:
                c2 c2Var = (c2) this.b;
                HashSet hashSet = c2Var.f;
                SharedPreferences sharedPreferences = c2Var.b;
                HashSet hashSet2 = c2Var.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j10 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = c2Var.h;
                if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                    c2.i.b("Upload the feature usage report.", new Object[0]);
                    j1 l4 = k1.l();
                    String str = c2.j;
                    l4.c();
                    k1.n((k1) l4.b, str);
                    String str2 = c2Var.c;
                    l4.c();
                    k1.m((k1) l4.b, str2);
                    k1 k1Var = (k1) l4.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    f1 l10 = g1.l();
                    l10.c();
                    g1.n((g1) l10.b, arrayList);
                    l10.c();
                    g1.m((g1) l10.b, k1Var);
                    g1 g1Var = (g1) l10.a();
                    q1 m10 = r1.m();
                    m10.c();
                    r1.s((r1) m10.b, g1Var);
                    c2Var.a.a((r1) m10.a(), zs.S3);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((c1) it.next()).a);
                            String h = sc.e.h("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(h)) {
                                h = sc.e.h("feature_usage_timestamp_detected_feature_", num);
                            }
                            String h10 = sc.e.h("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(h, h10)) {
                                long j12 = sharedPreferences.getLong(h, 0L);
                                edit.remove(h);
                                if (j12 != 0) {
                                    edit.putLong(h10, j12);
                                }
                            }
                        }
                    }
                    c2Var.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
