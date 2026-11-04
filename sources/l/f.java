package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ g b;

    public f(g gVar) {
        this.b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.b.c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((m) arrayList.get(i3)) == mVar) {
                    this.a = i3;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i3) {
        g gVar = this.b;
        k kVar = gVar.c;
        kVar.i();
        ArrayList arrayList = kVar.j;
        gVar.getClass();
        int i10 = this.a;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (m) arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        g gVar = this.b;
        k kVar = gVar.c;
        kVar.i();
        int size = kVar.j.size();
        gVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
