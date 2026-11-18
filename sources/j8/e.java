package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class e extends r6.a implements r {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status a;
    public final f b;

    public e(Status status, f fVar) {
        this.a = status;
        this.b = fVar;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.a, i7);
        bc.k(parcel, 2, this.b, i7);
        bc.s(parcel, r10);
    }
}
