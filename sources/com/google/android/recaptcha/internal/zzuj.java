package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzuj extends zzuo {
    zzuj() {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzuo
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzc(); i++) {
                ((zzsc) ((zzuk) zzg(i)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzsc) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
