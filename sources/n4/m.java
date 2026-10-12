package n4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class m extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public m(n nVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(nVar);
    }

    public final void F0(b bVar) {
        n nVar = (n) this.a.get();
        if (nVar == null || bVar == null) {
            return;
        }
        nVar.f.register(bVar, new t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (nVar.d) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [n4.b] */
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12;
        Bundle bundle;
        b bVar = null;
        r5 = null;
        Bundle bundle2 = null;
        y yVar = null;
        a aVar = null;
        if (i10 == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    a aVar2 = new a();
                    aVar2.a = readStrongBinder;
                    bVar = aVar2;
                } else {
                    bVar = (b) queryLocalInterface;
                }
            }
            F0(bVar);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                    a aVar3 = new a();
                    aVar3.a = readStrongBinder2;
                    aVar = aVar3;
                } else {
                    aVar = (b) queryLocalInterface2;
                }
            }
            n nVar = (n) this.a.get();
            if (nVar != null && aVar != null) {
                nVar.f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (nVar.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            n nVar2 = (n) this.a.get();
            if (nVar2 != null) {
                yVar = nVar2.g;
                i iVar = nVar2.i;
                if (yVar != null) {
                    float f7 = yVar.d;
                    long j10 = yVar.n;
                    int i13 = yVar.a;
                    long j11 = yVar.b;
                    long j12 = -1;
                    if (j11 != -1 && ((i13 == 3 || i13 == 4 || i13 == 5) && j10 > 0)) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j13 = ((long) (f7 * (elapsedRealtime - j10))) + j11;
                        if (iVar != null) {
                            Bundle bundle3 = iVar.a;
                            if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                j12 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                            }
                        }
                        long j14 = (j12 < 0 || j13 <= j12) ? j13 < 0 ? 0L : j13 : j12;
                        ArrayList arrayList = new ArrayList();
                        long j15 = yVar.c;
                        long j16 = yVar.e;
                        int i14 = yVar.f;
                        CharSequence charSequence = yVar.h;
                        AbstractCollection abstractCollection = yVar.r;
                        if (abstractCollection != null) {
                            arrayList.addAll(abstractCollection);
                        }
                        yVar = new y(yVar.a, j14, j15, yVar.d, j16, i14, charSequence, elapsedRealtime, arrayList, yVar.s, yVar.v);
                    }
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            if (yVar == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            yVar.writeToParcel(parcel2, 1);
            return true;
        }
        if (i10 == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            n nVar3 = (n) this.a.get();
            i12 = nVar3 != null ? nVar3.j : -1;
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
        if (i10 == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i10 == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            n nVar4 = (n) this.a.get();
            i12 = nVar4 != null ? nVar4.k : -1;
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
        if (i10 != 50) {
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        n nVar5 = (n) this.a.get();
        if (nVar5 != null && (bundle = nVar5.e) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
