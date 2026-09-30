package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
