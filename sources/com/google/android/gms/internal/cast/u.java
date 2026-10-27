package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                List list = ((w) this.b).e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                x0 x0Var = (x0) this.b;
                y0 y0Var = x0Var.g;
                if (y0Var != null) {
                    x0Var.a.a((p1) x0Var.c.b(y0Var).a(), 223);
                }
                x0Var.e();
                return;
            default:
                a2 a2Var = (a2) this.b;
                HashSet hashSet = a2Var.f;
                SharedPreferences sharedPreferences = a2Var.b;
                HashSet hashSet2 = a2Var.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j10 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = a2Var.h;
                if (j11 == 0 || currentTimeMillis - j11 >= j10) {
                    a2.i.b("Upload the feature usage report.", new Object[0]);
                    h1 l4 = i1.l();
                    String str = a2.j;
                    l4.c();
                    i1.n((i1) l4.b, str);
                    String str2 = a2Var.c;
                    l4.c();
                    i1.m((i1) l4.b, str2);
                    i1 i1Var = (i1) l4.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    d1 l10 = e1.l();
                    l10.c();
                    e1.n((e1) l10.b, arrayList);
                    l10.c();
                    e1.m((e1) l10.b, i1Var);
                    e1 e1Var = (e1) l10.a();
                    o1 m10 = p1.m();
                    m10.c();
                    p1.s((p1) m10.b, e1Var);
                    a2Var.a.a((p1) m10.a(), 243);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((a1) it.next()).a);
                            String j12 = b10.j("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(j12)) {
                                j12 = b10.j("feature_usage_timestamp_detected_feature_", num);
                            }
                            String j13 = b10.j("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(j12, j13)) {
                                long j14 = sharedPreferences.getLong(j12, 0L);
                                edit.remove(j12);
                                if (j14 != 0) {
                                    edit.putLong(j13, j14);
                                }
                            }
                        }
                    }
                    a2Var.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
        }
    }
}
