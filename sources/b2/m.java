package b2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new o(parcel);
            case 1:
                return new n(parcel);
            default:
                return new e1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new o[i10];
            case 1:
                return new n[i10];
            default:
                return new e1[i10];
        }
    }
}
