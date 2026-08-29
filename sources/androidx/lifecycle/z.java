package androidx.lifecycle;

import ag.q1;
import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class z {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final o.f b = new o.f();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final q1 j;

    public z() {
        Object obj = k;
        this.f = obj;
        this.j = new q1(this, 6);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        n.a.a().a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a4.w.n("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(y yVar) {
        if (yVar.b) {
            if (!yVar.k()) {
                yVar.c(false);
                return;
            }
            int i10 = yVar.c;
            int i11 = this.g;
            if (i10 >= i11) {
                return;
            }
            yVar.c = i11;
            yVar.a.S(this.e);
        }
    }

    public final void c(y yVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (yVar != null) {
                b(yVar);
                yVar = null;
            } else {
                o.f fVar = this.b;
                fVar.getClass();
                o.d dVar = new o.d(fVar);
                fVar.c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((y) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(t tVar, a0 a0Var) {
        Object obj;
        a("observe");
        if (((v) tVar.m()).c == n.a) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, tVar, a0Var);
        o.f fVar = this.b;
        o.c i10 = fVar.i(a0Var);
        if (i10 != null) {
            obj = i10.b;
        } else {
            o.c cVar = new o.c(a0Var, liveData$LifecycleBoundObserver);
            fVar.d++;
            o.c cVar2 = fVar.b;
            if (cVar2 == null) {
                fVar.a = cVar;
                fVar.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                fVar.b = cVar;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar != null && !yVar.j(tVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar != null) {
            return;
        }
        tVar.m().a(liveData$LifecycleBoundObserver);
    }

    public final void e(ha.c cVar) {
        Object obj;
        a("observeForever");
        x xVar = new x(this, cVar);
        o.f fVar = this.b;
        o.c i10 = fVar.i(cVar);
        if (i10 != null) {
            obj = i10.b;
        } else {
            o.c cVar2 = new o.c(cVar, xVar);
            fVar.d++;
            o.c cVar3 = fVar.b;
            if (cVar3 == null) {
                fVar.a = cVar2;
                fVar.b = cVar2;
            } else {
                cVar3.c = cVar2;
                cVar2.d = cVar3;
                fVar.b = cVar2;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar != null) {
            return;
        }
        xVar.c(true);
    }

    public final void h(Object obj) {
        boolean z10;
        synchronized (this.a) {
            z10 = this.f == k;
            this.f = obj;
        }
        if (z10) {
            n.a.a().b(this.j);
        }
    }

    public void i(a0 a0Var) {
        a("removeObserver");
        y yVar = (y) this.b.n(a0Var);
        if (yVar == null) {
            return;
        }
        yVar.g();
        yVar.c(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void f() {
    }

    public void g() {
    }
}
