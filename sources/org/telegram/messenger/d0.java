package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ d0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // c5.p
    public void a(c5.h hVar, List list) {
        this.a.onPurchasesUpdated(hVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.h hVar, List list) {
        this.a.onQueriedPremiumProductDetails(hVar, list);
    }
}
