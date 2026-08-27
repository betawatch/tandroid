package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class w implements u {
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
    public t k;
    public y1.a l;

    public w(Context context, String str) {
        MediaSession e9 = e(context, str);
        this.a = e9;
        this.b = new MediaSessionCompat$Token(e9.getSessionToken(), new v(this));
        e9.setFlags(3);
    }

    @Override // android.support.v4.media.session.u
    public final t a() {
        t tVar;
        synchronized (this.c) {
            tVar = this.k;
        }
        return tVar;
    }

    @Override // android.support.v4.media.session.u
    public final PlaybackStateCompat b() {
        return this.f;
    }

    @Override // android.support.v4.media.session.u
    public y1.a c() {
        y1.a aVar;
        synchronized (this.c) {
            aVar = this.l;
        }
        return aVar;
    }

    @Override // android.support.v4.media.session.u
    public void d(y1.a aVar) {
        synchronized (this.c) {
            this.l = aVar;
        }
    }

    public MediaSession e(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void f(t tVar, Handler handler) {
        synchronized (this.c) {
            try {
                this.k = tVar;
                this.a.setCallback(tVar == null ? null : tVar.mCallbackFwk, handler);
                if (tVar != null) {
                    tVar.setSessionImpl(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
