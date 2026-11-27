// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class i23 extends c4 {
    public static final Parcelable.Creator<i23> CREATOR = new g31((byte) 13);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public i23(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        boolean z = (ddb.h(str3) || ddb.h(str4)) ? false : true;
        boolean z2 = !ddb.h(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        qu6.u(sb, "Either type: ", str, ", or requestType: ", str3);
        lq5.j(qu6.o(" and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value.", sb));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.b(parcel, 2, this.b);
        bye.b(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.l(parcel, 5, this.e);
        bye.l(parcel, 6, this.f);
        bye.s(parcel, r);
    }
}
