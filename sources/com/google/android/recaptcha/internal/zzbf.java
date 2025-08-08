package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Locale;
import java.util.MissingResourceException;

/* loaded from: classes.dex */
public final class zzbf {
    public static final zzbe zza = new zzbe(null);
    private static zzmo zzb;
    private final String zzc;
    private final zzac zzd;
    private final zznc zze;
    private final long zzf;

    public zzbf(zzbb zzbbVar, String str, zzac zzacVar) {
        this.zzc = str;
        this.zzd = zzacVar;
        zznc zzi = zznf.zzi();
        this.zze = zzi;
        this.zzf = System.currentTimeMillis();
        zzi.zzp(zzbbVar.zza());
        zzi.zzd(zzbbVar.zzb());
        zzi.zzr(zzbbVar.zzc());
        if (zzbbVar.zzd() != null) {
            zzi.zzu(zzbbVar.zzd());
        }
        zzi.zzt(zzmg.zzc(zzmg.zzb(System.currentTimeMillis())));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private static final com.google.android.recaptcha.internal.zzmo zzb(android.content.Context r8) {
        /*
            java.lang.String r0 = "unknown"
            r1 = 33
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = -1
            if (r2 < r1) goto L2c
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r5 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            r6 = 128(0x80, double:6.32E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r6 = com.google.android.recaptcha.internal.zzbf$$ExternalSyntheticApiModelOutline0.m(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.content.pm.ApplicationInfo r2 = com.google.android.recaptcha.internal.zzbf$$ExternalSyntheticApiModelOutline1.m(r2, r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            if (r2 != r4) goto L27
        L25:
            r2 = r0
            goto L47
        L27:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            goto L47
        L2c:
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            java.lang.String r5 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            int r2 = r2.getInt(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
            if (r2 != r4) goto L43
            goto L25
        L43:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L25
        L47:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            if (r3 < r1) goto L66
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            r3 = 0
            android.content.pm.PackageManager$PackageInfoFlags r3 = com.google.android.recaptcha.internal.zzbf$$ExternalSyntheticApiModelOutline2.m(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            android.content.pm.PackageInfo r8 = com.google.android.recaptcha.internal.zzbf$$ExternalSyntheticApiModelOutline3.m(r1, r8, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            long r3 = com.google.android.recaptcha.internal.zzbf$$ExternalSyntheticApiModelOutline4.m(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            goto L92
        L66:
            r1 = 28
            r4 = 0
            if (r3 < r1) goto L80
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            long r3 = com.google.android.recaptcha.internal.zzbf$$ExternalSyntheticApiModelOutline4.m(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            goto L92
        L80:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            android.content.pm.PackageInfo r8 = r1.getPackageInfo(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            int r8 = r8.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L92
        L92:
            com.google.android.recaptcha.internal.zzmn r8 = com.google.android.recaptcha.internal.zzmo.zzf()
            int r1 = android.os.Build.VERSION.SDK_INT
            r8.zzd(r1)
            r8.zzq(r2)
            java.lang.String r1 = "18.4.0"
            r8.zzs(r1)
            java.lang.String r1 = android.os.Build.MODEL
            r8.zzp(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r8.zzr(r1)
            r8.zze(r0)
            com.google.android.recaptcha.internal.zzit r8 = r8.zzj()
            com.google.android.recaptcha.internal.zzmo r8 = (com.google.android.recaptcha.internal.zzmo) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbf.zzb(android.content.Context):com.google.android.recaptcha.internal.zzmo");
    }

    public final zznf zza(int i, zzmr zzmrVar, Context context) {
        String str;
        String str2 = "";
        long currentTimeMillis = System.currentTimeMillis() - this.zzf;
        zznc zzncVar = this.zze;
        zzncVar.zze(currentTimeMillis);
        zzncVar.zzv(i);
        if (zzmrVar != null) {
            this.zze.zzq(zzmrVar);
        }
        if (zzb == null) {
            zzb = zzb(context);
        }
        try {
            str = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            str = "";
        }
        try {
            str2 = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused2) {
        }
        zznc zzncVar2 = this.zze;
        String str3 = this.zzc;
        zznq zzf = zznr.zzf();
        zzf.zzq(str3);
        zzmo zzmoVar = zzb;
        if (zzmoVar == null) {
            zzmoVar = zzb(context);
        }
        zzf.zzd(zzmoVar);
        zzf.zzp(str);
        zzf.zze(str2);
        zzncVar2.zzs((zznr) zzf.zzj());
        return (zznf) this.zze.zzj();
    }
}
