package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k4 extends ArrayAdapter {
    public final /* synthetic */ q4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(q4 q4Var, Context context) {
        super(context, 0);
        this.a = q4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        q4 q4Var = this.a;
        p4 p4Var = q4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = q4Var.I.getWidth();
        if (view != null) {
            int i11 = p4Var.a;
            s4.e(view, menuItem, ((q4) p4Var.e).Q.j != null);
        } else {
            view = s4.b(((q4) p4Var.e).Q, (Context) p4Var.d, menuItem, true, false, false);
            int i12 = p4Var.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
