package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends y5.a {
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeFloat(this.a);
        p8.s(parcel, 3, 4);
        parcel.writeFloat(this.b);
        p8.s(parcel, 4, 4);
        parcel.writeFloat(this.c);
        p8.r(parcel, q10);
    }
}
