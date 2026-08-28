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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = Build.VERSION.SDK_INT;
        return i9 >= 29 ? new o(transportControls) : i9 >= 24 ? new n(transportControls) : i9 >= 23 ? new m(transportControls) : new l(transportControls);
    }

    public final void d(androidx.mediarouter.app.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.putIfAbsent(sVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        sVar.f(handler);
        h hVar = this.a;
        hVar.a.registerCallback(sVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                g gVar = new g(sVar);
                hVar.d.put(sVar, gVar);
                sVar.c = gVar;
                try {
                    hVar.e.a().k(gVar);
                    sVar.e(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                sVar.c = null;
                hVar.c.add(sVar);
            }
        }
    }

    public final void e(androidx.mediarouter.app.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.remove(sVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.a.b(sVar);
        } finally {
            sVar.f(null);
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
