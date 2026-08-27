package c7;

import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class z extends b7.a implements a0 {
    public z() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
    }

    @Override // b7.a
    public final boolean I0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        x xVar = (x) e.a(parcel, x.CREATOR);
        e.b(parcel);
        Z(xVar);
        return true;
    }
}
