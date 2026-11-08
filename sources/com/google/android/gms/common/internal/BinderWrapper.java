package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j6.u;
import q4.x;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new x(8);
    public final IBinder a;

    public BinderWrapper(u uVar) {
        this.a = uVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStrongBinder(this.a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }
}
