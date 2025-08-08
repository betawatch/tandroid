package com.google.android.gms.internal.mlkit_language_id_common;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzx extends zzq implements Set {
    private transient zzu zza;

    zzx() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzae.zza(this);
    }

    public final zzu zzf() {
        zzu zzuVar = this.zza;
        if (zzuVar != null) {
            return zzuVar;
        }
        zzu zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    zzu zzg() {
        return zzu.zzg(toArray());
    }
}
