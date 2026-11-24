package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class LogUtils {
    public static x1e zza(long j, int i, String str, String str2, List<v1e> list, vcf vcfVar) {
        n1e l = o1e.l();
        g1e m = h1e.m();
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((h1e) m.b).l(str2);
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((h1e) m.b).j(j);
        long j2 = i;
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((h1e) m.b).n(j2);
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((h1e) m.b).k(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((h1e) m.f());
        if (l.c) {
            l.d();
            l.c = false;
        }
        ((o1e) l.b).k(arrayList);
        q1e j3 = r1e.j();
        long j4 = vcfVar.b;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((r1e) j3.b).l(j4);
        long j5 = vcfVar.a;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((r1e) j3.b).k(j5);
        long j6 = vcfVar.c;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((r1e) j3.b).m(j6);
        long j7 = vcfVar.d;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((r1e) j3.b).n(j7);
        r1e r1eVar = (r1e) j3.f();
        if (l.c) {
            l.d();
            l.c = false;
        }
        ((o1e) l.b).j(r1eVar);
        o1e o1eVar = (o1e) l.f();
        w1e k = x1e.k();
        if (k.c) {
            k.d();
            k.c = false;
        }
        ((x1e) k.b).j(o1eVar);
        return (x1e) k.f();
    }

    private static String zzb(Context context) {
        try {
            return ryc.a(context).e(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ame.a(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static y0e zza(Context context) {
        x0e k = y0e.k();
        String packageName = context.getPackageName();
        if (k.c) {
            k.d();
            k.c = false;
        }
        ((y0e) k.b).j(packageName);
        String zzb = zzb(context);
        if (zzb != null) {
            if (k.c) {
                k.d();
                k.c = false;
            }
            ((y0e) k.b).m(zzb);
        }
        return (y0e) k.f();
    }
}
