package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c8.yb;
import f7.t0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public final String a;
    public final String b;
    public final k c;
    public final f d;
    public final boolean e;
    public final boolean f;
    public static final j6.b h = new j6.b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new t0(17);

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
                Parcel r12 = kVar.r1(kVar.p1(), 2);
                a7.a m12 = a7.b.m1(r12.readStrongBinder());
                r12.recycle();
                if (a7.b.n1(m12) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e10) {
                h.a(e10, "Unable to call %s on %s.", "getWrappedClientObject", k.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.l(parcel, 3, this.b);
        k kVar = this.c;
        yb.f(parcel, 4, kVar == null ? null : kVar.b);
        yb.k(parcel, 5, this.d, i7);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        yb.s(parcel, r10);
    }
}
