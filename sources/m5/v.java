package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v extends z5.a {
    public final int a;
    public final int b;
    public final int c;
    public static final r5.b d = new r5.b("VideoInfo", null);
    public static final Parcelable.Creator<v> CREATOR = new w(21);

    public v(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.b == vVar.b && this.a == vVar.a && this.c == vVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        r8.r(parcel, q6);
    }
}
