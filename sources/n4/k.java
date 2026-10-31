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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k extends Binder implements d {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public k(l lVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(lVar);
    }

    public final void H0(b bVar) {
        l lVar = (l) this.a.get();
        if (lVar == null || bVar == null) {
            return;
        }
        lVar.f.register(bVar, new r("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (lVar.d) {
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
        w wVar = null;
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
            H0(bVar);
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
            l lVar = (l) this.a.get();
            if (lVar != null && aVar != null) {
                lVar.f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (lVar.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            l lVar2 = (l) this.a.get();
            if (lVar2 != null) {
                wVar = lVar2.g;
                i iVar = lVar2.i;
                if (wVar != null) {
                    float f7 = wVar.d;
                    long j10 = wVar.n;
                    int i13 = wVar.a;
                    long j11 = wVar.b;
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
                        long j15 = wVar.c;
                        long j16 = wVar.e;
                        int i14 = wVar.f;
                        CharSequence charSequence = wVar.h;
                        AbstractCollection abstractCollection = wVar.r;
                        if (abstractCollection != null) {
                            arrayList.addAll(abstractCollection);
                        }
                        wVar = new w(wVar.a, j14, j15, wVar.d, j16, i14, charSequence, elapsedRealtime, arrayList, wVar.s, wVar.w);
                    }
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            if (wVar == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            wVar.writeToParcel(parcel2, 1);
            return true;
        }
        if (i10 == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            l lVar3 = (l) this.a.get();
            i12 = lVar3 != null ? lVar3.j : -1;
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
            l lVar4 = (l) this.a.get();
            i12 = lVar4 != null ? lVar4.k : -1;
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
        l lVar5 = (l) this.a.get();
        if (lVar5 != null && (bundle = lVar5.e) != null) {
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
