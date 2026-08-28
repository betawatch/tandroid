package bg;

import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k1 extends cg.e {
    public final /* synthetic */ l1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, b6 b6Var) {
        super(b6Var);
        this.r = l1Var;
    }

    @Override // cg.e
    public final void E() {
        b6 b6Var;
        l1 l1Var = this.r;
        String str = l1Var.W;
        String string = ((str == null || str.isEmpty()) && l1Var.T.to_id == -1) ? LocaleController.getString(R.string.BoostingOnlyGiveawayCreatorSeeLink) : LocaleController.getString(R.string.BoostingOnlyRecipientCode);
        org.telegram.ui.ActionBar.d3 d3Var = l1Var.container;
        b6Var = ((org.telegram.ui.ActionBar.f3) l1Var).resourcesProvider;
        new oc(d3Var, b6Var).Q(R.raw.chats_infotip, 36, string).k(true);
    }

    @Override // cg.e
    public final void F(TLObject tLObject) {
        l1 l1Var = this.r;
        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = l1Var.T;
        org.telegram.ui.ActionBar.o2 o2Var = l1Var.n;
        l1Var.dismiss();
        if (tLObject instanceof TLRPC.Chat) {
            o2Var.presentFragment(qn.R9(-((TLRPC.Chat) tLObject).id));
            return;
        }
        if (tLObject instanceof TLRPC.User) {
            o2Var.presentFragment(qn.R9(((TLRPC.User) tLObject).id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -DialogObject.getPeerDialogId(tL_payments_checkedGiftCode.from_id));
        bundle.putInt("message_id", tL_payments_checkedGiftCode.giveaway_msg_id);
        o2Var.presentFragment(new qn(bundle));
    }
}
