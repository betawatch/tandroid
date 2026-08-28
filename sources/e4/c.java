package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new c.c(8);
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final j[] h;

    public c(String str, int i9, int i10, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i9;
        this.d = i10;
        this.e = j10;
        this.f = j11;
        this.h = jVarArr;
    }

    @Override // e4.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && f0.a(this.b, cVar.b) && Arrays.equals(this.h, cVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i9 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        j[] jVarArr = this.h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i9 = f0.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.h[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
