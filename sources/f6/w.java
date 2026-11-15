package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new v(2);
    public final float a;
    public final float b;
    public final float c;

    public w(float f10, float f11, float f12) {
        this.a = f10;
        this.b = f11;
        this.c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a == wVar.a && this.b == wVar.b && this.c == wVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeFloat(this.a);
        yb.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        yb.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        yb.s(parcel, r10);
    }
}
