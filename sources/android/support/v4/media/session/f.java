package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import e2.t0;
import h9.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f extends Handler {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q2.b bVar, Looper looper) {
        super(looper);
        this.c = bVar;
    }

    public boolean a(Message message, q2.x xVar) {
        long min;
        q2.a aVar = (q2.a) message.obj;
        if (aVar.b) {
            int i7 = aVar.e + 1;
            aVar.e = i7;
            ((q2.b) this.c).i.getClass();
            if (i7 <= 3) {
                x2.t tVar = new x2.t(xVar.a, xVar.b, xVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - aVar.c, xVar.d);
                qb.a aVar2 = ((q2.b) this.c).i;
                int i10 = aVar.e;
                aVar2.getClass();
                for (Throwable lVar = xVar.getCause() instanceof IOException ? (IOException) xVar.getCause() : new androidx.datastore.preferences.protobuf.l(xVar.getCause()); lVar != null; lVar = lVar.getCause()) {
                    if ((lVar instanceof t0) || (lVar instanceof FileNotFoundException) || (lVar instanceof j2.u) || (lVar instanceof b3.n) || ((lVar instanceof j2.j) && ((j2.j) lVar).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i10 - 1) * 1000, 5000);
                if (min == -9223372036854775807L) {
                    return false;
                }
                synchronized (((q2.b) this.c).o) {
                    ff ffVar = ((q2.b) this.c).y;
                    if (ffVar != null) {
                        ((f0) ffVar.b).c(tVar);
                    }
                }
                synchronized (this) {
                    try {
                        if (this.b) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), min);
                        return true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    public synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        x2.t tVar;
        switch (this.a) {
            case 0:
                androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            a0.g(message.getData());
                            return;
                        case 2:
                            qVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            qVar.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            a0.g((Bundle) message.obj);
                            return;
                        case 8:
                            qVar.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            return;
                    }
                }
                return;
            default:
                q2.a aVar = (q2.a) message.obj;
                try {
                    int i7 = message.what;
                    if (i7 == 1) {
                        obj = ((q2.b) this.c).k.n((q2.q) aVar.d);
                    } else {
                        if (i7 != 2) {
                            throw new RuntimeException();
                        }
                        q2.b bVar = (q2.b) this.c;
                        q2.w m10 = bVar.k.m(bVar.l, (q2.p) aVar.d);
                        synchronized (((q2.b) this.c).o) {
                            try {
                                ff ffVar = ((q2.b) this.c).y;
                                if (ffVar != null && (tVar = m10.b) != null) {
                                    ((f0) ffVar.b).c(new x2.t(tVar.a, tVar.b, tVar.c, tVar.d, SystemClock.elapsedRealtime() - aVar.c, tVar.f));
                                }
                            } finally {
                            }
                        }
                        obj = m10;
                    }
                } catch (q2.x e10) {
                    boolean a10 = a(message, e10);
                    obj = e10;
                    if (a10) {
                        return;
                    }
                } catch (Exception e11) {
                    h2.a.m("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                    obj = e11;
                }
                qb.a aVar2 = ((q2.b) this.c).i;
                long j3 = aVar.a;
                aVar2.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((q2.b) this.c).n.obtainMessage(message.what, Pair.create(aVar.d, obj)).sendToTarget();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.q qVar, Looper looper) {
        super(looper);
        this.c = qVar;
        this.b = false;
    }
}
