// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class bod implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bod(sef sefVar) {
        this.a = (byte) 6;
        p5f p5fVar = p5f.b;
        this.b = sefVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        double d = 75.0d;
        int i = 3;
        l3 l3Var = null;
        long j = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                List list = ((ood) obj).e;
                if (list != null) {
                    list.isEmpty();
                }
                throw null;
            case 1:
                ese eseVar = (ese) obj;
                nwe nweVar = eseVar.g;
                if (nweVar != null) {
                    eseVar.a.a((y3f) eseVar.c.b(nweVar).a(), kk7.z3);
                }
                eseVar.e();
                return;
            case 2:
                i5f i5fVar = (i5f) obj;
                HashSet hashSet = i5fVar.f;
                SharedPreferences sharedPreferences = i5fVar.b;
                HashSet hashSet2 = i5fVar.g;
                if (hashSet.isEmpty()) {
                    return;
                }
                long j2 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = i5fVar.h;
                if (j3 == 0 || currentTimeMillis - j3 >= j2) {
                    i5f.i.b("Upload the feature usage report.", new Object[0]);
                    f3f l = i3f.l();
                    String str = i5f.j;
                    l.c();
                    i3f.n((i3f) l.b, str);
                    String str2 = i5fVar.c;
                    l.c();
                    i3f.m((i3f) l.b, str2);
                    i3f i3fVar = (i3f) l.a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    n2f l2 = q2f.l();
                    l2.c();
                    q2f.n((q2f) l2.b, arrayList);
                    l2.c();
                    q2f.m((q2f) l2.b, i3fVar);
                    q2f q2fVar = (q2f) l2.a();
                    w3f m = y3f.m();
                    m.c();
                    y3f.s((y3f) m.b, q2fVar);
                    i5fVar.a.a((y3f) m.a(), kk7.R3);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String num = Integer.toString(((k1f) it.next()).a);
                            String h = b00.h("feature_usage_timestamp_reported_feature_", num);
                            if (!sharedPreferences.contains(h)) {
                                h = b00.h("feature_usage_timestamp_detected_feature_", num);
                            }
                            String h2 = b00.h("feature_usage_timestamp_reported_feature_", num);
                            if (!TextUtils.equals(h, h2)) {
                                long j4 = j;
                                long j5 = sharedPreferences.getLong(h, j4);
                                edit.remove(h);
                                if (j5 != j4) {
                                    edit.putLong(h2, j5);
                                }
                                j = j4;
                            }
                        }
                    }
                    i5fVar.h = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                    return;
                }
                return;
            case 3:
                z3f z3fVar = (z3f) obj;
                HashMap hashMap = z3fVar.j;
                ete eteVar = ete.f;
                j7d j7dVar = (j7d) hashMap.get(eteVar);
                if (j7dVar != null) {
                    j7d j7dVar2 = j7dVar;
                    d5d d5dVar = j7dVar2.a;
                    if (d5dVar == null) {
                        j7d j7dVar3 = j7dVar2;
                        d5d d5dVar2 = new d5d(j7dVar3, j7dVar3.c);
                        j7dVar2.a = d5dVar2;
                        d5dVar = d5dVar2;
                    }
                    Iterator it2 = d5dVar.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object obj2 = (Collection) j7dVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list2 = (List) obj2;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new k5d(j7dVar, next, list2, null) : new l3(j7dVar, next, list2, (l3) null));
                        Collections.sort(arrayList2);
                        hpe hpeVar = new hpe();
                        int size = arrayList2.size();
                        long j6 = 0;
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            j6 = ((Long) obj3).longValue() + j6;
                        }
                        hpeVar.c = Long.valueOf((j6 / arrayList2.size()) & Long.MAX_VALUE);
                        hpeVar.a = Long.valueOf(z3f.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        hpeVar.f = Long.valueOf(z3f.a(arrayList2, d) & Long.MAX_VALUE);
                        hpeVar.e = Long.valueOf(z3f.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        hpeVar.d = Long.valueOf(z3f.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        hpeVar.b = Long.valueOf(z3f.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        tpe tpeVar = new tpe(hpeVar);
                        int size2 = arrayList2.size();
                        ep epVar = new ep();
                        epVar.c = tse.b;
                        rod rodVar = new rod((byte) 0);
                        rodVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        rodVar.b = (cpd) next;
                        rodVar.d = tpeVar;
                        epVar.f = new opd(rodVar);
                        z3f z3fVar2 = z3fVar;
                        ete eteVar2 = eteVar;
                        yjb.c(1, new vc1(z3fVar2, new qx(epVar, 0), eteVar2, z3fVar.b(), (byte) 3));
                        eteVar = eteVar2;
                        z3fVar = z3fVar2;
                        d = 75.0d;
                    }
                    hashMap.remove(eteVar);
                    return;
                }
                return;
            case 4:
                ((kgf) obj).g(false);
                return;
            case 5:
                DataHolder dataHolder = (DataHolder) obj;
                int i3 = dataHolder.e;
                dataHolder.close();
                return;
            default:
                sef sefVar = (sef) obj;
                p5f p5fVar = p5f.O1;
                HashMap hashMap2 = sefVar.j;
                vhf vhfVar = (vhf) hashMap2.get(p5fVar);
                if (vhfVar != null) {
                    vhf vhfVar2 = vhfVar;
                    xze xzeVar = vhfVar2.a;
                    if (xzeVar == null) {
                        vhf vhfVar3 = vhfVar2;
                        xze xzeVar2 = new xze(vhfVar3, vhfVar3.c);
                        vhfVar2.a = xzeVar2;
                        xzeVar = xzeVar2;
                    }
                    Iterator it3 = xzeVar.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        Object obj4 = (Collection) vhfVar.c.get(next2);
                        if (obj4 == null) {
                            obj4 = new ArrayList(i);
                        }
                        List list3 = (List) obj4;
                        ArrayList arrayList3 = new ArrayList(list3 instanceof RandomAccess ? new abf(vhfVar, next2, list3, l3Var) : new l3(vhfVar, next2, list3, l3Var));
                        Collections.sort(arrayList3);
                        hpe hpeVar2 = new hpe();
                        int size3 = arrayList3.size();
                        long j7 = 0;
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj5 = arrayList3.get(i4);
                            i4++;
                            j7 = ((Long) obj5).longValue() + j7;
                        }
                        hpeVar2.c = Long.valueOf((j7 / arrayList3.size()) & Long.MAX_VALUE);
                        hpeVar2.a = Long.valueOf(sef.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        hpeVar2.f = Long.valueOf(sef.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        hpeVar2.e = Long.valueOf(sef.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        hpeVar2.d = Long.valueOf(sef.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        hpeVar2.b = Long.valueOf(sef.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        d3f d3fVar = new d3f(hpeVar2);
                        int size4 = arrayList3.size();
                        ntb ntbVar = new ntb();
                        ntbVar.c = v4f.b;
                        rod rodVar2 = new rod((byte) 2);
                        rodVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        rodVar2.b = (isd) next2;
                        rodVar2.d = d3fVar;
                        ntbVar.h = new ssd(rodVar2);
                        sef sefVar2 = sefVar;
                        p5f p5fVar2 = p5fVar;
                        yjb.c(1, new vc1(sefVar2, new qx(ntbVar, 0), p5fVar2, sefVar.c(), (byte) 4));
                        p5fVar = p5fVar2;
                        sefVar = sefVar2;
                        l3Var = null;
                        i = 3;
                    }
                    hashMap2.remove(p5fVar);
                    return;
                }
                return;
        }
    }

    public bod(e5d e5dVar, DataHolder dataHolder) {
        this.a = (byte) 5;
        this.b = dataHolder;
    }

    public /* synthetic */ bod(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
