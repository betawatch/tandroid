package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] bArr, String str, String str2);

    Bundle call(String str, String str2, Bundle bundle);

    String[] getStreamTypes(Uri uri, String str);

    String getType(Uri uri);

    boolean onCreate();

    void onDragEnd(boolean z9);

    ParcelFileDescriptor openFile(ContentProvider contentProvider, Uri uri);

    Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    void setClearCachedDataIntervalMs(int i7);
}
