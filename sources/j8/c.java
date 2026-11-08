package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List a;
    public final boolean b;
    public final boolean c;

    public c(ArrayList arrayList, boolean z9, boolean z10) {
        this.a = arrayList;
        this.b = z9;
        this.c = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.s(parcel, r10);
    }
}
