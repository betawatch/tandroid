package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
