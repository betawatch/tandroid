package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ej1 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ WallpapersListActivity f;

    public ej1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        jj1 jj1Var = wallpapersListActivity.J;
        jj1Var.n = null;
        jj1Var.E(null, true);
        wallpapersListActivity.L.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.I);
        wallpapersListActivity.H.invalidate();
        wallpapersListActivity.J.E(null, true);
        wallpapersListActivity.L.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.J);
        wallpapersListActivity.H.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        this.f.J.E(editText.getText().toString(), false);
    }
}
