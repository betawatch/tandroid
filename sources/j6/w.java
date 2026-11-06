package j6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import f6.y;
import m.q3;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class w extends q6.h {
    public static final b J = new b("CastClientImplCxless", null);
    public final CastDevice F;
    public final long G;
    public final Bundle H;
    public final String I;

    public w(Context context, Looper looper, q3 q3Var, CastDevice castDevice, long j3, Bundle bundle, String str, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar) {
        super(context, looper, 10, q3Var, kVar, lVar, 0);
        this.F = castDevice;
        this.G = j3;
        this.H = bundle;
        this.I = str;
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final void a() {
        try {
            try {
                ((f) n()).X0();
            } finally {
                super.a();
            }
        } catch (RemoteException | IllegalStateException e10) {
            J.a(e10, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 19390000;
    }

    @Override // q6.d
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return y.e;
    }

    @Override // q6.d
    public final Bundle m() {
        Bundle bundle = new Bundle();
        J.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.F;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.G);
        bundle.putString("connectionless_client_record_id", this.I);
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
