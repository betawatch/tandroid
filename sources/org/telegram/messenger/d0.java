package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.BillingController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
