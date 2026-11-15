package dh;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import ri.p;
import ri.q;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c {
    public final ui.a a;
    public final ui.a b;
    public final ui.a c;
    public int d;
    public int e;
    public xe.b f;
    public xe.b g;
    public jh.k h;
    public ViewGroup i;
    public q j;
    public boolean k;

    public c(ui.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final fh.g a(View view) {
        return c(view, null, false);
    }

    public final fh.g b(View view, gh.a aVar) {
        return c(view, aVar, false);
    }

    public final fh.g c(View view, gh.a aVar, boolean z10) {
        fh.g gVar;
        ui.a aVar2 = this.c;
        ui.a aVar3 = this.a;
        ui.a aVar4 = this.b;
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
        if (this.k && !gVar.X) {
            gVar.X = true;
            gVar.a0 = true;
        }
        gVar.p(aVar);
        int i7 = this.d;
        int i10 = this.e;
        gVar.L = i7;
        gVar.M = i10;
        xe.b bVar = this.g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.j;
        if (qVar != null && view != null) {
            qVar.c.add(new p(view, gVar));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new ab.g(14, gVar, new WeakReference(view)), z10);
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

    public c(ui.a aVar, ui.a aVar2, ui.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }
}
