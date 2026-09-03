package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
final class zzmp extends zzmk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzmp(Iterable iterable, int i10) {
        this.zza = iterable;
        this.zzb = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i10 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzmd.zzb(i10 >= 0, "numberToAdvance must be nonnegative");
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            it.next();
        }
        return new zzmo(this, it);
    }
}
