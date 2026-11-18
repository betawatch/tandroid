package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d(k kVar, boolean z10) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
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
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.c;
        g gVar = new g((ContextThemeWrapper) bVar.c);
        lVar.c = gVar;
        gVar.e = lVar;
        d0Var.b(gVar, context);
        g gVar2 = lVar.c;
        if (gVar2.f == null) {
            gVar2.f = new f(gVar2);
        }
        bVar.l = gVar2.f;
        bVar.m = lVar;
        View view = d0Var.o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.e = d0Var.n;
            bVar.f = d0Var.m;
        }
        bVar.k = lVar;
        g.f g10 = jVar.g();
        lVar.b = g10;
        g10.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.b.show();
        w wVar = this.e;
        if (wVar == null) {
            return true;
        }
        wVar.C(d0Var);
        return true;
    }

    @Override // l.x
    public final boolean k(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        this.c.q(this.f.getItem(i7), this, 0);
    }
}
