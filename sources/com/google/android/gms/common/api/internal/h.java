package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
