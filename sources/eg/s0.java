package eg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements b5, kv0, gg.g, gg.l {
    public final /* synthetic */ c1 a;

    public /* synthetic */ s0(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        c1 c1Var = this.a;
        c1Var.i0 = i10 * 1000;
        c1Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        c1 c1Var = this.a;
        int i11 = c1Var.d0;
        int i12 = gg.e.s;
        if (i11 == 2) {
            c1Var.j0 = i10;
        } else {
            c1Var.k0 = i10;
        }
        c1Var.m0.a.c(c1Var.V(), true);
        if (c1Var.d0 == 3) {
            c1Var.a0(true, true);
        } else {
            c1Var.a0(false, false);
        }
        fg.b bVar = c1Var.c0;
        int V = c1Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof gg.z) {
                o6 o6Var = ((gg.z) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof gg.h) {
                gg.h hVar = (gg.h) childAt;
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

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
    }
}
