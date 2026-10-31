package g6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c6.y;
import com.google.android.gms.cast.CastDevice;
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w extends n6.g {
    public static final b Y = new b("CastClientImplCxless", null);
    public final CastDevice U;
    public final long V;
    public final Bundle W;
    public final String X;

    public w(Context context, Looper looper, p3 p3Var, CastDevice castDevice, long j10, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, p3Var, kVar, lVar, 0);
        this.U = castDevice;
        this.V = j10;
        this.W = bundle;
        this.X = str;
    }

    @Override // n6.g
    public final boolean D() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final void j() {
        try {
            try {
                ((f) v()).X0();
            } finally {
                super.j();
            }
        } catch (RemoteException | IllegalStateException e) {
            Y.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 19390000;
    }

    @Override // n6.g
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return y.e;
    }

    @Override // n6.g
    public final Bundle u() {
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
    public final String w() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
