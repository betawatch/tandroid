// default package

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kb3 extends Handler {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb3(tu6 tu6Var, Looper looper) {
        super(looper);
        this.c = tu6Var;
        this.b = false;
    }

    public final boolean a(Message message, ms6 ms6Var) {
        long min;
        lb3 lb3Var = (lb3) message.obj;
        if (lb3Var.b) {
            int i = lb3Var.e + 1;
            lb3Var.e = i;
            ((mb3) this.c).i.getClass();
            if (i <= 3) {
                da6 da6Var = new da6(lb3Var.a, ms6Var.a, SystemClock.elapsedRealtime());
                da6Var.d = ms6Var.b;
                da6Var.e = ms6Var.c;
                da6Var.f = SystemClock.elapsedRealtime() - lb3Var.c;
                da6Var.g = ms6Var.d;
                ea6 ea6Var = new ea6(da6Var);
                k4f k4fVar = ((mb3) this.c).i;
                int i2 = lb3Var.e;
                k4fVar.getClass();
                for (Throwable ol2Var = ms6Var.getCause() instanceof IOException ? (IOException) ms6Var.getCause() : new ol2(ms6Var.getCause()); ol2Var != null; ol2Var = ol2Var.getCause()) {
                    if ((ol2Var instanceof bx7) || (ol2Var instanceof FileNotFoundException) || (ol2Var instanceof hi5) || (ol2Var instanceof la6) || ((ol2Var instanceof d83) && ((d83) ol2Var).a == 2008)) {
                        min = -9223372036854775807L;
                        break;
                    }
                }
                min = Math.min((i2 - 1) * 1000, 5000);
                if (min != -9223372036854775807L) {
                    synchronized (((mb3) this.c).o) {
                        ai4 ai4Var = ((mb3) this.c).y;
                        if (ai4Var != null) {
                            ((jo5) ai4Var.b).c(ea6Var);
                        }
                    }
                    synchronized (this) {
                        if (this.b) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), min);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        ea6 ea6Var;
        switch (this.a) {
            case 0:
                lb3 lb3Var = (lb3) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        obj = ((mb3) this.c).k.r((s64) lb3Var.d);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        mb3 mb3Var = (mb3) this.c;
                        ls6 q = mb3Var.k.q(mb3Var.l, (r64) lb3Var.d);
                        synchronized (((mb3) this.c).o) {
                            try {
                                ai4 ai4Var = ((mb3) this.c).y;
                                if (ai4Var != null && (ea6Var = q.b) != null) {
                                    da6 a = ea6Var.a();
                                    a.a = lb3Var.a;
                                    a.f = SystemClock.elapsedRealtime() - lb3Var.c;
                                    ((jo5) ai4Var.b).c(new ea6(a));
                                }
                            } finally {
                            }
                        }
                    }
                } catch (ms6 e) {
                    boolean a2 = a(message, e);
                    obj = e;
                    if (a2) {
                        return;
                    }
                } catch (Exception e2) {
                    ncd.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    obj = e2;
                }
                k4f k4fVar = ((mb3) this.c).i;
                long j = lb3Var.a;
                k4fVar.getClass();
                synchronized (this) {
                    if (!this.b) {
                        ((mb3) this.c).n.obtainMessage(message.what, Pair.create(lb3Var.d, obj)).sendToTarget();
                    }
                }
                return;
            default:
                tu6 tu6Var = (tu6) this.c;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            mx6.D(message.getData());
                            return;
                        case 2:
                            tu6Var.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            tu6Var.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            return;
                        case 5:
                            return;
                        case 6:
                            return;
                        case 7:
                            mx6.D((Bundle) message.obj);
                            return;
                        case 8:
                            tu6Var.d();
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb3(mb3 mb3Var, Looper looper) {
        super(looper);
        this.c = mb3Var;
    }
}
