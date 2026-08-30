package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import b7.y0;
import g5.l0;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends Handler {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o3.b bVar, Looper looper) {
        super(looper);
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Message message, o3.b0 b0Var) {
        long j10;
        o3.a aVar = (o3.a) message.obj;
        if (aVar.b) {
            int i10 = aVar.d + 1;
            aVar.d = i10;
            ((o3.b) this.c).i.getClass();
            if (i10 <= 3) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                Throwable y0Var = b0Var.getCause() instanceof IOException ? (IOException) b0Var.getCause() : new y0(b0Var.getCause());
                ab.a aVar2 = ((o3.b) this.c).i;
                int i11 = aVar.d;
                aVar2.getClass();
                if (!(y0Var instanceof r1) && !(y0Var instanceof FileNotFoundException) && !(y0Var instanceof g5.b0) && !(y0Var instanceof l0)) {
                    int i12 = g5.n.b;
                    while (y0Var != null) {
                        if (!(y0Var instanceof g5.n) || ((g5.n) y0Var).a != 2008) {
                            y0Var = y0Var.getCause();
                        }
                    }
                    j10 = Math.min((i11 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
                    if (j10 != -9223372036854775807L) {
                        synchronized (this) {
                            try {
                                if (this.b) {
                                    return false;
                                }
                                sendMessageDelayed(Message.obtain(message), j10);
                                return true;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                j10 = -9223372036854775807L;
                if (j10 != -9223372036854775807L) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        o3.b0 b0Var;
        switch (this.a) {
            case 0:
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            c0.a(message.getData());
                            return;
                        case 2:
                            sVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            sVar.a((MediaMetadataCompat) message.obj);
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
                            sVar.d();
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
                o3.a aVar = (o3.a) message.obj;
                try {
                    int i10 = message.what;
                    if (i10 == 0) {
                        b0Var = ((o3.b) this.c).k.k((o3.u) aVar.c);
                    } else {
                        if (i10 != 1) {
                            throw new RuntimeException();
                        }
                        o3.b bVar = (o3.b) this.c;
                        b0Var = bVar.k.i(bVar.l, (o3.t) aVar.c);
                    }
                } catch (o3.b0 e) {
                    boolean a2 = a(message, e);
                    b0Var = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e6) {
                    h5.a.L("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e6);
                    b0Var = e6;
                }
                ab.a aVar2 = ((o3.b) this.c).i;
                long j10 = aVar.a;
                aVar2.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((o3.b) this.c).n.obtainMessage(message.what, Pair.create(aVar.c, b0Var)).sendToTarget();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.s sVar, Looper looper) {
        super(looper);
        this.c = sVar;
        this.b = false;
    }
}
