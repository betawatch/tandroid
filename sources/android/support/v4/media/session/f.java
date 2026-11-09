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
import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public boolean a(Message message, q2.w wVar) {
        long min;
        q2.a aVar = (q2.a) message.obj;
        if (aVar.b) {
            int i7 = aVar.e + 1;
            aVar.e = i7;
            ((q2.b) this.c).i.getClass();
            if (i7 <= 3) {
                x2.u uVar = new x2.u(wVar.a, wVar.b, wVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - aVar.c, wVar.d);
                pb.b bVar = ((q2.b) this.c).i;
                int i10 = aVar.e;
                bVar.getClass();
                for (Throwable lVar = wVar.getCause() instanceof IOException ? (IOException) wVar.getCause() : new androidx.datastore.preferences.protobuf.l(wVar.getCause()); lVar != null; lVar = lVar.getCause()) {
                    if ((lVar instanceof t0) || (lVar instanceof FileNotFoundException) || (lVar instanceof j2.v) || (lVar instanceof b3.n) || ((lVar instanceof j2.j) && ((j2.j) lVar).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i10 - 1) * 1000, 5000);
                if (min == -9223372036854775807L) {
                    return false;
                }
                synchronized (((q2.b) this.c).o) {
                    rt rtVar = ((q2.b) this.c).y;
                    if (rtVar != null) {
                        ((f0) rtVar.b).c(uVar);
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
        x2.u uVar;
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
                        obj = ((q2.b) this.c).k.n((q2.p) aVar.d);
                    } else {
                        if (i7 != 2) {
                            throw new RuntimeException();
                        }
                        q2.b bVar = (q2.b) this.c;
                        q2.v m10 = bVar.k.m(bVar.l, (q2.o) aVar.d);
                        synchronized (((q2.b) this.c).o) {
                            try {
                                rt rtVar = ((q2.b) this.c).y;
                                if (rtVar != null && (uVar = m10.b) != null) {
                                    ((f0) rtVar.b).c(new x2.u(uVar.a, uVar.b, uVar.c, uVar.d, SystemClock.elapsedRealtime() - aVar.c, uVar.f));
                                }
                            } finally {
                            }
                        }
                        obj = m10;
                    }
                } catch (q2.w e10) {
                    boolean a10 = a(message, e10);
                    obj = e10;
                    if (a10) {
                        return;
                    }
                } catch (Exception e11) {
                    h2.a.m("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                    obj = e11;
                }
                pb.b bVar2 = ((q2.b) this.c).i;
                long j3 = aVar.a;
                bVar2.getClass();
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
