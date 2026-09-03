package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ h b;

    public g(h hVar) {
        this.b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.b.c;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.a = i10;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i10) {
        h hVar = this.b;
        l lVar = hVar.c;
        lVar.i();
        ArrayList arrayList = lVar.j;
        hVar.getClass();
        int i11 = this.a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.b;
        l lVar = hVar.c;
        lVar.i();
        int size = lVar.j.size();
        hVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
