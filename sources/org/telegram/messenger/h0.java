package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements BillingController.ProductDetailsResponseListenerLegacy, d5.p {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ h0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // d5.p
    public void a(d5.i iVar, List list) {
        this.a.onPurchasesUpdated(iVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(d5.i iVar, List list) {
        this.a.onQueriedPremiumProductDetails(iVar, list);
    }
}
