package androidx.emoji2.text;

import a8.b8;
import a8.u6;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import c8.x0;
import e2.s0;
import h2.l0;
import java.security.Signature;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.ht;
import org.telegram.ui.Cells.c5;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class n implements k, u2.k {
    public final Context a;

    public /* synthetic */ n(Context context, char c10) {
        this.a = context;
    }

    public static FingerprintManager e(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i7 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
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
    public static int f(e2.u uVar) {
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
    public u2.l D(b8 b8Var) {
        Context context;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 && ((context = this.a) == null || i7 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new w7.s(25).D(b8Var);
        }
        int h = s0.h(((e2.u) b8Var.c).s);
        h2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l0.I(h));
        androidx.activity.n nVar = new androidx.activity.n(new u2.b(h, 0), new u2.b(h, 1));
        nVar.b = true;
        return nVar.D(b8Var);
    }

    @Override // androidx.emoji2.text.k
    public void a(u6 u6Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new aa.r(this, u6Var, threadPoolExecutor, 7));
    }

    public void b(h6.m mVar, ca.i iVar, ob.c cVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (iVar != null) {
            synchronized (iVar) {
                try {
                    if (((CancellationSignal) iVar.c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        iVar.c = cancellationSignal3;
                        if (iVar.b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) iVar.c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager e10 = e(this.a);
        if (e10 != null) {
            if (mVar != null) {
                Mac mac = (Mac) mVar.d;
                Signature signature = (Signature) mVar.b;
                Cipher cipher = (Cipher) mVar.c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            e10.authenticate(cryptoObject, cancellationSignal, 0, new k0.a(cVar, 0), null);
        }
    }

    public Object c(Context context, v0.e eVar, ht htVar) {
        zd.m mVar = new zd.m(1, x0.b(htVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new be.q(cancellationSignal, 1));
        je.b bVar = new je.b(mVar);
        d3.b bVar2 = new d3.b(3);
        kotlin.jvm.internal.j.e(context, "context");
        v0.i x10 = c5.x(new c5(this.a), eVar);
        if (x10 == null) {
            bVar.a(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.a(new w0.c(3, "createCredential is not supported on this device"));
        } else {
            x10.onCreateCredential(context, eVar, cancellationSignal, bVar2, bVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    public void d(Context context, v0.m mVar, CancellationSignal cancellationSignal, Executor executor, v0.g gVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        v0.i x10 = c5.x(new c5(context), mVar);
        if (x10 == null) {
            gVar.a(new w0.h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            x10.onGetCredential(context, mVar, cancellationSignal, executor, gVar);
        }
    }

    public n(Context context, int i7) {
        switch (i7) {
            case 2:
                context.getClass();
                this.a = context;
                break;
            case 3:
            default:
                this.a = context.getApplicationContext();
                break;
            case 4:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
        }
    }
}
