package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class ua extends c6.a {
    public static final Parcelable.Creator<ua> CREATOR = new t5(3);
    public final float a;
    public final int b;

    public ua(float f10, int i10) {
        this.a = f10;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.s(parcel, 1, 4);
        parcel.writeFloat(this.a);
        j7.f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        j7.f5.r(parcel, q10);
    }
}
