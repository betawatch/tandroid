package n4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.g;
import l4.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements Comparable, Parcelable, g {
    public static final Parcelable.Creator<b> CREATOR = new j(13);
    public static final String d;
    public static final String e;
    public static final String f;
    public final int a;
    public final int b;
    public final int c;

    static {
        int i10 = d0.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public b(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i10 = this.a - bVar.a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.b - bVar.b;
        return i11 == 0 ? this.c - bVar.c : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public b(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
