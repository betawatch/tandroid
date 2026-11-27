// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hme extends c4 {
    public static final Parcelable.Creator<hme> CREATOR = new ime((byte) 6);
    public final byte[] a;

    public hme(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a);
        bye.s(parcel, r);
    }
}
