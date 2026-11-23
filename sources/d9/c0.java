package d9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
