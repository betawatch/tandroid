package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p extends c6.a {
    public static final Parcelable.Creator<p> CREATOR = new w.a(20);
    public final int a;
    public List b;

    public p(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.p(parcel, 2, this.b);
        g5.r(parcel, q10);
    }
}
