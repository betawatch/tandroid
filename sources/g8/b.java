package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new j(3);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final r7.j e;

    public b(long j3, int i10, boolean z10, String str, r7.j jVar) {
        this.a = j3;
        this.b = i10;
        this.c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && n6.l.l(this.d, bVar.d) && n6.l.l(this.e, bVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder u10 = a4.a.u("LastLocationRequest[");
        long j3 = this.a;
        if (j3 != Long.MAX_VALUE) {
            u10.append("maxAge=");
            r7.p.a(u10, j3);
        }
        int i10 = this.b;
        if (i10 != 0) {
            u10.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            u10.append(str);
        }
        if (this.c) {
            u10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            u10.append(", moduleId=");
            u10.append(str2);
        }
        r7.j jVar = this.e;
        if (jVar != null) {
            u10.append(", impersonation=");
            u10.append(jVar);
        }
        u10.append(']');
        return u10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        f0.l(parcel, 4, this.d);
        f0.k(parcel, 5, this.e, i10);
        f0.r(parcel, q6);
    }
}
