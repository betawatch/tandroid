package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
