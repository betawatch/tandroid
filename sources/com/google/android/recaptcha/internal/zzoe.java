package com.google.android.recaptcha.internal;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zzoe extends zzns {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zznl zzc;
    private static final zzob zzd;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(zzmu.zza, zzmz.zza, zzna.zza)));
        zzb = unmodifiableSet;
        zzc = zzno.zza(unmodifiableSet).zza();
        zzd = new zzob(null);
    }

    /* synthetic */ zzoe(String str, String str2, boolean z, int i, Level level, Set set, zznl zznlVar, zzod zzodVar) {
        super(str2);
        if (str2.length() > 23) {
            int i2 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i2 = length;
                    break;
                }
            }
            str2 = str2.substring(i2 + 1);
        }
        String concat = "".concat(String.valueOf(str2));
        concat.substring(0, Math.min(concat.length(), 23));
    }

    public static zzob zzc() {
        return zzd;
    }
}
