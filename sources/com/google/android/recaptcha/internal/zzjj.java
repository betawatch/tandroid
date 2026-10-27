package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.f;
import kd.i;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzjj implements zzjt {
    public static final zzjj zza = new zzjj();

    private zzjj() {
    }

    private static final boolean zzb(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.d(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzzt) it.next()).zzR()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (!zzb(f.h(zzztVarArr))) {
            throw new zzdm(4, 5, null);
        }
        for (zzzt zzztVar : zzztVarArr) {
            zzizVar.zzc().zzb(zzztVar.zzi());
        }
    }
}
