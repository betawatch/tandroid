package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class f4 extends ArrayAdapter {
    public final /* synthetic */ k4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(k4 k4Var, Context context) {
        super(context, 0);
        this.a = k4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        k4 k4Var = this.a;
        ab.v vVar = k4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i7);
        int width = k4Var.I.getWidth();
        if (view != null) {
            int i10 = vVar.a;
            m4.e(view, menuItem, ((k4) vVar.e).Q.j != null);
        } else {
            view = m4.b(((k4) vVar.e).Q, (Context) vVar.c, menuItem, true, false, false);
            int i11 = vVar.b;
            view.setPadding(i11, 0, i11, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
