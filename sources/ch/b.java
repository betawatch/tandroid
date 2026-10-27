package ch;

import ai.f0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import jh.k;
import oi.p;
import oi.q;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b {
    public final hh.a a;
    public int b;
    public int c;
    public se.b d;
    public se.b e;
    public k f;
    public ViewGroup g;
    public q h;
    public boolean i;

    public b(hh.a aVar) {
        this.a = aVar;
    }

    public final eh.d a(View view) {
        return c(view, null, false);
    }

    public final eh.d b(View view, fh.a aVar) {
        return c(view, aVar, false);
    }

    public final eh.d c(View view, fh.a aVar, boolean z10) {
        eh.d f7 = this.a.f();
        if (this.i && Build.VERSION.SDK_INT >= 33 && (f7 instanceof eh.e)) {
            eh.e eVar = (eh.e) f7;
            eVar.h0 = new g(eVar.c0);
        }
        f7.v(aVar);
        int i10 = this.b;
        int i11 = this.c;
        f7.s = i10;
        f7.v = i11;
        se.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        q qVar = this.h;
        if (qVar != null && view != null) {
            qVar.c.add(new p(view, f7));
        }
        if (this.f != null && this.g != null && view != null) {
            this.f.d(view, this.g, new f0(6, f7, new WeakReference(view)), z10);
        }
        se.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(f7);
        }
        return f7;
    }

    public final void d() {
        se.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(q qVar) {
        this.h = qVar;
    }

    public final void f(se.b bVar) {
        this.e = bVar;
    }

    public final void g(k kVar, ViewGroup viewGroup) {
        this.f = kVar;
        this.g = viewGroup;
    }
}
