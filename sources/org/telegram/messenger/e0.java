package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.q {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ e0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // c5.q
    public void a(c5.i iVar, List list) {
        this.a.onPurchasesUpdated(iVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.a.onQueriedPremiumProductDetails(iVar, list);
    }
}
