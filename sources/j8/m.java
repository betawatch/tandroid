package j8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.common.data.DataHolder;
import k8.b1;
import k8.d1;
import k8.e0;
import k8.m0;
import k8.n0;
import k8.x0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends c7.a {
    public volatile int b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 8);
        this.c = kVar;
        this.b = -1;
    }

    public static final void K0(e0 e0Var, boolean z10, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.c);
            int i10 = r7.a.a;
            obtain.writeInt(z10 ? 1 : 0);
            obtain.writeByteArray(bArr);
            try {
                e0Var.b.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e10) {
            Log.e("WearableLS", "Failed to send a response back", e10);
        }
    }

    @Override // c7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        e0 e0Var;
        e0 e0Var2;
        if (i10 == 13) {
            Object obj = (m0) r7.a.a(parcel, m0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                e0Var2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (!(queryLocalInterface instanceof e0)) {
                    e0Var = new e0(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 8);
                    r7.a.b(parcel);
                    J0(new q1(this, obj, e0Var, false, 5), "onRequestReceived", obj);
                    return true;
                }
                e0Var2 = (e0) queryLocalInterface;
            }
            e0Var = e0Var2;
            r7.a.b(parcel);
            J0(new q1(this, obj, e0Var, false, 5), "onRequestReceived", obj);
            return true;
        }
        if (i10 != 14) {
            switch (i10) {
                case 1:
                    DataHolder dataHolder = (DataHolder) r7.a.a(parcel, DataHolder.CREATOR);
                    r7.a.b(parcel);
                    try {
                        if (!J0(new ab.o(this, dataHolder, false, 17), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.n)) {
                            break;
                        }
                    } finally {
                        dataHolder.close();
                    }
                    break;
                case 2:
                    Object obj2 = (m0) r7.a.a(parcel, m0.CREATOR);
                    r7.a.b(parcel);
                    J0(new ab.o(this, obj2, false, 18), "onMessageReceived", obj2);
                    break;
                case 3:
                    n0 n0Var = (n0) r7.a.a(parcel, n0.CREATOR);
                    r7.a.b(parcel);
                    J0(new q(this, n0Var, 0), "onPeerConnected", n0Var);
                    break;
                case 4:
                    n0 n0Var2 = (n0) r7.a.a(parcel, n0.CREATOR);
                    r7.a.b(parcel);
                    J0(new q(this, n0Var2, 1), "onPeerDisconnected", n0Var2);
                    break;
                case 5:
                    Object createTypedArrayList = parcel.createTypedArrayList(n0.CREATOR);
                    r7.a.b(parcel);
                    J0(new ab.o(this, createTypedArrayList, false, 19), "onConnectedNodes", createTypedArrayList);
                    break;
                case 6:
                    Object obj3 = (d1) r7.a.a(parcel, d1.CREATOR);
                    r7.a.b(parcel);
                    J0(new ab.o(this, obj3, false, 21), "onNotificationReceived", obj3);
                    break;
                case 7:
                    Object obj4 = (k8.e) r7.a.a(parcel, k8.e.CREATOR);
                    r7.a.b(parcel);
                    J0(new ab.o(this, obj4, false, 23), "onChannelEvent", obj4);
                    break;
                case 8:
                    Object obj5 = (k8.b) r7.a.a(parcel, k8.b.CREATOR);
                    r7.a.b(parcel);
                    J0(new ab.o(this, obj5, false, 20), "onConnectedCapabilityChanged", obj5);
                    break;
                case 9:
                    Object obj6 = (x0) r7.a.a(parcel, x0.CREATOR);
                    r7.a.b(parcel);
                    J0(new ab.o(this, obj6, false, 22), "onEntityUpdate", obj6);
                    break;
                default:
                    return false;
            }
        } else {
            r7.a.b(parcel);
        }
        return true;
    }

    public final boolean J0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z10;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (b1.a(this.c).b() && g6.b.g(this.c, "com.google.android.wearable.app.cn", callingUid)) {
                this.b = callingUid;
            } else {
                if (!g6.b.e(this.c, callingUid)) {
                    Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                    return false;
                }
                this.b = callingUid;
            }
        }
        obj2 = this.c.zzf;
        synchronized (obj2) {
            try {
                k kVar = this.c;
                z10 = kVar.zzg;
                if (z10) {
                    return false;
                }
                pVar = kVar.zzb;
                pVar.post(runnable);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
