package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class x extends p6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w a;
    public final w b;

    public x(w wVar, w wVar2) {
        this.a = wVar;
        this.b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h6.a.d(this.a, xVar.a) && h6.a.d(this.b, xVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.a, i10);
        df.k(parcel, 3, this.b, i10);
        df.r(parcel, q5);
    }
}
