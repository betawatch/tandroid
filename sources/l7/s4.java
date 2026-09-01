package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s4 extends c6.a {
    public static final Parcelable.Creator<s4> CREATOR = new t5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public s4(float f10, int i10, String str, String str2) {
        this.b = str2;
        this.c = f10;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.l(parcel, 2, this.b);
        j7.g5.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        j7.g5.l(parcel, 4, this.a);
        j7.g5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        j7.g5.r(parcel, q10);
    }
}
