package g8;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import w7.e0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(7);
    public final List a;
    public final boolean b;
    public final boolean c;

    public e(ArrayList arrayList, boolean z10, boolean z11) {
        this.a = arrayList;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        e0.r(parcel, q6);
    }
}
