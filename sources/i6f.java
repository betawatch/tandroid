// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i6f extends b4 {
    public static final Parcelable.Creator<i6f> CREATOR = new c0f(11);
    public final float a;
    public final int b;

    public i6f(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.s(parcel, r);
    }
}
