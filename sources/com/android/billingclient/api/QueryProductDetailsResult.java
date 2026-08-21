package com.android.billingclient.api;

import java.util.List;

/* loaded from: classes.dex */
public final class QueryProductDetailsResult {
    private final List productDetailsList;
    private final List unfetchedProductList;

    QueryProductDetailsResult(List list, List list2) {
        this.productDetailsList = list;
        this.unfetchedProductList = list2;
    }

    public List getProductDetailsList() {
        return this.productDetailsList;
    }
}
