package eg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e1 extends fg.e {
    public final /* synthetic */ f1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, c6 c6Var) {
        super(c6Var);
        this.r = f1Var;
    }

    @Override // fg.e
    public final void E() {
        c6 c6Var;
        f1 f1Var = this.r;
        String str = f1Var.W;
        String string = ((str == null || str.isEmpty()) && f1Var.T.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        d3 d3Var = f1Var.container;
        c6Var = ((f3) f1Var).resourcesProvider;
        new tc(d3Var, c6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // fg.e
    public final void F(TLObject tLObject) {
        f1 f1Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = f1Var.T;
        org.telegram.ui.ActionBar.o2 o2Var = f1Var.n;
        f1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(tn.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(tn.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        o2Var.presentFragment(new tn(bundle));
    }
}
