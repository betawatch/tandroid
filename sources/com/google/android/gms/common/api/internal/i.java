package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class i extends b8.b implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 6);
    }

    @Override // b8.b
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) k7.a.a(parcel, Status.CREATOR);
        k7.a.b(parcel);
        H(status);
        return true;
    }
}
