package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(19);
    public final Enum a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(a aVar) {
        this.a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i10) {
        c0 c0Var;
        if (i10 == -262) {
            c0Var = c0.b;
        } else {
            c0[] values = c0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.a == i10) {
                            c0Var = pVar;
                        }
                    }
                    throw new n(hc.b.k(i10, "Algorithm with COSE value ", " not supported"));
                }
                c0 c0Var2 = values[i11];
                if (c0Var2.a == i10) {
                    c0Var = c0Var2;
                    break;
                }
                i11++;
            }
        }
        return new o(c0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c7.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [c7.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.a.a() == ((o) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a4.a.p("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c7.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a.a());
    }
}
