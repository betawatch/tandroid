package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new f4.e(29);
    public final d a;
    public final a b;
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b h;
    public final boolean n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.a = dVar;
        l.h(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z10;
        this.e = i10;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.l(this.a, eVar.a) && l.l(this.b, eVar.b) && l.l(this.f, eVar.f) && l.l(this.h, eVar.h) && l.l(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.n == eVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.a, i10);
        r8.k(parcel, 2, this.b, i10);
        r8.l(parcel, 3, this.c);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        r8.k(parcel, 6, this.f, i10);
        r8.k(parcel, 7, this.h, i10);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        r8.r(parcel, q6);
    }
}
