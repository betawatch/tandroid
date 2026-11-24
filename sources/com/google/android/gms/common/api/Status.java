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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class Status extends b4 implements ua9, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ds2 d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new rpd(19);

    public Status(int i, String str, PendingIntent pendingIntent, ds2 ds2Var) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = ds2Var;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final void c(Activity activity, int i) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            fre.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && cqe.a(this.b, status.b) && cqe.a(this.c, status.c) && cqe.a(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        wk4 wk4Var = new wk4(this);
        String str = this.b;
        if (str == null) {
            str = asd.a(this.a);
        }
        wk4Var.a(str, "statusCode");
        wk4Var.a(this.c, "resolution");
        return wk4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r2 = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 2, this.b);
        jte.k(parcel, 3, this.c, i);
        jte.k(parcel, 4, this.d, i);
        jte.s(parcel, r2);
    }

    @Override // ua9
    public final Status a() {
        return this;
    }
}
