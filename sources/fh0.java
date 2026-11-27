// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fh0 extends c4 {
    public static final Parcelable.Creator<fh0> CREATOR = new s5d((byte) 20);
    public final boolean a;
    public final String b;

    public fh0(String str, boolean z) {
        if (z) {
            xve.h(str);
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        fh0 fh0Var = (fh0) obj;
        return this.a == fh0Var.a && vue.a(this.b, fh0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.l(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
