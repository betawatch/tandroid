package l5;

import android.content.Context;
import android.os.CancellationSignal;
import b2.r0;
import e2.d0;
import hg.k0;
import ki.e0;
import m.p3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class j implements v0.h {
    public Context a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.a = context;
                break;
            default:
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
    public static int c(b2.s sVar) {
        String str = sVar.r;
        if (str == null || !r0.k(str)) {
            return k0.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        String str3 = d0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return k0.b(4, 0, 0, 0);
        }
        return k0.b(1, 0, 0, 0);
    }

    public k a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.a = n5.a.a(n.a);
        a9.r rVar = new a9.r(context);
        kVar.b = rVar;
        kVar.c = n5.a.a(new m5.e(0, rVar, new android.support.v4.media.c(rVar, 28)));
        a9.r rVar2 = kVar.b;
        kVar.d = new e0(rVar2, 21);
        fd.a a2 = n5.a.a(new m5.e(20, kVar.d, n5.a.a(new k2.e(rVar2, 24))));
        kVar.e = a2;
        qb.b bVar = new qb.b(19);
        a9.r rVar3 = kVar.b;
        lf.h hVar = new lf.h(rVar3, a2, bVar, 21);
        fd.a aVar = kVar.a;
        fd.a aVar2 = kVar.c;
        cf.c cVar = new cf.c(aVar, aVar2, hVar, a2, a2);
        p3 p3Var = new p3();
        p3Var.a = rVar3;
        p3Var.b = aVar2;
        p3Var.c = a2;
        p3Var.d = hVar;
        p3Var.e = aVar;
        p3Var.f = a2;
        p3Var.h = a2;
        oi.f fVar = new oi.f();
        fVar.a = aVar;
        fVar.b = a2;
        fVar.c = hVar;
        fVar.d = a2;
        kVar.f = n5.a.a(new aa.a(cVar, p3Var, fVar, false, 28));
        return kVar;
    }

    public Object b(Context context, v0.e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        k2.e eVar2 = new k2.e(mVar, 26);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j a2 = v0.k.a(new v0.k(this.a, 0), eVar);
        if (a2 == null) {
            eVar2.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            eVar2.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, eVar2);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }
}
