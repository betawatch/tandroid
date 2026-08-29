package b4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import i7.q7;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final b[] a;
    public final long b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(c cVar) {
        if (cVar != null) {
            b[] bVarArr = cVar.a;
            if (bVarArr.length != 0) {
                int i10 = d0.a;
                b[] bVarArr2 = this.a;
                Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                return new c(this.b, (b[]) copyOf);
            }
        }
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.a, cVar.a) && this.b == cVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q7.a(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.a));
        long j10 = this.b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b[] bVarArr = this.a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.b);
    }

    public c(long j10, b... bVarArr) {
        this.b = j10;
        this.a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }
}
