package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSourceFactory implements y73 {
    private final y73 baseDataSourceFactory;
    private final Context context;
    private final w0c listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, w0c w0cVar, y73 y73Var) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = w0cVar;
        this.baseDataSourceFactory = y73Var;
    }

    @Override // y73
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public void putDocumentUri(long j, Uri uri) {
        this.mtprotoUris.put(j, uri);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedDefaultDataSourceFactory(Context context, String str, w0c w0cVar) {
        this(context, w0cVar, r0);
        yh4 yh4Var = new yh4((byte) 5);
        yh4Var.d = str;
        yh4Var.c = w0cVar;
        yh4Var.a = true;
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (w0c) null);
    }
}
