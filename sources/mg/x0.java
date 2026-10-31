package mg;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.o5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 extends ng.f {
    public final /* synthetic */ y0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, p6 p6Var) {
        super(p6Var);
        this.r = y0Var;
    }

    @Override // ng.f
    public final void E() {
        y0 y0Var = this.r;
        String str = y0Var.S1;
        new cc(y0Var.c, y0Var.I0).Q(R.raw.chats_infotip, 36, ((str == null || str.isEmpty()) && y0Var.P1.to_id == -1) ? cd.L0(2131753334, null) : cd.L0(2131753333, null)).k(true);
    }

    @Override // ng.f
    public final void F(TLObject tLObject) {
        y0 y0Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = y0Var.P1;
        k2 k2Var = y0Var.o1;
        y0Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            k2Var.presentFragment(un.ha(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            k2Var.presentFragment(un.ha(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -o5.o(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        k2Var.presentFragment(new un(bundle));
    }
}
