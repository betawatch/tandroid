package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List a;
    public final boolean b;
    public final boolean c;

    public c(ArrayList arrayList, boolean z10, boolean z11) {
        this.a = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bc.s(parcel, r10);
    }
}
