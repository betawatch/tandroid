package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n4 extends ArrayAdapter {
    public final /* synthetic */ t4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(t4 t4Var, Context context) {
        super(context, 0);
        this.a = t4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        t4 t4Var = this.a;
        com.google.firebase.messaging.o oVar = t4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i9);
        int width = t4Var.I.getWidth();
        if (view != null) {
            int i10 = oVar.a;
            v4.e(view, menuItem, ((t4) oVar.e).Q.j != null);
        } else {
            view = v4.b(((t4) oVar.e).Q, oVar.c, menuItem, true, false, false);
            int i11 = oVar.b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
