package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bi1 extends org.telegram.ui.ActionBar.s0 {
    public final /* synthetic */ WallpapersListActivity a;

    public bi1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void f() {
        WallpapersListActivity wallpapersListActivity = this.a;
        gi1 gi1Var = wallpapersListActivity.H;
        gi1Var.n = null;
        gi1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        WallpapersListActivity wallpapersListActivity = this.a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        f();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        WallpapersListActivity wallpapersListActivity = this.a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        this.a.H.E(editText.getText().toString(), false);
    }
}
