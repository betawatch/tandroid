package f6;

import a8.df;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import d7.r0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends p6.a {
    public final String a;
    public final String b;
    public final l c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final h6.b h = new h6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new r0(29);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        l lVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
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
                y6.a K0 = y6.b.K0(P0.readStrongBinder());
                P0.recycle();
                if (y6.b.L0(K0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                h.a(e, "Unable to call %s on %s.", "getWrappedClientObject", l.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        l lVar = this.c;
        df.f(parcel, 4, lVar == null ? null : lVar.b);
        df.k(parcel, 5, this.d, i10);
        df.s(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        df.r(parcel, q5);
    }
}
