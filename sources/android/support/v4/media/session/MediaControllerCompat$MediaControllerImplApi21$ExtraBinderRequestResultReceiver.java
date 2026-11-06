package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i7, Bundle bundle) {
        d dVar;
        h hVar = (h) this.a.get();
        if (hVar == null || bundle == null) {
            return;
        }
        synchronized (hVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = hVar.e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i10 = t.b;
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
            hVar.e.c(b5.a.c(bundle));
            hVar.a();
        }
    }
}
