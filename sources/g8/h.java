package g8;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import f6.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(10);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.n(parcel, 1, this.a);
        j8.a.h(parcel, 2, this.b);
        j8.a.l(parcel, 3, this.c, i3);
        j8.a.d(parcel, 4, this.d);
        j8.a.t(parcel, s6);
    }
}
