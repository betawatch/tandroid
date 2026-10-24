package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
import g2.c0;
import g2.g;
import g2.o;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSourceFactory implements g {
    private final g baseDataSourceFactory;
    private final Context context;
    private final c0 listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (c0) null);
    }

    public void putDocumentUri(long j10, Uri uri) {
        this.mtprotoUris.put(j10, uri);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedDefaultDataSourceFactory(Context context, String str, c0 c0Var) {
        this(context, c0Var, r0);
        o oVar = new o();
        oVar.c = str;
        oVar.b = c0Var;
        oVar.f = true;
    }

    @Override // g2.g
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public ExtendedDefaultDataSourceFactory(Context context, c0 c0Var, g gVar) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = c0Var;
        this.baseDataSourceFactory = gVar;
    }
}
