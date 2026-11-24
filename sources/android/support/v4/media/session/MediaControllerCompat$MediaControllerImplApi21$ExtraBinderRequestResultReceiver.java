package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        lk5 lk5Var;
        a aVar = (a) this.a.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = d.b;
            if (binder == null) {
                lk5Var = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof lk5)) {
                    jk5 jk5Var = new jk5();
                    jk5Var.a = binder;
                    lk5Var = jk5Var;
                } else {
                    lk5Var = (lk5) queryLocalInterface;
                }
            }
            mediaSessionCompat$Token.b(lk5Var);
            aVar.e.c(ww7.b(bundle));
            aVar.a();
        }
    }
}
