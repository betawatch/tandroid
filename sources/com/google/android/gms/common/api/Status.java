package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.g5;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class Status extends c6.a implements q, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final y5.a d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new t(3);

    public Status(int i10, String str, PendingIntent pendingIntent, y5.a aVar) {
        this.a = i10;
        this.b = str;
        this.c = pendingIntent;
        this.d = aVar;
    }

    public final boolean e() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && b6.m.l(this.b, status.b) && b6.m.l(this.c, status.c) && b6.m.l(this.d, status.d);
    }

    public final void f(Activity activity, int i10) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            b6.m.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        bf.b bVar = new bf.b(this);
        String str = this.b;
        if (str == null) {
            str = l8.j.a(this.a);
        }
        bVar.r(str, "statusCode");
        bVar.r(this.c, "resolution");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        g5.l(parcel, 2, this.b);
        g5.k(parcel, 3, this.c, i10);
        g5.k(parcel, 4, this.d, i10);
        g5.r(parcel, q10);
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this;
    }
}
