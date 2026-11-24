// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class asb extends b4 {
    public static final Parcelable.Creator<asb> CREATOR = new lbd(9);
    public final yrb a;
    public final String b;

    static {
        new asb("supported", null);
        new asb("not-supported", null);
    }

    public asb(String str, String str2) {
        ite.h(str);
        try {
            this.a = yrb.a(str);
            this.b = str2;
        } catch (zrb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof asb)) {
            return false;
        }
        asb asbVar = (asb) obj;
        return x1f.a(this.a, asbVar.a) && x1f.a(this.b, asbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a.a);
        mve.l(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
