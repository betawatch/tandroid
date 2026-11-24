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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class Status extends b4 implements uc9, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ot2 d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new urd(19);

    public Status(int i, String str, PendingIntent pendingIntent, ot2 ot2Var) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.d = ot2Var;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final void c(Activity activity, int i) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            ite.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && fse.a(this.b, status.b) && fse.a(this.c, status.c) && fse.a(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        wm4 wm4Var = new wm4(this);
        String str = this.b;
        if (str == null) {
            str = dud.a(this.a);
        }
        wm4Var.a(str, "statusCode");
        wm4Var.a(this.c, "resolution");
        return wm4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r2 = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 2, this.b);
        mve.k(parcel, 3, this.c, i);
        mve.k(parcel, 4, this.d, i);
        mve.s(parcel, r2);
    }

    @Override // uc9
    public final Status a() {
        return this;
    }
}
