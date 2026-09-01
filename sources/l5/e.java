package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import l4.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(1);
    public final d a;
    public final a b;
    public final String c;
    public final boolean d;
    public final int e;
    public final c f;
    public final b h;
    public final boolean n;

    public e(d dVar, a aVar, String str, boolean z4, int i10, c cVar, b bVar, boolean z10) {
        m.h(dVar);
        this.a = dVar;
        m.h(aVar);
        this.b = aVar;
        this.c = str;
        this.d = z4;
        this.e = i10;
        this.f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.n = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.l(this.a, eVar.a) && m.l(this.b, eVar.b) && m.l(this.f, eVar.f) && m.l(this.h, eVar.h) && m.l(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.n == eVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.k(parcel, 2, this.b, i10);
        g5.l(parcel, 3, this.c);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g5.k(parcel, 6, this.f, i10);
        g5.k(parcel, 7, this.h, i10);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        g5.r(parcel, q10);
    }
}
