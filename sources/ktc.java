// default package

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ktc extends c6 {
    public final /* synthetic */ WallpapersListActivity a;

    public ktc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override // c6
    public final void b(int i) {
        rja rjaVar;
        rja rjaVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i == -1) {
            rjaVar = ((d) wallpapersListActivity).simpleActionBar;
            if (!rjaVar.x()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            rjaVar2 = ((d) wallpapersListActivity).simpleActionBar;
            rjaVar2.w();
            wallpapersListActivity.I0();
            return;
        }
        if (i != 4) {
            if (i == 3) {
                nk3 nk3Var = new nk3(td4.j(3, "onlySelect", "dialogsType", true));
                nk3Var.E2 = new jtc(this);
                wallpapersListActivity.presentFragment(nk3Var);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            String G = jb6.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
            he heVar = alertDialog$Builder.a;
            heVar.S = G;
            heVar.U = jb6.a0("DeleteChatBackgroundsAlert", null, 2131751491, new Object[0]);
            alertDialog$Builder.j(jb6.M0(2131751535, null), new jtc(this));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            wallpapersListActivity.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }
}
