package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* loaded from: classes.dex */
final class zzfn implements ObjectEncoder {
    static final zzfn zza = new zzfn();
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final FieldDescriptor zzd;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        zzbz zzbzVar = new zzbz();
        zzbzVar.zza(1);
        zzb = builder.withProperty(zzbzVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        zzbz zzbzVar2 = new zzbz();
        zzbzVar2.zza(2);
        zzc = builder2.withProperty(zzbzVar2.zzb()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        zzbz zzbzVar3 = new zzbz();
        zzbzVar3.zza(3);
        zzd = builder3.withProperty(zzbzVar3.zzb()).build();
    }

    private zzfn() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdy zzdyVar = (zzdy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(zzb, zzdyVar.zza());
        objectEncoderContext.add(zzc, zzdyVar.zzc());
        objectEncoderContext.add(zzd, zzdyVar.zzb());
    }
}
