package l5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.CancellationSignal;
import b2.v0;
import b2.w;
import com.google.android.gms.internal.cast.z5;
import e2.m0;
import i2.o1;
import k2.w0;
import ki.t1;
import m.g3;
import m.s3;
import z7.xf;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class j implements v0.h {
    public Context a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.a = context;
                break;
            case 3:
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
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
    public static int d(w wVar) {
        String str = wVar.s;
        if (str == null || !v0.k(str)) {
            return o1.c(0, 0, 0, 0);
        }
        String str2 = wVar.s;
        String str3 = m0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return o1.c(4, 0, 0, 0);
        }
        return o1.c(1, 0, 0, 0);
    }

    public k a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.a = n5.a.a(n.a);
        n5.c cVar = new n5.c(context);
        kVar.b = cVar;
        kVar.c = n5.a.a(new xf(cVar, new t1(cVar, 6)));
        n5.c cVar2 = kVar.b;
        kVar.d = new w0(cVar2, 22);
        hd.a a2 = n5.a.a(new mi.q(20, kVar.d, n5.a.a(new le.b(cVar2, 21))));
        kVar.e = a2;
        oa.d dVar = new oa.d(20);
        n5.c cVar3 = kVar.b;
        g3 g3Var = new g3(cVar3, a2, dVar, 21);
        hd.a aVar = kVar.a;
        hd.a aVar2 = kVar.c;
        z5 z5Var = new z5();
        z5Var.b = aVar;
        z5Var.c = aVar2;
        z5Var.a = g3Var;
        z5Var.d = a2;
        z5Var.e = a2;
        s3 s3Var = new s3();
        s3Var.a = cVar3;
        s3Var.b = aVar2;
        s3Var.c = a2;
        s3Var.d = g3Var;
        s3Var.e = aVar;
        s3Var.f = a2;
        s3Var.h = a2;
        qi.e eVar = new qi.e();
        eVar.a = aVar;
        eVar.b = a2;
        eVar.c = g3Var;
        eVar.d = a2;
        kVar.f = n5.a.a(new androidx.biometric.e(z5Var, s3Var, eVar, 29));
        return kVar;
    }

    public Object b(Context context, v0.e eVar, kd.c cVar) {
        be.m mVar = new be.m(1, w7.n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        w0 w0Var = new w0(mVar, 25);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j c10 = te.b.c(new te.b(this.a), eVar);
        if (c10 == null) {
            w0Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            w0Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            c10.onCreateCredential(context, eVar, cancellationSignal, bVar, w0Var);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.a;
        return r10;
    }

    public PackageInfo c(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }
}
