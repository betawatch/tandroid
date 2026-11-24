// default package

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import org.telegram.messenger.WearAuthListenerService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g7d extends e1d {
    public volatile int b;
    public final /* synthetic */ WearAuthListenerService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7d(WearAuthListenerService wearAuthListenerService) {
        super("com.google.android.gms.wearable.internal.IWearableListener", (byte) 12);
        this.c = wearAuthListenerService;
        this.b = -1;
    }

    public final boolean T(Runnable runnable, String str, Object obj) {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", String.format("%s: %s %s", str, this.c.a.toString(), obj));
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (vne.a(this.c).b() && cze.b(callingUid, this.c, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else {
                if (!cze.a(this.c, callingUid)) {
                    Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                    return false;
                }
                this.b = callingUid;
            }
        }
        synchronized (this.c.f) {
            WearAuthListenerService wearAuthListenerService = this.c;
            if (wearAuthListenerService.h) {
                return false;
            }
            wearAuthListenerService.b.post(runnable);
            return true;
        }
    }

    @Override // e1d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        vzd vzdVar;
        byte b = 20;
        if (i == 13) {
            k7e k7eVar = (k7e) cjd.a(parcel, k7e.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                vzdVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                vzdVar = queryLocalInterface instanceof vzd ? (vzd) queryLocalInterface : new vzd(readStrongBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback", (byte) 9);
            }
            cjd.b(parcel);
            T(new tnd(this, k7eVar, vzdVar, b), "onRequestReceived", k7eVar);
            return true;
        }
        if (i == 14) {
            cjd.b(parcel);
            return true;
        }
        boolean z = false;
        switch (i) {
            case 1:
                DataHolder dataHolder = (DataHolder) cjd.a(parcel, DataHolder.CREATOR);
                cjd.b(parcel);
                Runnable eqdVar = new eqd(this, dataHolder);
                try {
                    String valueOf = String.valueOf(dataHolder);
                    int i2 = dataHolder.n;
                    StringBuilder sb = new StringBuilder();
                    sb.append(valueOf);
                    sb.append(", rows=");
                    sb.append(i2);
                    return !T(eqdVar, "onDataItemChanged", sb.toString()) ? true : true;
                } finally {
                    dataHolder.close();
                }
            case 2:
                Object obj = (k7e) cjd.a(parcel, k7e.CREATOR);
                cjd.b(parcel);
                T(new us4(this, obj, z, (byte) 23), "onMessageReceived", obj);
                return true;
            case 3:
                Object obj2 = (bbe) cjd.a(parcel, bbe.CREATOR);
                cjd.b(parcel);
                T(new sw((Binder) this, obj2, (byte) 17), "onPeerConnected", obj2);
                return true;
            case 4:
                Object obj3 = (bbe) cjd.a(parcel, bbe.CREATOR);
                cjd.b(parcel);
                T(new sw((Binder) this, obj3, (byte) 18), "onPeerDisconnected", obj3);
                return true;
            case 5:
                Object createTypedArrayList = parcel.createTypedArrayList(bbe.CREATOR);
                cjd.b(parcel);
                T(new sw((Binder) this, createTypedArrayList, (byte) 19), "onConnectedNodes", createTypedArrayList);
                return true;
            case 6:
                Object obj4 = (oye) cjd.a(parcel, oye.CREATOR);
                cjd.b(parcel);
                T(new sw((Binder) this, obj4, (byte) 21), "onNotificationReceived", obj4);
                return true;
            case 7:
                Object obj5 = (ved) cjd.a(parcel, ved.CREATOR);
                cjd.b(parcel);
                T(new us4(this, obj5, z, (byte) 25), "onChannelEvent", obj5);
                return true;
            case 8:
                Object obj6 = (rad) cjd.a(parcel, rad.CREATOR);
                cjd.b(parcel);
                T(new sw(this, obj6, b), "onConnectedCapabilityChanged", obj6);
                return true;
            case 9:
                Object obj7 = (uje) cjd.a(parcel, uje.CREATOR);
                cjd.b(parcel);
                T(new sw((Binder) this, obj7, (byte) 22), "onEntityUpdate", obj7);
                return true;
            default:
                return false;
        }
    }
}
