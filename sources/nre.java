// default package

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class nre extends u3d implements IInterface {
    public final int b;

    public nre(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 6);
        xve.b(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] U(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            hz6.e(e);
            return null;
        }
    }

    public abstract byte[] T();

    @Override // u3d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            br7 br7Var = new br7(T());
            parcel2.writeNoException();
            dld.b(parcel2, br7Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nre) {
            try {
                nre nreVar = (nre) obj;
                if (nreVar.b == this.b) {
                    return Arrays.equals(T(), (byte[]) br7.U(new br7(nreVar.T())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
