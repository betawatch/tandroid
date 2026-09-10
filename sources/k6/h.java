package k6;

import a9.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import b2.r0;
import b2.s;
import bi.u6;
import e2.d0;
import m.e3;
import m.r3;
import og.u0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h {
    public static h b;
    public Context a;

    public h(Context context, int i10) {
        switch (i10) {
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static h b(Context context) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(s sVar) {
        String str = sVar.r;
        if (str == null || !r0.k(str)) {
            return hc.b.c(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        String str3 = d0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return hc.b.c(4, 0, 0, 0);
        }
        return hc.b.c(1, 0, 0, 0);
    }

    public static final l d(PackageInfo packageInfo, l... lVarArr) {
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
    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (z10) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z10 ? d(packageInfo2, n.a) : d(packageInfo2, n.a[0])) == null) {
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
            if ((!z10 ? d(packageInfo2, n.a) : d(packageInfo2, n.a[0])) == null) {
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
        r rVar = new r(context);
        jVar.b = rVar;
        jVar.c = n5.a.a(new of.b(rVar, new l2.g(rVar, 3), false, 25));
        r rVar2 = jVar.b;
        jVar.d = new l2.g(rVar2, 20);
        fd.a a2 = n5.a.a(new u0(15, jVar.d, n5.a.a(new o0.b(rVar2))));
        jVar.e = a2;
        qb.b bVar = new qb.b(19);
        r rVar3 = jVar.b;
        e3 e3Var = new e3(rVar3, a2, bVar, 19);
        fd.a aVar = jVar.a;
        fd.a aVar2 = jVar.c;
        u6 u6Var = new u6();
        u6Var.a = aVar;
        u6Var.b = aVar2;
        u6Var.c = e3Var;
        u6Var.d = a2;
        u6Var.e = a2;
        r3 r3Var = new r3();
        r3Var.a = rVar3;
        r3Var.b = aVar2;
        r3Var.c = a2;
        r3Var.d = e3Var;
        r3Var.e = aVar;
        r3Var.f = a2;
        r3Var.h = a2;
        ki.f fVar = new ki.f();
        fVar.a = aVar;
        fVar.b = a2;
        fVar.c = e3Var;
        fVar.d = a2;
        jVar.f = n5.a.a(new aa.a(u6Var, r3Var, fVar, false, 27));
        return jVar;
    }
}
