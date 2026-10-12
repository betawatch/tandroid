package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements BillingController.ProductDetailsResponseListenerLegacy, c5.q {
    public final /* synthetic */ BillingController a;

    public /* synthetic */ f0(BillingController billingController) {
        this.a = billingController;
    }

    @Override // c5.q
    public void b(c5.i iVar, List list) {
        this.a.onPurchasesUpdated(iVar, list);
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(c5.i iVar, List list) {
        this.a.onQueriedPremiumProductDetails(iVar, list);
    }
}
