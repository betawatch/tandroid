package l;

import android.view.MenuItem;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    public final /* synthetic */ s b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = sVar;
        this.a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onMenuItemClick(this.b.f(menuItem));
    }
}
