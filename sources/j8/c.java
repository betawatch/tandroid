package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new j7.b(25);
    public final List a;
    public final boolean b;
    public final boolean c;

    public c(ArrayList arrayList, boolean z9, boolean z10) {
        this.a = arrayList;
        this.b = z9;
        this.c = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.p(parcel, 1, DesugarCollections.unmodifiableList(this.a));
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        wb.s(parcel, r10);
    }
}
