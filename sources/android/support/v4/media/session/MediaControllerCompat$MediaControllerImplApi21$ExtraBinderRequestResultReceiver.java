package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        ok5 ok5Var;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = d.b;
            if (binder == null) {
                ok5Var = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof ok5)) {
                    mk5 mk5Var = new mk5();
                    mk5Var.a = binder;
                    ok5Var = mk5Var;
                } else {
                    ok5Var = (ok5) queryLocalInterface;
                }
            }
            mediaSessionCompat$Token.b(ok5Var);
            aVar.e.c(cy7.b(bundle));
            aVar.a();
        }
    }
}
