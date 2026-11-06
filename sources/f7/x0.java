package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class x0 extends r6.a {
    public static final Parcelable.Creator<x0> CREATOR = new t0(10);
    public final List a;

    public x0(ArrayList arrayList) {
        q6.m.g(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        List list = ((x0) obj).a;
        List list2 = this.a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, this.a);
        xb.s(parcel, r10);
    }
}
