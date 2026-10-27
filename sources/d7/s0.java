package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s0 extends p6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(3);
    public final String a;

    public s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return o6.l.l(this.a, ((s0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.r(parcel, q5);
    }
}
