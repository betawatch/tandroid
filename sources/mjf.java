// default package

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mjf extends zz4 {
    public static final ce6 I = new ce6("CastClientImplCxless", null);
    public final CastDevice F;
    public final Bundle G;
    public final String H;

    public mjf(Context context, Looper looper, ovb ovbVar, CastDevice castDevice, Bundle bundle, String str, f05 f05Var, g05 g05Var) {
        super(10, f05Var, g05Var, ovbVar, context, looper);
        this.F = castDevice;
        this.G = bundle;
        this.H = str;
    }

    @Override // hh0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof z8d ? (z8d) queryLocalInterface : new z8d(iBinder);
    }

    @Override // hh0
    public final void c() {
        try {
            try {
                ((z8d) k()).Z();
            } finally {
                super.c();
            }
        } catch (RemoteException | IllegalStateException e) {
            I.a(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // hh0
    public final o94[] f() {
        return jgd.e;
    }

    @Override // hh0
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

    @Override // hh0
    public final int i() {
        return 19390000;
    }

    @Override // hh0
    public final String l() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // hh0
    public final String n() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // hh0
    public final boolean x() {
        return true;
    }
}
