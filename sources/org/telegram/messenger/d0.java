package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements BillingController.ProductDetailsResponseListenerLegacy, p2.m {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ d0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // p2.m
    public void b(p2.g gVar, List list) {
        this.a.onPurchasesUpdated(gVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(p2.g gVar, List list) {
        this.a.onQueriedPremiumProductDetails(gVar, list);
    }
}
