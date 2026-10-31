package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g(6);
    public final List a;
    public final boolean b;
    public final boolean c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.a = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h0.r(parcel, q6);
    }
}
