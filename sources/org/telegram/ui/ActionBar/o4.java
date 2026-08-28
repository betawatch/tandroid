package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
