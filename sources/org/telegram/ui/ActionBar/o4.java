package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o4 extends ArrayAdapter {
    public final /* synthetic */ u4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(u4 u4Var, Context context) {
        super(context, 0);
        this.a = u4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        u4 u4Var = this.a;
        com.google.firebase.messaging.p pVar = u4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = u4Var.I.getWidth();
        if (view != null) {
            int i11 = pVar.a;
            w4.e(view, menuItem, ((u4) pVar.e).Q.j != null);
        } else {
            view = w4.b(((u4) pVar.e).Q, (Context) pVar.c, menuItem, true, false, false);
            int i12 = pVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
