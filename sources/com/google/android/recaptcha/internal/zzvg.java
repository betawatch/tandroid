package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class zzvg {
    public static final zzvg zza;
    public static final zzvg zzb;
    public static final zzvg zzc;
    public static final zzvg zzd;
    public static final zzvg zze;
    public static final zzvg zzf;
    public static final zzvg zzg;
    public static final zzvg zzh;
    public static final zzvg zzi;
    public static final zzvg zzj;
    public static final zzvg zzk;
    public static final zzvg zzl;
    public static final zzvg zzm;
    public static final zzvg zzn;
    public static final zzvg zzo;
    public static final zzvg zzp;
    public static final zzvg zzq;
    public static final zzvg zzr;
    private static final /* synthetic */ zzvg[] zzs;
    private final zzvh zzt;

    static {
        zzvg zzvgVar = new zzvg("DOUBLE", 0, zzvh.zzd, 1);
        zza = zzvgVar;
        zzvg zzvgVar2 = new zzvg("FLOAT", 1, zzvh.zzc, 5);
        zzb = zzvgVar2;
        zzvh zzvhVar = zzvh.zzb;
        zzvg zzvgVar3 = new zzvg("INT64", 2, zzvhVar, 0);
        zzc = zzvgVar3;
        zzvg zzvgVar4 = new zzvg("UINT64", 3, zzvhVar, 0);
        zzd = zzvgVar4;
        zzvh zzvhVar2 = zzvh.zza;
        zzvg zzvgVar5 = new zzvg("INT32", 4, zzvhVar2, 0);
        zze = zzvgVar5;
        zzvg zzvgVar6 = new zzvg("FIXED64", 5, zzvhVar, 1);
        zzf = zzvgVar6;
        zzvg zzvgVar7 = new zzvg("FIXED32", 6, zzvhVar2, 5);
        zzg = zzvgVar7;
        zzvg zzvgVar8 = new zzvg("BOOL", 7, zzvh.zze, 0);
        zzh = zzvgVar8;
        zzvg zzvgVar9 = new zzvg("STRING", 8, zzvh.zzf, 2);
        zzi = zzvgVar9;
        zzvh zzvhVar3 = zzvh.zzi;
        zzvg zzvgVar10 = new zzvg("GROUP", 9, zzvhVar3, 3);
        zzj = zzvgVar10;
        zzvg zzvgVar11 = new zzvg("MESSAGE", 10, zzvhVar3, 2);
        zzk = zzvgVar11;
        zzvg zzvgVar12 = new zzvg("BYTES", 11, zzvh.zzg, 2);
        zzl = zzvgVar12;
        zzvg zzvgVar13 = new zzvg("UINT32", 12, zzvhVar2, 0);
        zzm = zzvgVar13;
        zzvg zzvgVar14 = new zzvg("ENUM", 13, zzvh.zzh, 0);
        zzn = zzvgVar14;
        zzvg zzvgVar15 = new zzvg("SFIXED32", 14, zzvhVar2, 5);
        zzo = zzvgVar15;
        zzvg zzvgVar16 = new zzvg("SFIXED64", 15, zzvhVar, 1);
        zzp = zzvgVar16;
        zzvg zzvgVar17 = new zzvg("SINT32", 16, zzvhVar2, 0);
        zzq = zzvgVar17;
        zzvg zzvgVar18 = new zzvg("SINT64", 17, zzvhVar, 0);
        zzr = zzvgVar18;
        zzs = new zzvg[]{zzvgVar, zzvgVar2, zzvgVar3, zzvgVar4, zzvgVar5, zzvgVar6, zzvgVar7, zzvgVar8, zzvgVar9, zzvgVar10, zzvgVar11, zzvgVar12, zzvgVar13, zzvgVar14, zzvgVar15, zzvgVar16, zzvgVar17, zzvgVar18};
    }

    private zzvg(String str, int i10, zzvh zzvhVar, int i11) {
        this.zzt = zzvhVar;
    }

    public static zzvg[] values() {
        return (zzvg[]) zzs.clone();
    }

    public final zzvh zza() {
        return this.zzt;
    }
}
