package n8;

import a8.df;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import n4.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new x(9);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.k(parcel, 3, this.b, i10);
        df.k(parcel, 4, this.c, i10);
        long j10 = this.d;
        df.s(parcel, 5, 8);
        parcel.writeLong(j10);
        df.c(parcel, 6, this.e);
        df.r(parcel, q5);
        this.c = null;
    }
}
