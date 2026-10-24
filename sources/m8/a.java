package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
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
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.a);
        f0.c(parcel, 3, this.b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f0.r(parcel, q6);
    }
}
