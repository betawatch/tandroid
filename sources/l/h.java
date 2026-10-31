package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final void d() {
        g gVar = this.f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // l.y
    public final void e(x xVar) {
        throw null;
    }

    @Override // l.y
    public final void g(l lVar, boolean z10) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
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
        c5.x xVar = new c5.x(context);
        g.b bVar = (g.b) xVar.c;
        h hVar = new h((ContextThemeWrapper) bVar.c);
        mVar.c = hVar;
        hVar.e = mVar;
        e0Var.b(hVar, context);
        h hVar2 = mVar.c;
        if (hVar2.f == null) {
            hVar2.f = new g(hVar2);
        }
        bVar.l = hVar2.f;
        bVar.m = mVar;
        View view = e0Var.o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.e = e0Var.n;
            bVar.f = e0Var.m;
        }
        bVar.k = mVar;
        g.f g10 = xVar.g();
        mVar.b = g10;
        g10.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.b.show();
        x xVar2 = this.e;
        if (xVar2 == null) {
            return true;
        }
        xVar2.B(e0Var);
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
