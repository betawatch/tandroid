package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
final class zznz extends zzns {
    static final boolean zza;
    static final boolean zzb;
    static final boolean zzc;
    private static final AtomicReference zzd;
    private static final AtomicLong zze;
    private static final ConcurrentLinkedQueue zzf;
    private volatile zznb zzg;

    static {
        String str = Build.FINGERPRINT;
        zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        zzc = "eng".equals(str3) || "userdebug".equals(str3);
        zzd = new AtomicReference();
        zze = new AtomicLong();
        zzf = new ConcurrentLinkedQueue();
    }

    private zznz(String str) {
        super(str);
        if (zza || zzb) {
            this.zzg = new zznt().zza(zza());
        } else if (zzc) {
            this.zzg = zzoe.zzc().zzb(false).zza(zza());
        } else {
            this.zzg = null;
        }
    }

    public static zznb zzb(String str) {
        AtomicReference atomicReference = zzd;
        if (atomicReference.get() != null) {
            return ((zznu) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char charAt = str.charAt(length);
                if (charAt != '$') {
                    if (charAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        zznz zznzVar = new zznz(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = zznx.zza;
        concurrentLinkedQueue.offer(zznzVar);
        if (atomicReference.get() != null) {
            while (true) {
                zznz zznzVar2 = (zznz) concurrentLinkedQueue.poll();
                if (zznzVar2 == null) {
                    break;
                }
                zznzVar2.zzg = ((zznu) atomicReference.get()).zza(zznzVar2.zza());
            }
            if (((zzny) zzf.poll()) != null) {
                zze.getAndDecrement();
                throw null;
            }
        }
        return zznzVar;
    }
}
