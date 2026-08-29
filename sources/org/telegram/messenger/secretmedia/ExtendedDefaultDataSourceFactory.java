package org.telegram.messenger.secretmedia;

import android.content.Context;
import android.net.Uri;
import android.util.LongSparseArray;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.y0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ExtendedDefaultDataSourceFactory implements l {
    private final l baseDataSourceFactory;
    private final Context context;
    private final y0 listener;
    private final LongSparseArray<Uri> mtprotoUris;

    public ExtendedDefaultDataSourceFactory(Context context, String str) {
        this(context, str, (y0) null);
    }

    public void putDocumentUri(long j10, Uri uri) {
        this.mtprotoUris.put(j10, uri);
    }

    public ExtendedDefaultDataSourceFactory(Context context, String str, y0 y0Var) {
        this(context, y0Var, new a0(str, y0Var));
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public ExtendedDefaultDataSource createDataSource() {
        return new ExtendedDefaultDataSource(this.context, this.listener, this.baseDataSourceFactory.createDataSource(), this.mtprotoUris);
    }

    public ExtendedDefaultDataSourceFactory(Context context, y0 y0Var, l lVar) {
        this.mtprotoUris = new LongSparseArray<>();
        this.context = context.getApplicationContext();
        this.listener = y0Var;
        this.baseDataSourceFactory = lVar;
    }
}
