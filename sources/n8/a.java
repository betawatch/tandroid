package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(5);
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
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.c(parcel, 3, this.b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        df.r(parcel, q5);
    }
}
