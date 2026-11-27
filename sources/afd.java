// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class afd extends c4 {
    public static final Parcelable.Creator<afd> CREATOR = new ced((byte) 7);
    public final String a;

    public afd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afd) {
            return vue.a(this.a, ((afd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
