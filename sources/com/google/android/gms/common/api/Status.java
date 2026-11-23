package com.google.android.gms.common.api;

import a8.j8;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class Status extends r6.a implements r, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final n6.a d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new u(3);

    public Status(int i7, String str, PendingIntent pendingIntent, n6.a aVar) {
        this.a = i7;
        this.b = str;
        this.c = pendingIntent;
        this.d = aVar;
    }

    public final boolean b() {
        return this.a <= 0;
    }

    public final void c(Activity activity, int i7) {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            Bundle bundle = Build.VERSION.SDK_INT >= 34 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            q6.m.h(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i7, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && q6.m.l(this.b, status.b) && q6.m.l(this.c, status.c) && q6.m.l(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ji.l lVar = new ji.l(this);
        String str = this.b;
        if (str == null) {
            str = j8.a(this.a);
        }
        lVar.E(str, "statusCode");
        lVar.E(this.c, "resolution");
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bc.l(parcel, 2, this.b);
        bc.k(parcel, 3, this.c, i7);
        bc.k(parcel, 4, this.d, i7);
        bc.s(parcel, r10);
    }

    @Override // com.google.android.gms.common.api.r
    public final Status a() {
        return this;
    }
}
