package h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import c8.xb;
import f7.t0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z9, boolean z10) {
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
        this.e = z9;
        this.f = z10;
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
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        k kVar = this.c;
        xb.f(parcel, 4, kVar == null ? null : kVar.b);
        xb.k(parcel, 5, this.d, i7);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        xb.s(parcel, r10);
    }
}
