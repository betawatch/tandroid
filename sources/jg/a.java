package jg;

import ag.h0;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a {
    public final og.a a;
    public yd.b b;
    public yd.b c;
    public qg.j d;
    public ViewGroup e;
    public boolean f;

    public a(og.a aVar) {
        this.a = aVar;
    }

    public final lg.d a(View view) {
        return c(view, null, false);
    }

    public final lg.d b(View view, mg.a aVar) {
        return c(view, aVar, false);
    }

    public final lg.d c(View view, mg.a aVar, boolean z10) {
        ViewGroup viewGroup;
        lg.d w10 = this.a.w();
        if (this.f && Build.VERSION.SDK_INT >= 33 && (w10 instanceof lg.e)) {
            lg.e eVar = (lg.e) w10;
            eVar.N = new f(eVar.I);
        }
        w10.n(aVar);
        yd.b bVar = this.c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        qg.j jVar = this.d;
        if (jVar != null && (viewGroup = this.e) != null && view != null) {
            jVar.d(view, viewGroup, new h0(29, w10, view), z10);
        }
        yd.b bVar2 = this.b;
        if (bVar2 != null) {
            bVar2.add(w10);
        }
        return w10;
    }

    public final void d() {
        yd.b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(yd.b bVar) {
        this.c = bVar;
    }

    public final void f(qg.j jVar, ViewGroup viewGroup) {
        this.d = jVar;
        this.e = viewGroup;
    }
}
