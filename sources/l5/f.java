package l5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import l4.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f extends c6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(2);
    public final PendingIntent a;

    public f(PendingIntent pendingIntent) {
        m.h(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.r(parcel, q10);
    }
}
