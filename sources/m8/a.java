package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.c(parcel, 3, this.b);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        e0.r(parcel, q6);
    }
}
