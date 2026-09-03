package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements BillingController.ProductDetailsResponseListenerLegacy, p2.o {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ e0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // p2.o
    public void b(p2.h hVar, List list) {
        this.a.onPurchasesUpdated(hVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        this.a.onQueriedPremiumProductDetails(hVar, list);
    }
}
