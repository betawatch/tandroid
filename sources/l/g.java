package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g implements x, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public k c;
    public ExpandedMenuView d;
    public w e;
    public f f;

    public g(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // l.x
    public final boolean b(m mVar) {
        return false;
    }

    @Override // l.x
    public final void c(k kVar, boolean z4) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.c(kVar, z4);
        }
    }

    @Override // l.x
    public final boolean d() {
        return false;
    }

    @Override // l.x
    public final void e() {
        f fVar = this.f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // l.x
    public final void h(w wVar) {
        throw null;
    }

    @Override // l.x
    public final void i(Context context, k kVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = kVar;
        f fVar = this.f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // l.x
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        l lVar = new l();
        lVar.a = d0Var;
        p2.w wVar = new p2.w(context);
        g.c cVar = (g.c) wVar.c;
        g gVar = new g(cVar.a);
        lVar.c = gVar;
        gVar.e = lVar;
        d0Var.b(gVar, context);
        g gVar2 = lVar.c;
        if (gVar2.f == null) {
            gVar2.f = new f(gVar2);
        }
        cVar.i = gVar2.f;
        cVar.j = lVar;
        View view = d0Var.o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.c = d0Var.n;
            cVar.d = d0Var.m;
        }
        cVar.h = lVar;
        g.f d = wVar.d();
        lVar.b = d;
        d.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.b.show();
        w wVar2 = this.e;
        if (wVar2 == null) {
            return true;
        }
        wVar2.e0(d0Var);
        return true;
    }

    @Override // l.x
    public final boolean k(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.c.q(this.f.getItem(i10), this, 0);
    }
}
