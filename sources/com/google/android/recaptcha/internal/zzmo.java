package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
final class zzmo implements Iterator {
    boolean zza = true;
    final /* synthetic */ Iterator zzb;

    public zzmo(zzmp zzmpVar, Iterator it) {
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.zzb.next();
        this.zza = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzmd.zze(!this.zza, "no calls to next() since the last call to remove()");
        this.zzb.remove();
    }
}
