package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_getTmpPassword;
import org.telegram.tgnet.TLRPC$TL_error;
/* loaded from: classes3.dex */
public final /* synthetic */ class PaymentFormActivity$$ExternalSyntheticLambda57 implements RequestDelegate {
    public final /* synthetic */ PaymentFormActivity f$0;
    public final /* synthetic */ TLRPC$TL_account_getTmpPassword f$1;

    public /* synthetic */ PaymentFormActivity$$ExternalSyntheticLambda57(PaymentFormActivity paymentFormActivity, TLRPC$TL_account_getTmpPassword tLRPC$TL_account_getTmpPassword) {
        this.f$0 = paymentFormActivity;
        this.f$1 = tLRPC$TL_account_getTmpPassword;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.f$0.lambda$checkPassword$60(this.f$1, tLObject, tLRPC$TL_error);
    }
}
