package androidx.biometric;

import a3.j0;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v7.t8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class s implements androidx.emoji2.text.k, v0.h {
    public final Context a;

    public s(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            case 2:
                this.a = context;
                break;
            case 3:
                kotlin.jvm.internal.i.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // androidx.emoji2.text.k
    public void a(v7.w wVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new j0(this, wVar, threadPoolExecutor, 3));
    }

    public void b(aa.a aVar, b2.p pVar, a4.m mVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.c = cancellationSignal2;
                        if (pVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (g10 = e0.b.g(this.a)) == null) {
            return;
        }
        e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new k0.a(mVar));
    }

    public Object c(Context context, v0.e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, t8.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        mg.n nVar = new mg.n(mVar, 18);
        a3.a aVar = new a3.a(2);
        kotlin.jvm.internal.i.e(context, "context");
        v0.j b10 = k6.h.b(new k6.h(this.a, 2), eVar);
        if (b10 == null) {
            nVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            nVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, aVar, nVar);
        }
        Object r10 = mVar.r();
        jd.a aVar2 = jd.a.a;
        return r10;
    }
}
