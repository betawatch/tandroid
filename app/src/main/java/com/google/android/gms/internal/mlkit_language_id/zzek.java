package com.google.android.gms.internal.mlkit_language_id;
/* JADX WARN: Init of enum zza can be incorrect */
/* JADX WARN: Init of enum zzaa can be incorrect */
/* JADX WARN: Init of enum zzab can be incorrect */
/* JADX WARN: Init of enum zzac can be incorrect */
/* JADX WARN: Init of enum zzad can be incorrect */
/* JADX WARN: Init of enum zzae can be incorrect */
/* JADX WARN: Init of enum zzaf can be incorrect */
/* JADX WARN: Init of enum zzag can be incorrect */
/* JADX WARN: Init of enum zzah can be incorrect */
/* JADX WARN: Init of enum zzai can be incorrect */
/* JADX WARN: Init of enum zzaj can be incorrect */
/* JADX WARN: Init of enum zzak can be incorrect */
/* JADX WARN: Init of enum zzal can be incorrect */
/* JADX WARN: Init of enum zzam can be incorrect */
/* JADX WARN: Init of enum zzan can be incorrect */
/* JADX WARN: Init of enum zzao can be incorrect */
/* JADX WARN: Init of enum zzap can be incorrect */
/* JADX WARN: Init of enum zzaq can be incorrect */
/* JADX WARN: Init of enum zzar can be incorrect */
/* JADX WARN: Init of enum zzas can be incorrect */
/* JADX WARN: Init of enum zzat can be incorrect */
/* JADX WARN: Init of enum zzau can be incorrect */
/* JADX WARN: Init of enum zzav can be incorrect */
/* JADX WARN: Init of enum zzaw can be incorrect */
/* JADX WARN: Init of enum zzax can be incorrect */
/* JADX WARN: Init of enum zzb can be incorrect */
/* JADX WARN: Init of enum zzc can be incorrect */
/* JADX WARN: Init of enum zzd can be incorrect */
/* JADX WARN: Init of enum zze can be incorrect */
/* JADX WARN: Init of enum zzf can be incorrect */
/* JADX WARN: Init of enum zzg can be incorrect */
/* JADX WARN: Init of enum zzh can be incorrect */
/* JADX WARN: Init of enum zzi can be incorrect */
/* JADX WARN: Init of enum zzj can be incorrect */
/* JADX WARN: Init of enum zzk can be incorrect */
/* JADX WARN: Init of enum zzl can be incorrect */
/* JADX WARN: Init of enum zzm can be incorrect */
/* JADX WARN: Init of enum zzn can be incorrect */
/* JADX WARN: Init of enum zzo can be incorrect */
/* JADX WARN: Init of enum zzp can be incorrect */
/* JADX WARN: Init of enum zzq can be incorrect */
/* JADX WARN: Init of enum zzr can be incorrect */
/* JADX WARN: Init of enum zzs can be incorrect */
/* JADX WARN: Init of enum zzt can be incorrect */
/* JADX WARN: Init of enum zzu can be incorrect */
/* JADX WARN: Init of enum zzv can be incorrect */
/* JADX WARN: Init of enum zzw can be incorrect */
/* JADX WARN: Init of enum zzx can be incorrect */
/* JADX WARN: Init of enum zzy can be incorrect */
/* JADX WARN: Init of enum zzz can be incorrect */
/* compiled from: com.google.mlkit:language-id@@16.1.1 */
/* loaded from: classes.dex */
public enum zzek {
    DOUBLE(0, r7, r8),
    FLOAT(1, r7, r10),
    INT64(2, r7, r12),
    UINT64(3, r7, r12),
    INT32(4, r7, r15),
    FIXED64(5, r7, r12),
    FIXED32(6, r7, r15),
    BOOL(7, r7, r19),
    STRING(8, r7, r21),
    MESSAGE(9, r7, r23),
    BYTES(10, r7, r25),
    UINT32(11, r7, r15),
    ENUM(12, r7, r28),
    SFIXED32(13, r7, r15),
    SFIXED64(14, r7, r12),
    SINT32(15, r7, r15),
    SINT64(16, r7, r12),
    GROUP(17, r7, r23),
    DOUBLE_LIST(18, r34, r8),
    FLOAT_LIST(19, r34, r10),
    INT64_LIST(20, r34, r12),
    UINT64_LIST(21, r34, r12),
    INT32_LIST(22, r34, r15),
    FIXED64_LIST(23, r34, r12),
    FIXED32_LIST(24, r34, r15),
    BOOL_LIST(25, r34, r19),
    STRING_LIST(26, r34, r21),
    MESSAGE_LIST(27, r34, r23),
    BYTES_LIST(28, r34, r25),
    UINT32_LIST(29, r34, r15),
    ENUM_LIST(30, r34, r28),
    SFIXED32_LIST(31, r34, r15),
    SFIXED64_LIST(32, r34, r12),
    SINT32_LIST(33, r34, r15),
    SINT64_LIST(34, r34, r12),
    DOUBLE_LIST_PACKED(35, r50, r8),
    FLOAT_LIST_PACKED(36, r50, r10),
    INT64_LIST_PACKED(37, r50, r12),
    UINT64_LIST_PACKED(38, r50, r12),
    INT32_LIST_PACKED(39, r50, r15),
    FIXED64_LIST_PACKED(40, r50, r12),
    FIXED32_LIST_PACKED(41, r50, r15),
    BOOL_LIST_PACKED(42, r50, r19),
    UINT32_LIST_PACKED(43, r50, r15),
    ENUM_LIST_PACKED(44, r50, r28),
    SFIXED32_LIST_PACKED(45, r50, r15),
    SFIXED64_LIST_PACKED(46, r50, r12),
    SINT32_LIST_PACKED(47, r50, r15),
    SINT64_LIST_PACKED(48, r50, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, zzem.MAP, zzfb.VOID);
    
    private static final zzek[] zzbe;
    private final int zzba;

    zzek(int i, zzem zzemVar, zzfb zzfbVar) {
        this.zzba = i;
        int i2 = zzen.zza[zzemVar.ordinal()];
        if (i2 == 1) {
            zzfbVar.zza();
        } else if (i2 == 2) {
            zzfbVar.zza();
        }
        if (zzemVar == zzem.SCALAR) {
            int i3 = zzen.zzb[zzfbVar.ordinal()];
        }
    }

    public final int zza() {
        return this.zzba;
    }

    static {
        zzem zzemVar = zzem.SCALAR;
        zzfb zzfbVar = zzfb.DOUBLE;
        zzfb zzfbVar2 = zzfb.FLOAT;
        zzfb zzfbVar3 = zzfb.LONG;
        zzfb zzfbVar4 = zzfb.INT;
        zzfb zzfbVar5 = zzfb.BOOLEAN;
        zzfb zzfbVar6 = zzfb.STRING;
        zzfb zzfbVar7 = zzfb.MESSAGE;
        zzfb zzfbVar8 = zzfb.BYTE_STRING;
        zzfb zzfbVar9 = zzfb.ENUM;
        zzem zzemVar2 = zzem.VECTOR;
        zzem zzemVar3 = zzem.PACKED_VECTOR;
        zzek[] values = values();
        zzbe = new zzek[values.length];
        for (zzek zzekVar : values) {
            zzbe[zzekVar.zzba] = zzekVar;
        }
    }
}
