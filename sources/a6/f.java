package a6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import q6.m;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);
    public final PendingIntent a;

    public f(PendingIntent pendingIntent) {
        m.g(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.a, i7);
        yb.s(parcel, r10);
    }
}
