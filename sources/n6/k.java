package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new o0(28);
    public final r a;
    public final String b;
    public final int c;

    public k(int i10, int i11, String str) {
        try {
            this.a = r.a(i10);
            this.b = str;
            this.c = i11;
        } catch (q e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return y5.l.l(this.a, kVar.a) && y5.l.l(this.b, kVar.b) && y5.l.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        u2.b bVar = new u2.b(getClass().getSimpleName(), 12);
        String valueOf = String.valueOf(this.a.a);
        y6.c cVar = new y6.c(11);
        ((u2.b) bVar.d).d = cVar;
        bVar.d = cVar;
        cVar.c = valueOf;
        cVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            bVar.j(str, "errorMessage");
        }
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        int i11 = this.a.a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        r8.r(parcel, q6);
    }
}
