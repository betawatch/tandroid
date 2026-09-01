package k8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import j8.t;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new t(20);
    public String a;
    public d b;
    public f c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.k(parcel, 3, this.b, i10);
        g5.k(parcel, 5, this.c, i10);
        g5.r(parcel, q10);
    }
}
