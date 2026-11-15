package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.p(parcel, 1, this.a);
        yb.s(parcel, r10);
    }
}
