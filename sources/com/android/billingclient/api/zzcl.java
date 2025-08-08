package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;

/* loaded from: classes.dex */
final class zzcl implements zzch {
    private zzku zzb;
    private final zzcn zzc;

    zzcl(Context context, zzku zzkuVar) {
        this.zzc = new zzcn(context);
        this.zzb = zzkuVar;
    }

    @Override // com.android.billingclient.api.zzch
    public final void zza(zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.zzb);
            zzc.zza(zzjzVar);
            this.zzc.zza((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzb(zzjz zzjzVar, int i) {
        try {
            zzks zzksVar = (zzks) this.zzb.zzn();
            zzksVar.zza(i);
            this.zzb = (zzku) zzksVar.zzf();
            zza(zzjzVar);
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzc(zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.zzb);
            zzc.zzm(zzkdVar);
            this.zzc.zza((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzd(zzkd zzkdVar, int i) {
        try {
            zzks zzksVar = (zzks) this.zzb.zzn();
            zzksVar.zza(i);
            this.zzb = (zzku) zzksVar.zzf();
            zzc(zzkdVar);
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zze(zzkl zzklVar) {
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.zzb);
            zzc.zzn(zzklVar);
            this.zzc.zza((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzf(zzlq zzlqVar) {
        try {
            zzcn zzcnVar = this.zzc;
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.zzb);
            zzc.zzp(zzlqVar);
            zzcnVar.zza((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzch
    public final void zzg(zzlu zzluVar) {
        if (zzluVar == null) {
            return;
        }
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo(this.zzb);
            zzc.zzq(zzluVar);
            this.zzc.zza((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }
}
