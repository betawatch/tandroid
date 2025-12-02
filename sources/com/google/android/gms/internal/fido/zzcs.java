package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zzcs implements Comparator {
    protected zzcs() {
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzcs zza() {
        return new zzcx(this);
    }
}
