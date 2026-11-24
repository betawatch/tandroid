// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b64 extends b4 {
    public static final Parcelable.Creator<b64> CREATOR = new lbd((byte) 12);
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b64) {
            b64 b64Var = (b64) obj;
            if (fse.a(this.a, b64Var.a) && fse.a(this.b, b64Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.l(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
