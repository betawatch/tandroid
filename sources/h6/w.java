package h6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import d6.y;
import m.r3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class w extends o6.g {
    public static final b Y = new b("CastClientImplCxless", null);
    public final CastDevice U;
    public final long V;
    public final Bundle W;
    public final String X;

    public w(Context context, Looper looper, r3 r3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, r3Var, kVar, lVar, 0);
        this.U = castDevice;
        this.V = j10;
        this.W = bundle;
        this.X = str;
    }

    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final void disconnect() {
        try {
            try {
                ((f) u()).V0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e) {
            Y.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 19390000;
    }

    @Override // o6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return y.e;
    }

    @Override // o6.g
    public final Bundle t() {
        Bundle bundle = new Bundle();
        Y.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.U;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.V);
        bundle.putString("connectionless_client_record_id", this.X);
        Bundle bundle2 = this.W;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
