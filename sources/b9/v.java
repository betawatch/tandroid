package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(19);
    public final int a;
    public final ConnectionConfiguration[] b;

    public v(int i7, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i7;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        yb.o(parcel, 3, this.b, i7);
        yb.s(parcel, r10);
    }
}
