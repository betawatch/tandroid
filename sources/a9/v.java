package a9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v extends q6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int a;
    public final ConnectionConfiguration[] b;

    public v(int i3, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i3;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        j8.a.p(parcel, 3, this.b, i3);
        j8.a.t(parcel, s6);
    }
}
