package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u4 extends ArrayAdapter {
    public final /* synthetic */ a5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(a5 a5Var, Context context) {
        super(context, 0);
        this.a = a5Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        a5 a5Var = this.a;
        com.google.firebase.messaging.m mVar = a5Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = a5Var.I.getWidth();
        if (view != null) {
            int i11 = mVar.a;
            c5.e(view, menuItem, ((a5) mVar.e).Q.j != null);
        } else {
            view = c5.b(((a5) mVar.e).Q, (Context) mVar.c, menuItem, true, false, false);
            int i12 = mVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
