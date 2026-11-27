// default package

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class c27 extends BaseAdapter {
    public final f27 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public c27(f27 f27Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = f27Var;
        this.f = i;
        a();
    }

    public final void a() {
        f27 f27Var = this.a;
        j27 j27Var = f27Var.v;
        if (j27Var != null) {
            f27Var.i();
            ArrayList arrayList = f27Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((j27) arrayList.get(i)) == j27Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j27 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        f27 f27Var = this.a;
        if (z) {
            f27Var.i();
            l = f27Var.j;
        } else {
            l = f27Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (j27) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        f27 f27Var = this.a;
        if (z) {
            f27Var.i();
            l = f27Var.j;
        } else {
            l = f27Var.l();
        }
        return this.b < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        b37 b37Var = (b37) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        b37Var.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
