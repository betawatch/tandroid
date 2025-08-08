package com.google.android.gms.internal.vision;

/* loaded from: classes.dex */
final class zzkb implements zzlf {
    private static final zzkl zzb = new zzka();
    private final zzkl zza;

    public zzkb() {
        this(new zzkd(zzjc.zza(), zza()));
    }

    private zzkb(zzkl zzklVar) {
        this.zza = (zzkl) zzjf.zza((Object) zzklVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.vision.zzlf
    public final zzlc zza(Class cls) {
        zzle.zza(cls);
        zzki zzb2 = this.zza.zzb(cls);
        if (zzb2.zzb()) {
            if (zzjb.class.isAssignableFrom(cls)) {
                return zzkq.zza(zzle.zzc(), zzir.zza(), zzb2.zzc());
            }
            return zzkq.zza(zzle.zza(), zzir.zzb(), zzb2.zzc());
        }
        if (zzjb.class.isAssignableFrom(cls)) {
            if (zza(zzb2)) {
                return zzko.zza(cls, zzb2, zzku.zzb(), zzju.zzb(), zzle.zzc(), zzir.zza(), zzkj.zzb());
            }
            return zzko.zza(cls, zzb2, zzku.zzb(), zzju.zzb(), zzle.zzc(), (zziq) null, zzkj.zzb());
        }
        if (zza(zzb2)) {
            return zzko.zza(cls, zzb2, zzku.zza(), zzju.zza(), zzle.zza(), zzir.zzb(), zzkj.zza());
        }
        return zzko.zza(cls, zzb2, zzku.zza(), zzju.zza(), zzle.zzb(), (zziq) null, zzkj.zza());
    }

    private static boolean zza(zzki zzkiVar) {
        return zzkiVar.zza() == zzkz.zza;
    }

    private static zzkl zza() {
        try {
            return (zzkl) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return zzb;
        }
    }
}
