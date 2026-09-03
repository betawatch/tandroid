package org.telegram.ui.ActionBar;

import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s4 implements View.OnClickListener {
    public final /* synthetic */ x4 a;

    public s4(x4 x4Var) {
        this.a = x4Var;
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
