// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class o08 extends b4 {
    public static final Parcelable.Creator<o08> CREATOR = new sje(7);
    public final int a;
    public final Float b;

    public o08(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        ite.a("Invalid PatternItem: type=" + i + " length=" + f, z);
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o08)) {
            return false;
        }
        o08 o08Var = (o08) obj;
        return this.a == o08Var.a && fse.a(this.b, o08Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.e(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
