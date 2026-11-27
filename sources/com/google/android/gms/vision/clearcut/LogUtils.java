package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class LogUtils {
    public static n6e zza(long j, int i, String str, String str2, List<l6e> list, lhf lhfVar) {
        d6e l = e6e.l();
        w5e m = x5e.m();
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((x5e) m.b).l(str2);
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((x5e) m.b).j(j);
        long j2 = i;
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((x5e) m.b).n(j2);
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((x5e) m.b).k(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((x5e) m.f());
        if (l.c) {
            l.d();
            l.c = false;
        }
        ((e6e) l.b).k(arrayList);
        g6e j3 = h6e.j();
        long j4 = lhfVar.b;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((h6e) j3.b).l(j4);
        long j5 = lhfVar.a;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((h6e) j3.b).k(j5);
        long j6 = lhfVar.c;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((h6e) j3.b).m(j6);
        long j7 = lhfVar.d;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((h6e) j3.b).n(j7);
        h6e h6eVar = (h6e) j3.f();
        if (l.c) {
            l.d();
            l.c = false;
        }
        ((e6e) l.b).j(h6eVar);
        e6e e6eVar = (e6e) l.f();
        m6e k = n6e.k();
        if (k.c) {
            k.d();
            k.c = false;
        }
        ((n6e) k.b).j(e6eVar);
        return (n6e) k.f();
    }

    private static String zzb(Context context) {
        try {
            return h3d.a(context).a(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            tqe.a(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static o5e zza(Context context) {
        n5e k = o5e.k();
        String packageName = context.getPackageName();
        if (k.c) {
            k.d();
            k.c = false;
        }
        ((o5e) k.b).j(packageName);
        String zzb = zzb(context);
        if (zzb != null) {
            if (k.c) {
                k.d();
                k.c = false;
            }
            ((o5e) k.b).m(zzb);
        }
        return (o5e) k.f();
    }
}
