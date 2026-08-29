package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new n0(29);
    public final r a;
    public final String b;
    public final int c;

    public k(int i10, int i11, String str) {
        try {
            this.a = r.a(i10);
            this.b = str;
            this.c = i11;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return z5.l.l(this.a, kVar.a) && z5.l.l(this.b, kVar.b) && z5.l.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        v5.c cVar = new v5.c(getClass().getSimpleName(), 11);
        String valueOf = String.valueOf(this.a.a);
        z6.c cVar2 = new z6.c(10);
        ((v5.c) cVar.d).d = cVar2;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.a.a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
