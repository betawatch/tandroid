package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zznp {
    private static final zznr zza = zzb(zznr.zzd);

    private static zznr zzb(String[] strArr) {
        zznv zznvVar;
        try {
            zznvVar = zznw.zza;
        } catch (NoClassDefFoundError unused) {
            zznvVar = null;
        }
        if (zznvVar != null) {
            return zznvVar;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zznr) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}
