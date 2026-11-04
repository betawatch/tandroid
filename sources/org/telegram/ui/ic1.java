package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ic1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public ic1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i3 == -1) {
            y4Var = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).simpleActionBar;
            if (!y4Var.s()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            y4Var2 = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).simpleActionBar;
            y4Var2.r();
            wallpapersListActivity.I0();
            return;
        }
        if (i3 != 4) {
            if (i3 == 3) {
                uw uwVar = new uw(org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true));
                uwVar.D2 = new gc1(this);
                wallpapersListActivity.presentFragment(uwVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        String G = org.telegram.messenger.bd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = G;
        s1Var.U = org.telegram.messenger.bd.a0("DeleteChatBackgroundsAlert", null, 2131751555, new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new gc1(this));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        wallpapersListActivity.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
        }
    }
}
