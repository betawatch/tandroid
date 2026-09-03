package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k extends c6.a {
    public static final Parcelable.Creator<k> CREATOR = new b9.e(12);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final h[] h;
    public final String n;
    public final l r;

    public k(String str, String str2, boolean z4, int i10, boolean z10, String str3, h[] hVarArr, String str4, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = z4;
        this.d = i10;
        this.e = z10;
        this.f = str3;
        this.h = hVarArr;
        this.n = str4;
        this.r = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && b6.m.l(this.a, kVar.a) && b6.m.l(this.b, kVar.b) && b6.m.l(this.f, kVar.f) && b6.m.l(this.n, kVar.n) && b6.m.l(this.r, kVar.r) && Arrays.equals(this.h, kVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.a);
        g5.l(parcel, 2, this.b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        g5.l(parcel, 6, this.f);
        g5.o(parcel, 7, this.h, i10);
        g5.l(parcel, 11, this.n);
        g5.k(parcel, 12, this.r, i10);
        g5.r(parcel, q10);
    }
}
