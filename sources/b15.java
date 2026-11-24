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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b15 {
    public static b15 b;
    public final Context a;

    public b15(Context context) {
        this.a = context.getApplicationContext();
    }

    public static b15 a(Context context) {
        b15 b15Var;
        ite.h(context);
        synchronized (b15.class) {
            b15Var = b;
            if (b15Var == null) {
                i7f.a(context);
                b15Var = new b15(context);
                b = b15Var;
            }
        }
        return b15Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(PackageInfo packageInfo, boolean z) {
        s9d s9dVar;
        s9d s9dVar2;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & nm7.M1) == 0) ? false : true;
            }
            try {
                s9dVar = z ? y4f.c : y4f.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        j8d j8dVar = c9d.n;
                        Object[] objArr = {bArr};
                        g1f.b(1, objArr);
                        s9dVar2 = new s9d(1, objArr);
                    } else {
                        j8d j8dVar2 = c9d.n;
                        s9dVar2 = s9d.w;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        j8d j8dVar3 = c9d.n;
                        s9dVar2 = s9d.w;
                    } else {
                        j8d j8dVar4 = c9d.n;
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
                        s9dVar2 = i4 == 0 ? s9d.w : new s9d(i4, objArr2);
                    }
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? c(packageInfo, y4f.a) : c(packageInfo, y4f.a[0])) != null) {
                }
            }
            if (s9dVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            c9d y = s9dVar2.y();
            int size = y.size();
            int i6 = 0;
            while (i6 < size) {
                byte[] bArr2 = (byte[]) y.get(i6);
                j8d listIterator = s9dVar.listIterator(0);
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

    public static zoe c(PackageInfo packageInfo, zoe... zoeVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            gue gueVar = new gue(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zoeVarArr.length; i++) {
                if (zoeVarArr[i].equals(gueVar)) {
                    return zoeVarArr[i];
                }
            }
        }
        return null;
    }
}
