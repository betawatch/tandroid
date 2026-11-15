package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new k(4);
    public final List a;

    public q(List simSlots) {
        kotlin.jvm.internal.j.e(simSlots, "simSlots");
        this.a = simSlots;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.h(dest, 1, this.a);
        yb.s(dest, r10);
    }
}
