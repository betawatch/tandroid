package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.e;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
