package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q6.m;
import u7.k;
import u7.o;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(21);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final k e;

    public a(long j3, int i7, boolean z10, String str, k kVar) {
        this.a = j3;
        this.b = i7;
        this.c = z10;
        this.d = str;
        this.e = kVar;
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
        StringBuilder m10 = e2.m("LastLocationRequest[");
        long j3 = this.a;
        if (j3 != Long.MAX_VALUE) {
            m10.append("maxAge=");
            o.a(j3, m10);
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
        k kVar = this.e;
        if (kVar != null) {
            m10.append(", impersonation=");
            m10.append(kVar);
        }
        m10.append(']');
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        yb.l(parcel, 4, this.d);
        yb.k(parcel, 5, this.e, i7);
        yb.s(parcel, r10);
    }
}
