package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import q6.m;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new m6.e(6);
    public final String a;

    public e(String str) {
        m.i(str, "json must not be null");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.s(parcel, r10);
    }
}
