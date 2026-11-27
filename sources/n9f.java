// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
