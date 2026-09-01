package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        com.google.firebase.messaging.n nVar = x4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = x4Var.I.getWidth();
        if (view != null) {
            int i11 = nVar.a;
            z4.e(view, menuItem, ((x4) nVar.e).Q.j != null);
        } else {
            view = z4.b(((x4) nVar.e).Q, nVar.c, menuItem, true, false, false);
            int i12 = nVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
