package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
abstract class zzoz implements zzpd {
    zzoz() {
    }

    @Override // com.google.android.recaptcha.internal.zzpd
    public final zzpc zza(CharSequence charSequence, Charset charset) {
        zzpe zzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzoy) zzb).zza(bytes, 0, bytes.length);
        return zzb.zzb();
    }
}
