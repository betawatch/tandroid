package k6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ji.u4;
import k2.g0;
import m.p3;
import m2.t;
import n4.y;
import v0.p;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h {
    public static h b;
    public Context a;

    public h(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.a = context;
                break;
            case 3:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static v0.j b(h hVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return hVar.e();
        }
        if (obj instanceof v0.n) {
            for (p pVar : ((v0.n) obj).a) {
            }
        }
        Context ctx = hVar.a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return hVar.e();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0.l lVar = new v0.l(ctx);
            v0.l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? hVar.e() : lVar2;
        }
        if (i10 <= 33) {
            return hVar.e();
        }
        return null;
    }

    public static h c(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (b == null) {
                    o.a(context);
                    b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    public static final l f(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (z10) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z10 ? f(packageInfo2, n.a) : f(packageInfo2, n.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z10 ? f(packageInfo2, n.a) : f(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    public l5.j a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l5.j jVar = new l5.j();
        jVar.a = n5.a.a(l5.m.a);
        l.d dVar = new l.d(context, 6);
        jVar.b = dVar;
        jVar.c = n5.a.a(new y(25, dVar, new u4(dVar, 5)));
        l.d dVar2 = jVar.b;
        jVar.d = new g0(dVar2, 22);
        fd.a a2 = n5.a.a(new o0.a(16, jVar.d, n5.a.a(new mg.n(dVar2, 16))));
        jVar.e = a2;
        rb.a aVar = new rb.a(19);
        l.d dVar3 = jVar.b;
        t tVar = new t(dVar3, a2, aVar, 19);
        fd.a aVar2 = jVar.a;
        fd.a aVar3 = jVar.c;
        cf.c cVar = new cf.c();
        cVar.a = aVar2;
        cVar.b = aVar3;
        cVar.c = tVar;
        cVar.d = a2;
        cVar.e = a2;
        p3 p3Var = new p3();
        p3Var.a = dVar3;
        p3Var.b = aVar3;
        p3Var.c = a2;
        p3Var.d = tVar;
        p3Var.e = aVar2;
        p3Var.f = a2;
        p3Var.h = a2;
        fg.f fVar = new fg.f();
        fVar.a = aVar2;
        fVar.b = a2;
        fVar.c = tVar;
        fVar.d = a2;
        jVar.f = n5.a.a(new aa.a(cVar, p3Var, fVar, false, 27));
        return jVar;
    }

    public PackageInfo d(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }

    public v0.j e() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List m10 = hd.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        Iterator it = m10.iterator();
        v0.j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.j jVar2 = (v0.j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (jVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }
}
