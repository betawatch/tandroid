package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class i extends c8.b implements j {
    public i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 6);
    }

    @Override // c8.b
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) l7.a.a(parcel, Status.CREATOR);
        l7.a.b(parcel);
        F(status);
        return true;
    }
}
