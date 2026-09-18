package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dj1 extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ WallpapersListActivity f;

    public dj1(WallpapersListActivity wallpapersListActivity) {
        this.f = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f;
        ij1 ij1Var = wallpapersListActivity.H;
        ij1Var.n = null;
        ij1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        k();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void q(EditText editText) {
        this.f.H.E(editText.getText().toString(), false);
    }
}
