package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class v implements t {
    public final MediaSession a;
    public final MediaSessionCompat$Token b;
    public final Object c = new Object();
    public boolean d = false;
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public List g;
    public MediaMetadataCompat h;
    public int i;
    public int j;
    public s k;
    public y1.a l;

    public v(Context context, String str) {
        MediaSession e = e(context, str);
        this.a = e;
        this.b = new MediaSessionCompat$Token(e.getSessionToken(), new u(this));
        e.setFlags(3);
    }

    @Override // android.support.v4.media.session.t
    public final s a() {
        s sVar;
        synchronized (this.c) {
            sVar = this.k;
        }
        return sVar;
    }

    @Override // android.support.v4.media.session.t
    public y1.a b() {
        y1.a aVar;
        synchronized (this.c) {
            aVar = this.l;
        }
        return aVar;
    }

    @Override // android.support.v4.media.session.t
    public final PlaybackStateCompat c() {
        return this.f;
    }

    @Override // android.support.v4.media.session.t
    public void d(y1.a aVar) {
        synchronized (this.c) {
            this.l = aVar;
        }
    }

    public MediaSession e(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void f(s sVar, Handler handler) {
        synchronized (this.c) {
            try {
                this.k = sVar;
                this.a.setCallback(sVar == null ? null : sVar.mCallbackFwk, handler);
                if (sVar != null) {
                    sVar.setSessionImpl(this, handler);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
