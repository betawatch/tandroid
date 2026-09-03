package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        } catch (zzcg e6) {
            throw e6;
        } catch (Exception e10) {
            throw new zzcg(zzce.zzc, zzcd.zzai, e10.getMessage(), null, 8, null);
        }
    }

    public /* synthetic */ zzhm(zzii zziiVar, int i10, f fVar) {
        this.zza = new zzii();
    }
}
