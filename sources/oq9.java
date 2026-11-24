// default package

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oq9 extends b4 {
    public static final Parcelable.Creator<oq9> CREATOR = new sje((byte) 8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.k(parcel, 3, this.b, i);
        mve.k(parcel, 4, this.c, i);
        long j = this.d;
        mve.q(parcel, 5, 8);
        parcel.writeLong(j);
        mve.c(parcel, 6, this.e);
        mve.s(parcel, r);
        this.c = null;
    }
}
