package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b4 extends ArrayAdapter {
    public final /* synthetic */ i4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(i4 i4Var, Context context) {
        super(context, 0);
        this.a = i4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        i4 i4Var = this.a;
        h4 h4Var = i4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i3);
        int width = i4Var.I.getWidth();
        if (view != null) {
            int i10 = h4Var.a;
            k4.e(view, menuItem, ((i4) h4Var.e).Q.j != null);
        } else {
            view = k4.b(((i4) h4Var.e).Q, (Context) h4Var.d, menuItem, true, false, false);
            int i11 = h4Var.b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
