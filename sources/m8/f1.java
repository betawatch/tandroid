package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f1 extends c6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean a;
    public final List b;

    public f1(ArrayList arrayList, boolean z4) {
        this.a = z4;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        List list;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.a == f1Var.a && ((list = this.b) == (obj2 = f1Var.b) || (list != null && list.equals(obj2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.a + ", watchfaceCategories=" + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f5.n(parcel, 2, this.b);
        f5.r(parcel, q10);
    }
}
