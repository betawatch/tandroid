package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements BillingController.ProductDetailsResponseListenerLegacy, p2.n {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ e0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // p2.n
    public void b(p2.h hVar, List list) {
        this.a.onPurchasesUpdated(hVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.h hVar, List list) {
        this.a.onQueriedPremiumProductDetails(hVar, list);
    }
}
