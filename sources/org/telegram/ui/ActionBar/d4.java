package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d4 extends ArrayAdapter {
    public final /* synthetic */ i4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(i4 i4Var, Context context) {
        super(context, 0);
        this.a = i4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        i4 i4Var = this.a;
        ab.v vVar = i4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = i4Var.I.getWidth();
        if (view != null) {
            int i10 = vVar.a;
            k4.e(view, menuItem, ((i4) vVar.e).Q.j != null);
        } else {
            view = k4.b(((i4) vVar.e).Q, (Context) vVar.c, menuItem, true, false, false);
            int i11 = vVar.b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
