package a9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class a0 extends s implements b0 {
    @Override // a9.s
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) v.a(parcel);
            v.b(parcel);
            e(bundle);
            return true;
        }
        if (i10 == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) v.a(parcel);
            v.b(parcel);
            c(bundle2);
            return true;
        }
        if (i10 == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) v.a(parcel);
            v.b(parcel);
            d(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) v.a(parcel);
        v.b(parcel);
        b(bundle4);
        return true;
    }
}
