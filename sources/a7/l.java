package a7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends z5.a {
    public static final Parcelable.Creator<l> CREATOR = new w.a(7);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final i[] h;
    public final String n;
    public final m r;

    public l(String str, String str2, boolean z10, int i10, boolean z11, String str3, i[] iVarArr, String str4, m mVar) {
        this.a = str;
        this.b = str2;
        this.c = z10;
        this.d = i10;
        this.e = z11;
        this.f = str3;
        this.h = iVarArr;
        this.n = str4;
        this.r = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.c == lVar.c && this.d == lVar.d && this.e == lVar.e && y5.l.l(this.a, lVar.a) && y5.l.l(this.b, lVar.b) && y5.l.l(this.f, lVar.f) && y5.l.l(this.n, lVar.n) && y5.l.l(this.r, lVar.r) && Arrays.equals(this.h, lVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.l(parcel, 2, this.b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        r8.l(parcel, 6, this.f);
        r8.o(parcel, 7, this.h, i10);
        r8.l(parcel, 11, this.n);
        r8.k(parcel, 12, this.r, i10);
        r8.r(parcel, q6);
    }
}
