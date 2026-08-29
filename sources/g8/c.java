package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new b(2);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        o.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        o.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        o.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        o.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f9 = this.f;
        o.s(parcel, 7, 4);
        parcel.writeFloat(f9);
        o.r(parcel, q6);
    }
}
