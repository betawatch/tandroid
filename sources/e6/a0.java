package e6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import d7.r0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a0 extends p6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(26);
    public final boolean a;

    public a0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        df.r(parcel, q5);
    }
}
