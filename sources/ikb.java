// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ikb extends c4 {
    public static final Parcelable.Creator<ikb> CREATOR = new s5d((byte) 0);
    public final int a;
    public List b;

    public ikb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.p(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
