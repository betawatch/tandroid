// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n9f extends c4 implements ie9 {
    public static final Parcelable.Creator<n9f> CREATOR = new t4f(12);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // ie9
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.p(parcel, 2, this.b);
        bye.m(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
