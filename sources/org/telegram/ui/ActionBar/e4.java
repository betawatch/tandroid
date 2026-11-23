package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e4 extends ArrayAdapter {
    public final /* synthetic */ j4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(j4 j4Var, Context context) {
        super(context, 0);
        this.a = j4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        j4 j4Var = this.a;
        ab.v vVar = j4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = j4Var.I.getWidth();
        if (view != null) {
            int i10 = vVar.a;
            l4.e(view, menuItem, ((j4) vVar.e).Q.j != null);
        } else {
            view = l4.b(((j4) vVar.e).Q, (Context) vVar.c, menuItem, true, false, false);
            int i11 = vVar.b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
