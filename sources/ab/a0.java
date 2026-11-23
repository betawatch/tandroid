package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new w.a(9);
    public final Bundle a;
    public a0.f b;

    public a0(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.b(parcel, 2, this.a);
        bc.s(parcel, r10);
    }
}
