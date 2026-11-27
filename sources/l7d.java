// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l7d extends c4 implements ie9 {
    public static final Parcelable.Creator<l7d> CREATOR = new s5d((byte) 10);
    public final ArrayList a;
    public final String b;

    public l7d(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // ie9
    public final Status a() {
        return this.b != null ? Status.e : Status.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.n(parcel, 1, this.a);
        bye.l(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
