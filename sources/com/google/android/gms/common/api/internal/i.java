package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
