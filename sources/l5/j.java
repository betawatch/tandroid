package l5;

import android.content.Context;
import android.os.Build;
import b2.v0;
import b2.w;
import com.google.android.gms.internal.cast.z5;
import e2.m0;
import ki.t1;
import m.g3;
import m.s3;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class j implements r2.k {
    public Context a;

    public j(Context context) {
        this.a = context;
    }

    @Override // r2.k
    public r2.l J(com.google.firebase.messaging.l lVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new sb.a(20).J(lVar);
        }
        int h = v0.h(((w) lVar.c).s);
        e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
        r2.b bVar = new r2.b(h, 0);
        r2.b bVar2 = new r2.b(h, 1);
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.b = bVar;
        oVar.c = bVar2;
        oVar.a = true;
        oVar.a = true;
        return oVar.J(lVar);
    }

    public k a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.a = n5.a.a(n.a);
        k0.b bVar = new k0.b(context, 8);
        kVar.b = bVar;
        kVar.c = n5.a.a(new n4.s(29, bVar, new t1(bVar, 6)));
        k0.b bVar2 = kVar.b;
        kVar.d = new l2.f(bVar2, 19);
        hd.a a2 = n5.a.a(new mi.q(21, kVar.d, n5.a.a(new k0.b(bVar2, 27))));
        kVar.e = a2;
        oa.d dVar = new oa.d(20);
        k0.b bVar3 = kVar.b;
        g3 g3Var = new g3(bVar3, a2, dVar, 21);
        hd.a aVar = kVar.a;
        hd.a aVar2 = kVar.c;
        z5 z5Var = new z5();
        z5Var.b = aVar;
        z5Var.c = aVar2;
        z5Var.a = g3Var;
        z5Var.d = a2;
        z5Var.e = a2;
        s3 s3Var = new s3();
        s3Var.a = bVar3;
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
}
