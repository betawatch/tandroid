// default package

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ebd extends u3d {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebd(byte b) {
        super("com.google.android.gms.cast.internal.IBundleCallback", (byte) 4);
        this.b = b;
        switch (b) {
            case 1:
                super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", (byte) 4);
                break;
            default:
                break;
        }
    }

    public abstract void T(xr xrVar, String str, String str2, boolean z);

    public abstract void U(Bundle bundle);

    public abstract void V(int i);

    public abstract void W(int i);

    public abstract void X(int i);

    public abstract void Y(t9d t9dVar);

    public abstract void Z(int i);

    public void a0(String str, byte[] bArr) {
        rjd.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    public abstract void c0(fad fadVar);

    @Override // u3d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (this.b) {
            case 0:
                if (i == 1) {
                    Bundle bundle = (Bundle) ald.a(parcel, Bundle.CREATOR);
                    ald.b(parcel);
                    U(bundle);
                    break;
                }
                break;
            default:
                switch (i) {
                    case 1:
                        int readInt = parcel.readInt();
                        ald.b(parcel);
                        d0(readInt);
                        break;
                    case 2:
                        xr xrVar = (xr) ald.a(parcel, xr.CREATOR);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        boolean z = parcel.readInt() != 0;
                        ald.b(parcel);
                        T(xrVar, readString, readString2, z);
                        break;
                    case 3:
                        int readInt2 = parcel.readInt();
                        ald.b(parcel);
                        V(readInt2);
                        break;
                    case 4:
                        parcel.readString();
                        parcel.readDouble();
                        int i2 = ald.a;
                        parcel.readInt();
                        ald.b(parcel);
                        g0();
                        break;
                    case 5:
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        ald.b(parcel);
                        i0(readString3, readString4);
                        break;
                    case 6:
                        String readString5 = parcel.readString();
                        byte[] createByteArray = parcel.createByteArray();
                        ald.b(parcel);
                        a0(readString5, createByteArray);
                        break;
                    case 7:
                        int readInt3 = parcel.readInt();
                        ald.b(parcel);
                        X(readInt3);
                        break;
                    case 8:
                        int readInt4 = parcel.readInt();
                        ald.b(parcel);
                        Z(readInt4);
                        break;
                    case 9:
                        int readInt5 = parcel.readInt();
                        ald.b(parcel);
                        W(readInt5);
                        break;
                    case 10:
                        parcel.readString();
                        long readLong = parcel.readLong();
                        int readInt6 = parcel.readInt();
                        ald.b(parcel);
                        f0(readInt6, readLong);
                        break;
                    case 11:
                        parcel.readString();
                        long readLong2 = parcel.readLong();
                        ald.b(parcel);
                        e0(readLong2);
                        break;
                    case 12:
                        t9d t9dVar = (t9d) ald.a(parcel, t9d.CREATOR);
                        ald.b(parcel);
                        Y(t9dVar);
                        break;
                    case 13:
                        fad fadVar = (fad) ald.a(parcel, fad.CREATOR);
                        ald.b(parcel);
                        c0(fadVar);
                        break;
                    case 14:
                        int readInt7 = parcel.readInt();
                        ald.b(parcel);
                        b0(readInt7);
                        break;
                    case 15:
                        int readInt8 = parcel.readInt();
                        ald.b(parcel);
                        h0(readInt8);
                        break;
                }
                break;
        }
        return true;
    }

    public abstract void d0(int i);

    public abstract void e0(long j);

    public abstract void f0(int i, long j);

    public void g0() {
        rjd.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    public abstract void i0(String str, String str2);

    public void b0(int i) {
    }

    public void h0(int i) {
    }
}
