package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(25);
    public final Bundle a;
    public a0.f b;

    public s(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.b(parcel, 2, this.a);
        w7.f0.r(parcel, q6);
    }
}
