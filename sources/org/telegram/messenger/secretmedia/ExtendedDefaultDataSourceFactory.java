package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSourceFactory implements m63 {
    private final m63 baseDataSourceFactory;
    private final Context context;
    private final vyb listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, vyb vybVar, m63 m63Var) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = vybVar;
        this.baseDataSourceFactory = m63Var;
    }

    @Override // m63
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
    public ExtendedDefaultDataSourceFactory(Context context, String str, vyb vybVar) {
        this(context, vybVar, r0);
        xf4 xf4Var = new xf4((byte) 5);
        xf4Var.d = str;
        xf4Var.c = vybVar;
        xf4Var.a = true;
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (vyb) null);
    }
}
