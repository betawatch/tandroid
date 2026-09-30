package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class o4 implements View.OnClickListener {
    public final /* synthetic */ t4 a;

    public o4(t4 t4Var) {
        this.a = t4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = this.a.K) == null) {
            return;
        }
        onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
    }
}
