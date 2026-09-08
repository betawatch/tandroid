package com.google.android.recaptcha.internal;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public /* synthetic */ zzoe(String str, String str2, boolean z10, int i10, Level level, Set set, zznl zznlVar, zzod zzodVar) {
        super(str2);
        if (str2.length() > 23) {
            int i11 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i11 = length;
                    break;
                }
            }
            str2 = str2.substring(i11 + 1);
        }
        String concat = "".concat(String.valueOf(str2));
        concat.substring(0, Math.min(concat.length(), 23));
    }

    public static zzob zzc() {
        return zzd;
    }
}
