package g6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c6.y;
import com.google.android.gms.cast.CastDevice;
import m.r3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w extends n6.g {
    public static final b Y = new b("CastClientImplCxless", null);
    public final CastDevice U;
    public final long V;
    public final Bundle W;
    public final String X;

    public w(Context context, Looper looper, r3 r3Var, CastDevice castDevice, long j3, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, r3Var, kVar, lVar, 0);
        this.U = castDevice;
        this.V = j3;
        this.W = bundle;
        this.X = str;
    }

    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final void disconnect() {
        try {
            try {
                ((f) u()).W0();
            } finally {
                super.disconnect();
            }
        } catch (RemoteException | IllegalStateException e) {
            Y.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 19390000;
    }

    @Override // n6.g
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return y.e;
    }

    @Override // n6.g
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

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
