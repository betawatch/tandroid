package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends c6.a {
    public static final Parcelable.Creator<b> CREATOR = new t(18);
    public String a;
    public String b;
    public ArrayList c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.p(parcel, 4, this.c);
        g5.r(parcel, q10);
    }
}
