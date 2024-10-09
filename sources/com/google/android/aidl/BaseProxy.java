package com.google.android.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class BaseProxy implements IInterface {
    private final String mDescriptor;
    private final IBinder mRemote;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseProxy(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.mDescriptor = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcel transactAndReadException(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.mRemote.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
