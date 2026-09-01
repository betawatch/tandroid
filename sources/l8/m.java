package l8;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.common.data.DataHolder;
import m8.a1;
import m8.c1;
import m8.e0;
import m8.l0;
import m8.m0;
import m8.w0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m extends a7.c {
    public volatile int b;
    public final /* synthetic */ k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super("com.google.android.gms.wearable.internal.IWearableListener", 9);
        this.c = kVar;
        this.b = -1;
    }

    public static final void K0(e0 e0Var, boolean z4, byte[] bArr) {
        try {
            e0Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(e0Var.c);
            int i10 = t7.a.a;
            obtain.writeInt(z4 ? 1 : 0);
            obtain.writeByteArray(bArr);
            try {
                e0Var.b.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e6) {
            Log.e("WearableLS", "Failed to send a response back", e6);
        }
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        e0 e0Var;
        e0 e0Var2;
        if (i10 == 13) {
            Object obj = (l0) t7.a.a(parcel, l0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                e0Var2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (!(queryLocalInterface instanceof e0)) {
                    e0Var = new e0(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", 9);
                    t7.a.b(parcel);
                    J0(new s1(this, obj, e0Var, false, 5), "onRequestReceived", obj);
                    return true;
                }
                e0Var2 = (e0) queryLocalInterface;
            }
            e0Var = e0Var2;
            t7.a.b(parcel);
            J0(new s1(this, obj, e0Var, false, 5), "onRequestReceived", obj);
            return true;
        }
        if (i10 != 14) {
            switch (i10) {
                case 1:
                    DataHolder dataHolder = (DataHolder) t7.a.a(parcel, DataHolder.CREATOR);
                    t7.a.b(parcel);
                    try {
                        if (!J0(new androidx.biometric.k(17, this, dataHolder), "onDataItemChanged", String.valueOf(dataHolder) + ", rows=" + dataHolder.n)) {
                            break;
                        }
                    } finally {
                        dataHolder.close();
                    }
                    break;
                case 2:
                    Object obj2 = (l0) t7.a.a(parcel, l0.CREATOR);
                    t7.a.b(parcel);
                    J0(new androidx.biometric.k(18, this, obj2), "onMessageReceived", obj2);
                    break;
                case 3:
                    m0 m0Var = (m0) t7.a.a(parcel, m0.CREATOR);
                    t7.a.b(parcel);
                    J0(new q(this, m0Var, 0), "onPeerConnected", m0Var);
                    break;
                case 4:
                    m0 m0Var2 = (m0) t7.a.a(parcel, m0.CREATOR);
                    t7.a.b(parcel);
                    J0(new q(this, m0Var2, 1), "onPeerDisconnected", m0Var2);
                    break;
                case 5:
                    Object createTypedArrayList = parcel.createTypedArrayList(m0.CREATOR);
                    t7.a.b(parcel);
                    J0(new androidx.biometric.k(19, this, createTypedArrayList), "onConnectedNodes", createTypedArrayList);
                    break;
                case 6:
                    Object obj3 = (c1) t7.a.a(parcel, c1.CREATOR);
                    t7.a.b(parcel);
                    J0(new androidx.biometric.k(21, this, obj3), "onNotificationReceived", obj3);
                    break;
                case 7:
                    Object obj4 = (m8.e) t7.a.a(parcel, m8.e.CREATOR);
                    t7.a.b(parcel);
                    J0(new androidx.biometric.k(23, this, obj4), "onChannelEvent", obj4);
                    break;
                case 8:
                    Object obj5 = (m8.b) t7.a.a(parcel, m8.b.CREATOR);
                    t7.a.b(parcel);
                    J0(new androidx.biometric.k(20, this, obj5), "onConnectedCapabilityChanged", obj5);
                    break;
                case 9:
                    Object obj6 = (w0) t7.a.a(parcel, w0.CREATOR);
                    t7.a.b(parcel);
                    J0(new androidx.biometric.k(22, this, obj6), "onEntityUpdate", obj6);
                    break;
                default:
                    return false;
            }
        } else {
            t7.a.b(parcel);
        }
        return true;
    }

    public final boolean J0(Runnable runnable, String str, Object obj) {
        Object obj2;
        boolean z4;
        p pVar;
        ComponentName componentName;
        if (Log.isLoggable("WearableLS", 3)) {
            componentName = this.c.zza;
            Log.d("WearableLS", String.format("%s: %s %s", str, componentName.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (a1.a(this.c).b() && i6.b.g(this.c, "com.google.android.wearable.app.cn", callingUid)) {
                this.b = callingUid;
            } else {
                if (!i6.b.e(this.c, callingUid)) {
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
                z4 = kVar.zzg;
                if (z4) {
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
