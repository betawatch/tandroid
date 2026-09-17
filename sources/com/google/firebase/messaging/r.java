package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new r0(25);
    public final Bundle a;
    public a0.f b;

    public r(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.b(parcel, 2, this.a);
        w7.e0.r(parcel, q6);
    }
}
