package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new t(2);
    public String a;
    public String b;
    public String c;
    public int d;
    public UserAddress e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 1, this.a);
        g5.l(parcel, 2, this.b);
        g5.l(parcel, 3, this.c);
        int i11 = this.d;
        g5.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g5.k(parcel, 5, this.e, i10);
        g5.r(parcel, q10);
    }
}
