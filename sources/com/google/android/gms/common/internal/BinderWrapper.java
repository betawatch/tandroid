package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g6.u;
import m8.h;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new h(18);
    public final IBinder a;

    public BinderWrapper(u uVar) {
        this.a = uVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStrongBinder(this.a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }
}
