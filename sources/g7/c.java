package g7;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new e6.i(14);
    public final boolean a;

    public c(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = f0.q(dest, 20293);
        f0.s(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        f0.r(dest, q6);
    }
}
