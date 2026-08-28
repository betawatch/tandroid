package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new c.c(13);
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public l(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = iArr;
        this.f = iArr2;
    }

    @Override // e4.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.b == lVar.b && this.c == lVar.c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f, lVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i9 = f0.a;
        this.e = createIntArray;
        this.f = parcel.createIntArray();
    }
}
