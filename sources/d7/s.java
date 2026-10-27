package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s extends p6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(25);
    public final String a;

    public s(String str) {
        o6.l.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.a.equals(((s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.r(parcel, q5);
    }
}
