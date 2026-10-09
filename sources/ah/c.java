package ah;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c {
    public final fh.a a;
    public int b;
    public int c;
    public qe.b d;
    public qe.b e;
    public hh.j f;
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
        qe.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        li.e eVar2 = this.h;
        if (eVar2 != null && view != null) {
            eVar2.d.add(new li.d(view, l4));
        }
        if (this.f != null && this.g != null && view != null) {
            this.f.d(view, this.g, new b(0, l4, new WeakReference(view)), z10);
        }
        qe.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(l4);
        }
        return l4;
    }

    public final void d() {
        qe.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(qe.b bVar) {
        this.e = bVar;
    }

    public final void f(hh.j jVar, ViewGroup viewGroup) {
        this.f = jVar;
        this.g = viewGroup;
    }
}
