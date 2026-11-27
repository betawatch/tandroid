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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class Status extends c4 implements ie9, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ws2 d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new hud(19);

    public Status(int i, String str, PendingIntent pendingIntent, ws2 ws2Var) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = ws2Var;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final void c(Activity activity, int i) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            xve.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && vue.a(this.b, status.b) && vue.a(this.c, status.c) && vue.a(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        um4 um4Var = new um4(this);
        String str = this.b;
        if (str == null) {
            str = qwd.a(this.a);
        }
        um4Var.a(str, "statusCode");
        um4Var.a(this.c, "resolution");
        return um4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r2 = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 2, this.b);
        bye.k(parcel, 3, this.c, i);
        bye.k(parcel, 4, this.d, i);
        bye.s(parcel, r2);
    }

    @Override // ie9
    public final Status a() {
        return this;
    }
}
