package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class Scope extends r6.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new u(2);
    public final int a;
    public final String b;

    public Scope(int i7, String str) {
        q6.m.g(str, "scopeUri must not be null or empty");
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        cc.l(parcel, 2, this.b);
        cc.s(parcel, r10);
    }
}
