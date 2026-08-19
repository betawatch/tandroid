package com.microsoft.appcenter.http;

/* loaded from: classes3.dex */
public abstract class HttpClientDecorator implements HttpClient, AutoCloseable {
    final HttpClient mDecoratedApi;

    HttpClientDecorator(HttpClient httpClient) {
        this.mDecoratedApi = httpClient;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDecoratedApi.close();
    }

    @Override // com.microsoft.appcenter.http.HttpClient
    public void reopen() {
        this.mDecoratedApi.reopen();
    }
}
