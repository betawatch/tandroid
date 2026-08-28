package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i extends a7.a implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 10);
    }

    @Override // a7.a
    public final boolean F0(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 != 1) {
            return false;
        }
        Status status = (Status) u6.a.a(parcel, Status.CREATOR);
        u6.a.b(parcel);
        D(status);
        return true;
    }
}
