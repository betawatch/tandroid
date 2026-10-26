package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class y1 extends o6.g {
    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 11925000;
    }

    @Override // o6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof z1 ? (z1) queryLocalInterface : new z1(iBinder);
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
