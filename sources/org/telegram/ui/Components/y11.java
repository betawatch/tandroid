package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y11 implements org.telegram.messenger.ip, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y11(o21 o21Var, org.telegram.ui.ActionBar.b1 b1Var, z60 z60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.b = o21Var;
        this.c = b1Var;
        this.d = z60Var;
        this.a = j10;
        this.e = user;
        this.f = chat;
    }

    @Override // org.telegram.messenger.ip
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.i0.g3(new org.telegram.messenger.bh((o21) this.b, z10, (org.telegram.ui.ActionBar.b1) this.c, (z60) this.d, this.a, (TLRPC.User) this.e, (TLRPC.Chat) this.f));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        rh.e4 e4Var = (rh.e4) this.b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) this.d;
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.e;
        CharSequence charSequence = (CharSequence) this.f;
        gf.e h = x1Var.h(-1, true, true);
        h.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(e4Var.a).sendRequest(tL_payments_sendStarsForm, new org.telegram.messenger.vm(e4Var, h, x1Var, tL_starGiftUnique, this.a, charSequence, 2));
    }

    public /* synthetic */ y11(rh.e4 e4Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence) {
        this.b = e4Var;
        this.c = tL_starGiftUnique;
        this.d = paymentForm;
        this.e = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.a = j10;
        this.f = charSequence;
    }
}
