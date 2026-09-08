package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p4 extends ArrayAdapter {
    public final /* synthetic */ v4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(v4 v4Var, Context context) {
        super(context, 0);
        this.a = v4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        v4 v4Var = this.a;
        com.google.firebase.messaging.p pVar = v4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = v4Var.I.getWidth();
        if (view != null) {
            int i11 = pVar.a;
            x4.e(view, menuItem, ((v4) pVar.e).Q.j != null);
        } else {
            view = x4.b(((v4) pVar.e).Q, (Context) pVar.c, menuItem, true, false, false);
            int i12 = pVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
