package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class v implements t {
    public final MediaSession a;
    public final u b;
    public final MediaSessionCompat$Token c;
    public final Object d = new Object();
    public final RemoteCallbackList e = new RemoteCallbackList();
    public PlaybackStateCompat f;
    public List g;
    public MediaMetadataCompat h;
    public int i;
    public int j;
    public s k;
    public y1.a l;

    public v(Context context, String str) {
        MediaSession e7 = e(context, str);
        this.a = e7;
        u uVar = new u(this);
        this.b = uVar;
        this.c = new MediaSessionCompat$Token(e7.getSessionToken(), uVar);
        e7.setFlags(3);
    }

    @Override // android.support.v4.media.session.t
    public final s a() {
        s sVar;
        synchronized (this.d) {
            sVar = this.k;
        }
        return sVar;
    }

    @Override // android.support.v4.media.session.t
    public y1.a b() {
        y1.a aVar;
        synchronized (this.d) {
            aVar = this.l;
        }
        return aVar;
    }

    @Override // android.support.v4.media.session.t
    public void c(y1.a aVar) {
        synchronized (this.d) {
            this.l = aVar;
        }
    }

    @Override // android.support.v4.media.session.t
    public final PlaybackStateCompat d() {
        return this.f;
    }

    public MediaSession e(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void f(s sVar, Handler handler) {
        synchronized (this.d) {
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
