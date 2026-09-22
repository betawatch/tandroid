package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(27);
    public final String a;

    public e(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 2, this.a);
        e0.r(parcel, q6);
    }
}
