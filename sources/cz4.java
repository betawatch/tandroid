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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cz4 {
    public static cz4 b;
    public final Context a;

    public cz4(Context context) {
        this.a = context.getApplicationContext();
    }

    public static cz4 a(Context context) {
        cz4 cz4Var;
        fre.h(context);
        synchronized (cz4.class) {
            cz4Var = b;
            if (cz4Var == null) {
                g5f.a(context);
                cz4Var = new cz4(context);
                b = cz4Var;
            }
        }
        return cz4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(PackageInfo packageInfo, boolean z) {
        q7d q7dVar;
        q7d q7dVar2;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & kk7.M1) == 0) ? false : true;
            }
            try {
                q7dVar = z ? w2f.c : w2f.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        h6d h6dVar = a7d.n;
                        Object[] objArr = {bArr};
                        eze.b(1, objArr);
                        q7dVar2 = new q7d(1, objArr);
                    } else {
                        h6d h6dVar2 = a7d.n;
                        q7dVar2 = q7d.w;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        h6d h6dVar3 = a7d.n;
                        q7dVar2 = q7d.w;
                    } else {
                        h6d h6dVar4 = a7d.n;
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
                        q7dVar2 = i4 == 0 ? q7d.w : new q7d(i4, objArr2);
                    }
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? c(packageInfo, w2f.a) : c(packageInfo, w2f.a[0])) != null) {
                }
            }
            if (q7dVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            a7d y = q7dVar2.y();
            int size = y.size();
            int i6 = 0;
            while (i6 < size) {
                byte[] bArr2 = (byte[]) y.get(i6);
                h6d listIterator = q7dVar.listIterator(0);
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

    public static wme c(PackageInfo packageInfo, wme... wmeVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            dse dseVar = new dse(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < wmeVarArr.length; i++) {
                if (wmeVarArr[i].equals(dseVar)) {
                    return wmeVarArr[i];
                }
            }
        }
        return null;
    }
}
