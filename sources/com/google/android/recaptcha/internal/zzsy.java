package com.google.android.recaptcha.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class zzsy {
    public static final zzsy zza;
    public static final zzsy zzb;
    public static final zzsy zzc;
    public static final zzsy zzd;
    public static final zzsy zze;
    public static final zzsy zzf;
    public static final zzsy zzg;
    public static final zzsy zzh;
    public static final zzsy zzi;
    public static final zzsy zzj;
    private static final /* synthetic */ zzsy[] zzk;
    private final Class zzl;

    static {
        zzsy zzsyVar = new zzsy("VOID", 0, Void.class, Void.class, null);
        zza = zzsyVar;
        Class cls = Integer.TYPE;
        zzsy zzsyVar2 = new zzsy("INT", 1, cls, Integer.class, 0);
        zzb = zzsyVar2;
        zzsy zzsyVar3 = new zzsy("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzsyVar3;
        zzsy zzsyVar4 = new zzsy("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzsyVar4;
        zzsy zzsyVar5 = new zzsy("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzsyVar5;
        zzsy zzsyVar6 = new zzsy("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzsyVar6;
        zzsy zzsyVar7 = new zzsy("STRING", 6, String.class, String.class, "");
        zzg = zzsyVar7;
        zzsy zzsyVar8 = new zzsy("BYTE_STRING", 7, zzqm.class, zzqm.class, zzqm.zzb);
        zzh = zzsyVar8;
        zzsy zzsyVar9 = new zzsy("ENUM", 8, cls, Integer.class, null);
        zzi = zzsyVar9;
        zzsy zzsyVar10 = new zzsy("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzsyVar10;
        zzk = new zzsy[]{zzsyVar, zzsyVar2, zzsyVar3, zzsyVar4, zzsyVar5, zzsyVar6, zzsyVar7, zzsyVar8, zzsyVar9, zzsyVar10};
    }

    private zzsy(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzsy[] values() {
        return (zzsy[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
