package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.a) {
        }
        return this.b;
    }

    public Parcel h1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void i1(Parcel parcel, int i7) {
        try {
            this.b.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel j1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void k1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel l1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public void m1(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel n1(Parcel parcel, int i7) {
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

    public Parcel o1(Parcel parcel, int i7) {
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

    public Parcel p1() {
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

    public Parcel q1(Parcel parcel, int i7) {
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

    public Parcel r1(Parcel parcel, int i7) {
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

    public void s1(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.b.transact(3, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void t1(Parcel parcel, int i7) {
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

    public void u1(Parcel parcel, int i7) {
        try {
            this.b.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel v1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        return obtain;
    }

    public Parcel w1(Parcel parcel, int i7) {
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
}
