package androidx.biometric;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import b8.jc;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.ft;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t {
    public final Context a;

    public t(Context context, int i3) {
        switch (i3) {
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

    public static FingerprintManager c(Context context) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i3 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public void a(android.support.v4.media.session.a0 a0Var, ba.i iVar, bb.c cVar) {
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
        FingerprintManager c2 = c(this.a);
        if (c2 != null) {
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
            c2.authenticate(cryptoObject, cancellationSignal, 0, new k0.a(cVar, 0), null);
        }
    }

    public Object b(Context context, v0.e eVar, ft ftVar) {
        wd.m mVar = new wd.m(1, jc.b(ftVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal, 0));
        ge.b bVar = new ge.b(mVar);
        c3.b bVar2 = new c3.b(3);
        kotlin.jvm.internal.j.e(context, "context");
        v0.i c2 = androidx.emoji2.text.n.c(new androidx.emoji2.text.n(this.a, 4), eVar);
        if (c2 == null) {
            bVar.a(new w0.c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.a(new w0.c(3, "createCredential is not supported on this device"));
        } else {
            c2.onCreateCredential(context, eVar, cancellationSignal, bVar2, bVar);
        }
        Object r5 = mVar.r();
        gd.a aVar = gd.a.a;
        return r5;
    }
}
