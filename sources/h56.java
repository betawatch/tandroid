// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h56 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ i56 b;

    public h56(i56 i56Var) {
        this.b = i56Var;
        a();
    }

    public final void a() {
        yz6 yz6Var = this.b.c;
        c07 c07Var = yz6Var.v;
        if (c07Var != null) {
            yz6Var.i();
            ArrayList arrayList = yz6Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c07) arrayList.get(i)) == c07Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c07 getItem(int i) {
        yz6 yz6Var = this.b.c;
        yz6Var.i();
        ArrayList arrayList = yz6Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c07) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        yz6 yz6Var = this.b.c;
        yz6Var.i();
        int size = yz6Var.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((u07) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
