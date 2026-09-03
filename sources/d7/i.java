package d7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import j7.g5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.p(parcel, 2, this.b);
        g5.m(parcel, 3, this.c);
        g5.r(parcel, q10);
    }
}
