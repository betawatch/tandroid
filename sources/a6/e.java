package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    public e(d dVar, a aVar, String str, boolean z9, int i7, c cVar, b bVar, boolean z10) {
        m.g(dVar);
        this.a = dVar;
        m.g(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z9;
        this.e = i7;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.n = z10;
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
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.a, i7);
        wb.k(parcel, 2, this.b, i7);
        wb.l(parcel, 3, this.c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        wb.k(parcel, 6, this.f, i7);
        wb.k(parcel, 7, this.h, i7);
        wb.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        wb.s(parcel, r10);
    }
}
