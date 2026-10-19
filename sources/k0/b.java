package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.activity.o;
import androidx.biometric.e;
import b2.t;
import b2.v0;
import b2.w;
import e2.m0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import qb.c;
import r2.k;
import r2.l;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class b implements k {
    public final Context a;

    public /* synthetic */ b(Context context) {
        this.a = context;
    }

    public static FingerprintManager b(Context context) {
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
    public l J(com.google.firebase.messaging.l lVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new sb.a(20).J(lVar);
        }
        int h = v0.h(((w) lVar.c).s);
        e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
        r2.b bVar = new r2.b(h, 0);
        r2.b bVar2 = new r2.b(h, 1);
        o oVar = new o();
        oVar.b = bVar;
        oVar.c = bVar2;
        oVar.a = true;
        oVar.a = true;
        return oVar.J(lVar);
    }

    public void a(e eVar, t tVar, c cVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        tVar.c = cancellationSignal3;
                        if (tVar.b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) tVar.c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager b10 = b(this.a);
        if (b10 != null) {
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
            b10.authenticate(cryptoObject, cancellationSignal, 0, new a(cVar), null);
        }
    }
}
