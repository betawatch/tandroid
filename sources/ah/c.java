package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import li.o;
import li.p;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c {
    public final fh.a a;
    public int b;
    public int c;
    public pe.b d;
    public pe.b e;
    public hh.k f;
    public ViewGroup g;
    public p h;
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
        ch.d b10 = this.a.b();
        if (this.i && Build.VERSION.SDK_INT >= 33 && (b10 instanceof ch.e)) {
            ch.e eVar = (ch.e) b10;
            eVar.Q = new j(eVar.L);
        }
        b10.w(aVar);
        int i10 = this.b;
        int i11 = this.c;
        b10.j = i10;
        b10.k = i11;
        pe.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        p pVar = this.h;
        if (pVar != null && view != null) {
            pVar.c.add(new o(view, b10));
        }
        hh.k kVar = this.f;
        if (kVar != null && (viewGroup = this.g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, b10, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(b10);
        }
        return b10;
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

    public final void e(p pVar) {
        this.h = pVar;
    }

    public final void f(pe.b bVar) {
        this.e = bVar;
    }

    public final void g(hh.k kVar, ViewGroup viewGroup) {
        this.f = kVar;
        this.g = viewGroup;
    }
}
