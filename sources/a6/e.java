package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(1);
    public final d a;
    public final a b;
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b h;
    public final boolean n;

    public e(d dVar, a aVar, String str, boolean z10, int i7, c cVar, b bVar, boolean z11) {
        m.g(dVar);
        this.a = dVar;
        m.g(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z10;
        this.e = i7;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.k(this.a, eVar.a) && m.k(this.b, eVar.b) && m.k(this.f, eVar.f) && m.k(this.h, eVar.h) && m.k(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.n == eVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.a, i7);
        yb.k(parcel, 2, this.b, i7);
        yb.l(parcel, 3, this.c);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        yb.k(parcel, 6, this.f, i7);
        yb.k(parcel, 7, this.h, i7);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        yb.s(parcel, r10);
    }
}
