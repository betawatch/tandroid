package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class ta extends c6.a {
    public static final Parcelable.Creator<ta> CREATOR = new t5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public ta(float f10, int i10, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.g5.q(parcel, 20293);
        j7.g5.l(parcel, 1, this.a);
        j7.g5.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        j7.g5.l(parcel, 3, this.c);
        j7.g5.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        j7.g5.r(parcel, q10);
    }
}
