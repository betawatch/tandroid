package androidx.emoji2.text;

import a8.b8;
import a8.u6;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import c8.v0;
import e2.s0;
import h2.l0;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.lt;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class n implements k, u2.k {
    public final Context a;

    public n(Context context, int i7) {
        switch (i7) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
                this.a = context;
                break;
            case 3:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
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
    public static int d(e2.u uVar) {
        String str = uVar.s;
        if (str == null || !s0.k(str)) {
            return i5.c.a(0, 0, 0, 0);
        }
        String str2 = uVar.s;
        String str3 = l0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return i5.c.a(4, 0, 0, 0);
        }
        return i5.c.a(1, 0, 0, 0);
    }

    @Override // u2.k
    public u2.l F(b8 b8Var) {
        Context context;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 && ((context = this.a) == null || i7 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new w7.s(25).F(b8Var);
        }
        int h = s0.h(((e2.u) b8Var.c).s);
        h2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l0.I(h));
        androidx.activity.n nVar = new androidx.activity.n(new u2.b(h, 0), new u2.b(h, 1));
        nVar.b = true;
        return nVar.F(b8Var);
    }

    @Override // androidx.emoji2.text.k
    public void a(u6 u6Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new aa.r(this, u6Var, threadPoolExecutor, 5));
    }

    public Object b(Context context, v0.e eVar, lt ltVar) {
        zd.m mVar = new zd.m(1, v0.b(ltVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new be.q(cancellationSignal, 1));
        u7.i iVar = new u7.i(mVar);
        d3.b bVar = new d3.b(3);
        kotlin.jvm.internal.j.e(context, "context");
        v0.i b10 = o5.j.b(new o5.j(this.a), eVar);
        if (b10 == null) {
            iVar.a(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            iVar.a(new w0.c(3, "createCredential is not supported on this device"));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, bVar, iVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    public void c(Context context, v0.m mVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        v0.i b10 = o5.j.b(new o5.j(context), mVar);
        if (b10 == null) {
            gVar.a(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            b10.onGetCredential(context, mVar, cancellationSignal, executor, gVar);
        }
    }
}
