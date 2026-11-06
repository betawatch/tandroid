package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class z1 extends q6.h {
    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 11925000;
    }

    @Override // q6.d
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof a2 ? (a2) queryLocalInterface : new a2(iBinder);
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
