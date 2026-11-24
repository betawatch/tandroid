package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class LogUtils {
    public static a4e zza(long j, int i, String str, String str2, List<y3e> list, wef wefVar) {
        q3e l = r3e.l();
        j3e m = k3e.m();
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((k3e) m.b).l(str2);
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((k3e) m.b).j(j);
        long j2 = i;
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((k3e) m.b).n(j2);
        if (m.c) {
            m.d();
            m.c = false;
        }
        ((k3e) m.b).k(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((k3e) m.f());
        if (l.c) {
            l.d();
            l.c = false;
        }
        ((r3e) l.b).k(arrayList);
        t3e j3 = u3e.j();
        long j4 = wefVar.b;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((u3e) j3.b).l(j4);
        long j5 = wefVar.a;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((u3e) j3.b).k(j5);
        long j6 = wefVar.c;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((u3e) j3.b).m(j6);
        long j7 = wefVar.d;
        if (j3.c) {
            j3.d();
            j3.c = false;
        }
        ((u3e) j3.b).n(j7);
        u3e u3eVar = (u3e) j3.f();
        if (l.c) {
            l.d();
            l.c = false;
        }
        ((r3e) l.b).j(u3eVar);
        r3e r3eVar = (r3e) l.f();
        z3e k = a4e.k();
        if (k.c) {
            k.d();
            k.c = false;
        }
        ((a4e) k.b).j(r3eVar);
        return (a4e) k.f();
    }

    private static String zzb(Context context) {
        try {
            return s0d.a(context).b(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            coe.a(e, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static b3e zza(Context context) {
        a3e k = b3e.k();
        String packageName = context.getPackageName();
        if (k.c) {
            k.d();
            k.c = false;
        }
        ((b3e) k.b).j(packageName);
        String zzb = zzb(context);
        if (zzb != null) {
            if (k.c) {
                k.d();
                k.c = false;
            }
            ((b3e) k.b).m(zzb);
        }
        return (b3e) k.f();
    }
}
