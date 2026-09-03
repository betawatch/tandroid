package a7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a implements IInterface {
    public final /* synthetic */ int a;
    public final IBinder b;
    public final String c;

    public /* synthetic */ a(IBinder iBinder, String str, int i10) {
        this.a = i10;
        this.b = iBinder;
        this.c = str;
    }

    public Parcel E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void F0(Parcel parcel, int i10) {
        try {
            this.b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void H0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel I0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void J0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel K0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i10, parcel, obtain, 0);
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

    public Parcel L0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i10, parcel, obtain, 0);
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

    public Parcel M0() {
        switch (this.a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.c);
                return obtain;
            case 1:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.c);
                return obtain2;
            case 2:
            case 3:
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.c);
                return obtain3;
            case 4:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.c);
                return obtain4;
            case 5:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.c);
                return obtain5;
        }
    }

    public Parcel N0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i10, parcel, obtain, 0);
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

    public Parcel O0(Parcel parcel, int i10) {
        switch (this.a) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i10, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e) {
                        obtain.recycle();
                        throw e;
                    }
                } finally {
                }
            case 6:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i10, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } finally {
                    }
                } catch (RuntimeException e6) {
                    obtain2.recycle();
                    throw e6;
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i10, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e10) {
                        obtain3.recycle();
                        throw e10;
                    }
                } finally {
                }
        }
    }

    public void P0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void Q0(Parcel parcel, int i10) {
        Parcel obtain;
        switch (this.a) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
            case 3:
            default:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 4:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 5:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 6:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i10, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void R0(Parcel parcel, int i10) {
        try {
            this.b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel S0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public Parcel T0(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i10, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.a) {
        }
        return this.b;
    }
}
