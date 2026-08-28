package o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import g7.p8;
import m6.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends y5.a {
    public final String a;
    public final String b;
    public final k c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final q5.b h = new q5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(28);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k kVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
        }
        this.c = kVar;
        this.d = fVar;
        this.e = z10;
        this.f = z11;
    }

    public final void b() {
        k kVar = this.c;
        if (kVar != null) {
            try {
                Parcel O0 = kVar.O0(kVar.M0(), 2);
                h6.a J0 = h6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (h6.b.K0(J0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        k kVar = this.c;
        p8.f(parcel, 4, kVar == null ? null : kVar.b);
        p8.k(parcel, 5, this.d, i9);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        p8.r(parcel, q10);
    }
}
