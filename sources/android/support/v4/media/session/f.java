package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import b2.w0;
import com.google.android.gms.internal.cast.z4;
import e9.k0;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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

    public boolean a(Message message, n2.x xVar) {
        long min;
        n2.a aVar = (n2.a) message.obj;
        if (aVar.b) {
            int i10 = aVar.e + 1;
            aVar.e = i10;
            ((n2.b) this.c).i.getClass();
            if (i10 <= 3) {
                u2.u uVar = new u2.u(xVar.a, xVar.b, xVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - aVar.c, xVar.d);
                oa.d dVar = ((n2.b) this.c).i;
                int i11 = aVar.e;
                dVar.getClass();
                for (Throwable z4Var = xVar.getCause() instanceof IOException ? (IOException) xVar.getCause() : new z4(xVar.getCause()); z4Var != null; z4Var = z4Var.getCause()) {
                    if ((z4Var instanceof w0) || (z4Var instanceof FileNotFoundException) || (z4Var instanceof g2.u) || (z4Var instanceof y2.k) || ((z4Var instanceof g2.j) && ((g2.j) z4Var).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i11 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
                if (min == -9223372036854775807L) {
                    return false;
                }
                synchronized (((n2.b) this.c).o) {
                    le.b bVar = ((n2.b) this.c).y;
                    if (bVar != null) {
                        ((k0) bVar.b).c(uVar);
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
                androidx.mediarouter.app.q qVar = (androidx.mediarouter.app.q) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            b0.a(message.getData());
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
                            b0.a((Bundle) message.obj);
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
                n2.a aVar = (n2.a) message.obj;
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        obj = ((n2.b) this.c).k.l((n2.q) aVar.d);
                    } else {
                        if (i10 != 2) {
                            throw new RuntimeException();
                        }
                        n2.b bVar = (n2.b) this.c;
                        n2.w k10 = bVar.k.k(bVar.l, (n2.p) aVar.d);
                        synchronized (((n2.b) this.c).o) {
                            try {
                                le.b bVar2 = ((n2.b) this.c).y;
                                if (bVar2 != null && (uVar = k10.b) != null) {
                                    ((k0) bVar2.b).c(new u2.u(uVar.a, uVar.b, uVar.c, uVar.d, SystemClock.elapsedRealtime() - aVar.c, uVar.f));
                                }
                            } finally {
                            }
                        }
                        obj = k10;
                    }
                } catch (n2.x e) {
                    boolean a2 = a(message, e);
                    obj = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e7) {
                    e2.a.m("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e7);
                    obj = e7;
                }
                oa.d dVar = ((n2.b) this.c).i;
                long j10 = aVar.a;
                dVar.getClass();
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
    public f(androidx.mediarouter.app.q qVar, Looper looper) {
        super(looper);
        this.c = qVar;
        this.b = false;
    }
}
