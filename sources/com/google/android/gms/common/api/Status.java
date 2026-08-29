package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class Status extends a6.a implements q, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final w5.a d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new t(3);

    public Status(int i10, String str, PendingIntent pendingIntent, w5.a aVar) {
        this.a = i10;
        this.b = str;
        this.c = pendingIntent;
        this.d = aVar;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final void c(Activity activity, int i10) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            z5.l.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && z5.l.l(this.b, status.b) && z5.l.l(this.c, status.c) && z5.l.l(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        v5.n nVar = new v5.n(this);
        String str = this.b;
        if (str == null) {
            str = j8.j.a(this.a);
        }
        nVar.g(str, "statusCode");
        nVar.g(this.c, "resolution");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this;
    }
}
