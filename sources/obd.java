// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class obd extends b4 {
    public static final Parcelable.Creator<obd> CREATOR = new lbd((byte) 3);
    public final float a;
    public final float b;
    public final float c;

    public obd(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obd)) {
            return false;
        }
        obd obdVar = (obd) obj;
        return this.a == obdVar.a && this.b == obdVar.b && this.c == obdVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeFloat(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        mve.s(parcel, r);
    }
}
