package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements y, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public l c;
    public ExpandedMenuView d;
    public x e;
    public g f;

    public h(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // l.y
    public final void b(l lVar, boolean z10) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.b(lVar, z10);
        }
    }

    @Override // l.y
    public final boolean c(n nVar) {
        return false;
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.y
    public final void e() {
        g gVar = this.f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void h(x xVar) {
        throw null;
    }

    @Override // l.y
    public final void i(Context context, l lVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = lVar;
        g gVar = this.f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        m mVar = new m();
        mVar.a = e0Var;
        n2.v vVar = new n2.v(context);
        g.d dVar = (g.d) vVar.c;
        h hVar = new h(dVar.a);
        mVar.c = hVar;
        hVar.e = mVar;
        e0Var.b(hVar, context);
        h hVar2 = mVar.c;
        if (hVar2.f == null) {
            hVar2.f = new g(hVar2);
        }
        dVar.i = hVar2.f;
        dVar.j = mVar;
        View view = e0Var.o;
        if (view != null) {
            dVar.e = view;
        } else {
            dVar.c = e0Var.n;
            dVar.d = e0Var.m;
        }
        dVar.h = mVar;
        g.g d = vVar.d();
        mVar.b = d;
        d.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.b.show();
        x xVar = this.e;
        if (xVar == null) {
            return true;
        }
        xVar.l(e0Var);
        return true;
    }

    @Override // l.y
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.c.q(this.f.getItem(i10), this, 0);
    }
}
