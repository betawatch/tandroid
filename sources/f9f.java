// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f9f extends b4 {
    public static final Parcelable.Creator<f9f> CREATOR = new c0f((byte) 17);
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.m(parcel, 1, this.a);
        jte.g(parcel, 2, this.b);
        jte.k(parcel, 3, this.c, i);
        jte.c(parcel, 4, this.d);
        jte.s(parcel, r);
    }
}
