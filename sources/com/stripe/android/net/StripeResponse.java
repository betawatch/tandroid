package com.stripe.android.net;

import java.util.Map;

/* loaded from: classes.dex */
public class StripeResponse {
    private String mResponseBody;
    private int mResponseCode;
    private Map mResponseHeaders;

    public StripeResponse(int i, String str, Map map) {
        this.mResponseCode = i;
        this.mResponseBody = str;
        this.mResponseHeaders = map;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public String getResponseBody() {
        return this.mResponseBody;
    }

    public Map getResponseHeaders() {
        return this.mResponseHeaders;
    }
}
