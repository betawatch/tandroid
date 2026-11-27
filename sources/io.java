// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class io extends c4 {
    public static final Parcelable.Creator<io> CREATOR = g31.b;
    public static final io d;
    public final cq2 a;
    public final boolean b;
    public boolean c;

    static {
        io ioVar = new io(null, false);
        ioVar.c = false;
        d = ioVar;
    }

    public io(cq2 cq2Var, boolean z) {
        this.a = cq2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof io)) {
            return false;
        }
        io ioVar = (io) obj;
        return vue.a(this.a, ioVar.a) && this.c == ioVar.c && this.b == ioVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return qu6.o("ApiMetadata(complianceOptions=", valueOf, ")", new StringBuilder(valueOf.length() + 31));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.s(parcel, r);
    }
}
