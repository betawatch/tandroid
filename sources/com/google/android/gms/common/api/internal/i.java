package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i extends c7.a implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 10);
    }

    @Override // c7.a
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) w6.a.a(parcel, Status.CREATOR);
        w6.a.b(parcel);
        B(status);
        return true;
    }
}
