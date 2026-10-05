package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class l extends o6.a {
    public static final Parcelable.Creator<l> CREATOR = new e6.i(24);
    public final PendingIntent a;

    public l(PendingIntent pendingIntent) {
        kotlin.jvm.internal.i.e(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = g0.q(dest, 20293);
        g0.k(dest, 1, this.a, i10);
        g0.r(dest, q6);
    }
}
