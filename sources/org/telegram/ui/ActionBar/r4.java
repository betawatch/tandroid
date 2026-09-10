package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r4 extends ArrayAdapter {
    public final /* synthetic */ x4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(x4 x4Var, Context context) {
        super(context, 0);
        this.a = x4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        x4 x4Var = this.a;
        com.google.firebase.messaging.p pVar = x4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = x4Var.I.getWidth();
        if (view != null) {
            int i11 = pVar.a;
            z4.e(view, menuItem, ((x4) pVar.e).Q.j != null);
        } else {
            view = z4.b(((x4) pVar.e).Q, (Context) pVar.c, menuItem, true, false, false);
            int i12 = pVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
