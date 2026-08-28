package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements org.telegram.ui.ActionBar.b2, MessagesController.IsInChatCheckedCallback {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q2(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.b = k5Var;
        this.c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.a = j10;
        this.f = charSequence;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        k5.L0((k5) this.b, (TL_stars.TL_starGiftUnique) this.c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.a, (CharSequence) this.f, c2Var);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new f((b21) this.b, z10, (org.telegram.ui.ActionBar.g1) this.c, (x60) this.d, this.a, (TLRPC.User) this.e, (TLRPC.Chat) this.f));
    }

    public /* synthetic */ q2(b21 b21Var, org.telegram.ui.ActionBar.g1 g1Var, x60 x60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.b = b21Var;
        this.c = g1Var;
        this.d = x60Var;
        this.a = j10;
        this.e = user;
        this.f = chat;
    }
}
