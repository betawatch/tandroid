package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.f0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class p extends o6.a {
    public static final Parcelable.Creator<p> CREATOR = new r0(25);
    public final Bundle a;
    public a0.f b;

    public p(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.b(parcel, 2, this.a);
        f0.r(parcel, q6);
    }
}
