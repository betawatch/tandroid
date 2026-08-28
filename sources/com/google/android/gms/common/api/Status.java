package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class Status extends y5.a implements q, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final u5.a d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new t(3);

    public Status(int i9, String str, PendingIntent pendingIntent, u5.a aVar) {
        this.a = i9;
        this.b = str;
        this.c = pendingIntent;
        this.d = aVar;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final void c(Activity activity, int i9) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            x5.l.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i9, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && x5.l.l(this.b, status.b) && x5.l.l(this.c, status.c) && x5.l.l(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        w4.e eVar = new w4.e(this);
        String str = this.b;
        if (str == null) {
            str = h8.j.a(this.a);
        }
        eVar.c(str, "statusCode");
        eVar.c(this.c, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.l(parcel, 2, this.b);
        p8.k(parcel, 3, this.c, i9);
        p8.k(parcel, 4, this.d, i9);
        p8.r(parcel, q10);
    }

    @Override // com.google.android.gms.common.api.q
    public final Status i() {
        return this;
    }
}
