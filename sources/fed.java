// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fed extends c4 {
    public static final Parcelable.Creator<fed> CREATOR = new ced((byte) 3);
    public final float a;
    public final float b;
    public final float c;

    public fed(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fed)) {
            return false;
        }
        fed fedVar = (fed) obj;
        return this.a == fedVar.a && this.b == fedVar.b && this.c == fedVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeFloat(this.a);
        bye.q(parcel, 3, 4);
        parcel.writeFloat(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeFloat(this.c);
        bye.s(parcel, r);
    }
}
