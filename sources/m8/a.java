package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String a;
    public final byte[] b;
    public final int c;

    public a(String str, byte[] bArr, int i10) {
        this.a = str;
        this.b = bArr;
        this.c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.c(parcel, 3, this.b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f0.r(parcel, q6);
    }
}
