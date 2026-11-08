package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
    public b2.a l;

    public u(Context context, String str) {
        MediaSession a10 = a(context, str);
        this.a = a10;
        t tVar = new t(this);
        this.b = tVar;
        this.c = new MediaSessionCompat$Token(a10.getSessionToken(), tVar);
        a10.setFlags(3);
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

    public b2.a c() {
        b2.a aVar;
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

    public void f(b2.a aVar) {
        synchronized (this.d) {
            this.l = aVar;
        }
    }
}
