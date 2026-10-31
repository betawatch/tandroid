package k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.v4.media.session.a0;
import android.util.Log;
import b2.u;
import b2.v0;
import b2.x;
import e2.l0;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k2.m0;
import k6.h;
import l2.f;
import l5.j;
import m.p3;
import m5.e;
import org.telegram.messenger.zs;
import q5.d;
import r2.k;
import r2.l;
import v0.i;
import v0.m;
import v0.o;
import xa.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements k {
    public Context a;

    public /* synthetic */ b(Context context, boolean z10) {
        this.a = context;
    }

    public static i c(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.f();
        }
        if (obj instanceof m) {
            for (o oVar : ((m) obj).a) {
            }
        }
        Context ctx = bVar.a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return bVar.f();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0.k kVar = new v0.k(ctx);
            v0.k kVar2 = kVar.isAvailableOnDevice() ? kVar : null;
            return kVar2 == null ? bVar.f() : kVar2;
        }
        if (i10 <= 33) {
            return bVar.f();
        }
        return null;
    }

    public static FingerprintManager e(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public void a(a0 a0Var, u uVar, h hVar) {
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
        FingerprintManager e = e(this.a);
        if (e != null) {
            if (a0Var != null) {
                Mac mac = (Mac) a0Var.d;
                Signature signature = (Signature) a0Var.b;
                Cipher cipher = (Cipher) a0Var.c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            e.authenticate(cryptoObject, cancellationSignal, 0, new a(hVar, 0), null);
        }
    }

    public j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.a = n5.a.a(l5.m.a);
        m0 m0Var = new m0(context);
        jVar.b = m0Var;
        jVar.c = n5.a.a(new e(0, m0Var, new f(m0Var, 3)));
        m0 m0Var2 = jVar.b;
        jVar.d = new n2.u(m0Var2, 24);
        zc.a a2 = n5.a.a(new e(23, jVar.d, n5.a.a(new f(m0Var2, 29))));
        jVar.e = a2;
        t7.u uVar = new t7.u(17);
        m0 m0Var3 = jVar.b;
        d dVar = new d(m0Var3, a2, uVar, 0);
        zc.a aVar = jVar.a;
        zc.a aVar2 = jVar.c;
        bh.d dVar2 = new bh.d(aVar, aVar2, dVar, a2, a2);
        p3 p3Var = new p3();
        p3Var.a = m0Var3;
        p3Var.b = aVar2;
        p3Var.c = a2;
        p3Var.d = dVar;
        p3Var.e = aVar;
        p3Var.f = a2;
        p3Var.h = a2;
        jVar.f = n5.a.a(new a0(dVar2, p3Var, new n(aVar, a2, dVar, a2), 29));
        return jVar;
    }

    @Override // r2.k
    public l d(j2.f fVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new oa.d(18).d(fVar);
        }
        int h = v0.h(((x) fVar.c).s);
        e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l0.I(h));
        androidx.activity.o oVar = new androidx.activity.o(new r2.b(h, 0), new r2.b(h, 1));
        oVar.b = true;
        return oVar.d(fVar);
    }

    public i f() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), zs.Q1);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List m10 = bd.i.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        Iterator it = m10.iterator();
        i iVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                i iVar2 = (i) newInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (iVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    public b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
    }
}
