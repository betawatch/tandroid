package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
