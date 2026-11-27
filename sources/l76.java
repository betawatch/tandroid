// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l76 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ m76 b;

    public l76(m76 m76Var) {
        this.b = m76Var;
        a();
    }

    public final void a() {
        f27 f27Var = this.b.c;
        j27 j27Var = f27Var.v;
        if (j27Var != null) {
            f27Var.i();
            ArrayList arrayList = f27Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((j27) arrayList.get(i)) == j27Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j27 getItem(int i) {
        f27 f27Var = this.b.c;
        f27Var.i();
        ArrayList arrayList = f27Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (j27) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        f27 f27Var = this.b.c;
        f27Var.i();
        int size = f27Var.j.size();
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
        ((b37) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
