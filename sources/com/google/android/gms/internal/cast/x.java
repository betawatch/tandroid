package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                List list = ((z) this.b).e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                c1 c1Var = (c1) this.b;
                d1 d1Var = c1Var.g;
                if (d1Var != null) {
                    c1Var.a.a((u1) c1Var.c.b(d1Var).a(), 223);
                }
                c1Var.e();
                return;
            default:
                f2 f2Var = (f2) this.b;
                HashSet hashSet = f2Var.f;
                SharedPreferences sharedPreferences = f2Var.b;
                HashSet hashSet2 = f2Var.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j3 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = f2Var.h;
                if (j10 == 0 || currentTimeMillis - j10 >= j3) {
                    f2.i.b("Upload the feature usage report.", new Object[0]);
                    m1 l4 = n1.l();
                    String str = f2.j;
                    l4.c();
                    n1.n((n1) l4.b, str);
                    String str2 = f2Var.c;
                    l4.c();
                    n1.m((n1) l4.b, str2);
                    n1 n1Var = (n1) l4.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    i1 l10 = j1.l();
                    l10.c();
                    j1.n((j1) l10.b, arrayList);
                    l10.c();
                    j1.m((j1) l10.b, n1Var);
                    j1 j1Var = (j1) l10.a();
                    t1 m10 = u1.m();
                    m10.c();
                    u1.s((u1) m10.b, j1Var);
                    f2Var.a.a((u1) m10.a(), 243);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((f1) it.next()).a);
                            String i10 = org.telegram.ui.Cells.p6.i("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(i10)) {
                                i10 = org.telegram.ui.Cells.p6.i("feature_usage_timestamp_detected_feature_", num);
                            }
                            String i11 = org.telegram.ui.Cells.p6.i("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(i10, i11)) {
                                long j11 = sharedPreferences.getLong(i10, 0L);
                                edit.remove(i10);
                                if (j11 != 0) {
                                    edit.putLong(i11, j11);
                                }
                            }
                        }
                    }
                    f2Var.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
