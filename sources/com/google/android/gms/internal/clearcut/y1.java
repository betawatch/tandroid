package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class y1 extends p6.h {
    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 11925000;
    }

    @Override // p6.d
    public final /* synthetic */ IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof z1 ? (z1) queryLocalInterface : new z1(iBinder);
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
