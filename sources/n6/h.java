package n6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import c8.bb;
import java.util.Arrays;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h {
    public static h b;
    public final Context a;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public static h a(Context context) {
        q6.m.g(context);
        synchronized (h.class) {
            try {
                if (b == null) {
                    o.a(context);
                    b = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(PackageInfo packageInfo, boolean z9) {
        p7.f fVar;
        p7.f fVar2;
        int i7;
        if (packageInfo != null) {
            if (z9 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z9 = (applicationInfo == null || (applicationInfo.flags & qs.N1) == 0) ? false : true;
            }
            try {
                fVar = z9 ? n.c : n.b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        p7.b bVar = p7.e.b;
                        Object[] objArr = {bArr};
                        bb.a(1, objArr);
                        fVar2 = new p7.f(1, objArr);
                    } else {
                        p7.b bVar2 = p7.e.b;
                        fVar2 = p7.f.e;
                    }
                } else {
                    if (i10 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                        p7.b bVar3 = p7.e.b;
                        Object[] objArr2 = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            byte[] byteArray = signingCertificateHistory[i11].toByteArray();
                            byteArray.getClass();
                            int length2 = objArr2.length;
                            int i13 = i12 + 1;
                            if (i13 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i13 <= length2) {
                                i7 = length2;
                            } else {
                                i7 = (length2 >> 1) + length2 + 1;
                                if (i7 < i13) {
                                    int highestOneBit = Integer.highestOneBit(i12);
                                    i7 = highestOneBit + highestOneBit;
                                }
                                if (i7 < 0) {
                                    i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                            }
                            if (i7 > length2) {
                                objArr2 = Arrays.copyOf(objArr2, i7);
                            }
                            objArr2[i12] = byteArray;
                            i11++;
                            i12 = i13;
                        }
                        fVar2 = i12 == 0 ? p7.f.e : new p7.f(i12, objArr2);
                    }
                    p7.b bVar4 = p7.e.b;
                    fVar2 = p7.f.e;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z9 ? c(packageInfo, n.a) : c(packageInfo, n.a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            p7.e l10 = fVar2.l();
            int size = l10.size();
            int i14 = 0;
            while (i14 < size) {
                byte[] bArr2 = (byte[]) l10.get(i14);
                p7.b listIterator = fVar.listIterator(0);
                do {
                    int i15 = i14 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static l c(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < lVarArr.length; i7++) {
                if (lVarArr[i7].equals(mVar)) {
                    return lVarArr[i7];
                }
            }
        }
        return null;
    }
}
