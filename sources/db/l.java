package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class l extends r6.a {
    public static final Parcelable.Creator<l> CREATOR = new k(2);
    public final ArrayList a;

    public l(ArrayList capabilities) {
        kotlin.jvm.internal.j.e(capabilities, "capabilities");
        this.a = capabilities;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.p(dest, 1, this.a);
        bc.s(dest, r10);
    }
}
