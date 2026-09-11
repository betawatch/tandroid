package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
final class zzuj extends zzuo {
    public zzuj() {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzuo
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                ((zzsc) ((zzuk) zzg(i10)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzsc) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
