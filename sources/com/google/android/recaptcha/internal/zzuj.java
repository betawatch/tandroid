package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
