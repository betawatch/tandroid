// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jcd extends b4 {
    public static final Parcelable.Creator<jcd> CREATOR = new lbd((byte) 7);
    public final String a;

    public jcd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jcd) {
            return fse.a(this.a, ((jcd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
