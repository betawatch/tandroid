package bh;

import ah.i0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class b {
    public final gh.a a;
    public pe.b b;
    public pe.b c;
    public ih.k d;
    public ViewGroup e;
    public boolean f;

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
        ViewGroup viewGroup;
        dh.d k10 = this.a.k();
        if (this.f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof dh.e)) {
            dh.e eVar = (dh.e) k10;
            eVar.N = new g(eVar.I);
        }
        k10.n(aVar);
        pe.b bVar = this.c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        ih.k kVar = this.d;
        if (kVar != null && (viewGroup = this.e) != null && view != null) {
            kVar.d(view, viewGroup, new i0(1, k10, view), z10);
        }
        pe.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        pe.b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(pe.b bVar) {
        this.c = bVar;
    }

    public final void f(ih.k kVar, ViewGroup viewGroup) {
        this.d = kVar;
        this.e = viewGroup;
    }
}
