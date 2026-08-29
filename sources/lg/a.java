package lg;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kg.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a {
    public final qg.a a;
    public zd.b b;
    public zd.b c;
    public sg.i d;
    public ViewGroup e;
    public boolean f;

    public a(qg.a aVar) {
        this.a = aVar;
    }

    public final ng.d a(View view) {
        return c(view, null, false);
    }

    public final ng.d b(View view, og.a aVar) {
        return c(view, aVar, false);
    }

    public final ng.d c(View view, og.a aVar, boolean z10) {
        ViewGroup viewGroup;
        ng.d v = this.a.v();
        if (this.f && Build.VERSION.SDK_INT >= 33 && (v instanceof ng.e)) {
            ng.e eVar = (ng.e) v;
            eVar.N = new f(eVar.I);
        }
        v.n(aVar);
        zd.b bVar = this.c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        sg.i iVar = this.d;
        if (iVar != null && (viewGroup = this.e) != null && view != null) {
            iVar.d(view, viewGroup, new w(1, v, view), z10);
        }
        zd.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.add(v);
        }
        return v;
    }

    public final void d() {
        zd.b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(zd.b bVar) {
        this.c = bVar;
    }

    public final void f(sg.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.e = viewGroup;
    }
}
