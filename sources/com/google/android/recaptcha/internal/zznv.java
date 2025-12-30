package com.google.android.recaptcha.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: classes.dex */
public final class zznv extends zznr {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zznq zzc;

    final class zza {
        zza() {
        }

        static boolean zza() {
            return zznv.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z = true;
        if (str != null && !"robolectric".equals(str)) {
            z = false;
        }
        zzb = z;
        zzc = new zznq() { // from class: com.google.android.recaptcha.internal.zznv.1
            @Override // com.google.android.recaptcha.internal.zznq
            public zzmw zza(Class<?> cls, int i) {
                return zzmw.zza;
            }

            @Override // com.google.android.recaptcha.internal.zznq
            public String zzb(Class cls) {
                StackTraceElement zza2;
                if (zznv.zza) {
                    try {
                        if (cls.equals(zznv.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zznv.zzb || (zza2 = zzos.zza(cls, 1)) == null) {
                    return null;
                }
                return zza2.getClassName();
            }
        };
    }

    static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.recaptcha.internal.zznr
    protected zznb zze(String str) {
        return zznz.zzb(str);
    }

    @Override // com.google.android.recaptcha.internal.zznr
    protected zznq zzh() {
        return zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznr
    protected zzof zzj() {
        return zzoa.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zznr
    protected String zzm() {
        return "platform: Android";
    }
}
