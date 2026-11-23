package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new db.k(21);
    public final String a;

    public r0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return q6.m.l(this.a, ((r0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.a);
        bc.s(parcel, r10);
    }
}
