package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.e;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        } catch (zzcg e) {
            throw e;
        } catch (Exception e7) {
            throw new zzcg(zzce.zzc, zzcd.zzai, e7.getMessage(), null, 8, null);
        }
    }

    public /* synthetic */ zzhm(zzii zziiVar, int i10, e eVar) {
        this.zza = new zzii();
    }
}
