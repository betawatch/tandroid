package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class a2 extends b6.g {
    @Override // b6.g, com.google.android.gms.common.api.c
    public final int k() {
        return 11925000;
    }

    @Override // b6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof b2 ? (b2) queryLocalInterface : new b2(iBinder);
    }

    @Override // b6.g
    public final String v() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // b6.g
    public final String w() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
