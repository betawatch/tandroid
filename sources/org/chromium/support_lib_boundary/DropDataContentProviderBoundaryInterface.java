package org.chromium.support_lib_boundary;

import android.content.ContentProvider;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public interface DropDataContentProviderBoundaryInterface {
    Uri cache(byte[] bArr, String str, String str2);

    Bundle call(String str, String str2, Bundle bundle);

    String[] getStreamTypes(Uri uri, String str);

    String getType(Uri uri);

    boolean onCreate();

    void onDragEnd(boolean z10);

    ParcelFileDescriptor openFile(ContentProvider contentProvider, Uri uri);

    Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    void setClearCachedDataIntervalMs(int i10);
}
