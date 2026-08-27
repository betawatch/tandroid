package j4;

import android.os.Looper;
import h3.s2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final g0 c = new g0(new CopyOnWriteArrayList(), 0, null, 0);
    public final b6.a d = new b6.a(new CopyOnWriteArrayList(), 0, null, 14);
    public Looper e;
    public s2 f;
    public i3.k g;

    public final g0 a(c0 c0Var) {
        return new g0(this.c.c, 0, c0Var, 0L);
    }

    public abstract z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10);

    public final void c(d0 d0Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(d0Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(d0 d0Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(d0Var);
        if (isEmpty) {
            f();
        }
    }

    public s2 g() {
        return null;
    }

    public abstract h3.f1 h();

    public boolean i() {
        return true;
    }

    public abstract void j();

    public final void k(d0 d0Var, com.google.android.exoplayer2.upstream.y0 y0Var, i3.k kVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        d5.a.f(looper == null || looper == myLooper);
        this.g = kVar;
        s2 s2Var = this.f;
        this.a.add(d0Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(d0Var);
            l(y0Var);
        } else if (s2Var != null) {
            e(d0Var);
            d0Var.a(this, s2Var);
        }
    }

    public abstract void l(com.google.android.exoplayer2.upstream.y0 y0Var);

    public final void m(s2 s2Var) {
        this.f = s2Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).a(this, s2Var);
        }
    }

    public abstract void n(z zVar);

    public final void o(d0 d0Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            c(d0Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        p();
    }

    public abstract void p();

    public final void q(l3.h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l3.g gVar = (l3.g) it.next();
            if (gVar.a == hVar) {
                copyOnWriteArrayList.remove(gVar);
            }
        }
    }

    public final void r(h0 h0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            if (f0Var.b == h0Var) {
                copyOnWriteArrayList.remove(f0Var);
            }
        }
    }

    public void d() {
    }

    public void f() {
    }
}
