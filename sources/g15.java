// default package

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g15 {
    public static g15 b;
    public final Context a;

    public g15(Context context) {
        this.a = context.getApplicationContext();
    }

    public static g15 a(Context context) {
        g15 g15Var;
        xve.h(context);
        synchronized (g15.class) {
            g15Var = b;
            if (g15Var == null) {
                x9f.a(context);
                g15Var = new g15(context);
                b = g15Var;
            }
        }
        return g15Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(PackageInfo packageInfo, boolean z) {
        jcd jcdVar;
        jcd jcdVar2;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & jn7.M1) == 0) ? false : true;
            }
            try {
                jcdVar = z ? n7f.c : n7f.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        abd abdVar = tbd.n;
                        Object[] objArr = {bArr};
                        w3f.a(1, objArr);
                        jcdVar2 = new jcd(1, objArr);
                    } else {
                        abd abdVar2 = tbd.n;
                        jcdVar2 = jcd.w;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        abd abdVar3 = tbd.n;
                        jcdVar2 = jcd.w;
                    } else {
                        abd abdVar4 = tbd.n;
                        Object[] objArr2 = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray = signingCertificateHistory[i3].toByteArray();
                            byteArray.getClass();
                            int length2 = objArr2.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    i = Integer.highestOneBit(i4) << 1;
                                }
                                if (i < 0) {
                                    i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                            }
                            if (i > length2) {
                                objArr2 = Arrays.copyOf(objArr2, i);
                            }
                            objArr2[i4] = byteArray;
                            i3++;
                            i4 = i5;
                        }
                        jcdVar2 = i4 == 0 ? jcd.w : new jcd(i4, objArr2);
                    }
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? c(packageInfo, n7f.a) : c(packageInfo, n7f.a[0])) != null) {
                }
            }
            if (jcdVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            tbd y = jcdVar2.y();
            int size = y.size();
            int i6 = 0;
            while (i6 < size) {
                byte[] bArr2 = (byte[]) y.get(i6);
                abd listIterator = jcdVar.listIterator(0);
                do {
                    int i7 = i6 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static nre c(PackageInfo packageInfo, nre... nreVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            uwe uweVar = new uwe(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < nreVarArr.length; i++) {
                if (nreVarArr[i].equals(uweVar)) {
                    return nreVarArr[i];
                }
            }
        }
        return null;
    }
}
