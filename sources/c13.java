// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class c13 extends c4 {
    public static final Parcelable.Creator<c13> CREATOR = new g31((byte) 12);
    public final String a;
    public final Bundle b;

    public c13(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.b(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
