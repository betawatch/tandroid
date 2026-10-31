package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
