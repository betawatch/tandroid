// default package

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i56 implements s07, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public yz6 c;
    public ExpandedMenuView d;
    public r07 e;
    public h56 f;

    public i56(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // s07
    public final boolean b(bab babVar) {
        boolean hasVisibleItems = babVar.hasVisibleItems();
        Context context = babVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        zz6 zz6Var = new zz6();
        zz6Var.a = babVar;
        dd ddVar = new dd(context, (byte) 0);
        pc pcVar = (pc) ddVar.c;
        i56 i56Var = new i56((ContextThemeWrapper) pcVar.c);
        zz6Var.c = i56Var;
        i56Var.e = zz6Var;
        babVar.b(i56Var, context);
        i56 i56Var2 = zz6Var.c;
        h56 h56Var = i56Var2.f;
        if (h56Var == null) {
            h56Var = new h56(i56Var2);
            i56Var2.f = h56Var;
        }
        pcVar.l = h56Var;
        pcVar.m = zz6Var;
        View view = babVar.o;
        if (view != null) {
            pcVar.h = view;
        } else {
            pcVar.e = babVar.n;
            pcVar.f = babVar.m;
        }
        pcVar.k = zz6Var;
        id Y = ddVar.Y();
        zz6Var.b = Y;
        Y.setOnDismissListener(zz6Var);
        WindowManager.LayoutParams attributes = zz6Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        zz6Var.b.show();
        r07 r07Var = this.e;
        if (r07Var == null) {
            return true;
        }
        r07Var.J(babVar);
        return true;
    }

    @Override // s07
    public final boolean c() {
        return false;
    }

    @Override // s07
    public final void d(yz6 yz6Var, boolean z) {
        r07 r07Var = this.e;
        if (r07Var != null) {
            r07Var.d(yz6Var, z);
        }
    }

    @Override // s07
    public final boolean g(c07 c07Var) {
        return false;
    }

    @Override // s07
    public final void h(r07 r07Var) {
        throw null;
    }

    @Override // s07
    public final boolean i(c07 c07Var) {
        return false;
    }

    @Override // s07
    public final void j() {
        h56 h56Var = this.f;
        if (h56Var != null) {
            h56Var.notifyDataSetChanged();
        }
    }

    @Override // s07
    public final void k(Context context, yz6 yz6Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = yz6Var;
        h56 h56Var = this.f;
        if (h56Var != null) {
            h56Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
