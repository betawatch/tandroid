package d9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
