package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
    public final androidx.activity.i j;

    public z() {
        Object obj = k;
        this.f = obj;
        this.j = new androidx.activity.i(this, 5);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        n.a.a().a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(android.support.v4.media.a.o("Cannot invoke ", str, " on a background thread"));
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
            yVar.a.m0(this.e);
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

    public final void e(o5.i iVar) {
        Object obj;
        a("observeForever");
        x xVar = new x(this, iVar);
        o.f fVar = this.b;
        o.c i10 = fVar.i(iVar);
        if (i10 != null) {
            obj = i10.b;
        } else {
            o.c cVar = new o.c(iVar, xVar);
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
        if (yVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar != null) {
            return;
        }
        xVar.c(true);
    }

    public final void h(Object obj) {
        boolean z4;
        synchronized (this.a) {
            z4 = this.f == k;
            this.f = obj;
        }
        if (z4) {
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
