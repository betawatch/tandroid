package h5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new h(0);
    public final d a;
    public final a b;
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b h;
    public final boolean n;

    public e(d dVar, a aVar, String str, boolean z10, int i9, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.a = dVar;
        l.h(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z10;
        this.e = i9;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.k(parcel, 2, this.b, i9);
        p8.l(parcel, 3, this.c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        p8.k(parcel, 6, this.f, i9);
        p8.k(parcel, 7, this.h, i9);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        p8.r(parcel, q10);
    }
}
