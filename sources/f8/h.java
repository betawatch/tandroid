package f8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new f6.i(7);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.m(parcel, 1, this.a);
        df.g(parcel, 2, this.b);
        df.k(parcel, 3, this.c, i10);
        df.c(parcel, 4, this.d);
        df.r(parcel, q5);
    }
}
