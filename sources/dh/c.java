package dh;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import oi.p;
import oi.q;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c {
    public final ri.a a;
    public final ri.a b;
    public final ri.a c;
    public int d;
    public int e;
    public xe.b f;
    public xe.b g;
    public jh.k h;
    public ViewGroup i;
    public q j;
    public boolean k;

    public c(ri.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final fh.g a(View view) {
        return c(view, null, false);
    }

    public final fh.g b(View view, gh.a aVar) {
        return c(view, aVar, false);
    }

    public final fh.g c(View view, gh.a aVar, boolean z9) {
        fh.g gVar;
        ri.a aVar2 = this.c;
        ri.a aVar3 = this.a;
        ri.a aVar4 = this.b;
        if (aVar3 == aVar4 && aVar4 == aVar2) {
            gVar = aVar3 instanceof b ? ((b) aVar3).b() : new fh.g(aVar3, aVar3, aVar3);
        } else {
            fh.g gVar2 = new fh.g(aVar3, aVar4, aVar2);
            if (aVar3 instanceof b) {
                ((b) aVar3).c(gVar2);
            }
            if (aVar4 != aVar3 && (aVar4 instanceof b)) {
                ((b) aVar4).c(gVar2);
            }
            if (aVar2 != aVar3 && aVar2 != aVar4 && (aVar2 instanceof b)) {
                ((b) aVar2).c(gVar2);
            }
            gVar = gVar2;
        }
        if (this.k && !gVar.W) {
            gVar.W = true;
            gVar.Z = true;
        }
        gVar.p(aVar);
        int i7 = this.d;
        int i10 = this.e;
        gVar.K = i7;
        gVar.L = i10;
        xe.b bVar = this.g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.j;
        if (qVar != null && view != null) {
            qVar.c.add(new p(view, gVar));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new ab.g(10, gVar, new WeakReference(view)), z9);
        }
        xe.b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        xe.b bVar = this.g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.j = qVar;
    }

    public final void f(xe.b bVar) {
        this.g = bVar;
    }

    public final void g(jh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.i = viewGroup;
    }

    public c(ri.a aVar, ri.a aVar2, ri.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }
}
