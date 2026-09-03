package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new b9.e(8);
    public final String a;
    public final String b;
    public final String c;

    public f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return android.support.v4.media.a.r(ai.l("DocumentId[packageName=", this.a, ", corpusName=", this.b, ", uri="), this.c, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 1, this.a);
        f5.l(parcel, 2, this.b);
        f5.l(parcel, 3, this.c);
        f5.r(parcel, q10);
    }
}
