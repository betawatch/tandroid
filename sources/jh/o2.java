package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements org.telegram.ui.ActionBar.b2, MessagesController.IsInChatCheckedCallback {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o2(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.b = h5Var;
        this.c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.a = j10;
        this.f = charSequence;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        h5.L0((h5) this.b, (TL_stars.TL_starGiftUnique) this.c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.a, (CharSequence) this.f, c2Var);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((m21) this.b, z10, (org.telegram.ui.ActionBar.g1) this.c, (j70) this.d, this.a, (TLRPC.User) this.e, (TLRPC.Chat) this.f));
    }

    public /* synthetic */ o2(m21 m21Var, org.telegram.ui.ActionBar.g1 g1Var, j70 j70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.b = m21Var;
        this.c = g1Var;
        this.d = j70Var;
        this.a = j10;
        this.e = user;
        this.f = chat;
    }
}
