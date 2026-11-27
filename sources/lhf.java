// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lhf extends c4 {
    public static final Parcelable.Creator<lhf> CREATOR = new nkf((byte) 1);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public static lhf b(pm3 pm3Var) {
        lhf lhfVar = new lhf();
        rc0 rc0Var = (rc0) pm3Var.b;
        lhfVar.a = rc0Var.a;
        lhfVar.b = rc0Var.b;
        lhfVar.e = rc0Var.c;
        lhfVar.c = 0;
        lhfVar.d = 0L;
        return lhfVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i5);
        bye.s(parcel, r);
    }
}
