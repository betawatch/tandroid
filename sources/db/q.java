package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        int r10 = xb.r(dest, 20293);
        xb.h(dest, 1, this.a);
        xb.s(dest, r10);
    }
}
