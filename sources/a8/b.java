package a8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(7);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.k(parcel, 3, this.b, i10);
        g5.k(parcel, 4, this.c, i10);
        long j10 = this.d;
        g5.s(parcel, 5, 8);
        parcel.writeLong(j10);
        g5.c(parcel, 6, this.e);
        g5.r(parcel, q10);
        this.c = null;
    }
}
