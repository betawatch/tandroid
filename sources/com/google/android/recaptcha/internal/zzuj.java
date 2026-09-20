package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
