package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                List list = ((y) this.b).e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                a1 a1Var = (a1) this.b;
                b1 b1Var = a1Var.g;
                if (b1Var != null) {
                    a1Var.a.a((s1) a1Var.c.b(b1Var).a(), 223);
                }
                a1Var.e();
                return;
            default:
                d2 d2Var = (d2) this.b;
                HashSet hashSet = d2Var.f;
                SharedPreferences sharedPreferences = d2Var.b;
                HashSet hashSet2 = d2Var.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j3 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = d2Var.h;
                if (j10 == 0 || currentTimeMillis - j10 >= j3) {
                    d2.i.b("Upload the feature usage report.", new Object[0]);
                    k1 l4 = l1.l();
                    String str = d2.j;
                    l4.c();
                    l1.n((l1) l4.b, str);
                    String str2 = d2Var.c;
                    l4.c();
                    l1.m((l1) l4.b, str2);
                    l1 l1Var = (l1) l4.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    g1 l10 = h1.l();
                    l10.c();
                    h1.n((h1) l10.b, arrayList);
                    l10.c();
                    h1.m((h1) l10.b, l1Var);
                    h1 h1Var = (h1) l10.a();
                    r1 m10 = s1.m();
                    m10.c();
                    s1.s((s1) m10.b, h1Var);
                    d2Var.a.a((s1) m10.a(), 243);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((d1) it.next()).a);
                            String i10 = sc.v.i("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(i10)) {
                                i10 = sc.v.i("feature_usage_timestamp_detected_feature_", num);
                            }
                            String i11 = sc.v.i("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(i10, i11)) {
                                long j11 = sharedPreferences.getLong(i10, 0L);
                                edit.remove(i10);
                                if (j11 != 0) {
                                    edit.putLong(i11, j11);
                                }
                            }
                        }
                    }
                    d2Var.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
