package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
abstract class zzoz implements zzpd {
    @Override // com.google.android.recaptcha.internal.zzpd
    public final zzpc zza(CharSequence charSequence, Charset charset) {
        zzpe zzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzoy) zzb).zza(bytes, 0, bytes.length);
        return zzb.zzb();
    }
}
