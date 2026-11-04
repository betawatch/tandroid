package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import d2.v0;
import g9.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends Handler {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p2.b bVar, Looper looper) {
        super(looper);
        this.c = bVar;
    }

    public boolean a(Message message, p2.w wVar) {
        long min;
        p2.a aVar = (p2.a) message.obj;
        if (aVar.b) {
            int i3 = aVar.e + 1;
            aVar.e = i3;
            ((p2.b) this.c).i.getClass();
            if (i3 <= 3) {
                w2.u uVar = new w2.u(wVar.a, wVar.b, wVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - aVar.c, wVar.d);
                kb.a aVar2 = ((p2.b) this.c).i;
                int i10 = aVar.e;
                aVar2.getClass();
                for (Throwable lVar = wVar.getCause() instanceof IOException ? (IOException) wVar.getCause() : new androidx.datastore.preferences.protobuf.l(wVar.getCause()); lVar != null; lVar = lVar.getCause()) {
                    if ((lVar instanceof v0) || (lVar instanceof FileNotFoundException) || (lVar instanceof i2.v) || (lVar instanceof a3.p) || ((lVar instanceof i2.k) && ((i2.k) lVar).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i10 - 1) * 1000, 5000);
                if (min == -9223372036854775807L) {
                    return false;
                }
                synchronized (((p2.b) this.c).o) {
                    nh nhVar = ((p2.b) this.c).y;
                    if (nhVar != null) {
                        ((f0) nhVar.b).c(uVar);
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
        w2.u uVar;
        switch (this.a) {
            case 0:
                androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            a0.f(message.getData());
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
                            a0.f((Bundle) message.obj);
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
                p2.a aVar = (p2.a) message.obj;
                try {
                    int i3 = message.what;
                    if (i3 == 1) {
                        obj = ((p2.b) this.c).k.o((p2.p) aVar.d);
                    } else {
                        if (i3 != 2) {
                            throw new RuntimeException();
                        }
                        p2.b bVar = (p2.b) this.c;
                        p2.v n4 = bVar.k.n(bVar.l, (p2.o) aVar.d);
                        synchronized (((p2.b) this.c).o) {
                            try {
                                nh nhVar = ((p2.b) this.c).y;
                                if (nhVar != null && (uVar = n4.b) != null) {
                                    ((f0) nhVar.b).c(new w2.u(uVar.a, uVar.b, uVar.c, uVar.d, SystemClock.elapsedRealtime() - aVar.c, uVar.f));
                                }
                            } finally {
                            }
                        }
                        obj = n4;
                    }
                } catch (p2.w e10) {
                    boolean a10 = a(message, e10);
                    obj = e10;
                    if (a10) {
                        return;
                    }
                } catch (Exception e11) {
                    g2.a.m("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                    obj = e11;
                }
                kb.a aVar2 = ((p2.b) this.c).i;
                long j10 = aVar.a;
                aVar2.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((p2.b) this.c).n.obtainMessage(message.what, Pair.create(aVar.d, obj)).sendToTarget();
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
