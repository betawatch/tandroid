package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSourceFactory implements f73 {
    private final f73 baseDataSourceFactory;
    private final Context context;
    private final v2c listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, v2c v2cVar, f73 f73Var) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = v2cVar;
        this.baseDataSourceFactory = f73Var;
    }

    @Override // f73
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
    public ExtendedDefaultDataSourceFactory(Context context, String str, v2c v2cVar) {
        this(context, v2cVar, r0);
        vh4 vh4Var = new vh4((byte) 5);
        vh4Var.d = str;
        vh4Var.c = v2cVar;
        vh4Var.a = true;
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (v2c) null);
    }
}
