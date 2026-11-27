package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzhm {
    private final zzii zza;

    public /* synthetic */ zzhm(zzii zziiVar, int i, ma3 ma3Var) {
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
