package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import b2.x0;
import com.google.android.gms.internal.cast.w4;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends Handler {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n2.b bVar, Looper looper) {
        super(looper);
        this.c = bVar;
    }

    public boolean a(Message message, n2.w wVar) {
        long min;
        n2.a aVar = (n2.a) message.obj;
        if (aVar.b) {
            int i10 = aVar.e + 1;
            aVar.e = i10;
            ((n2.b) this.c).i.getClass();
            if (i10 <= 3) {
                u2.u uVar = new u2.u(wVar.a, wVar.b, wVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - aVar.c, wVar.d);
                u7.s sVar = ((n2.b) this.c).i;
                int i11 = aVar.e;
                sVar.getClass();
                for (Throwable w4Var = wVar.getCause() instanceof IOException ? (IOException) wVar.getCause() : new w4(wVar.getCause()); w4Var != null; w4Var = w4Var.getCause()) {
                    if ((w4Var instanceof x0) || (w4Var instanceof FileNotFoundException) || (w4Var instanceof g2.u) || (w4Var instanceof y2.k) || ((w4Var instanceof g2.j) && ((g2.j) w4Var).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i11 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
                if (min == -9223372036854775807L) {
                    return false;
                }
                synchronized (((n2.b) this.c).o) {
                    jg.i iVar = ((n2.b) this.c).y;
                    if (iVar != null) {
                        ((f9.f0) iVar.a).c(uVar);
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
        u2.u uVar;
        switch (this.a) {
            case 0:
                androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            b0.a(message.getData());
                            return;
                        case 2:
                            rVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            rVar.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            b0.a((Bundle) message.obj);
                            return;
                        case 8:
                            rVar.d();
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
                n2.a aVar = (n2.a) message.obj;
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        obj = ((n2.b) this.c).k.l((n2.p) aVar.d);
                    } else {
                        if (i10 != 2) {
                            throw new RuntimeException();
                        }
                        n2.b bVar = (n2.b) this.c;
                        n2.v k10 = bVar.k.k(bVar.l, (n2.o) aVar.d);
                        synchronized (((n2.b) this.c).o) {
                            try {
                                jg.i iVar = ((n2.b) this.c).y;
                                if (iVar != null && (uVar = k10.b) != null) {
                                    ((f9.f0) iVar.a).c(new u2.u(uVar.a, uVar.b, uVar.c, uVar.d, SystemClock.elapsedRealtime() - aVar.c, uVar.f));
                                }
                            } finally {
                            }
                        }
                        obj = k10;
                    }
                } catch (n2.w e) {
                    boolean a2 = a(message, e);
                    obj = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e10) {
                    e2.a.m("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
                    obj = e10;
                }
                u7.s sVar = ((n2.b) this.c).i;
                long j10 = aVar.a;
                sVar.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((n2.b) this.c).n.obtainMessage(message.what, Pair.create(aVar.d, obj)).sendToTarget();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.r rVar, Looper looper) {
        super(looper);
        this.c = rVar;
        this.b = false;
    }
}
