package com.google.android.recaptcha.internal;

import zd.x1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzh {
    public static final zzcg zza(Exception exc, zzcg zzcgVar) {
        return exc instanceof x1 ? new zzcg(zzce.zzb, zzcd.zzb, exc.getMessage(), null, 8, null) : exc instanceof zzcg ? (zzcg) exc : zzcgVar;
    }
}
