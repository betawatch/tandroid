package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class z extends r6.a {
    public static final Parcelable.Creator<z> CREATOR = new w.a(9);
    public final Bundle a;
    public a0.f b;

    public z(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.b(parcel, 2, this.a);
        wb.s(parcel, r10);
    }
}
