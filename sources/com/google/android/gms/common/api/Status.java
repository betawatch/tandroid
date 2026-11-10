package com.google.android.gms.common.api;

import a8.i8;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class Status extends r6.a implements q, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final n6.a d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status h = new Status(8, null, null, null);
    public static final Status n = new Status(15, null, null, null);
    public static final Status r = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new t(3);

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
            q6.m.g(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i7, null, 0, 0, 0, bundle);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && q6.m.k(this.b, status.b) && q6.m.k(this.c, status.c) && q6.m.k(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        j2.n nVar = new j2.n(this);
        String str = this.b;
        if (str == null) {
            str = i8.a(this.a);
        }
        nVar.X(str, "statusCode");
        nVar.X(this.c, "resolution");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        xb.l(parcel, 2, this.b);
        xb.k(parcel, 3, this.c, i7);
        xb.k(parcel, 4, this.d, i7);
        xb.s(parcel, r10);
    }

    @Override // com.google.android.gms.common.api.q
    public final Status a() {
        return this;
    }
}
