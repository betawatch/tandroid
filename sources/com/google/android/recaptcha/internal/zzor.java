package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class zzor {
    private static final Comparator zza = new zzok();
    private static final zzor zzb = new zzor(new zzop(Collections.EMPTY_LIST));
    private final zzop zzc;

    private zzor(zzop zzopVar) {
        this.zzc = zzopVar;
    }

    public static zzor zza() {
        return zzb;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzor) && ((zzor) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }
}
