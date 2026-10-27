package f6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new i(2);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i10, String str2) {
        this.a = str;
        this.b = i10;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        df.l(parcel, 4, this.c);
        df.r(parcel, q5);
    }
}
