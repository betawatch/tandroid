package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
