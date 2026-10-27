package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ai1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public ai1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        if (i10 == -1) {
            r5Var = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
            if (!r5Var.o()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            r5Var2 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
            r5Var2.n();
            wallpapersListActivity.E0();
            return;
        }
        if (i10 != 4) {
            if (i10 == 3) {
                ey eyVar = new ey(org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true));
                eyVar.C2 = new zh1(this);
                wallpapersListActivity.presentFragment(eyVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
        alertDialog$Builder.a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zh1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        wallpapersListActivity.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
        }
    }
}
