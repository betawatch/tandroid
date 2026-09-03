package gg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d1 extends hg.e {
    public final /* synthetic */ e1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, f6 f6Var) {
        super(f6Var);
        this.r = e1Var;
    }

    @Override // hg.e
    public final void E() {
        f6 f6Var;
        e1 e1Var = this.r;
        String str = e1Var.X;
        String string = ((str == null || str.isEmpty()) && e1Var.U.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        e3 e3Var = e1Var.container;
        f6Var = ((g3) e1Var).resourcesProvider;
        new qc(e3Var, f6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // hg.e
    public final void F(TLObject tLObject) {
        e1 e1Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = e1Var.U;
        org.telegram.ui.ActionBar.p2 p2Var = e1Var.n;
        e1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            p2Var.presentFragment(zn.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            p2Var.presentFragment(zn.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        p2Var.presentFragment(new zn(bundle));
    }
}
