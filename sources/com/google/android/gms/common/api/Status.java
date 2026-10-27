package com.google.android.gms.common.api;

import a8.df;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class Status extends p6.a implements q, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final l6.a d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new t(3);

    public Status(int i10, String str, PendingIntent pendingIntent, l6.a aVar) {
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
            o6.l.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && o6.l.l(this.b, status.b) && o6.l.l(this.c, status.c) && o6.l.l(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        String str = this.b;
        if (str == null) {
            str = y8.j.a(this.a);
        }
        w1Var.x(str, "statusCode");
        w1Var.x(this.c, "resolution");
        return w1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        df.l(parcel, 2, this.b);
        df.k(parcel, 3, this.c, i10);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }

    @Override // com.google.android.gms.common.api.q
    public final Status h() {
        return this;
    }
}
