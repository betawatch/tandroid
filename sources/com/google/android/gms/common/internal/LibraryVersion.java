package com.google.android.gms.common.internal;

import com.google.android.gms.common.util.IOUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    protected LibraryVersion() {
    }

    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getVersion(String str) {
        String str2;
        InputStream inputStream;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return (String) this.zzc.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r3 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (IOException e) {
                e = e;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                zza.v("LibraryVersion", str + " version is " + str3);
            } else {
                zza.w("LibraryVersion", "Failed to get app version for libraryName: " + str);
            }
        } catch (IOException e2) {
            e = e2;
            str2 = str3;
            inputStream2 = inputStream;
            zza.e("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
            String str4 = str2;
            inputStream = inputStream2;
            str3 = str4;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            this.zzc.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                IOUtils.closeQuietly(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
        }
        if (str3 == null) {
            zza.d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            str3 = "UNKNOWN";
        }
        this.zzc.put(str, str3);
        return str3;
    }
}
