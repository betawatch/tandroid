// default package

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nd6 extends c4 {
    public static final Parcelable.Creator<nd6> CREATOR = new nkf((byte) 15);
    public final ArrayList a;
    public final boolean b;
    public final boolean c;

    public nd6(ArrayList arrayList, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        bye.s(parcel, r);
    }
}
