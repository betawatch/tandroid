package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public class zzsj extends zzsh implements zztt {
    public zzsj(zzsk zzskVar) {
        super(zzskVar);
    }

    @Override // com.google.android.recaptcha.internal.zzsh, com.google.android.recaptcha.internal.zztr
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzsk zzl() {
        if (!((zzsk) this.zza).zzL()) {
            return (zzsk) this.zza;
        }
        ((zzsk) this.zza).zzb.zzg();
        return (zzsk) super.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzsh
    public final void zzo() {
        super.zzo();
        if (((zzsk) this.zza).zzb != zzsd.zzd()) {
            zzsk zzskVar = (zzsk) this.zza;
            zzskVar.zzb = zzskVar.zzb.clone();
        }
    }
}
