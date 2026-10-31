package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class u {
    public final MediaSession a;
    public final t b;
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

    public u(Context context, String str) {
        MediaSession a2 = a(context, str);
        this.a = a2;
        t tVar = new t(this);
        this.b = tVar;
        this.c = new MediaSessionCompat$Token(a2.getSessionToken(), tVar);
        a2.setFlags(3);
    }

    public MediaSession a(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final s b() {
        s sVar;
        synchronized (this.d) {
            sVar = this.k;
        }
        return sVar;
    }

    public y1.a c() {
        y1.a aVar;
        synchronized (this.d) {
            aVar = this.l;
        }
        return aVar;
    }

    public final PlaybackStateCompat d() {
        return this.f;
    }

    public final void e(s sVar, Handler handler) {
        synchronized (this.d) {
            try {
                this.k = sVar;
                this.a.setCallback(sVar == null ? null : (r) sVar.e, handler);
                if (sVar != null) {
                    sVar.c0(this, handler);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(y1.a aVar) {
        synchronized (this.d) {
            this.l = aVar;
        }
    }
}
