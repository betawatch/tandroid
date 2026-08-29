package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class b2 extends z5.g {
    @Override // z5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 11925000;
    }

    @Override // z5.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof c2 ? (c2) queryLocalInterface : new c2(iBinder);
    }

    @Override // z5.g
    public final String v() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // z5.g
    public final String w() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
