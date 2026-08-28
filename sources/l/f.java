package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            for (int i9 = 0; i9 < size; i9++) {
                if (((m) arrayList.get(i9)) == mVar) {
                    this.a = i9;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i9) {
        g gVar = this.b;
        k kVar = gVar.c;
        kVar.i();
        ArrayList arrayList = kVar.j;
        gVar.getClass();
        int i10 = this.a;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (m) arrayList.get(i9);
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
    public final long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i9));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
