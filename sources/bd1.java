// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bd1 extends b4 {
    public final String a;
    public final String b;
    public final cbd c;
    public final ql7 d;
    public final boolean e;
    public final boolean f;
    public static final dc6 h = new dc6("CastMediaOptions", null);
    public static final Parcelable.Creator<bd1> CREATOR = new b1d((byte) 28);

    public bd1(String str, String str2, IBinder iBinder, ql7 ql7Var, boolean z, boolean z2) {
        cbd cbdVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            cbdVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            cbdVar = queryLocalInterface instanceof cbd ? (cbd) queryLocalInterface : new cbd(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", (byte) 3);
        }
        this.c = cbdVar;
        this.d = ql7Var;
        this.e = z;
        this.f = z2;
    }

    public final void b() {
        cbd cbdVar = this.c;
        if (cbdVar != null) {
            try {
                Parcel T = cbdVar.T(cbdVar.R(), 2);
                yi5 T2 = bo7.T(T.readStrongBinder());
                T.recycle();
                if (bo7.U(T2) != null) {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", cbd.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        cbd cbdVar = this.c;
        jte.f(parcel, 4, cbdVar == null ? null : cbdVar.b);
        jte.k(parcel, 5, this.d, i);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jte.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        jte.s(parcel, r);
    }
}
