package androidx.lifecycle;

import a8.ra;
import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
    public final ra j;

    public z() {
        Object obj = k;
        this.f = obj;
        this.j = new ra(this, 7);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        n.a.a().a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a8.p0.p("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(y yVar) {
        if (yVar.b) {
            if (!yVar.k()) {
                yVar.c(false);
                return;
            }
            int i7 = yVar.c;
            int i10 = this.g;
            if (i7 >= i10) {
                return;
            }
            yVar.c = i10;
            yVar.a.X(this.e);
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
        o.c f10 = fVar.f(a0Var);
        if (f10 != null) {
            obj = f10.b;
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

    public final void e(d6.i iVar) {
        Object obj;
        a("observeForever");
        x xVar = new x(this, iVar);
        o.f fVar = this.b;
        o.c f10 = fVar.f(iVar);
        if (f10 != null) {
            obj = f10.b;
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
        boolean z9;
        synchronized (this.a) {
            z9 = this.f == k;
            this.f = obj;
        }
        if (z9) {
            n.a.a().b(this.j);
        }
    }

    public void i(a0 a0Var) {
        a("removeObserver");
        y yVar = (y) this.b.i(a0Var);
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
