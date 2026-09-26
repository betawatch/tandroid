package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class c {
    public final fh.a a;
    public int b;
    public int c;
    public pe.b d;
    public pe.b e;
    public hh.k f;
    public ViewGroup g;
    public li.e h;
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
        ch.d d = this.a.d();
        if (this.i && Build.VERSION.SDK_INT >= 33 && (d instanceof ch.e)) {
            ch.e eVar = (ch.e) d;
            eVar.P = new i(eVar.K);
        }
        d.o(aVar);
        int i10 = this.b;
        int i11 = this.c;
        d.h = i10;
        d.i = i11;
        pe.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new li.d(view, d));
        }
        hh.k kVar = this.f;
        if (kVar != null && (viewGroup = this.g) != null && view != null) {
            kVar.d(view, viewGroup, new b(0, d, view), z10);
        }
        pe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(d);
        }
        return d;
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
