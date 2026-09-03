package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new w.a(6);
    public final int a;
    public final boolean b;

    public i(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.r(parcel, q10);
    }
}
