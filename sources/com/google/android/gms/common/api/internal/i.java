package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i extends a7.c implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 11);
    }

    @Override // a7.c
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) y6.a.a(parcel, Status.CREATOR);
        y6.a.b(parcel);
        z(status);
        return true;
    }
}
