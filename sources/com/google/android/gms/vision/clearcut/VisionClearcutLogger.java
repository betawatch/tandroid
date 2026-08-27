package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.vision.c;
import com.google.android.gms.internal.vision.e0;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.internal.vision.k2;
import com.google.android.gms.internal.vision.n2;
import com.google.android.gms.internal.vision.r0;
import com.google.android.gms.internal.vision.u0;
import com.google.android.gms.internal.vision.y1;
import com.google.android.gms.internal.vision.z0;
import java.io.IOException;
import t5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class VisionClearcutLogger {
    private final a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new a(context);
    }

    public final void zza(int i10, f0 f0Var) {
        u0 u0Var;
        f0Var.getClass();
        try {
            int h = f0Var.h();
            byte[] bArr = new byte[h];
            r0 r0Var = new r0(bArr, h);
            f0Var.getClass();
            k2 k2Var = k2.c;
            k2Var.getClass();
            n2 a2 = k2Var.a(f0Var.getClass());
            y1 y1Var = r0Var.b;
            if (y1Var == null) {
                y1Var = new y1(r0Var);
            }
            a2.c(f0Var, y1Var);
            if (r0Var.F() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i10 < 0 || i10 > 3) {
                Object[] objArr = {Integer.valueOf(i10)};
                if (Log.isLoggable("Vision", 4)) {
                    Log.i("Vision", String.format("Illegal event code: %d", objArr));
                    return;
                }
                return;
            }
            try {
                if (this.zzb) {
                    a aVar = this.zza;
                    aVar.getClass();
                    r rVar = new r(aVar, bArr);
                    ((com.google.android.gms.internal.clearcut.y1) rVar.e).c = i10;
                    rVar.b();
                    return;
                }
                e0 k10 = f0.k();
                try {
                    u0 u0Var2 = u0.b;
                    if (u0Var2 == null) {
                        synchronized (u0.class) {
                            try {
                                u0Var = u0.b;
                                if (u0Var == null) {
                                    u0Var = z0.a();
                                    u0.b = u0Var;
                                }
                            } finally {
                            }
                        }
                        u0Var2 = u0Var;
                    }
                    k10.c(bArr, h, u0Var2);
                    String obj = k10.toString();
                    if (Log.isLoggable("Vision", 6)) {
                        Log.e("Vision", "Would have logged:\n" + obj);
                    }
                } catch (Exception e9) {
                    g7.f0.a(e9, "Parsing error", new Object[0]);
                }
            } catch (Exception e10) {
                c.a.q(e10);
                g7.f0.a(e10, "Failed to log", new Object[0]);
            }
        } catch (IOException e11) {
            String name = f0.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }
}
