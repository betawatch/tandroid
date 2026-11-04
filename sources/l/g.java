package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final void b(k kVar, boolean z10) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override // l.x
    public final boolean c(m mVar) {
        return false;
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
        e5.u uVar = new e5.u(context);
        g.b bVar = (g.b) uVar.c;
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
        g.f e10 = uVar.e();
        lVar.b = e10;
        e10.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.b.show();
        w wVar = this.e;
        if (wVar == null) {
            return true;
        }
        wVar.E(d0Var);
        return true;
    }

    @Override // l.x
    public final boolean k(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j10) {
        this.c.q(this.f.getItem(i3), this, 0);
    }
}
