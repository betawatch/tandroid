package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class VisionClearcutLogger {
    private final tj2 zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new tj2(context);
    }

    public final void zza(int i, a4e a4eVar) {
        tme tmeVar;
        a4eVar.getClass();
        try {
            int h = a4eVar.h();
            byte[] bArr = new byte[h];
            nle nleVar = new nle(h, bArr);
            hye hyeVar = hye.c;
            hyeVar.getClass();
            zye a = hyeVar.a(a4eVar.getClass());
            eod eodVar = nleVar.a;
            if (eodVar == null) {
                eodVar = new eod(nleVar);
            }
            a.d(a4eVar, eodVar);
            if (nleVar.e() != 0) {
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
                    tj2 tj2Var = this.zza;
                    tj2Var.getClass();
                    ef0 ef0Var = new ef0(tj2Var, bArr);
                    ((uee) ef0Var.e).c = i;
                    ef0Var.a();
                    return;
                }
                z3e k = a4e.k();
                try {
                    tme tmeVar2 = tme.b;
                    if (tmeVar2 == null) {
                        synchronized (tme.class) {
                            tmeVar = tme.b;
                            if (tmeVar == null) {
                                tmeVar = poe.a();
                                tme.b = tmeVar;
                            }
                        }
                        tmeVar2 = tmeVar;
                    }
                    k.c(bArr, h, tmeVar2);
                    String obj = k.toString();
                    if (Log.isLoggable("Vision", 6)) {
                        Log.e("Vision", "Would have logged:\n" + obj);
                    }
                } catch (Exception e) {
                    coe.a(e, "Parsing error", new Object[0]);
                }
            } catch (Exception e2) {
                i2e.a.a(e2);
                coe.a(e2, "Failed to log", new Object[0]);
            }
        } catch (IOException e3) {
            String name = a4e.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e3);
        }
    }
}
