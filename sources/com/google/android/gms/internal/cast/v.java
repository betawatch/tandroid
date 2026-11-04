package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i3) {
        this.a = i3;
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
                y0 y0Var = (y0) this.b;
                z0 z0Var = y0Var.g;
                if (z0Var != null) {
                    y0Var.a.a((q1) y0Var.c.b(z0Var).a(), hs.A3);
                }
                y0Var.e();
                return;
            default:
                b2 b2Var = (b2) this.b;
                HashSet hashSet = b2Var.f;
                SharedPreferences sharedPreferences = b2Var.b;
                HashSet hashSet2 = b2Var.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j10 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = b2Var.h;
                if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                    b2.i.b("Upload the feature usage report.", new Object[0]);
                    i1 l10 = j1.l();
                    String str = b2.j;
                    l10.c();
                    j1.n((j1) l10.b, str);
                    String str2 = b2Var.c;
                    l10.c();
                    j1.m((j1) l10.b, str2);
                    j1 j1Var = (j1) l10.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    e1 l11 = f1.l();
                    l11.c();
                    f1.n((f1) l11.b, arrayList);
                    l11.c();
                    f1.m((f1) l11.b, j1Var);
                    f1 f1Var = (f1) l11.a();
                    p1 m10 = q1.m();
                    m10.c();
                    q1.s((q1) m10.b, f1Var);
                    b2Var.a.a((q1) m10.a(), hs.S3);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((b1) it.next()).a);
                            String f10 = t4.c.f("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(f10)) {
                                f10 = t4.c.f("feature_usage_timestamp_detected_feature_", num);
                            }
                            String f11 = t4.c.f("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(f10, f11)) {
                                long j12 = sharedPreferences.getLong(f10, 0L);
                                edit.remove(f10);
                                if (j12 != 0) {
                                    edit.putLong(f11, j12);
                                }
                            }
                        }
                    }
                    b2Var.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
