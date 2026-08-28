package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzmp extends zzmk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzmp(Iterable iterable, int i9) {
        this.zza = iterable;
        this.zzb = i9;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i9 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzmd.zzb(i9 >= 0, "numberToAdvance must be nonnegative");
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            it.next();
        }
        return new zzmo(this, it);
    }
}
