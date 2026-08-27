package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class i extends b7.a implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 10);
    }

    @Override // b7.a
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) v6.a.a(parcel, Status.CREATOR);
        v6.a.b(parcel);
        B(status);
        return true;
    }
}
