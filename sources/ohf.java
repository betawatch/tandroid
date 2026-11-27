// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ohf extends c4 {
    public static final Parcelable.Creator<ohf> CREATOR = new t4f((byte) 25);
    public final ArrayList a;

    public ohf(ArrayList arrayList) {
        xve.h(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ohf)) {
            return false;
        }
        ArrayList arrayList = ((ohf) obj).a;
        ArrayList arrayList2 = this.a;
        return arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
