package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String a;
    public final List b;

    public b(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        q6.m.g(str);
        q6.m.g(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.b;
        String str = bVar.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.b;
        return list2 == null ? list == null : list2.equals(list);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return r.b.l("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.a);
        yb.p(parcel, 3, this.b);
        yb.s(parcel, r10);
    }
}
