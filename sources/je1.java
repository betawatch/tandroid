// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class je1 extends b4 {
    public final String a;
    public final String b;
    public final edd c;
    public final tn7 d;
    public final boolean e;
    public final boolean f;
    public static final ce6 h = new ce6("CastMediaOptions", null);
    public static final Parcelable.Creator<je1> CREATOR = new d3d((byte) 28);

    public je1(String str, String str2, IBinder iBinder, tn7 tn7Var, boolean z, boolean z2) {
        edd eddVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            eddVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            eddVar = queryLocalInterface instanceof edd ? (edd) queryLocalInterface : new edd(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 3);
        }
        this.c = eddVar;
        this.d = tn7Var;
        this.e = z;
        this.f = z2;
    }

    public final void b() {
        edd eddVar = this.c;
        if (eddVar != null) {
            try {
                Parcel T = eddVar.T(eddVar.R(), 2);
                xk5 T2 = eq7.T(T.readStrongBinder());
                T.recycle();
                if (eq7.U(T2) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", edd.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        edd eddVar = this.c;
        mve.f(parcel, 4, eddVar == null ? null : eddVar.b);
        mve.k(parcel, 5, this.d, i);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        mve.s(parcel, r);
    }
}
