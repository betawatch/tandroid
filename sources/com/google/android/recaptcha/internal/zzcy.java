package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzcy {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzcy(String str) {
        this.zza = "https://www.recaptcha.net/recaptcha/api3";
        this.zzb = "https://www.recaptcha.net/recaptcha/api3".concat("/mri");
        this.zzc = "https://www.recaptcha.net/recaptcha/api3".concat("/mlg");
        this.zzd = "https://www.recaptcha.net/recaptcha/api3".concat("/mrr");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }

    public zzcy() {
        this("https://www.recaptcha.net/recaptcha/api3");
    }
}
