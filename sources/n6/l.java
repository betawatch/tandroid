package n6;

import a8.q;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import q6.n0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class l extends q implements n0 {
    public final int b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 9);
        q6.m.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] n1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            try {
                n0 n0Var = (n0) obj;
                if (((l) n0Var).b == this.b) {
                    return Arrays.equals(m1(), (byte[]) a7.b.n1(new a7.b(((l) n0Var).m1())));
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

    @Override // a8.q
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 == 1) {
            a7.b bVar = new a7.b(m1());
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

    public abstract byte[] m1();
}
