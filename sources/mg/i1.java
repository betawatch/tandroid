package mg;

import ag.d3;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i1 extends sk0 {
    public final /* synthetic */ o1 c;

    public i1(o1 o1Var) {
        this.c = o1Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 3;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.Q1.size() + 3;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        o1 o1Var = this.c;
        int i12 = 0;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) o1Var.Q1.get(i10 - 3);
            qg.k kVar = (qg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(o1Var.P1.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            p4 p4Var = (p4) view;
            p4Var.setTextSize(15.0f);
            p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(2.0f));
            p4Var.setText(cd.L0(2131753295, null));
            return;
        }
        if (i11 == 0) {
            n1 n1Var = (n1) view;
            o1Var.T1 = n1Var;
            TLRPC.Chat chat = o1Var.R1;
            p80 p80Var = n1Var.e;
            try {
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.G((int) vp.r1(d20.s0).r0, "BoostingReassignBoostTextPluralWithLink", chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder R2 = org.telegram.messenger.i0.R2(cd.L0(2131753320, "BoostingReassignBoostTextLink"), t6.Uc, 2, new l1(o1Var, i12), null);
                int indexOf = TextUtils.indexOf(W2, "%3$s");
                W2.replace(indexOf, indexOf + 4, (CharSequence) R2);
                p80Var.setText(W2, TextView.BufferType.EDITABLE);
                p80Var.post(new d3(n1Var, indexOf, 10));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = viewGroup.getContext();
        o1 o1Var = this.c;
        if (i10 == 0) {
            n1 n1Var = new n1(context);
            n1Var.a(o1Var.P1, o1Var.R1);
            view = n1Var;
        } else if (i10 != 1) {
            view = i10 != 2 ? i10 != 3 ? new View(context) : new qg.k(context, true, false, o1Var.I0, true) : new p4(context, 22);
        } else {
            int i11 = t6.a7;
            view = new c7(context, t6.x0(null, i11, false), 0);
            a7.i(i11, view, null);
        }
        return sc.e.o(view, view, -1, -2);
    }
}
