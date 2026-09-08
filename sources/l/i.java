package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends BaseAdapter {
    public final l a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.e = layoutInflater;
        this.a = lVar;
        this.f = i10;
        a();
    }

    public final void a() {
        l lVar = this.a;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.b = i10;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i10) {
        ArrayList l4;
        boolean z10 = this.d;
        l lVar = this.a;
        if (z10) {
            lVar.i();
            l4 = lVar.j;
        } else {
            l4 = lVar.l();
        }
        int i11 = this.b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) l4.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l4;
        boolean z10 = this.d;
        l lVar = this.a;
        if (z10) {
            lVar.i();
            l4 = lVar.j;
        } else {
            l4 = lVar.l();
        }
        return this.b < 0 ? l4.size() : l4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i11 = getItem(i10).b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        z zVar = (z) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
