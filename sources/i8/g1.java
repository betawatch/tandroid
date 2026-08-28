package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g1 extends y5.a {
    public static final Parcelable.Creator<g1> CREATOR = new p0(12);
    public final boolean a;
    public final List b;

    public g1(ArrayList arrayList, boolean z10) {
        this.a = z10;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        List list;
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.a == g1Var.a && ((list = this.b) == (obj2 = g1Var.b) || (list != null && list.equals(obj2)))) {
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        p8.n(parcel, 2, this.b);
        p8.r(parcel, q10);
    }
}
