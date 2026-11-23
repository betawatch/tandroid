package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int a;
    public final long b;
    public final List c;

    public v0(int i7, long j3, ArrayList arrayList) {
        this.a = i7;
        this.b = j3;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        bc.p(parcel, 4, this.c);
        bc.s(parcel, r10);
    }
}
