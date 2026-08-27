package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v extends o {
    public final boolean a;
    public o.a b;
    public n c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public v(t tVar) {
        new AtomicReference();
        this.a = true;
        this.b = new o.a();
        this.c = n.b;
        this.h = new ArrayList();
        this.d = new WeakReference(tVar);
    }

    @Override // androidx.lifecycle.o
    public final void a(s sVar) {
        r reflectiveGenericLifecycleObserver;
        Object obj;
        t tVar;
        d("addObserver");
        n nVar = this.c;
        n nVar2 = n.a;
        if (nVar != nVar2) {
            nVar2 = n.b;
        }
        u uVar = new u();
        HashMap hashMap = w.a;
        boolean z10 = sVar instanceof r;
        boolean z11 = sVar instanceof e;
        if (z10 && z11) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) sVar, (r) sVar);
        } else if (z11) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) sVar, null);
        } else if (z10) {
            reflectiveGenericLifecycleObserver = (r) sVar;
        } else {
            Class<?> cls = sVar.getClass();
            if (w.b(cls) == 2) {
                Object obj2 = w.b.get(cls);
                kotlin.jvm.internal.j.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    w.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                int size = list.size();
                h[] hVarArr = new h[size];
                if (size > 0) {
                    w.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(hVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(sVar);
            }
        }
        uVar.b = reflectiveGenericLifecycleObserver;
        uVar.a = nVar2;
        o.a aVar = this.b;
        o.c i10 = aVar.i(sVar);
        if (i10 != null) {
            obj = i10.b;
        } else {
            HashMap hashMap2 = aVar.e;
            o.c cVar = new o.c(sVar, uVar);
            aVar.d++;
            o.c cVar2 = aVar.b;
            if (cVar2 == null) {
                aVar.a = cVar;
                aVar.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                aVar.b = cVar;
            }
            hashMap2.put(sVar, cVar);
            obj = null;
        }
        if (((u) obj) == null && (tVar = (t) this.d.get()) != null) {
            boolean z12 = this.e != 0 || this.f;
            n c10 = c(sVar);
            this.e++;
            while (uVar.a.compareTo(c10) < 0 && this.b.e.containsKey(sVar)) {
                n nVar3 = uVar.a;
                ArrayList arrayList = this.h;
                arrayList.add(nVar3);
                k kVar = m.Companion;
                n state = uVar.a;
                kVar.getClass();
                kotlin.jvm.internal.j.e(state, "state");
                int ordinal = state.ordinal();
                m mVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : m.ON_RESUME : m.ON_START : m.ON_CREATE;
                if (mVar == null) {
                    throw new IllegalStateException("no event up from " + uVar.a);
                }
                uVar.a(tVar, mVar);
                arrayList.remove(arrayList.size() - 1);
                c10 = c(sVar);
            }
            if (!z12) {
                h();
            }
            this.e--;
        }
    }

    @Override // androidx.lifecycle.o
    public final void b(s observer) {
        kotlin.jvm.internal.j.e(observer, "observer");
        d("removeObserver");
        this.b.n(observer);
    }

    public final n c(s sVar) {
        u uVar;
        HashMap hashMap = this.b.e;
        o.c cVar = hashMap.containsKey(sVar) ? ((o.c) hashMap.get(sVar)).d : null;
        n nVar = (cVar == null || (uVar = (u) cVar.b) == null) ? null : uVar.a;
        ArrayList arrayList = this.h;
        n nVar2 = arrayList.isEmpty() ? null : (n) i0.a.i(1, arrayList);
        n state1 = this.c;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (nVar == null || nVar.compareTo(state1) >= 0) {
            nVar = state1;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void d(String str) {
        if (this.a) {
            n.a.a().a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a9.p.m("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(m event) {
        kotlin.jvm.internal.j.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(n nVar) {
        n nVar2 = this.c;
        if (nVar2 == nVar) {
            return;
        }
        n nVar3 = n.b;
        n nVar4 = n.a;
        if (nVar2 == nVar3 && nVar == nVar4) {
            throw new IllegalStateException(("no event down from " + this.c + " in component " + this.d.get()).toString());
        }
        this.c = nVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.c == nVar4) {
            this.b = new o.a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(n.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        t tVar = (t) this.d.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            o.a aVar = this.b;
            if (aVar.d != 0) {
                o.c cVar = aVar.a;
                kotlin.jvm.internal.j.b(cVar);
                n nVar = ((u) cVar.b).a;
                o.c cVar2 = this.b.b;
                kotlin.jvm.internal.j.b(cVar2);
                n nVar2 = ((u) cVar2.b).a;
                if (nVar == nVar2 && this.c == nVar2) {
                    break;
                }
                this.g = false;
                n nVar3 = this.c;
                o.c cVar3 = this.b.a;
                kotlin.jvm.internal.j.b(cVar3);
                int compareTo = nVar3.compareTo(((u) cVar3.b).a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    o.a aVar2 = this.b;
                    o.b bVar = new o.b(aVar2.b, aVar2.a, 1);
                    aVar2.c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        kotlin.jvm.internal.j.d(entry, "next()");
                        s sVar = (s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.a.compareTo(this.c) > 0 && !this.g && this.b.e.containsKey(sVar)) {
                            k kVar = m.Companion;
                            n state = uVar.a;
                            kVar.getClass();
                            kotlin.jvm.internal.j.e(state, "state");
                            int ordinal = state.ordinal();
                            m mVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : m.ON_PAUSE : m.ON_STOP : m.ON_DESTROY;
                            if (mVar == null) {
                                throw new IllegalStateException("no event down from " + uVar.a);
                            }
                            arrayList.add(mVar.a());
                            uVar.a(tVar, mVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                o.c cVar4 = this.b.b;
                if (!this.g && cVar4 != null && this.c.compareTo(((u) cVar4.b).a) > 0) {
                    o.a aVar3 = this.b;
                    aVar3.getClass();
                    o.d dVar = new o.d(aVar3);
                    aVar3.c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        s sVar2 = (s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.a.compareTo(this.c) < 0 && !this.g && this.b.e.containsKey(sVar2)) {
                            arrayList.add(uVar2.a);
                            k kVar2 = m.Companion;
                            n state2 = uVar2.a;
                            kVar2.getClass();
                            kotlin.jvm.internal.j.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            m mVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : m.ON_RESUME : m.ON_START : m.ON_CREATE;
                            if (mVar2 == null) {
                                throw new IllegalStateException("no event up from " + uVar2.a);
                            }
                            uVar2.a(tVar, mVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
