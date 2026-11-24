// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class g1d implements Runnable {
    public final /* synthetic */ j1d a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ j1d c;
    public final Object d;

    public /* synthetic */ g1d(j1d j1dVar, Object obj, byte b) {
        this.b = b;
        this.c = j1dVar;
        this.a = j1dVar;
        this.d = obj;
    }

    public final void a() {
        eha ehaVar;
        Set set;
        byte b = this.b;
        int i = 0;
        Object obj = this.d;
        j1d j1dVar = this.c;
        switch (b) {
            case 0:
                dy4 dy4Var = j1dVar.d;
                k1d k1dVar = j1dVar.a.e;
                Context context = j1dVar.c;
                aec aecVar = new aec(dy4Var);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) obj;
                for (xx4 xx4Var : hashMap.keySet()) {
                    if (!xx4Var.v() || ((e1d) hashMap.get(xx4Var)).c) {
                        arrayList2.add(xx4Var);
                    } else {
                        arrayList.add(xx4Var);
                    }
                }
                int i2 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i < size) {
                        i2 = aecVar.e(context, (xx4) arrayList2.get(i));
                        i++;
                        if (i2 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        i2 = aecVar.e(context, (xx4) arrayList.get(i));
                        i++;
                        if (i2 != 0) {
                        }
                    }
                }
                if (i2 != 0) {
                    k1dVar.sendMessage(k1dVar.obtainMessage(1, new f1d(this, j1dVar, new ds2(i2, null, null))));
                    break;
                } else {
                    if (j1dVar.y && (ehaVar = j1dVar.w) != null) {
                        ehaVar.a(new fg0(ehaVar));
                    }
                    for (xx4 xx4Var2 : hashMap.keySet()) {
                        eg0 eg0Var = (eg0) hashMap.get(xx4Var2);
                        if (!xx4Var2.v() || aecVar.e(context, xx4Var2) == 0) {
                            xx4Var2.a(eg0Var);
                        } else {
                            k1dVar.sendMessage(k1dVar.obtainMessage(1, new c1d(this, j1dVar, eg0Var)));
                        }
                    }
                    break;
                }
                break;
            default:
                r1d r1dVar = j1dVar.a;
                m1d m1dVar = r1dVar.o;
                ntb ntbVar = j1dVar.I;
                if (ntbVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) ntbVar.a);
                    Map map = (Map) ntbVar.c;
                    for (yn ynVar : map.keySet()) {
                        if (!r1dVar.i.containsKey(ynVar.b)) {
                            map.get(ynVar).getClass();
                            fyb.g();
                            break;
                        }
                    }
                    set = hashSet;
                }
                m1dVar.G = set;
                ArrayList arrayList3 = (ArrayList) obj;
                int size3 = arrayList3.size();
                while (i < size3) {
                    ((xx4) arrayList3.get(i)).j(j1dVar.F, r1dVar.o.G);
                    i++;
                }
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1d j1dVar = this.a;
        ReentrantLock reentrantLock = j1dVar.b;
        reentrantLock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                k1d k1dVar = j1dVar.a.e;
                k1dVar.sendMessage(k1dVar.obtainMessage(2, e));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
