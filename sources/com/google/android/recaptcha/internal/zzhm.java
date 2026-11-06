package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
