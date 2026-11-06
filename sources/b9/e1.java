package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e1 extends r6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean a;
    public final List b;

    public e1(ArrayList arrayList, boolean z9) {
        this.a = z9;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        List list;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.a == e1Var.a && ((list = this.b) == (obj2 = e1Var.b) || (list != null && list.equals(obj2)))) {
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
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        wb.n(parcel, 2, this.b);
        wb.s(parcel, r10);
    }
}
