package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
