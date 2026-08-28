package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r a;
    public final String b;
    public final int c;

    public k(int i9, int i10, String str) {
        try {
            this.a = r.a(i9);
            this.b = str;
            this.c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return x5.l.l(this.a, kVar.a) && x5.l.l(this.b, kVar.b) && x5.l.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        t5.c cVar = new t5.c(getClass().getSimpleName(), 12);
        String valueOf = String.valueOf(this.a.a);
        x6.c cVar2 = new x6.c(11);
        ((t5.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.b = valueOf;
        cVar2.c = "errorCode";
        String str = this.b;
        if (str != null) {
            cVar.j(str, "errorMessage");
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a.a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.r(parcel, q10);
    }
}
