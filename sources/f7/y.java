package f7;

import android.os.Parcel;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class y extends a7.c implements z {
    public y() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 5);
    }

    @Override // a7.c
    public final boolean I0(Parcel parcel, int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            zze();
            return true;
        }
        w wVar = (w) e.a(parcel, w.CREATOR);
        e.b(parcel);
        V(wVar);
        return true;
    }
}
