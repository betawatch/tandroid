package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new k(0);
    public final int a;
    public final String b;
    public final int c;

    public i(int i7, int i10, String simOperatorName) {
        kotlin.jvm.internal.j.e(simOperatorName, "simOperatorName");
        this.a = i7;
        this.b = simOperatorName;
        this.c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.q(dest, 1, 4);
        dest.writeInt(this.a);
        yb.l(dest, 2, this.b);
        yb.q(dest, 3, 4);
        dest.writeInt(this.c);
        yb.s(dest, r10);
    }
}
