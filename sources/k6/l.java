package k6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import n6.x;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class l extends b8.b implements x {
    public final int b;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 7);
        n6.l.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] M0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // b8.b
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            x6.b bVar = new x6.b(N0());
            parcel2.writeNoException();
            m7.a.c(parcel2, bVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public abstract byte[] N0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            try {
                x xVar = (x) obj;
                if (((l) xVar).b == this.b) {
                    return Arrays.equals(N0(), (byte[]) x6.b.N0(new x6.b(((l) xVar).N0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
