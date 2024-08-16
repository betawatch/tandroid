package com.google.android.gms.internal.play_billing;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class zzcx implements zzdq {
    private static final zzdd zza = new zzcv();
    private final zzdd zzb;

    public zzcx() {
        zzdd zzddVar;
        zzbw zza2 = zzbw.zza();
        try {
            zzddVar = (zzdd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzddVar = zza;
        }
        zzcw zzcwVar = new zzcw(zza2, zzddVar);
        byte[] bArr = zzcg.zzd;
        this.zzb = zzcwVar;
    }

    private static boolean zzb(zzdc zzdcVar) {
        return zzdcVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final zzdp zza(Class cls) {
        zzdr.zzC(cls);
        zzdc zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            if (zzcb.class.isAssignableFrom(cls)) {
                if (zzb(zzb)) {
                    return zzdi.zzl(cls, zzb, zzdl.zzb(), zzct.zzd(), zzdr.zzz(), zzbq.zzb(), zzdb.zzb());
                }
                return zzdi.zzl(cls, zzb, zzdl.zzb(), zzct.zzd(), zzdr.zzz(), null, zzdb.zzb());
            } else if (zzb(zzb)) {
                return zzdi.zzl(cls, zzb, zzdl.zza(), zzct.zzc(), zzdr.zzy(), zzbq.zza(), zzdb.zza());
            } else {
                return zzdi.zzl(cls, zzb, zzdl.zza(), zzct.zzc(), zzdr.zzy(), null, zzdb.zza());
            }
        } else if (zzcb.class.isAssignableFrom(cls)) {
            return zzdj.zzc(zzdr.zzz(), zzbq.zzb(), zzb.zza());
        } else {
            return zzdj.zzc(zzdr.zzy(), zzbq.zza(), zzb.zza());
        }
    }
}
