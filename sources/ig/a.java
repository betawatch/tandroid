package ig;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a {
    public final ng.a a;
    public xd.b b;
    public xd.b c;
    public pg.i d;
    public ViewGroup e;
    public boolean f;

    public a(ng.a aVar) {
        this.a = aVar;
    }

    public final kg.d a(View view) {
        return c(view, null, false);
    }

    public final kg.d b(View view, lg.a aVar) {
        return c(view, aVar, false);
    }

    public final kg.d c(View view, lg.a aVar, boolean z10) {
        ViewGroup viewGroup;
        kg.d y10 = this.a.y();
        if (this.f && Build.VERSION.SDK_INT >= 33 && (y10 instanceof kg.e)) {
            kg.e eVar = (kg.e) y10;
            eVar.N = new f(eVar.I);
        }
        y10.n(aVar);
        xd.b bVar = this.c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        pg.i iVar = this.d;
        if (iVar != null && (viewGroup = this.e) != null && view != null) {
            iVar.d(view, viewGroup, new b5.d(28, y10, view), z10);
        }
        xd.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.add(y10);
        }
        return y10;
    }

    public final void d() {
        xd.b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(xd.b bVar) {
        this.c = bVar;
    }

    public final void f(pg.i iVar, ViewGroup viewGroup) {
        this.d = iVar;
        this.e = viewGroup;
    }
}
