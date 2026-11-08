package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
final class zzmp extends zzmk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzmp(Iterable iterable, int i7) {
        this.zza = iterable;
        this.zzb = i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i7 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzmd.zzb(i7 >= 0, "numberToAdvance must be nonnegative");
        for (int i10 = 0; i10 < i7 && it.hasNext(); i10++) {
            it.next();
        }
        return new zzmo(this, it);
    }
}
