package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g8.g(27);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(int i10, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.c(parcel, 3, this.b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        h0.r(parcel, q6);
    }
}
