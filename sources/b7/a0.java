package b7;

import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a0 extends a7.a implements b0 {
    public a0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 1);
    }

    @Override // a7.a
    public final boolean I0(Parcel parcel, int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            zze();
            return true;
        }
        y yVar = (y) f.a(parcel, y.CREATOR);
        f.b(parcel);
        x0(yVar);
        return true;
    }
}
