package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class z1 extends n6.g {
    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 11925000;
    }

    @Override // n6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof a2 ? (a2) queryLocalInterface : new a2(iBinder);
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
