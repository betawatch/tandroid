package com.google.android.recaptcha.internal;

import hd.f;
import hd.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
