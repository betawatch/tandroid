// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bzd extends c4 {
    public static final Parcelable.Creator<bzd> CREATOR = new hud((byte) 21);
    public final int a;
    public final ConnectionConfiguration b;

    public bzd(int i, ConnectionConfiguration connectionConfiguration) {
        this.a = i;
        this.b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
