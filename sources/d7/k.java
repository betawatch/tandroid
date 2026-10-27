package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(18);
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
        return o6.l.l(this.a, kVar.a) && o6.l.l(this.b, kVar.b) && o6.l.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        k6.c cVar = new k6.c(getClass().getSimpleName());
        String valueOf = String.valueOf(this.a.a);
        o7.c cVar2 = new o7.c(13, false);
        ((k6.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.b = valueOf;
        cVar2.c = "errorCode";
        String str = this.b;
        if (str != null) {
            cVar.K(str, "errorMessage");
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.a.a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        df.r(parcel, q5);
    }
}
