package b2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new s(parcel);
            case 1:
                return new r(parcel);
            default:
                return new i1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new s[i10];
            case 1:
                return new r[i10];
            default:
                return new i1[i10];
        }
    }
}
