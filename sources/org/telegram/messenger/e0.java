package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.p {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ e0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // c5.p
    public void b(c5.i iVar, List list) {
        this.a.onPurchasesUpdated(iVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.a.onQueriedPremiumProductDetails(iVar, list);
    }
}
