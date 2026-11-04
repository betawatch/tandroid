package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(23);
    public final Enum a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(a aVar) {
        this.a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i3) {
        c0 c0Var;
        if (i3 == -262) {
            c0Var = c0.b;
        } else {
            c0[] values = c0.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.a == i3) {
                            c0Var = pVar;
                        }
                    }
                    throw new n(p1.j(i3, "Algorithm with COSE value ", " not supported"));
                }
                c0 c0Var2 = values[i10];
                if (c0Var2.a == i3) {
                    c0Var = c0Var2;
                    break;
                }
                i10++;
            }
        }
        return new o(c0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e7.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [e7.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.a.a() == ((o) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a1.g.q("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e7.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.a.a());
    }
}
