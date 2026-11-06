package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class a implements IInterface {
    public final /* synthetic */ int a;
    public final IBinder b;
    public final String c;

    public /* synthetic */ a(IBinder iBinder, String str, int i7) {
        this.a = i7;
        this.b = iBinder;
        this.c = str;
    }

    public Parcel H0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void I0(Parcel parcel, int i7) {
        try {
            this.b.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel J0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void K0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel L0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void M0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel N0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel O0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel P0() {
        switch (this.a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.c);
                return obtain;
            case 2:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.c);
                return obtain2;
            case 9:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.c);
                return obtain3;
            case 10:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.c);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.c);
                return obtain5;
        }
    }

    public Parcel Q0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel R0(Parcel parcel, int i7) {
        switch (this.a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i7, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e10) {
                        obtain.recycle();
                        throw e10;
                    }
                } finally {
                }
            case 1:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i7, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } finally {
                    }
                } catch (RuntimeException e11) {
                    obtain2.recycle();
                    throw e11;
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i7, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e12) {
                        obtain3.recycle();
                        throw e12;
                    }
                } finally {
                }
        }
    }

    public void S0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void T0(Parcel parcel, int i7) {
        Parcel obtain;
        switch (this.a) {
            case 0:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i7, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i7, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i7, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 10:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i7, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i7, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void U0(Parcel parcel, int i7) {
        try {
            this.b.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel V0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public Parcel W0(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
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
