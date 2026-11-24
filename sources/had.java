// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class had extends b4 {
    public static final Parcelable.Creator<had> CREATOR = new j9d((byte) 7);
    public final String a;

    public had(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof had) {
            return cqe.a(this.a, ((had) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
