package k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.activity.o;
import androidx.biometric.e;
import b2.u;
import b2.w0;
import b2.x;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.messaging.m;
import e2.m0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ji.d4;
import ji.h5;
import kotlin.jvm.internal.i;
import l2.f;
import l5.j;
import m.q3;
import n4.s;
import n5.c;
import oa.d;
import r2.k;
import r2.l;
import v0.g;
import v0.h;
import w7.n;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b implements k, h {
    public Context a;

    public /* synthetic */ b(Context context, boolean z10) {
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

    @Override // r2.k
    public l H(m mVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new sb.a(20).H(mVar);
        }
        int h = w0.h(((x) mVar.c).s);
        e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
        r2.b bVar = new r2.b(h, 0);
        r2.b bVar2 = new r2.b(h, 1);
        o oVar = new o();
        oVar.b = bVar;
        oVar.c = bVar2;
        oVar.a = true;
        oVar.a = true;
        return oVar.H(mVar);
    }

    public void a(e eVar, u uVar, k6.h hVar) {
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
            d.authenticate(cryptoObject, cancellationSignal, 0, new a(hVar), null);
        }
    }

    public j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.a = n5.a.a(l5.m.a);
        c cVar = new c(context);
        jVar.b = cVar;
        jVar.c = n5.a.a(new s(27, cVar, new h5(cVar, 6)));
        c cVar2 = jVar.b;
        jVar.d = new f(cVar2, 19);
        hd.a a2 = n5.a.a(new m4.c(23, jVar.d, n5.a.a(new d4(cVar2, 24))));
        jVar.e = a2;
        d dVar = new d(20);
        c cVar3 = jVar.b;
        li.k kVar = new li.k(cVar3, a2, dVar, 22);
        hd.a aVar = jVar.a;
        hd.a aVar2 = jVar.c;
        z5 z5Var = new z5();
        z5Var.b = aVar;
        z5Var.c = aVar2;
        z5Var.a = kVar;
        z5Var.d = a2;
        z5Var.e = a2;
        q3 q3Var = new q3();
        q3Var.a = cVar3;
        q3Var.b = aVar2;
        q3Var.c = a2;
        q3Var.d = kVar;
        q3Var.e = aVar;
        q3Var.f = a2;
        q3Var.h = a2;
        qi.e eVar = new qi.e();
        eVar.a = aVar;
        eVar.b = a2;
        eVar.c = kVar;
        eVar.d = a2;
        jVar.f = n5.a.a(new e(z5Var, q3Var, eVar, 29));
        return jVar;
    }

    public Object c(Context context, v0.e eVar, kd.c cVar) {
        be.m mVar = new be.m(1, n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        d4 d4Var = new d4(mVar, 27);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        v0.j a2 = q2.b.a(new q2.b(this.a, 1), eVar);
        if (a2 == null) {
            d4Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            d4Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, d4Var);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.a;
        return r10;
    }

    public PackageInfo e(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }

    public b(Context context) {
        i.e(context, "context");
        this.a = context;
    }
}
