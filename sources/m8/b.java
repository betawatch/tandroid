package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends c6.a implements l8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String a;
    public final List b;

    public b(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        b6.m.h(str);
        b6.m.h(arrayList);
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
        return yh.l("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.p(parcel, 3, this.b);
        g5.r(parcel, q10);
    }
}
