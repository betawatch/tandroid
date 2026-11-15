package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        O(status);
        return true;
    }
}
