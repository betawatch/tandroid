package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class r21 implements MessagesController.IsInChatCheckedCallback, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r21(k31 k31Var, org.telegram.ui.ActionBar.g1 g1Var, w70 w70Var, long j3, TLRPC.User user, TLRPC.Chat chat) {
        this.b = k31Var;
        this.c = g1Var;
        this.d = w70Var;
        this.a = j3;
        this.e = user;
        this.f = chat;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xh.x3.L0((xh.x3) this.b, (TL_stars.TL_starGiftUnique) this.c, (TLRPC.PaymentForm) this.d, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e, this.a, (CharSequence) this.f, d2Var);
    }

    @Override // org.telegram.messenger.MessagesController.IsInChatCheckedCallback
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new v21((k31) this.b, z10, (org.telegram.ui.ActionBar.g1) this.c, (w70) this.d, this.a, (TLRPC.User) this.e, (TLRPC.Chat) this.f));
    }

    public /* synthetic */ r21(xh.x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence) {
        this.b = x3Var;
        this.c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.a = j3;
        this.f = charSequence;
    }
}
