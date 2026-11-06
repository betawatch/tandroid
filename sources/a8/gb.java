package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class gb extends r6.a {
    public static final Parcelable.Creator<gb> CREATOR = new z5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public gb(float f10, int i7, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 1, this.a);
        xb.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        xb.l(parcel, 3, this.c);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
