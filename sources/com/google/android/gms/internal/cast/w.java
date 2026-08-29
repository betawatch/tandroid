package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                b1 b1Var = (b1) this.b;
                c1 c1Var = b1Var.g;
                if (c1Var != null) {
                    b1Var.a.a((t1) b1Var.c.b(c1Var).a(), 223);
                }
                b1Var.e();
                return;
            default:
                e2 e2Var = (e2) this.b;
                HashSet hashSet = e2Var.f;
                SharedPreferences sharedPreferences = e2Var.b;
                HashSet hashSet2 = e2Var.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j10 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = e2Var.h;
                if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                    e2.i.b("Upload the feature usage report.", new Object[0]);
                    l1 l10 = m1.l();
                    String str = e2.j;
                    l10.c();
                    m1.n((m1) l10.b, str);
                    String str2 = e2Var.c;
                    l10.c();
                    m1.m((m1) l10.b, str2);
                    m1 m1Var = (m1) l10.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    h1 l11 = i1.l();
                    l11.c();
                    i1.n((i1) l11.b, arrayList);
                    l11.c();
                    i1.m((i1) l11.b, m1Var);
                    i1 i1Var = (i1) l11.a();
                    s1 m10 = t1.m();
                    m10.c();
                    t1.s((t1) m10.b, i1Var);
                    e2Var.a.a((t1) m10.a(), 243);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((e1) it.next()).a);
                            String e10 = u3.c.e("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(e10)) {
                                e10 = u3.c.e("feature_usage_timestamp_detected_feature_", num);
                            }
                            String e11 = u3.c.e("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(e10, e11)) {
                                long j12 = sharedPreferences.getLong(e10, 0L);
                                edit.remove(e10);
                                if (j12 != 0) {
                                    edit.putLong(e11, j12);
                                }
                            }
                        }
                    }
                    e2Var.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
