package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j6.v;
import q4.x;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new x(8);
    public final IBinder a;

    public BinderWrapper(v vVar) {
        this.a = vVar;
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
