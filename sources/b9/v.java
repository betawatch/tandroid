package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.o(parcel, 3, this.b, i7);
        xb.s(parcel, r10);
    }
}
