package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
