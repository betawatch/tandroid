package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
