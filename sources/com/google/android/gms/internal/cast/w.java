package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i9) {
        this.a = i9;
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
                long j10 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = d2Var.h;
                if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                    d2.i.b("Upload the feature usage report.", new Object[0]);
                    k1 l10 = l1.l();
                    String str = d2.j;
                    l10.c();
                    l1.n((l1) l10.b, str);
                    String str2 = d2Var.c;
                    l10.c();
                    l1.m((l1) l10.b, str2);
                    l1 l1Var = (l1) l10.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    g1 l11 = h1.l();
                    l11.c();
                    h1.n((h1) l11.b, arrayList);
                    l11.c();
                    h1.m((h1) l11.b, l1Var);
                    h1 h1Var = (h1) l11.a();
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
                            String d = ta.b.d("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(d)) {
                                d = ta.b.d("feature_usage_timestamp_detected_feature_", num);
                            }
                            String d9 = ta.b.d("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(d, d9)) {
                                long j12 = sharedPreferences.getLong(d, 0L);
                                edit.remove(d);
                                if (j12 != 0) {
                                    edit.putLong(d9, j12);
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
