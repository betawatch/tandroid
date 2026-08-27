package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y0 extends z5.a {
    public static final Parcelable.Creator<y0> CREATOR = new w0(2);
    public final List a;

    public y0(ArrayList arrayList) {
        y5.l.h(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        List list = ((y0) obj).a;
        List list2 = this.a;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.p(parcel, 1, this.a);
        r8.r(parcel, q6);
    }
}
