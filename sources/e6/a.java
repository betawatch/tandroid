package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c7.r0;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                Parcel P0 = lVar.P0(lVar.N0(), 2);
                x6.a K0 = x6.b.K0(P0.readStrongBinder());
                P0.recycle();
                if (x6.b.L0(K0) == null) {
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
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.a);
        d0.l(parcel, 3, this.b);
        l lVar = this.c;
        d0.f(parcel, 4, lVar == null ? null : lVar.b);
        d0.k(parcel, 5, this.d, i10);
        d0.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        d0.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        d0.r(parcel, q6);
    }
}
