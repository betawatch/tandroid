package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class h {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) obj;
            g gVar = new g(rVar);
            this.d.put(rVar, gVar);
            rVar.c = gVar;
            try {
                mediaSessionCompat$Token.a().o(gVar);
                rVar.e(13, null, null);
            } catch (RemoteException e7) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
            }
        }
        arrayList.clear();
    }

    public final void b(androidx.mediarouter.app.r rVar) {
        this.a.unregisterCallback(rVar.a);
        synchronized (this.b) {
            if (this.e.a() != null) {
                try {
                    g gVar = (g) this.d.remove(rVar);
                    if (gVar != null) {
                        rVar.c = null;
                        this.e.a().M(gVar);
                    }
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e7);
                }
            } else {
                this.c.remove(rVar);
            }
        }
    }
}
