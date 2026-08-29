package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p {
    public final h a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public p(Context context, d0 d0Var) {
        MediaSessionCompat$Token mediaSessionCompat$Token = d0Var.a.b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new i(context, mediaSessionCompat$Token);
        } else {
            this.a = new h(context, mediaSessionCompat$Token);
        }
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = this.a.a.getMetadata();
        if (metadata == null) {
            return null;
        }
        a0.f fVar = MediaMetadataCompat.d;
        Parcel obtain = Parcel.obtain();
        metadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.b = metadata;
        return createFromParcel;
    }

    public final PlaybackStateCompat b() {
        h hVar = this.a;
        MediaSessionCompat$Token mediaSessionCompat$Token = hVar.e;
        if (mediaSessionCompat$Token.a() != null) {
            try {
                return mediaSessionCompat$Token.a().b();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
            }
        }
        PlaybackState playbackState = hVar.a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public final l c() {
        MediaController.TransportControls transportControls = this.a.a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new o(transportControls) : i10 >= 24 ? new n(transportControls) : i10 >= 23 ? new m(transportControls) : new l(transportControls);
    }

    public final void d(androidx.mediarouter.app.p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.putIfAbsent(pVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        pVar.f(handler);
        h hVar = this.a;
        hVar.a.registerCallback(pVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                g gVar = new g(pVar);
                hVar.d.put(pVar, gVar);
                pVar.c = gVar;
                try {
                    hVar.e.a().k(gVar);
                    pVar.e(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                pVar.c = null;
                hVar.c.add(pVar);
            }
        }
    }

    public final void e(androidx.mediarouter.app.p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.remove(pVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.a.b(pVar);
        } finally {
            pVar.f(null);
        }
    }

    public p(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            this.a = new h(context, mediaSessionCompat$Token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
