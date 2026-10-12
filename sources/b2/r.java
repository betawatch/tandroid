package b2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new t(parcel);
            case 1:
                return new s(parcel);
            default:
                return new j1(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new t[i10];
            case 1:
                return new s[i10];
            default:
                return new j1[i10];
        }
    }
}
