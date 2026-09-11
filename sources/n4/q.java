package n4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class q extends Binder implements h {
    public static final /* synthetic */ int b = 0;
    public final WeakReference a;

    public q(r rVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new WeakReference(rVar);
    }

    public final void G0(f fVar) {
        r rVar = (r) this.a.get();
        if (rVar == null || fVar == null) {
            return;
        }
        rVar.f.register(fVar, new a0("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (rVar.d) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024a  */
    /* JADX WARN: Type inference failed for: r7v8, types: [n4.f] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        long j3;
        AbstractCollection abstractCollection;
        int i12;
        Bundle bundle;
        if (i10 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        f fVar = null;
        r7 = null;
        Bundle bundle2 = null;
        h0 h0Var = null;
        e eVar = null;
        switch (i10) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                    w.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                        e eVar2 = new e();
                        eVar2.a = readStrongBinder;
                        fVar = eVar2;
                    } else {
                        fVar = (f) queryLocalInterface;
                    }
                }
                G0(fVar);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof f)) {
                        e eVar3 = new e();
                        eVar3.a = readStrongBinder2;
                        eVar = eVar3;
                    } else {
                        eVar = (f) queryLocalInterface2;
                    }
                }
                r rVar = (r) this.a.get();
                if (rVar != null && eVar != null) {
                    rVar.f.unregister(eVar);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (rVar.d) {
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                throw new AssertionError();
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                throw new AssertionError();
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    i0.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r rVar2 = (r) this.a.get();
                if (rVar2 != null) {
                    h0Var = rVar2.g;
                    m mVar = rVar2.i;
                    if (h0Var != null) {
                        float f7 = h0Var.d;
                        long j10 = h0Var.n;
                        int i13 = h0Var.a;
                        long j11 = h0Var.b;
                        if (j11 != -1 && ((i13 == 3 || i13 == 4 || i13 == 5) && j10 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j12 = ((long) (f7 * (elapsedRealtime - j10))) + j11;
                            if (mVar != null) {
                                Bundle bundle3 = mVar.a;
                                if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                    j3 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                                    long j13 = (j3 >= 0 || j12 <= j3) ? j12 >= 0 ? 0L : j12 : j3;
                                    ArrayList arrayList = new ArrayList();
                                    long j14 = h0Var.c;
                                    long j15 = h0Var.e;
                                    int i14 = h0Var.f;
                                    CharSequence charSequence = h0Var.h;
                                    abstractCollection = h0Var.r;
                                    if (abstractCollection != null) {
                                        arrayList.addAll(abstractCollection);
                                    }
                                    h0Var = new h0(h0Var.a, j13, j14, h0Var.d, j15, i14, charSequence, elapsedRealtime, arrayList, h0Var.s, h0Var.v);
                                }
                            }
                            j3 = -1;
                            if (j3 >= 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            long j142 = h0Var.c;
                            long j152 = h0Var.e;
                            int i142 = h0Var.f;
                            CharSequence charSequence2 = h0Var.h;
                            abstractCollection = h0Var.r;
                            if (abstractCollection != null) {
                            }
                            h0Var = new h0(h0Var.a, j13, j142, h0Var.d, j152, i142, charSequence2, elapsedRealtime, arrayList2, h0Var.s, h0Var.v);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (h0Var == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                h0Var.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r rVar3 = (r) this.a.get();
                int i15 = rVar3 != null ? rVar3.j : 0;
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(i15);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r rVar4 = (r) this.a.get();
                i12 = rVar4 != null ? rVar4.k : -1;
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(i12);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    l.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    l.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    l.CREATOR.createFromParcel(parcel);
                }
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r rVar5 = (r) this.a.get();
                i12 = rVar5 != null ? rVar5.l : -1;
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(i12);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readFloat();
                throw new AssertionError();
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                r rVar6 = (r) this.a.get();
                if (rVar6 != null && (bundle = rVar6.e) != null) {
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
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    i0.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
