package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(dest, 20293);
        wb.p(dest, 1, this.a);
        wb.s(dest, r10);
    }
}
