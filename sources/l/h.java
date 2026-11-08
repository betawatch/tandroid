package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {
    public final k a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z9, int i7) {
        this.d = z9;
        this.e = layoutInflater;
        this.a = kVar;
        this.f = i7;
        a();
    }

    public final void a() {
        k kVar = this.a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.b = i7;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i7) {
        ArrayList l10;
        boolean z9 = this.d;
        k kVar = this.a;
        if (z9) {
            kVar.i();
            l10 = kVar.j;
        } else {
            l10 = kVar.l();
        }
        int i10 = this.b;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (m) l10.get(i7);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z9 = this.d;
        k kVar = this.a;
        if (z9) {
            kVar.i();
            l10 = kVar.j;
        } else {
            l10 = kVar.l();
        }
        return this.b < 0 ? l10.size() : l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        boolean z9 = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i10 = getItem(i7).b;
        int i11 = i7 - 1;
        int i12 = i11 >= 0 ? getItem(i11).b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i10 != i12) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        y yVar = (y) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i7));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
