// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nie extends c4 {
    public static final Parcelable.Creator<nie> CREATOR = new g3e((byte) 28);
    public final int a;
    public final long b;
    public final ArrayList c;

    public nie(int i, long j, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        bye.p(parcel, 4, this.c);
        bye.s(parcel, r);
    }
}
