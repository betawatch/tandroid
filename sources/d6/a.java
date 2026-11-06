package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(26);
    public final int a;
    public final int b;
    public final Bundle c;

    public a(int i7, int i10, Bundle bundle) {
        this.a = i7;
        this.b = i10;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        xb.b(parcel, 3, this.c);
        xb.s(parcel, r10);
    }
}
