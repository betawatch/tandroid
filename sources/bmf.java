// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bmf extends d05 {
    public static final he6 I = new he6("CastClientImplCxless", null);
    public final CastDevice F;
    public final Bundle G;
    public final String H;

    public bmf(Context context, Looper looper, oxb oxbVar, CastDevice castDevice, Bundle bundle, String str, k05 k05Var, l05 l05Var) {
        super(10, k05Var, l05Var, oxbVar, context, looper);
        this.F = castDevice;
        this.G = bundle;
        this.H = str;
    }

    @Override // hg0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof qbd ? (qbd) queryLocalInterface : new qbd(iBinder);
    }

    @Override // hg0
    public final void c() {
        try {
            try {
                ((qbd) k()).Z();
            } finally {
                super.c();
            }
        } catch (RemoteException | IllegalStateException e) {
            I.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // hg0
    public final a94[] f() {
        return zid.e;
    }

    @Override // hg0
    public final Bundle h() {
        Bundle bundle = new Bundle();
        I.b("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.F;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.H);
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // hg0
    public final int i() {
        return 19390000;
    }

    @Override // hg0
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // hg0
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // hg0
    public final boolean x() {
        return true;
    }
}
