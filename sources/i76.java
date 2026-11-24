// default package

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i76 implements s27, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public y17 c;
    public ExpandedMenuView d;
    public r27 e;
    public h76 f;

    public i76(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // s27
    public final boolean b(dcb dcbVar) {
        boolean hasVisibleItems = dcbVar.hasVisibleItems();
        Context context = dcbVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        z17 z17Var = new z17();
        z17Var.a = dcbVar;
        de deVar = new de(context, (byte) 0);
        pd pdVar = (pd) deVar.c;
        i76 i76Var = new i76((ContextThemeWrapper) pdVar.c);
        z17Var.c = i76Var;
        i76Var.e = z17Var;
        dcbVar.b(i76Var, context);
        i76 i76Var2 = z17Var.c;
        h76 h76Var = i76Var2.f;
        if (h76Var == null) {
            h76Var = new h76(i76Var2);
            i76Var2.f = h76Var;
        }
        pdVar.l = h76Var;
        pdVar.m = z17Var;
        View view = dcbVar.o;
        if (view != null) {
            pdVar.h = view;
        } else {
            pdVar.e = dcbVar.n;
            pdVar.f = dcbVar.m;
        }
        pdVar.k = z17Var;
        ie a0 = deVar.a0();
        z17Var.b = a0;
        a0.setOnDismissListener(z17Var);
        WindowManager.LayoutParams attributes = z17Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        z17Var.b.show();
        r27 r27Var = this.e;
        if (r27Var == null) {
            return true;
        }
        r27Var.w0(dcbVar);
        return true;
    }

    @Override // s27
    public final boolean c() {
        return false;
    }

    @Override // s27
    public final void d(y17 y17Var, boolean z) {
        r27 r27Var = this.e;
        if (r27Var != null) {
            r27Var.d(y17Var, z);
        }
    }

    @Override // s27
    public final boolean g(c27 c27Var) {
        return false;
    }

    @Override // s27
    public final void h(r27 r27Var) {
        throw null;
    }

    @Override // s27
    public final boolean i(c27 c27Var) {
        return false;
    }

    @Override // s27
    public final void j() {
        h76 h76Var = this.f;
        if (h76Var != null) {
            h76Var.notifyDataSetChanged();
        }
    }

    @Override // s27
    public final void k(Context context, y17 y17Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = y17Var;
        h76 h76Var = this.f;
        if (h76Var != null) {
            h76Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
