package com.android.billingclient.api;

import java.util.List;

/* loaded from: classes.dex */
public interface PurchasesResponseListener {
    void onQueryPurchasesResponse(BillingResult billingResult, List list);
}
