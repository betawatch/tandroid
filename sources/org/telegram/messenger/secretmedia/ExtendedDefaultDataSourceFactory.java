package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
import g2.d0;
import g2.g;
import g2.p;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSourceFactory implements g {
    private final g baseDataSourceFactory;
    private final Context context;
    private final d0 listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (d0) null);
    }

    public void putDocumentUri(long j10, Uri uri) {
        this.mtprotoUris.put(j10, uri);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedDefaultDataSourceFactory(Context context, String str, d0 d0Var) {
        this(context, d0Var, r0);
        p pVar = new p();
        pVar.c = str;
        pVar.b = d0Var;
        pVar.f = true;
    }

    @Override // g2.g
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public ExtendedDefaultDataSourceFactory(Context context, d0 d0Var, g gVar) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = d0Var;
        this.baseDataSourceFactory = gVar;
    }
}
