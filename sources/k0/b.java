package k0;

import a4.l;
import a9.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import b2.u;
import b2.w0;
import b2.x;
import com.google.android.gms.internal.cast.z5;
import e2.m0;
import i2.d;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ji.w4;
import kd.c;
import kotlin.jvm.internal.i;
import l5.j;
import l5.m;
import m.h3;
import m.t3;
import m2.t;
import v0.g;
import v0.h;
import v0.k;
import w7.n;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b implements h {
    public Context a;

    public /* synthetic */ b(Context context, byte b10) {
        this.a = context;
    }

    public static FingerprintManager d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
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
    public static int f(x xVar) {
        String str = xVar.s;
        if (str == null || !w0.k(str)) {
            return d.c(0, 0, 0, 0);
        }
        String str2 = xVar.s;
        String str3 = m0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return d.c(4, 0, 0, 0);
        }
        return d.c(1, 0, 0, 0);
    }

    public void a(e eVar, u uVar, l lVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        uVar.c = cancellationSignal3;
                        if (uVar.b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) uVar.c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager d = d(this.a);
        if (d != null) {
            if (eVar != null) {
                Mac mac = (Mac) eVar.d;
                Signature signature = (Signature) eVar.b;
                Cipher cipher = (Cipher) eVar.c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            d.authenticate(cryptoObject, cancellationSignal, 0, new a(lVar), null);
        }
    }

    public j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.a = n5.a.a(m.a);
        r rVar = new r(context);
        jVar.b = rVar;
        jVar.c = n5.a.a(new t(2, rVar, new w4(rVar, 6)));
        r rVar2 = jVar.b;
        jVar.d = new m.l(rVar2);
        hd.a a2 = n5.a.a(new t(23, jVar.d, n5.a.a(new m.h(rVar2, 17))));
        jVar.e = a2;
        oa.d dVar = new oa.d(20);
        r rVar3 = jVar.b;
        h3 h3Var = new h3(rVar3, a2, dVar, 22);
        hd.a aVar = jVar.a;
        hd.a aVar2 = jVar.c;
        z5 z5Var = new z5();
        z5Var.b = aVar;
        z5Var.c = aVar2;
        z5Var.a = h3Var;
        z5Var.d = a2;
        z5Var.e = a2;
        t3 t3Var = new t3();
        t3Var.a = rVar3;
        t3Var.b = aVar2;
        t3Var.c = a2;
        t3Var.d = h3Var;
        t3Var.e = aVar;
        t3Var.f = a2;
        t3Var.h = a2;
        pi.e eVar = new pi.e();
        eVar.a = aVar;
        eVar.b = a2;
        eVar.c = h3Var;
        eVar.d = a2;
        jVar.f = n5.a.a(new e(z5Var, t3Var, eVar, 29));
        return jVar;
    }

    public Object c(Context context, v0.e eVar, c cVar) {
        be.m mVar = new be.m(1, n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        m.h hVar = new m.h(mVar, 20);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        v0.j a2 = k.a(new k(this.a), eVar);
        if (a2 == null) {
            hVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            hVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, hVar);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.a;
        return r10;
    }

    public PackageInfo e(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }

    public b(Context context, int i10) {
        switch (i10) {
            case 3:
                i.e(context, "context");
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }
}
