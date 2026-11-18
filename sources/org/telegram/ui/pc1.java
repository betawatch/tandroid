package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pc1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ WallpapersListActivity a;

    public pc1(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.a5 a5Var;
        org.telegram.ui.ActionBar.a5 a5Var2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i7 == -1) {
            a5Var = ((org.telegram.ui.ActionBar.h2) wallpapersListActivity).simpleActionBar;
            if (!a5Var.x()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            a5Var2 = ((org.telegram.ui.ActionBar.h2) wallpapersListActivity).simpleActionBar;
            a5Var2.w();
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
        String G = org.telegram.messenger.gd.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = G;
        u1Var.U = org.telegram.messenger.gd.a0("DeleteChatBackgroundsAlert", null, 2131751543, new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new oc1(this));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        wallpapersListActivity.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }
}
