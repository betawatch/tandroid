package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o extends r6.a {
    public static final Parcelable.Creator<o> CREATOR = new k(3);
    public final String a;

    public o(String token) {
        kotlin.jvm.internal.j.e(token, "token");
        this.a = token;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.l(dest, 1, this.a);
        bc.s(dest, r10);
    }
}
