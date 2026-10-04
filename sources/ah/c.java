package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class c {
    public final fh.a a;
    public int b;
    public int c;
    public pe.b d;
    public pe.b e;
    public hh.k f;
    public ViewGroup g;
    public li.m h;
    public boolean i;

    public c(fh.a aVar) {
        this.a = aVar;
    }

    public final ch.d a(View view) {
        return c(view, null, false);
    }

    public final ch.d b(View view, dh.a aVar) {
        return c(view, aVar, false);
    }

    public final ch.d c(View view, dh.a aVar, boolean z10) {
        ViewGroup viewGroup;
        ch.d f7 = this.a.f();
        if (this.i && Build.VERSION.SDK_INT >= 33 && (f7 instanceof ch.e)) {
            ch.e eVar = (ch.e) f7;
            eVar.Q = new j(eVar.L);
        }
        f7.x(aVar);
        int i10 = this.b;
        int i11 = this.c;
        f7.j = i10;
        f7.k = i11;
        pe.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.m mVar = this.h;
        if (mVar != null && view != null) {
            mVar.c.add(new li.l(view, f7));
        }
        hh.k kVar = this.f;
        if (kVar != null && (viewGroup = this.g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, f7, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(f7);
        }
        return f7;
    }

    public final void d() {
        pe.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(li.m mVar) {
        this.h = mVar;
    }

    public final void f(pe.b bVar) {
        this.e = bVar;
    }

    public final void g(hh.k kVar, ViewGroup viewGroup) {
        this.f = kVar;
        this.g = viewGroup;
    }
}
