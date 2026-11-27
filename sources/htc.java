// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class htc extends c4 {
    public static final Parcelable.Creator<htc> CREATOR = new t4f((byte) 9);
    public String a;
    public String b;
    public prb c;
    public rac d;
    public rac e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.k(parcel, 4, this.c, i);
        bye.k(parcel, 5, this.d, i);
        bye.k(parcel, 6, this.e, i);
        bye.s(parcel, r);
    }
}
