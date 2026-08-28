package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import q5.v;
import w7.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new i(8);
    public final IBinder a;

    public BinderWrapper(v vVar) {
        this.a = vVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeStrongBinder(this.a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }
}
