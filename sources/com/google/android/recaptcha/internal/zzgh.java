package com.google.android.recaptcha.internal;

import android.app.Application;
import java.util.Locale;
import java.util.MissingResourceException;
import k7.o7;
import kotlin.jvm.internal.j;
import sc.c;
import sc.g;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class zzgh {
    private zzvu zza;
    private final c zzb;

    public zzgh() {
        int i10 = zzby.zza;
        this.zzb = o7.a(zzgg.zza);
    }

    private final Application zzb() {
        return (Application) ((g) this.zzb).a();
    }

    private static final String zzc() {
        try {
            String iSO3Country = Locale.getDefault().getISO3Country();
            j.b(iSO3Country);
            return iSO3Country;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    private static final String zzd() {
        try {
            String iSO3Language = Locale.getDefault().getISO3Language();
            j.b(iSO3Language);
            return iSO3Language;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x004f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final com.google.android.recaptcha.internal.zzwz zza(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = com.google.android.recaptcha.internal.zzby.zza
            com.google.android.recaptcha.internal.zzgf r0 = com.google.android.recaptcha.internal.zzgf.zza
            sc.g r0 = k7.o7.a(r0)
            java.lang.Object r0 = r0.a()
            com.google.android.recaptcha.internal.zzch r0 = (com.google.android.recaptcha.internal.zzch) r0
            android.app.Application r0 = r10.zzb()
            java.util.Set r0 = com.google.android.recaptcha.internal.zzch.zza(r0)
            com.google.android.recaptcha.internal.zzvu r1 = r10.zza
            if (r1 != 0) goto Lf7
            com.google.android.recaptcha.internal.zzvr r1 = com.google.android.recaptcha.internal.zzvu.zzf()
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.zzf(r2)
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = 33
            java.lang.String r5 = "unknown"
            r6 = -1
            if (r2 < r4) goto L56
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.app.Application r7 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            r8 = 128(0x80, double:6.32E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r8 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            int r2 = r2.getInt(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r2 != r6) goto L51
        L4f:
            r2 = r5
            goto L79
        L51:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            goto L79
        L56:
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.app.Application r7 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            int r2 = r2.getInt(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
            if (r2 != r6) goto L75
            goto L4f
        L75:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4f
        L79:
            r1.zzs(r2)
            java.lang.String r2 = "18.7.1"
            r1.zzu(r2)
            java.lang.String r2 = android.os.Build.MODEL
            r1.zzr(r2)
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r1.zzt(r2)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            if (r2 < r4) goto Lb2
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.app.Application r3 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            r6 = 0
            android.content.pm.PackageManager$PackageInfoFlags r4 = android.content.pm.PackageManager.PackageInfoFlags.of(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            long r2 = r2.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            goto Lee
        Lb2:
            r3 = 28
            r4 = 0
            if (r2 < r3) goto Ld4
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.app.Application r3 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            long r2 = r2.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            goto Lee
        Ld4:
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.app.Application r3 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lee
        Lee:
            r1.zzq(r5)
            com.google.android.recaptcha.internal.zzsn r1 = r1.zzk()
            com.google.android.recaptcha.internal.zzvu r1 = (com.google.android.recaptcha.internal.zzvu) r1
        Lf7:
            r10.zza = r1
            com.google.android.recaptcha.internal.zzsh r1 = r1.zzr()
            com.google.android.recaptcha.internal.zzvr r1 = (com.google.android.recaptcha.internal.zzvr) r1
            r1.zze(r0)
            com.google.android.recaptcha.internal.zzsn r0 = r1.zzk()
            com.google.android.recaptcha.internal.zzvu r0 = (com.google.android.recaptcha.internal.zzvu) r0
            com.google.android.recaptcha.internal.zzwx r1 = com.google.android.recaptcha.internal.zzwz.zzf()
            r1.zzr(r11)
            r1.zze(r0)
            java.lang.String r11 = zzd()
            r1.zzq(r11)
            java.lang.String r11 = zzc()
            r1.zzf(r11)
            com.google.android.recaptcha.internal.zzsn r11 = r1.zzk()
            com.google.android.recaptcha.internal.zzwz r11 = (com.google.android.recaptcha.internal.zzwz) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgh.zza(java.lang.String):com.google.android.recaptcha.internal.zzwz");
    }
}
