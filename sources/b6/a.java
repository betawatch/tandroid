package b6;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(12);
    public final int a;
    public final int b;
    public final Bundle c;

    public a(int i10, int i11, Bundle bundle) {
        this.a = i10;
        this.b = i11;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        df.b(parcel, 3, this.c);
        df.r(parcel, q5);
    }
}
