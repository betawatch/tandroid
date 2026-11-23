package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(10);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public c(String str, int i7, long j3, boolean z10) {
        this.a = str;
        this.b = i7;
        this.c = j3;
        this.d = z10;
    }

    public final long b() {
        long j3 = this.c;
        return j3 == -1 ? this.b : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (q6.m.l(this.a, cVar.a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        j6.k kVar = new j6.k(this);
        kVar.S(this.a, "name");
        kVar.S(Long.valueOf(b()), "version");
        kVar.S(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return kVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 1, this.a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        cc.q(parcel, 3, 8);
        parcel.writeLong(b10);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
