// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class oe5 extends c4 {
    public static final Parcelable.Creator<oe5> CREATOR = new zkd(3);
    public final String a;
    public final byte[] b;
    public final int c;

    public oe5(int i, String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.c(parcel, 3, this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
