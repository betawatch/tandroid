package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import e2.c;
import f0.f;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.xmlpull.v1.XmlPullParserException;
import ta.b;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] e = {"_display_name", "_size"};
    public static final File f = new File("/");
    public static final HashMap h = new HashMap();
    public final Object a;
    public final int b;
    public String c;
    public f d;

    public FileProvider() {
        this(0);
    }

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : c.m(str, 1, 0);
    }

    public static f c(Context context, String str, int i9) {
        f fVar;
        HashMap hashMap = h;
        synchronized (hashMap) {
            try {
                fVar = (f) hashMap.get(str);
                if (fVar == null) {
                    try {
                        try {
                            fVar = e(context, str, i9);
                            hashMap.put(str, fVar);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Uri d(Context context, String str, File file) {
        f c10 = c(context, str, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c10.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (a(canonicalPath).startsWith(a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(b.d("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(c10.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static f e(Context context, String str, int i9) {
        f fVar = new f(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(b.d("Couldn't find meta-data for provider with authority ", str));
        }
        if (resolveContentProvider.metaData == null && i9 != 0) {
            Bundle bundle = new Bundle(1);
            resolveContentProvider.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i9);
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return fVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        fVar.b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.a) {
            this.c = str2;
        }
        HashMap hashMap = h;
        synchronized (hashMap) {
            hashMap.remove(str2);
        }
    }

    public final f b() {
        f fVar;
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.d == null) {
                    this.d = c(getContext(), this.c, this.b);
                }
                fVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a2 = b().a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i9;
        File a2 = b().a(uri);
        if ("r".equals(str)) {
            i9 = TLObject.FLAG_28;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i9 = 738197504;
        } else if ("wa".equals(str)) {
            i9 = 704643072;
        } else if ("rw".equals(str)) {
            i9 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(b.d("Invalid mode: ", str));
            }
            i9 = 1006632960;
        }
        return ParcelFileDescriptor.open(a2, i9);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i9;
        File a2 = b().a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i10 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i10] = "_display_name";
                i9 = i10 + 1;
                objArr[i10] = queryParameter == null ? a2.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i10] = "_size";
                i9 = i10 + 1;
                objArr[i10] = Long.valueOf(a2.length());
            }
            i10 = i9;
        }
        String[] strArr4 = new String[i10];
        System.arraycopy(strArr3, 0, strArr4, 0, i10);
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(int i9) {
        this.a = new Object();
        this.b = i9;
    }
}
