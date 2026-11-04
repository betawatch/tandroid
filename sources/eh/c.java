package eh;

import ai.n;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import pi.p;
import pi.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c {
    public final si.a a;
    public final si.a b;
    public final si.a c;
    public int d;
    public int e;
    public ue.b f;
    public ue.b g;
    public kh.k h;
    public ViewGroup i;
    public q j;
    public boolean k;

    public c(si.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final gh.g a(View view) {
        return c(view, null, false);
    }

    public final gh.g b(View view, hh.a aVar) {
        return c(view, aVar, false);
    }

    public final gh.g c(View view, hh.a aVar, boolean z10) {
        gh.g gVar;
        si.a aVar2 = this.c;
        si.a aVar3 = this.a;
        si.a aVar4 = this.b;
        if (aVar3 == aVar4 && aVar4 == aVar2) {
            gVar = aVar3 instanceof b ? ((b) aVar3).b() : new gh.g(aVar3, aVar3, aVar3);
        } else {
            gh.g gVar2 = new gh.g(aVar3, aVar4, aVar2);
            if (aVar3 instanceof b) {
                ((b) aVar3).d(gVar2);
            }
            if (aVar4 != aVar3 && (aVar4 instanceof b)) {
                ((b) aVar4).d(gVar2);
            }
            if (aVar2 != aVar3 && aVar2 != aVar4 && (aVar2 instanceof b)) {
                ((b) aVar2).d(gVar2);
            }
            gVar = gVar2;
        }
        if (this.k && !gVar.X) {
            gVar.X = true;
            gVar.a0 = true;
        }
        gVar.p(aVar);
        int i3 = this.d;
        int i10 = this.e;
        gVar.L = i3;
        gVar.M = i10;
        ue.b bVar = this.g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.j;
        if (qVar != null && view != null) {
            qVar.c.add(new p(view, gVar));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new n(13, gVar, new WeakReference(view)), z10);
        }
        ue.b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.add(gVar);
        }
        return gVar;
    }

    public final void d() {
        ue.b bVar = this.g;
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

    public final void f(ue.b bVar) {
        this.g = bVar;
    }

    public final void g(kh.k kVar, ViewGroup viewGroup) {
        this.h = kVar;
        this.i = viewGroup;
    }

    public c(si.a aVar, si.a aVar2, si.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }
}
