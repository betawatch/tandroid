package o6;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f0 extends p6.a {
    public static final Parcelable.Creator<f0> CREATOR = new n4.x(17);
    public Bundle a;
    public l6.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.b(parcel, 1, this.a);
        df.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        df.s(parcel, 3, 4);
        parcel.writeInt(i11);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
