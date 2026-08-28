package b7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a implements IInterface {
    public final /* synthetic */ int a;
    public final IBinder b;
    public final String c;

    public /* synthetic */ a(IBinder iBinder, String str, int i9) {
        this.a = i9;
        this.b = iBinder;
        this.c = str;
    }

    public Parcel E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void F0(Parcel parcel, int i9) {
        try {
            this.b.transact(i9, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void H0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i9, parcel, obtain, 0);
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

    public void J0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i9, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel K0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i9, parcel, obtain, 0);
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

    public Parcel L0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i9, parcel, obtain, 0);
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
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.c);
                return obtain3;
            case 3:
            case 4:
            default:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.c);
                return obtain4;
            case 5:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.c);
                return obtain5;
        }
    }

    public Parcel N0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i9, parcel, obtain, 0);
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

    public Parcel O0(Parcel parcel, int i9) {
        switch (this.a) {
            case 2:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i9, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e10) {
                        obtain.recycle();
                        throw e10;
                    }
                } finally {
                }
            case 5:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.b.transact(i9, parcel, obtain2, 0);
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
                        this.b.transact(i9, parcel, obtain3, 0);
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

    public void Q0(Parcel parcel, int i9) {
        Parcel obtain;
        switch (this.a) {
            case 0:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 3:
            case 4:
            default:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 5:
                obtain = Parcel.obtain();
                try {
                    this.b.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void R0(Parcel parcel, int i9) {
        try {
            this.b.transact(i9, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel S0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public Parcel T0(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i9, parcel, obtain, 0);
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
