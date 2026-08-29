package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends a6.a {
    public static final Parcelable.Creator<k> CREATOR = new w.a(21);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final h[] h;
    public final String n;
    public final l r;

    public k(String str, String str2, boolean z10, int i10, boolean z11, String str3, h[] hVarArr, String str4, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = z10;
        this.d = i10;
        this.e = z11;
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
        return this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && z5.l.l(this.a, kVar.a) && z5.l.l(this.b, kVar.b) && z5.l.l(this.f, kVar.f) && z5.l.l(this.n, kVar.n) && z5.l.l(this.r, kVar.r) && Arrays.equals(this.h, kVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.h)), this.n, this.r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 1, this.a);
        o.l(parcel, 2, this.b);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        o.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        o.l(parcel, 6, this.f);
        o.o(parcel, 7, this.h, i10);
        o.l(parcel, 11, this.n);
        o.k(parcel, 12, this.r, i10);
        o.r(parcel, q6);
    }
}
