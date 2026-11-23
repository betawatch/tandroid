package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public pc1(WallpapersListActivity wallpapersListActivity) {
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
                cx cxVar = new cx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
                cxVar.E2 = new oc1(this);
                wallpapersListActivity.presentFragment(cxVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        String G = org.telegram.messenger.hd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = G;
        t1Var.U = org.telegram.messenger.hd.a0("DeleteChatBackgroundsAlert", null, 2131751542, new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new oc1(this));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        wallpapersListActivity.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
        }
    }
}
