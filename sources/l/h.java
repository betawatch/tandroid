package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {
    public final k a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z4, int i10) {
        this.d = z4;
        this.e = layoutInflater;
        this.a = kVar;
        this.f = i10;
        a();
    }

    public final void a() {
        k kVar = this.a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.b = i10;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i10) {
        ArrayList l10;
        boolean z4 = this.d;
        k kVar = this.a;
        if (z4) {
            kVar.i();
            l10 = kVar.j;
        } else {
            l10 = kVar.l();
        }
        int i11 = this.b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) l10.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z4 = this.d;
        k kVar = this.a;
        if (z4) {
            kVar.i();
            l10 = kVar.j;
        } else {
            l10 = kVar.l();
        }
        return this.b < 0 ? l10.size() : l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i11 = getItem(i10).b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i11 != i13) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        y yVar = (y) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
