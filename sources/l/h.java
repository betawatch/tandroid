package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    public final boolean b(n nVar) {
        return false;
    }

    @Override // l.y
    public final boolean c() {
        return false;
    }

    @Override // l.y
    public final void d(l lVar, boolean z10) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.d(lVar, z10);
        }
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
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.c;
        h hVar = new h(cVar.a);
        mVar.c = hVar;
        hVar.e = mVar;
        e0Var.b(hVar, context);
        h hVar2 = mVar.c;
        if (hVar2.f == null) {
            hVar2.f = new g(hVar2);
        }
        cVar.i = hVar2.f;
        cVar.j = mVar;
        View view = e0Var.o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.c = e0Var.n;
            cVar.d = e0Var.m;
        }
        cVar.h = mVar;
        g.g e7 = b0Var.e();
        mVar.b = e7;
        e7.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.b.show();
        x xVar = this.e;
        if (xVar == null) {
            return true;
        }
        xVar.q(e0Var);
        return true;
    }

    @Override // l.y
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.c.q(this.f.getItem(i10), this, 0);
    }
}
