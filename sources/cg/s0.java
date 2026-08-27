package cg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.x4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements x4, cv0, eg.g, eg.l {
    public final /* synthetic */ d1 a;

    public /* synthetic */ s0(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        d1 d1Var = this.a;
        d1Var.i0 = i10 * 1000;
        d1Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.cv0
    public void j(int i10) {
        d1 d1Var = this.a;
        int i11 = d1Var.d0;
        int i12 = eg.e.s;
        if (i11 == 2) {
            d1Var.j0 = i10;
        } else {
            d1Var.k0 = i10;
        }
        d1Var.m0.a.c(d1Var.V(), true);
        if (d1Var.d0 == 3) {
            d1Var.a0(true, true);
        } else {
            d1Var.a0(false, false);
        }
        dg.b bVar = d1Var.c0;
        int V = d1Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof eg.a0) {
                j6 j6Var = ((eg.a0) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                j6Var.a();
                j6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof eg.h) {
                eg.h hVar = (eg.h) childAt;
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

    @Override // org.telegram.ui.Components.cv0
    public /* synthetic */ void m() {
    }
}
