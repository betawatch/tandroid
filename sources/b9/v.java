package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        cc.o(parcel, 3, this.b, i7);
        cc.s(parcel, r10);
    }
}
