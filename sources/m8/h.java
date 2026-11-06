package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class h extends r6.a {
    public static final Parcelable.Creator<h> CREATOR = new m6.e(8);
    public final int a;
    public final Float b;

    public h(int i7, Float f10) {
        boolean z9 = true;
        if (i7 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z9 = false;
        }
        m.a("Invalid PatternItem: type=" + i7 + " length=" + f10, z9);
        this.a = i7;
        this.b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && m.k(this.b, hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.a + " length=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        wb.e(parcel, 3, this.b);
        wb.s(parcel, r10);
    }
}
