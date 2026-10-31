package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class b2 implements IInterface {
    public final IBinder a;

    public b2(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
