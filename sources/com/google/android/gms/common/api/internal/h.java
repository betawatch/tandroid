package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class h extends a8.q implements i {
    public h() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 8);
    }

    @Override // a8.q
    public final boolean i1(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) n7.a.a(parcel, Status.CREATOR);
        n7.a.d(parcel);
        N(status);
        return true;
    }
}
