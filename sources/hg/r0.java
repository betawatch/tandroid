package hg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements y4, uv0, jg.g, jg.l {
    public final /* synthetic */ b1 a;

    public /* synthetic */ r0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        b1 b1Var = this.a;
        b1Var.j0 = i10 * 1000;
        b1Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.uv0
    public void i(int i10) {
        b1 b1Var = this.a;
        int i11 = b1Var.e0;
        int i12 = jg.e.s;
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
        ig.b bVar = b1Var.d0;
        int V = b1Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof jg.z) {
                k6 k6Var = ((jg.z) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                k6Var.a();
                k6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof jg.h) {
                jg.h hVar = (jg.h) childAt;
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

    @Override // org.telegram.ui.Components.uv0
    public /* synthetic */ void m() {
    }
}
