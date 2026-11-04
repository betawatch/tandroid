package g6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import f6.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends q6.a {
    public final String a;
    public final String b;
    public final k c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final i6.b h = new i6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new c0(2);

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
                Parcel R0 = kVar.R0(kVar.P0(), 2);
                z6.a M0 = z6.b.M0(R0.readStrongBinder());
                R0.recycle();
                if (z6.b.N0(M0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        k kVar = this.c;
        j8.a.g(parcel, 4, kVar == null ? null : kVar.b);
        j8.a.l(parcel, 5, this.d, i3);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
