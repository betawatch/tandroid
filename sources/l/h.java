package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {
    public final k a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i3) {
        this.d = z10;
        this.e = layoutInflater;
        this.a = kVar;
        this.f = i3;
        a();
    }

    public final void a() {
        k kVar = this.a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((m) arrayList.get(i3)) == mVar) {
                    this.b = i3;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i3) {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.a;
        if (z10) {
            kVar.i();
            l10 = kVar.j;
        } else {
            l10 = kVar.l();
        }
        int i10 = this.b;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (m) l10.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.a;
        if (z10) {
            kVar.i();
            l10 = kVar.j;
        } else {
            l10 = kVar.l();
        }
        return this.b < 0 ? l10.size() : l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i10 = getItem(i3).b;
        int i11 = i3 - 1;
        int i12 = i11 >= 0 ? getItem(i11).b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i10 != i12) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
