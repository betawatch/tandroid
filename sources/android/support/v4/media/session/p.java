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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            } catch (RemoteException e9) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e9);
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

    public final void d(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.putIfAbsent(rVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        rVar.f(handler);
        h hVar = this.a;
        hVar.a.registerCallback(rVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                g gVar = new g(rVar);
                hVar.d.put(rVar, gVar);
                rVar.c = gVar;
                try {
                    hVar.e.a().j(gVar);
                    rVar.e(13, null, null);
                } catch (RemoteException e9) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e9);
                }
            } else {
                rVar.c = null;
                hVar.c.add(rVar);
            }
        }
    }

    public final void e(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.b.remove(rVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.a.b(rVar);
        } finally {
            rVar.f(null);
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
