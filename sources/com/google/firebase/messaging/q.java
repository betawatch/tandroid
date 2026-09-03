package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q extends c6.a {
    public static final Parcelable.Creator<q> CREATOR = new b9.e(6);
    public final Bundle a;
    public a0.f b;

    public q(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.b(parcel, 2, this.a);
        f5.r(parcel, q10);
    }
}
