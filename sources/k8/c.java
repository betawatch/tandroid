package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import j8.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(20);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.k(parcel, 3, this.b, i10);
        f5.k(parcel, 5, this.c, i10);
        f5.r(parcel, q10);
    }
}
