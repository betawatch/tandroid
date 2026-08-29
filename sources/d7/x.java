package d7;

import android.os.Parcel;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class x extends c7.a implements y {
    public x() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 4);
    }

    @Override // c7.a
    public final boolean I0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        v vVar = (v) d.a(parcel, v.CREATOR);
        d.b(parcel);
        g0(vVar);
        return true;
    }
}
