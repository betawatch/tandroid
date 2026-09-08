package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new e6.i(20);
    public final Bundle a;

    public i(Bundle responseBundle) {
        kotlin.jvm.internal.i.e(responseBundle, "responseBundle");
        this.a = responseBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.b(dest, 1, this.a);
        e0.r(dest, q6);
    }
}
