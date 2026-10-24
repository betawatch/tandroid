package bh;

import ah.h0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class b {
    public final gh.a a;
    public int b;
    public int c;
    public re.b d;
    public re.b e;
    public ih.k f;
    public ViewGroup g;
    public ni.e h;
    public boolean i;

    public b(gh.a aVar) {
        this.a = aVar;
    }

    public final dh.d a(View view) {
        return c(view, null, false);
    }

    public final dh.d b(View view, eh.a aVar) {
        return c(view, aVar, false);
    }

    public final dh.d c(View view, eh.a aVar, boolean z10) {
        dh.d d = this.a.d();
        if (this.i && Build.VERSION.SDK_INT >= 33 && (d instanceof dh.e)) {
            dh.e eVar = (dh.e) d;
            eVar.g0 = new g(eVar.b0);
        }
        d.o(aVar);
        int i10 = this.b;
        int i11 = this.c;
        d.n = i10;
        d.r = i11;
        re.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ni.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new ni.d(view, d));
        }
        if (this.f != null && this.g != null && view != null) {
            this.f.d(view, this.g, new h0(3, d, new WeakReference(view)), z10);
        }
        re.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(d);
        }
        return d;
    }

    public final void d() {
        re.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(re.b bVar) {
        this.e = bVar;
    }

    public final void f(ih.k kVar, ViewGroup viewGroup) {
        this.f = kVar;
        this.g = viewGroup;
    }
}
