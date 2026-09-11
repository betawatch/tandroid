package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c7.r0;
import w7.e0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public final String a;
    public final String b;
    public final l c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final g6.b h = new g6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(29);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        l lVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
        }
        this.c = lVar;
        this.d = fVar;
        this.e = z10;
        this.f = z11;
    }

    public final void b() {
        l lVar = this.c;
        if (lVar != null) {
            try {
                Parcel Q0 = lVar.Q0(lVar.O0(), 2);
                x6.a L0 = x6.b.L0(Q0.readStrongBinder());
                Q0.recycle();
                if (x6.b.M0(L0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e7) {
                h.a(e7, "Unable to call %s on %s.", "getWrappedClientObject", l.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.l(parcel, 3, this.b);
        l lVar = this.c;
        e0.f(parcel, 4, lVar == null ? null : lVar.b);
        e0.k(parcel, 5, this.d, i10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        e0.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        e0.r(parcel, q6);
    }
}
