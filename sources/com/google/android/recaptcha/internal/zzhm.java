package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzhm {
    private final zzii zza;

    public /* synthetic */ zzhm(zzii zziiVar, int i, t93 t93Var) {
        this.zza = new zzii();
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
        } catch (Exception e2) {
            throw new zzcg(zzce.zzc, zzcd.zzai, e2.getMessage(), null, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzhm() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
