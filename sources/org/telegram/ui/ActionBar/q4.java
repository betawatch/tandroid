package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q4 extends ArrayAdapter {
    public final /* synthetic */ w4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(w4 w4Var, Context context) {
        super(context, 0);
        this.a = w4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        w4 w4Var = this.a;
        com.google.firebase.messaging.n nVar = w4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = w4Var.I.getWidth();
        if (view != null) {
            int i11 = nVar.a;
            y4.e(view, menuItem, ((w4) nVar.e).Q.j != null);
        } else {
            view = y4.b(((w4) nVar.e).Q, nVar.c, menuItem, true, false, false);
            int i12 = nVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
