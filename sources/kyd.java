// default package

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kyd extends b4 {
    public static final Parcelable.Creator<kyd> CREATOR = new urd((byte) 26);
    public final int a;
    public final ParcelFileDescriptor b;

    public kyd(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 3, this.b, i | 1);
        mve.s(parcel, r);
    }
}
