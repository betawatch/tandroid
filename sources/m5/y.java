package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y extends z5.a {
    public static final Parcelable.Creator<y> CREATOR = new w(3);
    public final x a;
    public final x b;

    public y(x xVar, x xVar2) {
        this.a = xVar;
        this.b = xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return r5.a.d(this.a, yVar.a) && r5.a.d(this.b, yVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.k(parcel, 3, this.b, i10);
        r8.r(parcel, q6);
    }
}
