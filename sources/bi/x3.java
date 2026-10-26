package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements org.telegram.ui.ActionBar.b2, MessagesController.IsInChatCheckedCallback {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x3(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.b = h7Var;
        this.c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.a = j10;
        this.f = charSequence;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        h7.a0((h7) this.b, (TL_stars.TL_starGiftUnique) this.c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.a, (CharSequence) this.f, e2Var);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new l((e41) this.b, z10, (org.telegram.ui.ActionBar.g1) this.c, (k80) this.d, this.a, (TLRPC.User) this.e, (TLRPC.Chat) this.f));
    }

    public /* synthetic */ x3(e41 e41Var, org.telegram.ui.ActionBar.g1 g1Var, k80 k80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.b = e41Var;
        this.c = g1Var;
        this.d = k80Var;
        this.a = j10;
        this.e = user;
        this.f = chat;
    }
}
