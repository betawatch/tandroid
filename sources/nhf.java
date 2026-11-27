// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nhf extends c4 {
    public static final Parcelable.Creator<nhf> CREATOR = new t4f((byte) 24);
    public final boolean a;
    public final ArrayList b;

    public nhf(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nhf.class != obj.getClass()) {
            return false;
        }
        nhf nhfVar = (nhf) obj;
        if (this.a != nhfVar.a) {
            return false;
        }
        Object obj2 = nhfVar.b;
        ArrayList arrayList = this.b;
        if (arrayList != obj2) {
            return arrayList != null && arrayList.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.n(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
