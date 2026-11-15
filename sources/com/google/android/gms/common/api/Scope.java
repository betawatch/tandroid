package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class Scope extends r6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new u(2);
    public final int a;
    public final String b;

    public Scope(int i7, String str) {
        q6.m.f(str, "scopeUri must not be null or empty");
        this.a = i7;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.l(parcel, 2, this.b);
        yb.s(parcel, r10);
    }
}
