package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements BillingController.ProductDetailsResponseListenerLegacy, n2.m {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ d0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // n2.m
    public void c(n2.g gVar, List list) {
        this.a.onPurchasesUpdated(gVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        this.a.onQueriedPremiumProductDetails(gVar, list);
    }
}
