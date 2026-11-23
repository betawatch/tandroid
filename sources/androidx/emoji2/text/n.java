package androidx.emoji2.text;

import a8.b8;
import a8.v6;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import c8.y0;
import e2.s0;
import h2.l0;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.ht;
import org.telegram.ui.Cells.aa;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class n implements k, u2.k {
    public final Context a;

    public n(Context context, int i7) {
        switch (i7) {
            case 1:
                this.a = context;
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
    public void a(v6 v6Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new aa.r(this, v6Var, threadPoolExecutor, 7));
    }

    public Object b(Context context, v0.e eVar, ht htVar) {
        zd.m mVar = new zd.m(1, y0.b(htVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new be.q(cancellationSignal, 1));
        aa aaVar = new aa(mVar, 25);
        d3.b bVar = new d3.b(3);
        kotlin.jvm.internal.j.e(context, "context");
        v0.i b10 = o5.j.b(new o5.j(this.a), eVar);
        if (b10 == null) {
            aaVar.T(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            aaVar.T(new w0.c(3, "createCredential is not supported on this device"));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, bVar, aaVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    public void c(Context context, v0.m mVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        v0.i b10 = o5.j.b(new o5.j(context), mVar);
        if (b10 == null) {
            gVar.T(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            b10.onGetCredential(context, mVar, cancellationSignal, executor, gVar);
        }
    }

    @Override // u2.k
    public u2.l y(b8 b8Var) {
        Context context;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 && ((context = this.a) == null || i7 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new w7.s(25).y(b8Var);
        }
        int h = s0.h(((e2.u) b8Var.c).s);
        h2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l0.I(h));
        androidx.activity.n nVar = new androidx.activity.n(new u2.b(h, 0), new u2.b(h, 1));
        nVar.b = true;
        return nVar.y(b8Var);
    }
}
