package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public nc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i7 == -1) {
            z4Var = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
            if (!z4Var.x()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            z4Var2 = ((org.telegram.ui.ActionBar.g2) wallpapersListActivity).simpleActionBar;
            z4Var2.w();
            wallpapersListActivity.I0();
            return;
        }
        if (i7 != 4) {
            if (i7 == 3) {
                bx bxVar = new bx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
                bxVar.E2 = new mc1(this);
                wallpapersListActivity.presentFragment(bxVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        String G = org.telegram.messenger.gd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = G;
        t1Var.U = org.telegram.messenger.gd.a0("DeleteChatBackgroundsAlert", null, 2131751542, new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new mc1(this));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        wallpapersListActivity.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }
}
