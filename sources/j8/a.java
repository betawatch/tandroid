package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q6.m;
import u7.n;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final u7.j e;

    public a(long j3, int i7, boolean z10, String str, u7.j jVar) {
        this.a = j3;
        this.b = i7;
        this.c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && m.l(this.d, aVar.d) && m.l(this.e, aVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder m10 = e2.m("LastLocationRequest[");
        long j3 = this.a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            n.a(j3, m10);
        }
        int i7 = this.b;
        if (i7 != 0) {
            m10.append(", ");
            if (i7 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i7 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            m10.append(str);
        }
        if (this.c) {
            m10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            m10.append(", moduleId=");
            m10.append(str2);
        }
        u7.j jVar = this.e;
        if (jVar != null) {
            m10.append(", impersonation=");
            m10.append(jVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        cc.l(parcel, 4, this.d);
        cc.k(parcel, 5, this.e, i7);
        cc.s(parcel, r10);
    }
}
