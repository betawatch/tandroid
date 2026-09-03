package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) obj;
            g gVar = new g(sVar);
            this.d.put(sVar, gVar);
            sVar.c = gVar;
            try {
                mediaSessionCompat$Token.a().j(gVar);
                sVar.e(13, null, null);
            } catch (RemoteException e6) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e6);
            }
        }
        arrayList.clear();
    }

    public final void b(androidx.mediarouter.app.s sVar) {
        this.a.unregisterCallback(sVar.a);
        synchronized (this.b) {
            if (this.e.a() != null) {
                try {
                    g gVar = (g) this.d.remove(sVar);
                    if (gVar != null) {
                        sVar.c = null;
                        this.e.a().F(gVar);
                    }
                } catch (RemoteException e6) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e6);
                }
            } else {
                this.c.remove(sVar);
            }
        }
    }
}
