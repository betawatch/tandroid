// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class idd extends c4 {
    public static final Parcelable.Creator<idd> CREATOR = new m9d(26);
    public final String a;
    public final ArrayList b;

    public idd(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        xve.h(str);
        xve.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || idd.class != obj.getClass()) {
            return false;
        }
        idd iddVar = (idd) obj;
        String str = iddVar.a;
        String str2 = this.a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        ArrayList arrayList = iddVar.b;
        ArrayList arrayList2 = this.b;
        return arrayList2 != null ? arrayList2.equals(arrayList) : arrayList == null;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        ArrayList arrayList = this.b;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return c00.j("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.p(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
