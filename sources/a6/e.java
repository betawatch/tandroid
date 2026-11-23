package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        m.h(dVar);
        this.a = dVar;
        m.h(aVar);
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
        return m.l(this.a, eVar.a) && m.l(this.b, eVar.b) && m.l(this.f, eVar.f) && m.l(this.h, eVar.h) && m.l(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.n == eVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.h, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.a, i7);
        cc.k(parcel, 2, this.b, i7);
        cc.l(parcel, 3, this.c);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        cc.k(parcel, 6, this.f, i7);
        cc.k(parcel, 7, this.h, i7);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.n ? 1 : 0);
        cc.s(parcel, r10);
    }
}
