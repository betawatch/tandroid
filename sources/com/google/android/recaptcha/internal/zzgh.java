package com.google.android.recaptcha.internal;

import android.app.Application;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzgh {
    private zzvu zza;
    private final Lazy zzb;

    public zzgh() {
        int i = zzby.zza;
        this.zzb = LazyKt.lazy(zzgg.zza);
    }

    private final Application zzb() {
        return (Application) this.zzb.getValue();
    }

    private static final String zzc() {
        try {
            String iSO3Country = Locale.getDefault().getISO3Country();
            Intrinsics.checkNotNull(iSO3Country);
            return iSO3Country;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    private static final String zzd() {
        try {
            String iSO3Language = Locale.getDefault().getISO3Language();
            Intrinsics.checkNotNull(iSO3Language);
            return iSO3Language;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x004e
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
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            java.lang.Object r0 = r0.getValue()
            com.google.android.recaptcha.internal.zzch r0 = (com.google.android.recaptcha.internal.zzch) r0
            android.app.Application r0 = r10.zzb()
            java.util.Set r0 = com.google.android.recaptcha.internal.zzch.zza(r0)
            com.google.android.recaptcha.internal.zzvu r1 = r10.zza
            if (r1 != 0) goto Lf6
            com.google.android.recaptcha.internal.zzvr r1 = com.google.android.recaptcha.internal.zzvu.zzf()
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.zzf(r2)
            java.lang.String r3 = "com.google.android.gms.version"
            r4 = 33
            java.lang.String r5 = "unknown"
            r6 = -1
            if (r2 < r4) goto L55
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.app.Application r7 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            r8 = 128(0x80, double:6.32E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r8 = com.google.android.recaptcha.internal.zzgh$$ExternalSyntheticApiModelOutline0.m(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.ApplicationInfo r2 = com.google.android.recaptcha.internal.zzgh$$ExternalSyntheticApiModelOutline1.m(r2, r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            int r2 = r2.getInt(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            if (r2 != r6) goto L50
        L4e:
            r2 = r5
            goto L78
        L50:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            goto L78
        L55:
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.app.Application r7 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r7 = r7.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            int r2 = r2.getInt(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            if (r2 != r6) goto L74
            goto L4e
        L74:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
        L78:
            r1.zzs(r2)
            java.lang.String r2 = "18.7.1"
            r1.zzu(r2)
            java.lang.String r2 = android.os.Build.MODEL
            r1.zzr(r2)
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r1.zzt(r2)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            if (r2 < r4) goto Lb1
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.app.Application r3 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            r6 = 0
            android.content.pm.PackageManager$PackageInfoFlags r4 = com.google.android.recaptcha.internal.zzgh$$ExternalSyntheticApiModelOutline2.m(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.content.pm.PackageInfo r2 = com.google.android.recaptcha.internal.zzgh$$ExternalSyntheticApiModelOutline3.m(r2, r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            long r2 = androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility$GetGMSVersion$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            goto Led
        Lb1:
            r3 = 28
            r4 = 0
            if (r2 < r3) goto Ld3
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.app.Application r3 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            long r2 = androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility$GetGMSVersion$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            goto Led
        Ld3:
            android.app.Application r2 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.app.Application r3 = r10.zzb()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Led
        Led:
            r1.zzq(r5)
            com.google.android.recaptcha.internal.zzsn r1 = r1.zzk()
            com.google.android.recaptcha.internal.zzvu r1 = (com.google.android.recaptcha.internal.zzvu) r1
        Lf6:
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
