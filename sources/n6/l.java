package n6;

import a8.q;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import q6.n0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class l extends q implements n0 {
    public final int b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 9);
        q6.m.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] N0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // a8.q
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            a7.b bVar = new a7.b(M0());
            parcel2.writeNoException();
            p7.g.b(parcel2, bVar);
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public abstract byte[] M0();

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            try {
                n0 n0Var = (n0) obj;
                if (((l) n0Var).b == this.b) {
                    return Arrays.equals(M0(), (byte[]) a7.b.N0(new a7.b(((l) n0Var).M0())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
