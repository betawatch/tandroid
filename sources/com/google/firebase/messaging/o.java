package com.google.firebase.messaging;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
