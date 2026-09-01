package f6;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final boolean a;
    public final int b;

    public a(int i10, boolean z4) {
        this.a = z4;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        g5.r(parcel, q10);
    }
}
