package hg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d1 extends ig.e {
    public final /* synthetic */ e1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, g6 g6Var) {
        super(g6Var);
        this.r = e1Var;
    }

    @Override // ig.e
    public final void E() {
        g6 g6Var;
        e1 e1Var = this.r;
        String str = e1Var.X;
        String string = ((str == null || str.isEmpty()) && e1Var.U.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        f3 f3Var = e1Var.container;
        g6Var = ((h3) e1Var).resourcesProvider;
        new qc(f3Var, g6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // ig.e
    public final void F(TLObject tLObject) {
        e1 e1Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = e1Var.U;
        org.telegram.ui.ActionBar.p2 p2Var = e1Var.n;
        e1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            p2Var.presentFragment(xn.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            p2Var.presentFragment(xn.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        p2Var.presentFragment(new xn(bundle));
    }
}
