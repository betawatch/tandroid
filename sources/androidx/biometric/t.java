package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import e2.s0;
import h2.l0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class t {
    public final Context a;

    public /* synthetic */ t(Context context, byte b10) {
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

    public t(Context context, int i7) {
        switch (i7) {
            case 2:
                context.getClass();
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }
}
