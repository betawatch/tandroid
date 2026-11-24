package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class VisionClearcutLogger {
    private final fi2 zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new fi2(context);
    }

    public final void zza(int i, x1e x1eVar) {
        rke rkeVar;
        x1eVar.getClass();
        try {
            int h = x1eVar.h();
            byte[] bArr = new byte[h];
            lje ljeVar = new lje(h, bArr);
            fwe fweVar = fwe.c;
            fweVar.getClass();
            xwe a = fweVar.a(x1eVar.getClass());
            g6e g6eVar = ljeVar.a;
            if (g6eVar == null) {
                g6eVar = new g6e(ljeVar);
            }
            a.d(x1eVar, g6eVar);
            if (ljeVar.e() != 0) {
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
                    fi2 fi2Var = this.zza;
                    fi2Var.getClass();
                    ee0 ee0Var = new ee0(fi2Var, bArr);
                    ((tce) ee0Var.e).c = i;
                    ee0Var.a();
                    return;
                }
                w1e k = x1e.k();
                try {
                    rke rkeVar2 = rke.b;
                    if (rkeVar2 == null) {
                        synchronized (rke.class) {
                            rkeVar = rke.b;
                            if (rkeVar == null) {
                                rkeVar = mme.a();
                                rke.b = rkeVar;
                            }
                        }
                        rkeVar2 = rkeVar;
                    }
                    k.c(bArr, h, rkeVar2);
                    String obj = k.toString();
                    if (Log.isLoggable("Vision", 6)) {
                        Log.e("Vision", "Would have logged:\n" + obj);
                    }
                } catch (Exception e) {
                    ame.a(e, "Parsing error", new Object[0]);
                }
            } catch (Exception e2) {
                f0e.a.a(e2);
                ame.a(e2, "Failed to log", new Object[0]);
            }
        } catch (IOException e3) {
            String name = x1e.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e3);
        }
    }
}
