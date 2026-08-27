package o5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import h7.r8;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends z5.a {
    public final String a;
    public final String b;
    public final k c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final r5.b h = new r5.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new w0(6);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        k kVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
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
                i6.a J0 = i6.b.J0(O0.readStrongBinder());
                O0.recycle();
                if (i6.b.K0(J0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e9) {
                h.a(e9, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        k kVar = this.c;
        r8.f(parcel, 4, kVar == null ? null : kVar.b);
        r8.k(parcel, 5, this.d, i10);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        r8.r(parcel, q6);
    }
}
