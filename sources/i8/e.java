package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import i7.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends q6.a implements q {
    public static final Parcelable.Creator<e> CREATOR = new p(3);
    public final Status a;
    public final f b;

    public e(Status status, f fVar) {
        this.a = status;
        this.b = fVar;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.a, i3);
        j8.a.l(parcel, 2, this.b, i3);
        j8.a.t(parcel, s6);
    }
}
