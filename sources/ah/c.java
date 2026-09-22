package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c {
    public final fh.a a;
    public int b;
    public int c;
    public pe.b d;
    public pe.b e;
    public hh.k f;
    public ViewGroup g;
    public ki.e h;
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
        ch.d l4 = this.a.l();
        if (this.i && Build.VERSION.SDK_INT >= 33 && (l4 instanceof ch.e)) {
            ch.e eVar = (ch.e) l4;
            eVar.P = new i(eVar.K);
        }
        l4.o(aVar);
        int i10 = this.b;
        int i11 = this.c;
        l4.h = i10;
        l4.i = i11;
        pe.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ki.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new ki.d(view, l4));
        }
        hh.k kVar = this.f;
        if (kVar != null && (viewGroup = this.g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, l4, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(l4);
        }
        return l4;
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

    public final void e(pe.b bVar) {
        this.e = bVar;
    }

    public final void f(hh.k kVar, ViewGroup viewGroup) {
        this.f = kVar;
        this.g = viewGroup;
    }
}
