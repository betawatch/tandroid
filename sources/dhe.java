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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class dhe implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dhe(ijf ijfVar) {
        this.a = (byte) 5;
        gaf gafVar = gaf.b;
        this.b = ijfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        double d = 75.0d;
        m3 m3Var = null;
        int i = 3;
        Object obj = this.b;
        switch (b) {
            case 0:
                vwe vweVar = (vwe) obj;
                e1f e1fVar = vweVar.g;
                if (e1fVar != null) {
                    vweVar.a.a((p8f) vweVar.c.b(e1fVar).a(), jn7.z3);
                }
                vweVar.e();
                break;
            case 1:
                long j = 0;
                z9f z9fVar = (z9f) obj;
                HashSet hashSet = z9fVar.f;
                SharedPreferences sharedPreferences = z9fVar.b;
                HashSet hashSet2 = z9fVar.g;
                if (!hashSet.isEmpty()) {
                    long j2 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = z9fVar.h;
                    if (j3 == 0 || currentTimeMillis - j3 >= j2) {
                        z9f.i.b("Upload the feature usage report.", new Object[0]);
                        x7f l = z7f.l();
                        String str = z9f.j;
                        l.c();
                        z7f.n((z7f) l.b, str);
                        String str2 = z9fVar.c;
                        l.c();
                        z7f.m((z7f) l.b, str2);
                        z7f z7fVar = (z7f) l.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(hashSet);
                        e7f l2 = h7f.l();
                        l2.c();
                        h7f.n((h7f) l2.b, arrayList);
                        l2.c();
                        h7f.m((h7f) l2.b, z7fVar);
                        h7f h7fVar = (h7f) l2.a();
                        n8f m = p8f.m();
                        m.c();
                        p8f.s((p8f) m.b, h7fVar);
                        z9fVar.a.a((p8f) m.a(), jn7.R3);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!hashSet2.equals(hashSet)) {
                            hashSet2.clear();
                            hashSet2.addAll(hashSet);
                            Iterator it = hashSet2.iterator();
                            while (it.hasNext()) {
                                String num = Integer.toString(((b6f) it.next()).a);
                                String i2 = c00.i("feature_usage_timestamp_reported_feature_", num);
                                if (!sharedPreferences.contains(i2)) {
                                    i2 = c00.i("feature_usage_timestamp_detected_feature_", num);
                                }
                                String i3 = c00.i("feature_usage_timestamp_reported_feature_", num);
                                if (!TextUtils.equals(i2, i3)) {
                                    long j4 = j;
                                    long j5 = sharedPreferences.getLong(i2, j4);
                                    edit.remove(i2);
                                    if (j5 != j4) {
                                        edit.putLong(i3, j5);
                                    }
                                    j = j4;
                                }
                            }
                        }
                        z9fVar.h = currentTimeMillis;
                        edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                        break;
                    }
                }
                break;
            case 2:
                q8f q8fVar = (q8f) obj;
                HashMap hashMap = q8fVar.j;
                vxe vxeVar = vxe.f;
                ccd ccdVar = (ccd) hashMap.get(vxeVar);
                if (ccdVar != null) {
                    ccd ccdVar2 = ccdVar;
                    w9d w9dVar = ccdVar2.a;
                    if (w9dVar == null) {
                        ccd ccdVar3 = ccdVar2;
                        w9d w9dVar2 = new w9d(ccdVar3, ccdVar3.c);
                        ccdVar2.a = w9dVar2;
                        w9dVar = w9dVar2;
                    }
                    Iterator it2 = w9dVar.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Object obj2 = (Collection) ccdVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new dad(ccdVar, next, list, null) : new m3(ccdVar, next, list, (m3) null));
                        Collections.sort(arrayList2);
                        yte yteVar = new yte();
                        int size = arrayList2.size();
                        long j6 = 0;
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            j6 = ((Long) obj3).longValue() + j6;
                        }
                        yteVar.c = Long.valueOf((j6 / arrayList2.size()) & Long.MAX_VALUE);
                        yteVar.a = Long.valueOf(q8f.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        yteVar.f = Long.valueOf(q8f.a(arrayList2, d) & Long.MAX_VALUE);
                        yteVar.e = Long.valueOf(q8f.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        yteVar.d = Long.valueOf(q8f.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        yteVar.b = Long.valueOf(q8f.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        kue kueVar = new kue(yteVar);
                        int size2 = arrayList2.size();
                        fp fpVar = new fp();
                        fpVar.c = kxe.b;
                        htd htdVar = new htd((byte) 0);
                        htdVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        htdVar.b = (std) next;
                        htdVar.d = kueVar;
                        fpVar.f = new eud(htdVar);
                        q8f q8fVar2 = q8fVar;
                        xnb.c(1, new dd1(q8fVar2, new rx(fpVar, 0), vxeVar, q8fVar.b(), (byte) 3));
                        q8fVar = q8fVar2;
                        d = 75.0d;
                    }
                    hashMap.remove(vxeVar);
                    break;
                }
                break;
            case 3:
                ((alf) obj).g(false);
                break;
            case 4:
                DataHolder dataHolder = (DataHolder) obj;
                int i5 = dataHolder.e;
                dataHolder.close();
                break;
            default:
                ijf ijfVar = (ijf) obj;
                gaf gafVar = gaf.O1;
                HashMap hashMap2 = ijfVar.j;
                lmf lmfVar = (lmf) hashMap2.get(gafVar);
                if (lmfVar != null) {
                    lmf lmfVar2 = lmfVar;
                    o4f o4fVar = lmfVar2.a;
                    if (o4fVar == null) {
                        lmf lmfVar3 = lmfVar2;
                        o4f o4fVar2 = new o4f(lmfVar3, lmfVar3.c);
                        lmfVar2.a = o4fVar2;
                        o4fVar = o4fVar2;
                    }
                    Iterator it3 = o4fVar.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        Object obj4 = (Collection) lmfVar.c.get(next2);
                        if (obj4 == null) {
                            obj4 = new ArrayList(i);
                        }
                        List list2 = (List) obj4;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new qff(lmfVar, next2, list2, m3Var) : new m3(lmfVar, next2, list2, m3Var));
                        Collections.sort(arrayList3);
                        yte yteVar2 = new yte();
                        int size3 = arrayList3.size();
                        long j7 = 0;
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj5 = arrayList3.get(i6);
                            i6++;
                            j7 = ((Long) obj5).longValue() + j7;
                        }
                        yteVar2.c = Long.valueOf((j7 / arrayList3.size()) & Long.MAX_VALUE);
                        yteVar2.a = Long.valueOf(ijf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        yteVar2.f = Long.valueOf(ijf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        yteVar2.e = Long.valueOf(ijf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        yteVar2.d = Long.valueOf(ijf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        yteVar2.b = Long.valueOf(ijf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        u7f u7fVar = new u7f(yteVar2);
                        int size4 = arrayList3.size();
                        oxb oxbVar = new oxb();
                        oxbVar.c = m9f.b;
                        htd htdVar2 = new htd((byte) 2);
                        htdVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        htdVar2.b = (ywd) next2;
                        htdVar2.d = u7fVar;
                        oxbVar.h = new ixd(htdVar2);
                        ijf ijfVar2 = ijfVar;
                        gaf gafVar2 = gafVar;
                        xnb.c(1, new dd1(ijfVar2, new rx(oxbVar, 0), gafVar2, ijfVar.c(), (byte) 4));
                        gafVar = gafVar2;
                        ijfVar = ijfVar2;
                        m3Var = null;
                        i = 3;
                    }
                    hashMap2.remove(gafVar);
                    break;
                }
                break;
        }
    }

    public dhe(x9d x9dVar, DataHolder dataHolder) {
        this.a = (byte) 4;
        this.b = dataHolder;
    }

    public /* synthetic */ dhe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
