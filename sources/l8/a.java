package l8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.g;
import java.util.Arrays;
import n6.l;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g(20);
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.k(this.a, aVar.a) && l.k(this.b, aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.a);
        h0.l(parcel, 2, this.b);
        h0.r(parcel, q6);
    }
}
