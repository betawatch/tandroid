package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
