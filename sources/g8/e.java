package g8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new f4.e(23);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.h(parcel, 2, this.a);
        r8.l(parcel, 4, this.b);
        r8.l(parcel, 5, this.c);
        r8.h(parcel, 6, this.d);
        boolean z10 = this.e;
        r8.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.l(parcel, 8, this.f);
        r8.r(parcel, q6);
    }
}
