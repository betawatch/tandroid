package i7;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(18);
    public final boolean a;

    public d(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.r(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        j8.a.t(dest, s6);
    }
}
