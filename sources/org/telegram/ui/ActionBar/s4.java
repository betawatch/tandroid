package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s4 extends ArrayAdapter {
    public final /* synthetic */ y4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(y4 y4Var, Context context) {
        super(context, 0);
        this.a = y4Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        y4 y4Var = this.a;
        com.google.firebase.messaging.n nVar = y4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i10);
        int width = y4Var.I.getWidth();
        if (view != null) {
            int i11 = nVar.a;
            a5.e(view, menuItem, ((y4) nVar.e).Q.j != null);
        } else {
            view = a5.b(((y4) nVar.e).Q, (Context) nVar.c, menuItem, true, false, false);
            int i12 = nVar.b;
            view.setPadding(i12, 0, i12, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
