package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b4 extends ArrayAdapter {
    public final /* synthetic */ g4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(g4 g4Var, Context context) {
        super(context, 0);
        this.a = g4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        g4 g4Var = this.a;
        ab.v vVar = g4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = g4Var.I.getWidth();
        if (view != null) {
            int i10 = vVar.a;
            i4.e(view, menuItem, ((g4) vVar.e).Q.j != null);
        } else {
            view = i4.b(((g4) vVar.e).Q, (Context) vVar.c, menuItem, true, false, false);
            int i11 = vVar.b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
