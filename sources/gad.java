// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gad extends c4 {
    public static final Parcelable.Creator<gad> CREATOR = new m9d((byte) 11);
    public final long a;

    public gad(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gad) && this.a == ((gad) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        bye.s(parcel, r);
    }
}
