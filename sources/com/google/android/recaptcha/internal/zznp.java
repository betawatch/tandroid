package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
