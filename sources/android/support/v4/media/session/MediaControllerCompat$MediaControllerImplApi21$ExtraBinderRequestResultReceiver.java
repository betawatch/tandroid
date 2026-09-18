package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        d dVar;
        h hVar = (h) this.a.get();
        if (hVar == null || bundle == null) {
            return;
        }
        synchronized (hVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = hVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i11 = u.b;
            if (binder == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.a = binder;
                    dVar = cVar;
                } else {
                    dVar = (d) queryLocalInterface;
                }
            }
            mediaSessionCompat$Token.b(dVar);
            hVar.e.c(y4.a.a(bundle));
            hVar.a();
        }
    }
}
