package com.google.firebase.messaging;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class o extends p6.a {
    public static final Parcelable.Creator<o> CREATOR = new w.a(16);
    public final Bundle a;
    public a0.f b;

    public o(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.b(parcel, 2, this.a);
        df.r(parcel, q5);
    }
}
