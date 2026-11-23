package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class y4 extends r6.a {
    public static final Parcelable.Creator<y4> CREATOR = new z5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public y4(float f10, int i7, String str, String str2) {
        this.b = str2;
        this.c = f10;
        this.a = str;
        this.d = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.b);
        bc.q(parcel, 3, 4);
        parcel.writeFloat(this.c);
        bc.l(parcel, 4, this.a);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
