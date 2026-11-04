package i8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import p6.m;
import t7.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends q6.a {
    public static final Parcelable.Creator<a> CREATOR = new p(6);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final t7.j e;

    public a(long j10, int i3, boolean z10, String str, t7.j jVar) {
        this.a = j10;
        this.b = i3;
        this.c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && m.k(this.d, aVar.d) && m.k(this.e, aVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("LastLocationRequest[");
        long j10 = this.a;
        if (j10 != Long.MAX_VALUE) {
            l10.append("maxAge=");
            n.a(j10, l10);
        }
        int i3 = this.b;
        if (i3 != 0) {
            l10.append(", ");
            if (i3 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i3 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            l10.append(str);
        }
        if (this.c) {
            l10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            l10.append(", moduleId=");
            l10.append(str2);
        }
        t7.j jVar = this.e;
        if (jVar != null) {
            l10.append(", impersonation=");
            l10.append(jVar);
        }
        l10.append(']');
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j8.a.m(parcel, 4, this.d);
        j8.a.l(parcel, 5, this.e, i3);
        j8.a.t(parcel, s6);
    }
}
