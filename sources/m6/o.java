package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new r0(19);
    public final Enum a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(a aVar) {
        this.a = (Enum) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(int i9) {
        c0 c0Var;
        if (i9 == -262) {
            c0Var = c0.b;
        } else {
            c0[] values = c0.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.a == i9) {
                            c0Var = pVar;
                        }
                    }
                    throw new n(j3.r0.m(i9, "Algorithm with COSE value ", " not supported"));
                }
                c0 c0Var2 = values[i10];
                if (c0Var2.a == i9) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, m6.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, m6.a] */
    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.a.a() == ((o) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return aa.d.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, m6.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.a.a());
    }
}
