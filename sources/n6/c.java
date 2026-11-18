package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        ji.j jVar = new ji.j(this);
        jVar.E(this.a, "name");
        jVar.E(Long.valueOf(b()), "version");
        jVar.E(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 1, this.a);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        bc.q(parcel, 3, 8);
        parcel.writeLong(b10);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
