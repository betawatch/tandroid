package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
