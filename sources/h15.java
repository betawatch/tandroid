// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class h15 extends c4 {
    public static final Parcelable.Creator<h15> CREATOR = new m9d((byte) 16);
    public final boolean a;

    public h15(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h15) && this.a == ((h15) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        bye.s(parcel, r);
    }
}
