package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q4 implements View.OnClickListener {
    public final /* synthetic */ v4 a;

    public q4(v4 v4Var) {
        this.a = v4Var;
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
