package org.telegram.messenger;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class NotificationImageProvider extends ContentProvider implements cs {
    public static String d;
    public static UriMatcher e;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final HashMap c = new HashMap();

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            synchronized (this.b) {
                try {
                    String str = (String) objArr[0];
                    if (this.a.remove(str)) {
                        this.c.remove(str);
                        this.b.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        if (str.startsWith("*/") || str.startsWith("image/")) {
            return new String[]{"image/jpeg", "image/png", "image/webp"};
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        for (int i3 = 0; i3 < h10.c(); i3++) {
            hs.f(i3).b(this, hs.Y1);
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (!"r".equals(str)) {
            throw new SecurityException("Can only open files for read");
        }
        if (e == null) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            e = uriMatcher;
            if (d == null) {
                t0.d();
                d = "org.telegram.messenger.beta.notification_image_provider";
            }
            uriMatcher.addURI(d, "msg_media_raw/#/*", 1);
        }
        if (e.match(uri) != 1) {
            throw new FileNotFoundException("Invalid URI");
        }
        List<String> pathSegments = uri.getPathSegments();
        Integer.parseInt(pathSegments.get(1));
        String str2 = pathSegments.get(2);
        String queryParameter = uri.getQueryParameter("final_path");
        String queryParameter2 = uri.getQueryParameter("fallback");
        File file = new File(queryParameter);
        t0.w();
        if (g0.I1(Uri.fromFile(file), 0)) {
            throw new SecurityException("trying to read internal file");
        }
        if (!file.exists()) {
            Long l10 = (Long) this.c.get(str2);
            long longValue = l10 != null ? l10.longValue() : System.currentTimeMillis();
            if (l10 == null) {
                this.c.put(str2, Long.valueOf(longValue));
            }
            while (!file.exists()) {
                if (System.currentTimeMillis() - longValue >= 3000) {
                    if (r2.a) {
                        a8.l("Waiting for " + str2 + " to download timed out");
                    }
                    if (TextUtils.isEmpty(queryParameter2)) {
                        throw new FileNotFoundException("Download timed out");
                    }
                    File file2 = new File(queryParameter2);
                    if (g0.I1(Uri.fromFile(file2), 0)) {
                        throw new SecurityException("trying to read internal file");
                    }
                    return ParcelFileDescriptor.open(file2, TLObject.FLAG_28);
                }
                synchronized (this.b) {
                    this.a.add(str2);
                    try {
                        this.b.wait(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (g0.I1(Uri.fromFile(file), 0)) {
                throw new SecurityException("trying to read internal file");
            }
        }
        return ParcelFileDescriptor.open(file, TLObject.FLAG_28);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        for (int i3 = 0; i3 < h10.c(); i3++) {
            hs.f(i3).n(this, hs.Y1);
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
