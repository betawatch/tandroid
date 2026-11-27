// default package

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fs9 extends c4 {
    public static final Parcelable.Creator<fs9> CREATOR = new ime((byte) 8);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.k(parcel, 3, this.b, i);
        bye.k(parcel, 4, this.c, i);
        long j = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeLong(j);
        bye.c(parcel, 6, this.e);
        bye.s(parcel, r);
        this.c = null;
    }
}
