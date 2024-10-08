package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zba implements IInterface {
    private final IBinder zba;
    private final String zbb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zba(IBinder iBinder, String str) {
        this.zba = iBinder;
        this.zbb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zba;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zba() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zbb);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zbb(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zba.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
