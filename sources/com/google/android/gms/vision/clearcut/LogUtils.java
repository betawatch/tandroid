package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import c8.hc;
import com.google.android.gms.internal.vision.d0;
import com.google.android.gms.internal.vision.e0;
import com.google.android.gms.internal.vision.f;
import com.google.android.gms.internal.vision.f0;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.g;
import com.google.android.gms.internal.vision.o;
import com.google.android.gms.internal.vision.p;
import com.google.android.gms.internal.vision.v;
import com.google.android.gms.internal.vision.w;
import com.google.android.gms.internal.vision.y;
import com.google.android.gms.internal.vision.z;
import java.util.ArrayList;
import java.util.List;
import z6.b;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class LogUtils {
    public static f0 zza(long j3, int i7, String str, String str2, List<d0> list, f3 f3Var) {
        v l10 = w.l();
        o m10 = p.m();
        if (m10.c) {
            m10.d();
            m10.c = false;
        }
        p.k((p) m10.b, str2);
        if (m10.c) {
            m10.d();
            m10.c = false;
        }
        p.j((p) m10.b, j3);
        long j10 = i7;
        if (m10.c) {
            m10.d();
            m10.c = false;
        }
        p.n((p) m10.b, j10);
        if (m10.c) {
            m10.d();
            m10.c = false;
        }
        p.l((p) m10.b, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((p) m10.f());
        if (l10.c) {
            l10.d();
            l10.c = false;
        }
        w.k((w) l10.b, arrayList);
        y k10 = z.k();
        long j11 = f3Var.b;
        if (k10.c) {
            k10.d();
            k10.c = false;
        }
        z.l((z) k10.b, j11);
        long j12 = f3Var.a;
        if (k10.c) {
            k10.d();
            k10.c = false;
        }
        z.j((z) k10.b, j12);
        long j13 = f3Var.c;
        if (k10.c) {
            k10.d();
            k10.c = false;
        }
        z.m((z) k10.b, j13);
        long j14 = f3Var.d;
        if (k10.c) {
            k10.d();
            k10.c = false;
        }
        z.n((z) k10.b, j14);
        z zVar = (z) k10.f();
        if (l10.c) {
            l10.d();
            l10.c = false;
        }
        w.j((w) l10.b, zVar);
        w wVar = (w) l10.f();
        e0 k11 = f0.k();
        if (k11.c) {
            k11.d();
            k11.c = false;
        }
        f0.j((f0) k11.b, wVar);
        return (f0) k11.f();
    }

    private static String zzb(Context context) {
        try {
            return b.a(context).c(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            hc.a(e10, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static g zza(Context context) {
        f k10 = g.k();
        String packageName = context.getPackageName();
        if (k10.c) {
            k10.d();
            k10.c = false;
        }
        g.j((g) k10.b, packageName);
        String zzb = zzb(context);
        if (zzb != null) {
            if (k10.c) {
                k10.d();
                k10.c = false;
            }
            g.m((g) k10.b, zzb);
        }
        return (g) k10.f();
    }
}
