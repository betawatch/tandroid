package l5;

import android.content.Context;
import android.os.Build;
import b2.r0;
import e2.d0;
import m.p3;
import n4.y;
import n7.z0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class j implements r2.k {
    public Context a;

    public j(Context context) {
        this.a = context;
    }

    public k a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.a = n5.a.a(n.a);
        e.a aVar = new e.a(context);
        kVar.b = aVar;
        kVar.c = n5.a.a(new y(26, aVar, new l2.g(aVar, 3)));
        e.a aVar2 = kVar.b;
        int i10 = 19;
        kVar.d = new l2.g(aVar2, i10);
        fd.a a2 = n5.a.a(new o0.a(16, kVar.d, n5.a.a(new n2.c(aVar2, i10))));
        kVar.e = a2;
        qb.b bVar = new qb.b(19);
        e.a aVar3 = kVar.b;
        la.h hVar = new la.h(aVar3, a2, bVar, 21);
        fd.a aVar4 = kVar.a;
        fd.a aVar5 = kVar.c;
        cf.c cVar = new cf.c(aVar4, aVar5, hVar, a2, a2);
        p3 p3Var = new p3();
        p3Var.a = aVar3;
        p3Var.b = aVar5;
        p3Var.c = a2;
        p3Var.d = hVar;
        p3Var.e = aVar4;
        p3Var.f = a2;
        p3Var.h = a2;
        qi.f fVar = new qi.f();
        fVar.a = aVar4;
        fVar.b = a2;
        fVar.c = hVar;
        fVar.d = a2;
        kVar.f = n5.a.a(new aa.a(cVar, p3Var, fVar, false, 29));
        return kVar;
    }

    @Override // r2.k
    public r2.l f(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new rb.a(20).f(nVar);
        }
        int h = r0.h(((b2.s) nVar.c).r);
        e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
        return new z0(14, new r2.b(h, 0), new r2.b(h, 1)).f(nVar);
    }
}
