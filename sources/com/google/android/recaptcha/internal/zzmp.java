package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
