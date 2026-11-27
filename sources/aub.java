// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class aub extends c4 {
    public static final Parcelable.Creator<aub> CREATOR = new ced(9);
    public final ytb a;
    public final String b;

    static {
        new aub("supported", null);
        new aub("not-supported", null);
    }

    public aub(String str, String str2) {
        xve.h(str);
        try {
            this.a = ytb.a(str);
            this.b = str2;
        } catch (ztb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aub)) {
            return false;
        }
        aub aubVar = (aub) obj;
        return y4f.a(this.a, aubVar.a) && y4f.a(this.b, aubVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a.a);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
