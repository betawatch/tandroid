package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t {
    public final Context a;

    public /* synthetic */ t(Context context, boolean z10) {
        this.a = context;
    }

    public static FingerprintManager b(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i7 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public void a(h6.m mVar, ca.i iVar, ob.c cVar) {
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
        FingerprintManager b10 = b(this.a);
        if (b10 != null) {
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
            b10.authenticate(cryptoObject, cancellationSignal, 0, new k0.a(cVar, 0), null);
        }
    }

    public PackageInfo c(int i7, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i7);
    }

    public t(Context context) {
        this.a = context.getApplicationContext();
    }
}
