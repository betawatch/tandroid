package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h extends com.google.android.gms.internal.cast.o implements i {
    public h() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 6);
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean I0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) m7.a.a(parcel, Status.CREATOR);
        m7.a.d(parcel);
        G(status);
        return true;
    }
}
