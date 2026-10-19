package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        com.google.firebase.messaging.n nVar = v4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = v4Var.I.getWidth();
        if (view != null) {
            int i11 = nVar.a;
            x4.e(view, menuItem, ((v4) nVar.e).Q.j != null);
        } else {
            view = x4.b(((v4) nVar.e).Q, (Context) nVar.c, menuItem, true, false, false);
            int i12 = nVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
