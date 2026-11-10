package d9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class c0 extends p implements d0 {
    @Override // d9.p
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) s.a(parcel);
        s.b(parcel);
        b(bundle);
        return true;
    }
}
