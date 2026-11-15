package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new k(3);
    public final String a;

    public o(String token) {
        kotlin.jvm.internal.j.e(token, "token");
        this.a = token;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.a);
        yb.s(dest, r10);
    }
}
