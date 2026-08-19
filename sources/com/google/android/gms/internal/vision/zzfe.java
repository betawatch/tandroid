package com.google.android.gms.internal.vision;

import java.io.PrintStream;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public abstract class zzfe {
    private static final zzfd zza;
    private static final int zzb;

    static final class zza extends zzfd {
        zza() {
        }

        @Override // com.google.android.gms.internal.vision.zzfd
        public final void zza(Throwable th) {
            th.printStackTrace();
        }
    }

    public static void zza(Throwable th) {
        zza.zza(th);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    static {
        Integer num;
        zzfd zzaVar;
        try {
            num = zza();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = zza.class.getName();
                StringBuilder sb = new StringBuilder(name.length() + NotificationCenter.walletPendingTransactionsChanged);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                zzaVar = new zza();
                zza = zzaVar;
                zzb = num == null ? 1 : num.intValue();
            }
            if (num.intValue() >= 19) {
                zzaVar = new zzfj();
                zza = zzaVar;
                zzb = num == null ? 1 : num.intValue();
            }
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            zzaVar = new zzfh();
        } else {
            zzaVar = new zza();
        }
        zza = zzaVar;
        zzb = num == null ? 1 : num.intValue();
    }
}
