package f7;

import android.os.Parcel;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
