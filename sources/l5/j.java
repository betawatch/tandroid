package l5;

import android.content.Context;
import android.os.CancellationSignal;
import b2.r0;
import e2.d0;
import k2.c0;
import m.p3;
import n4.y;
import org.telegram.ui.Cells.ia;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            return hg.c.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        String str3 = d0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return hg.c.b(4, 0, 0, 0);
        }
        return hg.c.b(1, 0, 0, 0);
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
        kVar.c = n5.a.a(new y(26, rVar, new c0(rVar, 5)));
        a9.r rVar2 = kVar.b;
        kVar.d = new ka.c(rVar2, 18);
        fd.a a2 = n5.a.a(new o0.a(16, kVar.d, n5.a.a(new ia(rVar2, 14))));
        kVar.e = a2;
        qb.b bVar = new qb.b(19);
        a9.r rVar3 = kVar.b;
        lf.i iVar = new lf.i(rVar3, a2, bVar, 21);
        fd.a aVar = kVar.a;
        fd.a aVar2 = kVar.c;
        cf.c cVar = new cf.c();
        cVar.a = aVar;
        cVar.b = aVar2;
        cVar.c = iVar;
        cVar.d = a2;
        cVar.e = a2;
        p3 p3Var = new p3();
        p3Var.a = rVar3;
        p3Var.b = aVar2;
        p3Var.c = a2;
        p3Var.d = iVar;
        p3Var.e = aVar;
        p3Var.f = a2;
        p3Var.h = a2;
        ni.f fVar = new ni.f();
        fVar.a = aVar;
        fVar.b = a2;
        fVar.c = iVar;
        fVar.d = a2;
        kVar.f = n5.a.a(new aa.a(cVar, p3Var, fVar, false, 28));
        return kVar;
    }

    public Object b(Context context, v0.e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, w7.g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        ia iaVar = new ia(mVar, 16);
        a3.b bVar = new a3.b(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j a2 = v0.k.a(new v0.k(this.a, 0), eVar);
        if (a2 == null) {
            iaVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            iaVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, iaVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }
}
