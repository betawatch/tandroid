package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import b2.s0;
import com.google.android.gms.internal.cast.b5;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Message message, n2.v vVar) {
        long j3;
        n2.a aVar = (n2.a) message.obj;
        if (aVar.b) {
            int i10 = aVar.d + 1;
            aVar.d = i10;
            ((n2.b) this.c).i.getClass();
            if (i10 <= 3) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                Throwable b5Var = vVar.getCause() instanceof IOException ? (IOException) vVar.getCause() : new b5(vVar.getCause());
                rb.a aVar2 = ((n2.b) this.c).i;
                int i11 = aVar.d;
                aVar2.getClass();
                if (!(b5Var instanceof s0) && !(b5Var instanceof FileNotFoundException) && !(b5Var instanceof g2.u) && !(b5Var instanceof y2.l)) {
                    int i12 = g2.j.b;
                    while (b5Var != null) {
                        if (!(b5Var instanceof g2.j) || ((g2.j) b5Var).a != 2008) {
                            b5Var = b5Var.getCause();
                        }
                    }
                    j3 = Math.min((i11 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
                    if (j3 != -9223372036854775807L) {
                        synchronized (this) {
                            try {
                                if (this.b) {
                                    return false;
                                }
                                sendMessageDelayed(Message.obtain(message), j3);
                                return true;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                j3 = -9223372036854775807L;
                if (j3 != -9223372036854775807L) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable th2;
        switch (this.a) {
            case 0:
                androidx.mediarouter.app.r rVar = (androidx.mediarouter.app.r) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            c0.a(message.getData());
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
                            c0.a((Bundle) message.obj);
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
                        th2 = ((n2.b) this.c).k.j((n2.p) aVar.c);
                    } else {
                        if (i10 != 2) {
                            throw new RuntimeException();
                        }
                        n2.b bVar = (n2.b) this.c;
                        th2 = bVar.k.i(bVar.l, (n2.o) aVar.c);
                    }
                } catch (n2.v e7) {
                    boolean a2 = a(message, e7);
                    th2 = e7;
                    if (a2) {
                        return;
                    }
                } catch (Exception e10) {
                    e2.a.o("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
                    th2 = e10;
                }
                rb.a aVar2 = ((n2.b) this.c).i;
                long j3 = aVar.a;
                aVar2.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((n2.b) this.c).n.obtainMessage(message.what, Pair.create(aVar.c, th2)).sendToTarget();
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
