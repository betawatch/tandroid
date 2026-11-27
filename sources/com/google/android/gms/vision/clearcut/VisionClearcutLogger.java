package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class VisionClearcutLogger {
    private final bj2 zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new bj2(context);
    }

    public final void zza(int i, n6e n6eVar) {
        ipe ipeVar;
        n6eVar.getClass();
        try {
            int h = n6eVar.h();
            byte[] bArr = new byte[h];
            coe coeVar = new coe(h, bArr);
            w0f w0fVar = w0f.c;
            w0fVar.getClass();
            o1f a = w0fVar.a(n6eVar.getClass());
            g9d g9dVar = coeVar.a;
            if (g9dVar == null) {
                g9dVar = new g9d(coeVar);
            }
            a.e(n6eVar, g9dVar);
            if (coeVar.e() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i < 0 || i > 3) {
                Object[] objArr = {Integer.valueOf(i)};
                if (Log.isLoggable("Vision", 4)) {
                    Log.i("Vision", String.format("Illegal event code: %d", objArr));
                    return;
                }
                return;
            }
            try {
                if (this.zzb) {
                    bj2 bj2Var = this.zza;
                    bj2Var.getClass();
                    ge0 ge0Var = new ge0(bj2Var, bArr);
                    ((khe) ge0Var.e).c = i;
                    ge0Var.a();
                    return;
                }
                m6e k = n6e.k();
                try {
                    ipe ipeVar2 = ipe.b;
                    if (ipeVar2 == null) {
                        synchronized (ipe.class) {
                            ipeVar = ipe.b;
                            if (ipeVar == null) {
                                ipeVar = dre.a();
                                ipe.b = ipeVar;
                            }
                        }
                        ipeVar2 = ipeVar;
                    }
                    k.c(bArr, h, ipeVar2);
                    String obj = k.toString();
                    if (Log.isLoggable("Vision", 6)) {
                        Log.e("Vision", "Would have logged:\n" + obj);
                    }
                } catch (Exception e) {
                    tqe.a(e, "Parsing error", new Object[0]);
                }
            } catch (Exception e2) {
                v4e.a.a(e2);
                tqe.a(e2, "Failed to log", new Object[0]);
            }
        } catch (IOException e3) {
            String name = n6e.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e3);
        }
    }
}
