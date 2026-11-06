package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            } catch (Throwable th2) {
                th = th2;
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
