package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zzhm {
    private final zzii zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzhm() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzhl zza(String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzhl(zza);
        } catch (zzcg e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzcg(zzce.zzc, zzcd.zzai, e11.getMessage(), null, 8, null);
        }
    }

    public /* synthetic */ zzhm(zzii zziiVar, int i7, f fVar) {
        this.zza = new zzii();
    }
}
