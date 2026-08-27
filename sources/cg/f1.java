package cg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.mc;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f1 extends dg.e {
    public final /* synthetic */ g1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, c6 c6Var) {
        super(c6Var);
        this.r = g1Var;
    }

    @Override // dg.e
    public final void E() {
        c6 c6Var;
        g1 g1Var = this.r;
        String str = g1Var.W;
        String string = ((str == null || str.isEmpty()) && g1Var.T.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        c3 c3Var = g1Var.container;
        c6Var = ((e3) g1Var).resourcesProvider;
        new mc(c3Var, c6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // dg.e
    public final void F(TLObject tLObject) {
        g1 g1Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = g1Var.T;
        org.telegram.ui.ActionBar.n2 n2Var = g1Var.n;
        g1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            n2Var.presentFragment(rn.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            n2Var.presentFragment(rn.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        n2Var.presentFragment(new rn(bundle));
    }
}
