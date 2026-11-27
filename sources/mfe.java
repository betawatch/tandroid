// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class mfe extends c4 {
    public static final Parcelable.Creator<mfe> CREATOR = new g3e((byte) 17);
    public final int a;
    public final aud b;

    public mfe(int i, aud audVar) {
        this.a = i;
        this.b = audVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 3, this.b, i);
        bye.s(parcel, r);
    }
}
