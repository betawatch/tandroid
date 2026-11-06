package d9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class x extends p implements y {
    @Override // d9.p
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) s.a(parcel);
            s.b(parcel);
            e(bundle);
            return true;
        }
        if (i7 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) s.a(parcel);
            s.b(parcel);
            c(bundle2);
            return true;
        }
        if (i7 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) s.a(parcel);
            s.b(parcel);
            d(bundle3);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) s.a(parcel);
        s.b(parcel);
        b(bundle4);
        return true;
    }
}
