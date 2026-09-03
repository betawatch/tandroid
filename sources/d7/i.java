package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.f5;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends c6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new b9.e(11);
    public Status a;
    public ArrayList b;
    public String[] c;

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.a, i10);
        f5.p(parcel, 2, this.b);
        f5.m(parcel, 3, this.c);
        f5.r(parcel, q10);
    }
}
