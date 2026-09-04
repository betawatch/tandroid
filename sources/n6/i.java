package n6;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i {
    public static final m2.u b = new m2.u("LibraryVersion", "");
    public static final i c = new i();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e7;
        String str2;
        InputStream inputStream;
        m2.u uVar = b;
        l.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r6 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = i.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e10) {
                e7 = e10;
                str2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                String str4 = str + " version is " + str3;
                if (Log.isLoggable(uVar.b, 2)) {
                    String str5 = uVar.c;
                    if (str5 != null) {
                        str4 = str5.concat(str4);
                    }
                    Log.v("LibraryVersion", str4);
                }
            } else {
                String str6 = "Failed to get app version for libraryName: " + str;
                if (Log.isLoggable(uVar.b, 5)) {
                    String str7 = uVar.c;
                    if (str7 != null) {
                        str6 = str7.concat(str6);
                    }
                    Log.w("LibraryVersion", str6);
                }
            }
        } catch (IOException e11) {
            e7 = e11;
            inputStream2 = inputStream;
            str2 = null;
            String str8 = "Failed to get app version for libraryName: " + str;
            if (Log.isLoggable(uVar.b, 6)) {
                String str9 = uVar.c;
                if (str9 != null) {
                    str8 = str9.concat(str8);
                }
                Log.e("LibraryVersion", str8, e7);
            }
            InputStream inputStream3 = inputStream2;
            str3 = str2;
            inputStream = inputStream3;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            concurrentHashMap.put(str, str3);
            return str3;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                u6.b.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            u6.b.a(inputStream);
        }
        if (str3 == null) {
            if (Log.isLoggable(uVar.b, 3)) {
                String str10 = uVar.c;
                Log.d("LibraryVersion", str10 != null ? str10.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
