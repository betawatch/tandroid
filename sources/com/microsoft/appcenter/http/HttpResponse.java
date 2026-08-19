package com.microsoft.appcenter.http;

import java.util.Map;

/* loaded from: classes3.dex */
public class HttpResponse {
    private final Map headers;
    private final String payload;
    private final int statusCode;

    public HttpResponse(int i, String str, Map map) {
        this.payload = str;
        this.statusCode = i;
        this.headers = map;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getPayload() {
        return this.payload;
    }

    public Map getHeaders() {
        return this.headers;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpResponse httpResponse = (HttpResponse) obj;
            if (this.statusCode == httpResponse.statusCode && this.payload.equals(httpResponse.payload) && this.headers.equals(httpResponse.headers)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.statusCode * 31) + this.payload.hashCode()) * 31) + this.headers.hashCode();
    }
}
