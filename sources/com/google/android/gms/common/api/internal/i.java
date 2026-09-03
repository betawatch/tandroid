package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
