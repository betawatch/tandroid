package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzmp extends zzmk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzmp(Iterable iterable, int i3) {
        this.zza = iterable;
        this.zzb = i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i3 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzmd.zzb(i3 >= 0, "numberToAdvance must be nonnegative");
        for (int i10 = 0; i10 < i3 && it.hasNext(); i10++) {
            it.next();
        }
        return new zzmo(this, it);
    }
}
