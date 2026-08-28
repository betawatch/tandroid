package bg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.x4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements x4, av0, dg.g, dg.l {
    public final /* synthetic */ h1 a;

    public /* synthetic */ w0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        h1 h1Var = this.a;
        h1Var.i0 = i9 * 1000;
        h1Var.Z(false, true);
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        h1 h1Var = this.a;
        int i10 = h1Var.d0;
        int i11 = dg.e.s;
        if (i10 == 2) {
            h1Var.j0 = i9;
        } else {
            h1Var.k0 = i9;
        }
        h1Var.m0.a.c(h1Var.U(), true);
        if (h1Var.d0 == 3) {
            h1Var.Z(true, true);
        } else {
            h1Var.Z(false, false);
        }
        cg.b bVar = h1Var.c0;
        int U = h1Var.U();
        for (int i12 = 0; i12 < bVar.f.getChildCount(); i12++) {
            View childAt = bVar.f.getChildAt(i12);
            if (childAt instanceof dg.b0) {
                j6 j6Var = ((dg.b0) childAt).r;
                String formatPluralString = U <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", U, Integer.valueOf(U));
                j6Var.a();
                j6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof dg.h) {
                dg.h hVar = (dg.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.w) {
                    hVar.setSubtitle(F >= 1 ? LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", F, new Object[0]) : LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    hVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", U, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
    }
}
