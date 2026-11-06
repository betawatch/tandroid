package j7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new b(13);
    public final PendingIntent a;

    public n(PendingIntent pendingIntent) {
        kotlin.jvm.internal.j.e(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.k(dest, 1, this.a, i7);
        xb.s(dest, r10);
    }
}
