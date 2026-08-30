package o4;

import android.os.Looper;
import j3.c1;
import j3.o2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final b4.e0 c = new b4.e0(new CopyOnWriteArrayList(), 0, (v) null);
    public final o3.l d = new o3.l(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public o2 f;
    public k3.k g;

    public final b4.e0 a(v vVar) {
        return new b4.e0((CopyOnWriteArrayList) this.c.d, 0, vVar);
    }

    public abstract t b(v vVar, g5.q qVar, long j10);

    public final void c(w wVar) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(wVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(w wVar) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(wVar);
        if (isEmpty) {
            f();
        }
    }

    public o2 g() {
        return null;
    }

    public abstract c1 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(w wVar, g5.v0 v0Var, k3.k kVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        h5.a.f(looper == null || looper == myLooper);
        this.g = kVar;
        o2 o2Var = this.f;
        this.a.add(wVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(wVar);
            l(v0Var);
        } else if (o2Var != null) {
            e(wVar);
            wVar.a(this, o2Var);
        }
    }

    public abstract void l(g5.v0 v0Var);

    public final void m(o2 o2Var) {
        this.f = o2Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w) obj).a(this, o2Var);
        }
    }

    public abstract void n(t tVar);

    public final void o(w wVar) {
        ArrayList arrayList = this.a;
        arrayList.remove(wVar);
        if (!arrayList.isEmpty()) {
            c(wVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(o3.m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            o3.k kVar = (o3.k) it.next();
            if (kVar.b == mVar) {
                copyOnWriteArrayList.remove(kVar);
            }
        }
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (yVar.b == zVar) {
                copyOnWriteArrayList.remove(yVar);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
