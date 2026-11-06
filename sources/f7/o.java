package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new t0(8);
    public final Enum a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(a aVar) {
        this.a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i7) {
        c0 c0Var;
        if (i7 == -262) {
            c0Var = c0.b;
        } else {
            c0[] values = c0.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.a == i7) {
                            c0Var = pVar;
                        }
                    }
                    throw new n(jg.g.k(i7, "Algorithm with COSE value ", " not supported"));
                }
                c0 c0Var2 = values[i10];
                if (c0Var2.a == i7) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [f7.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [f7.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.a.a() == ((o) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a8.p0.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [f7.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.a.a());
    }
}
