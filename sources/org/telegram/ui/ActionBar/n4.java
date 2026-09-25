package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n4 extends ArrayAdapter {
    public final /* synthetic */ t4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.a = t4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        t4 t4Var = this.a;
        com.google.firebase.messaging.p pVar = t4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = t4Var.I.getWidth();
        if (view != null) {
            int i11 = pVar.a;
            v4.e(view, menuItem, ((t4) pVar.e).Q.j != null);
        } else {
            view = v4.b(((t4) pVar.e).Q, (Context) pVar.c, menuItem, true, false, false);
            int i12 = pVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
