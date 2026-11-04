package c9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class x extends p implements y {
    @Override // c9.p
    public final boolean a(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) s.a(parcel);
            s.b(parcel);
            e(bundle);
            return true;
        }
        if (i3 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) s.a(parcel);
            s.b(parcel);
            c(bundle2);
            return true;
        }
        if (i3 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) s.a(parcel);
            s.b(parcel);
            d(bundle3);
            return true;
        }
        if (i3 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) s.a(parcel);
        s.b(parcel);
        b(bundle4);
        return true;
    }
}
