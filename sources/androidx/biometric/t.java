package androidx.biometric;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.g8;
import m.s3;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t implements androidx.emoji2.text.k, v0.h {
    public Context a;

    public t(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            case 2:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // androidx.emoji2.text.k
    public void a(j7.s sVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.car.app.utils.b(this, sVar, threadPoolExecutor, 2));
    }

    public y2.j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        y2.j jVar = new y2.j();
        jVar.a = a3.a.a(y2.m.a);
        a3.c cVar = new a3.c(context);
        jVar.b = cVar;
        jVar.c = a3.a.a(new q5.c0(21, cVar, new xe.b(cVar)));
        a3.c cVar2 = jVar.b;
        jVar.d = new o5.i(cVar2, 16);
        rc.a a2 = a3.a.a(new af.c(29, jVar.d, a3.a.a(new ja.c(cVar2, 9))));
        jVar.e = a2;
        cb.b bVar = new cb.b(4);
        a3.c cVar3 = jVar.b;
        af.d dVar = new af.d(cVar3, a2, bVar, 12);
        rc.a aVar = jVar.a;
        rc.a aVar2 = jVar.c;
        c5.j jVar2 = new c5.j();
        jVar2.a = aVar;
        jVar2.b = aVar2;
        jVar2.c = dVar;
        jVar2.d = a2;
        jVar2.e = a2;
        s3 s3Var = new s3();
        s3Var.a = cVar3;
        s3Var.b = aVar2;
        s3Var.c = a2;
        s3Var.d = dVar;
        s3Var.e = aVar;
        s3Var.f = a2;
        s3Var.h = a2;
        jVar.f = a3.a.a(new s5.m(jVar2, s3Var, new rf.f(aVar, a2, dVar, a2, 3), 12));
        return jVar;
    }

    public Object c(Context context, v0.e eVar, uc.c cVar) {
        ld.m mVar = new ld.m(1, g8.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        o3.c cVar2 = new o3.c(mVar, 23);
        tb0 tb0Var = new tb0(1);
        kotlin.jvm.internal.j.e(context, "context");
        v0.j p22 = o2.i.p2(new o2.i(this.a), eVar);
        if (p22 == null) {
            cVar2.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            cVar2.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            p22.onCreateCredential(context, eVar, cancellationSignal, tb0Var, cVar2);
        }
        Object r10 = mVar.r();
        vc.a aVar = vc.a.a;
        return r10;
    }
}
