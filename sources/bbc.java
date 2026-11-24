// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bbc extends b4 {
    public final int a;
    public final int b;
    public final int c;
    public static final dc6 d = new dc6("VideoInfo", null);
    public static final Parcelable.Creator<bbc> CREATOR = new rpd((byte) 9);

    public bbc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbc)) {
            return false;
        }
        bbc bbcVar = (bbc) obj;
        return this.b == bbcVar.b && this.a == bbcVar.a && this.c == bbcVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
