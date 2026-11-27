// default package

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m76 implements z27, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public f27 c;
    public ExpandedMenuView d;
    public y27 e;
    public l76 f;

    public m76(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // z27
    public final boolean b(zdb zdbVar) {
        boolean hasVisibleItems = zdbVar.hasVisibleItems();
        Context context = zdbVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        g27 g27Var = new g27();
        g27Var.a = zdbVar;
        ed edVar = new ed(context, (byte) 0);
        qc qcVar = (qc) edVar.c;
        m76 m76Var = new m76((ContextThemeWrapper) qcVar.c);
        g27Var.c = m76Var;
        m76Var.e = g27Var;
        zdbVar.b(m76Var, context);
        m76 m76Var2 = g27Var.c;
        l76 l76Var = m76Var2.f;
        if (l76Var == null) {
            l76Var = new l76(m76Var2);
            m76Var2.f = l76Var;
        }
        qcVar.l = l76Var;
        qcVar.m = g27Var;
        View view = zdbVar.o;
        if (view != null) {
            qcVar.h = view;
        } else {
            qcVar.e = zdbVar.n;
            qcVar.f = zdbVar.m;
        }
        qcVar.k = g27Var;
        jd a0 = edVar.a0();
        g27Var.b = a0;
        a0.setOnDismissListener(g27Var);
        WindowManager.LayoutParams attributes = g27Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        g27Var.b.show();
        y27 y27Var = this.e;
        if (y27Var == null) {
            return true;
        }
        y27Var.z0(zdbVar);
        return true;
    }

    @Override // z27
    public final boolean c() {
        return false;
    }

    @Override // z27
    public final boolean e(j27 j27Var) {
        return false;
    }

    @Override // z27
    public final void f(f27 f27Var, boolean z) {
        y27 y27Var = this.e;
        if (y27Var != null) {
            y27Var.f(f27Var, z);
        }
    }

    @Override // z27
    public final void h(y27 y27Var) {
        throw null;
    }

    @Override // z27
    public final boolean i(j27 j27Var) {
        return false;
    }

    @Override // z27
    public final void j() {
        l76 l76Var = this.f;
        if (l76Var != null) {
            l76Var.notifyDataSetChanged();
        }
    }

    @Override // z27
    public final void k(Context context, f27 f27Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = f27Var;
        l76 l76Var = this.f;
        if (l76Var != null) {
            l76Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
