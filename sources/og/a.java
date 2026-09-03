package og;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import ng.w;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a {
    public final tg.a a;
    public be.b b;
    public be.b c;
    public vg.i d;
    public ViewGroup e;
    public boolean f;

    public a(tg.a aVar) {
        this.a = aVar;
    }

    public final qg.b a(View view) {
        return c(view, null, false);
    }

    public final qg.b b(View view, rg.a aVar) {
        return c(view, aVar, false);
    }

    public final qg.b c(View view, rg.a aVar, boolean z4) {
        ViewGroup viewGroup;
        qg.b k10 = this.a.k();
        if (this.f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof qg.c)) {
            qg.c cVar = (qg.c) k10;
            cVar.N = new f(cVar.I);
        }
        k10.n(aVar);
        be.b bVar = this.c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        vg.i iVar = this.d;
        if (iVar != null && (viewGroup = this.e) != null && view != null) {
            iVar.d(view, viewGroup, new w(2, k10, view), z4);
        }
        be.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        be.b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(be.b bVar) {
        this.c = bVar;
    }

    public final void f(vg.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.e = viewGroup;
    }
}
