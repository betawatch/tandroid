// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l51 implements Parcelable {
    public static final Parcelable.Creator<l51> CREATOR = new c0f(15);
    public final jj a;

    public l51(jj jjVar) {
        this.a = jjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l51 a(int i) {
        sy8 sy8Var;
        if (i == -262) {
            sy8Var = sy8.b;
        } else {
            sy8[] values = sy8.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (es3 es3Var : es3.values()) {
                        if (es3Var.a == i) {
                            sy8Var = es3Var;
                        }
                    }
                    throw new k51(tb4.n(i, "Algorithm with COSE value ", " not supported"));
                }
                sy8 sy8Var2 = values[i2];
                if (sy8Var2.a == i) {
                    sy8Var = sy8Var2;
                    break;
                }
                i2++;
            }
        }
        return new l51(sy8Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l51) && this.a.a() == ((l51) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return tb4.y("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
