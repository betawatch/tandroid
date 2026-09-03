package gg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements y4, tv0, ig.g, ig.l {
    public final /* synthetic */ b1 a;

    public /* synthetic */ r0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        b1 b1Var = this.a;
        b1Var.j0 = i10 * 1000;
        b1Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        b1 b1Var = this.a;
        int i11 = b1Var.e0;
        int i12 = ig.e.s;
        if (i11 == 2) {
            b1Var.k0 = i10;
        } else {
            b1Var.l0 = i10;
        }
        b1Var.n0.a.c(b1Var.V(), true);
        if (b1Var.e0 == 3) {
            b1Var.a0(true, true);
        } else {
            b1Var.a0(false, false);
        }
        hg.b bVar = b1Var.d0;
        int V = b1Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof ig.z) {
                k6 k6Var = ((ig.z) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                k6Var.a();
                k6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof ig.h) {
                ig.h hVar = (ig.h) childAt;
                int F = bVar.F(hVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(hVar.v);
                if (hVar.w) {
                    hVar.setSubtitle(F >= 1 ? LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", F, new Object[0]) : LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    hVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", V, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void j() {
    }
}
