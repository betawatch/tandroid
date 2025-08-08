package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
abstract class zzce implements Comparable, Serializable {
    final Comparable zza = "";

    zzce(Comparable comparable) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzce) {
            try {
                if (zza((zzce) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    public abstract int zza(zzce zzceVar);

    abstract void zzc(StringBuilder sb);

    abstract void zzd(StringBuilder sb);
}
