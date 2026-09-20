package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
