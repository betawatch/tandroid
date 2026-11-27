// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jd1 extends c4 {
    public final String a;
    public final String b;
    public final vfd c;
    public final po7 d;
    public final boolean e;
    public final boolean f;
    public static final he6 h = new he6("CastMediaOptions", null);
    public static final Parcelable.Creator<jd1> CREATOR = new s5d((byte) 28);

    public jd1(String str, String str2, IBinder iBinder, po7 po7Var, boolean z, boolean z2) {
        vfd vfdVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            vfdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            vfdVar = queryLocalInterface instanceof vfd ? (vfd) queryLocalInterface : new vfd(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 3);
        }
        this.c = vfdVar;
        this.d = po7Var;
        this.e = z;
        this.f = z2;
    }

    public final void b() {
        vfd vfdVar = this.c;
        if (vfdVar != null) {
            try {
                Parcel T = vfdVar.T(vfdVar.R(), 2);
                al5 T2 = br7.T(T.readStrongBinder());
                T.recycle();
                if (br7.U(T2) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", vfd.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        vfd vfdVar = this.c;
        bye.f(parcel, 4, vfdVar == null ? null : vfdVar.b);
        bye.k(parcel, 5, this.d, i);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        bye.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bye.s(parcel, r);
    }
}
