// default package

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dm4 extends ArrayAdapter {
    public final /* synthetic */ jm4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm4(jm4 jm4Var, Context context) {
        super(context, 0);
        this.a = jm4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        jm4 jm4Var = this.a;
        im4 im4Var = jm4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i);
        int width = jm4Var.I.getWidth();
        if (view != null) {
            int i2 = im4Var.b;
            lm4.e(view, menuItem, im4Var.e.Q.j != null);
        } else {
            lm4 lm4Var = im4Var.e.Q;
            Context context = im4Var.d;
            yl4 yl4Var = lm4.p;
            view = lm4Var.b(context, menuItem, true, false, false);
            int i3 = im4Var.c;
            view.setPadding(i3, 0, i3, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
