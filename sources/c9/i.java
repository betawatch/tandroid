package c9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import j7.i5;
import j7.j5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i implements c {
    public static final g n = new g(0);
    public final n e;
    public final f h;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        n nVar = new n(executor);
        this.e = nVar;
        this.h = fVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(b.c(nVar, n.class, y9.b.class, y9.a.class));
        arrayList3.add(b.c(this, i.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            b bVar = (b) obj;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ba.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.b(componentRegistrar));
                        it.remove();
                    }
                } catch (o e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((b) it2.next()).b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                i5.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                i5.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                b bVar2 = (b) obj4;
                this.a.put(bVar2, new p(new h(i10, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            b(this.a, bool.booleanValue());
        }
    }

    @Override // c9.c
    public final Object a(Class cls) {
        return f(t.a(cls));
    }

    public final void b(HashMap hashMap, boolean z4) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            ba.b bVar2 = (ba.b) entry.getValue();
            int i10 = bVar.d;
            if (i10 == 1 || (i10 == 2 && z4)) {
                bVar2.get();
            }
        }
        n nVar = this.e;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.b;
                if (arrayDeque != null) {
                    nVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // c9.c
    public final synchronized ba.b c(t tVar) {
        j5.a(tVar, "Null interface requested.");
        return (ba.b) this.b.get(tVar);
    }

    @Override // c9.c
    public final ba.b d(Class cls) {
        return c(t.a(cls));
    }

    @Override // c9.c
    public final r e(t tVar) {
        ba.b c3 = c(tVar);
        return c3 == null ? new r(r.c, r.d) : c3 instanceof r ? (r) c3 : new r(null, c3);
    }

    @Override // c9.c
    public final Object f(t tVar) {
        ba.b c3 = c(tVar);
        if (c3 == null) {
            return null;
        }
        return c3.get();
    }

    public final void g(boolean z4) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f;
        Boolean valueOf = Boolean.valueOf(z4);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        b(hashMap, z4);
    }

    public final void h() {
        HashMap hashMap = this.b;
        HashMap hashMap2 = this.c;
        for (b bVar : this.a.keySet()) {
            for (l lVar : bVar.c) {
                boolean z4 = lVar.b == 2;
                t tVar = lVar.a;
                if (z4 && !hashMap2.containsKey(tVar)) {
                    Set set = Collections.EMPTY_SET;
                    q qVar = new q();
                    qVar.b = null;
                    qVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    qVar.a.addAll(set);
                    hashMap2.put(tVar, qVar);
                } else if (hashMap.containsKey(tVar)) {
                    continue;
                } else {
                    int i10 = lVar.b;
                    if (i10 == 1) {
                        throw new m("Unsatisfied dependency for component " + bVar + ": " + tVar);
                    }
                    if (i10 != 2) {
                        hashMap.put(tVar, new r(r.c, r.d));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar = (b) obj;
            if (bVar.e == 0) {
                ba.b bVar2 = (ba.b) this.a.get(bVar);
                for (t tVar : bVar.b) {
                    HashMap hashMap = this.b;
                    if (hashMap.containsKey(tVar)) {
                        arrayList2.add(new a1.e(8, (r) ((ba.b) hashMap.get(tVar)), bVar2));
                    } else {
                        hashMap.put(tVar, bVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap hashMap = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.e != 0) {
                ba.b bVar2 = (ba.b) entry.getValue();
                for (t tVar : bVar.b) {
                    if (!hashMap2.containsKey(tVar)) {
                        hashMap2.put(tVar, new HashSet());
                    }
                    ((Set) hashMap2.get(tVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                q qVar = (q) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new a1.e(9, qVar, (ba.b) it.next()));
                }
            } else {
                t tVar2 = (t) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                q qVar2 = new q();
                qVar2.b = null;
                qVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                qVar2.a.addAll(set);
                hashMap.put(tVar2, qVar2);
            }
        }
        return arrayList;
    }

    @Override // c9.c
    public final Set k(t tVar) {
        ba.b bVar;
        synchronized (this) {
            bVar = (q) this.c.get(tVar);
            if (bVar == null) {
                bVar = n;
            }
        }
        return (Set) bVar.get();
    }
}
