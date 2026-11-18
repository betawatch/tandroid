package j7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new b(0);
    public final boolean a;

    public a(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.q(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        bc.s(dest, r10);
    }
}
