package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r a;
    public final String b;
    public final int c;

    public k(int i10, int i11, String str) {
        try {
            this.a = r.a(i10);
            this.b = str;
            this.c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n6.l.k(this.a, kVar.a) && n6.l.k(this.b, kVar.b) && n6.l.k(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        li.k kVar = new li.k(getClass().getSimpleName());
        String valueOf = String.valueOf(this.a.a);
        n7.c cVar = new n7.c(9, false);
        ((li.k) kVar.d).d = cVar;
        kVar.d = cVar;
        cVar.c = valueOf;
        cVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            kVar.M(str, "errorMessage");
        }
        return kVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        int i11 = this.a.a;
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.h0.l(parcel, 3, this.b);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.h0.r(parcel, q6);
    }
}
