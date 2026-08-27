package androidx.mediarouter.app;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import c2.v0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.z10;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        String str;
        y3.d dVar;
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                c cVar = gVar.I;
                int i10 = msg.what;
                if (i10 == 1) {
                    gVar.e((List) msg.obj);
                    return;
                }
                if (i10 == 2) {
                    if (gVar.r.isEmpty()) {
                        gVar.i(2);
                        cVar.removeMessages(2);
                        cVar.removeMessages(3);
                        cVar.sendMessageDelayed(cVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i10 == 3 && gVar.r.isEmpty()) {
                    gVar.i(3);
                    cVar.removeMessages(2);
                    cVar.removeMessages(3);
                    cVar.removeMessages(1);
                    gVar.f.h(gVar.h);
                    return;
                }
                return;
            case 1:
                if (msg.what != 1) {
                    return;
                }
                c0 c0Var = (c0) this.b;
                List list = (List) msg.obj;
                c0Var.B = SystemClock.uptimeMillis();
                c0Var.s.clear();
                c0Var.s.addAll(list);
                c0Var.v.D();
                return;
            case 2:
                p0 p0Var = (p0) this.b;
                int i11 = msg.what;
                if (i11 == 1) {
                    p0Var.n();
                    return;
                } else {
                    if (i11 == 2 && p0Var.I != null) {
                        p0Var.I = null;
                        p0Var.o();
                        return;
                    }
                    return;
                }
            case 3:
                int i12 = msg.what;
                int i13 = msg.arg1;
                Object obj = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((c2.h) this.b).j;
                v0 v0Var = (v0) sparseArray.get(i13);
                if (v0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i13);
                if (i12 == 3) {
                    v0Var.b((Bundle) obj);
                    return;
                } else {
                    if (i12 != 4) {
                        return;
                    }
                    v0.a(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
                    return;
                }
            case 4:
                c2.s sVar = (c2.s) this.b;
                int i14 = msg.what;
                if (i14 != 1) {
                    if (i14 != 2) {
                        return;
                    }
                    sVar.b = false;
                    sVar.f((c2.o) sVar.h);
                    return;
                }
                sVar.c = false;
                ga.c cVar2 = (ga.c) sVar.f;
                if (cVar2 != null) {
                    c2.t tVar = (c2.t) sVar.n;
                    c2.e eVar = (c2.e) cVar2.b;
                    c2.y d = eVar.d(sVar);
                    if (d != null) {
                        eVar.m(d, tVar);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                kotlin.jvm.internal.j.e(msg, "msg");
                if (msg.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                    super.handleMessage(msg);
                    return;
                }
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                Log.d("SessionLifecycleClient", "Session update received: ".concat(str));
                id.f0.q(id.f0.b((rc.h) this.b), new ia.w(str, null, 1));
                return;
            case 6:
                x10 x10Var = (x10) this.b;
                w10 w10Var = x10Var.g;
                int i15 = msg.what;
                if (i15 == 1) {
                    w10Var.getClass();
                    return;
                }
                if (i15 == 2) {
                    x10Var.f.removeMessages(3);
                    x10Var.j = false;
                    x10Var.k = true;
                    w10Var.onLongPress(x10Var.n);
                    return;
                }
                if (i15 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                v10 v10Var = x10Var.h;
                if (v10Var != null) {
                    if (x10Var.i) {
                        x10Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) v10Var).Z1(x10Var.n);
                        return;
                    }
                }
                return;
            case 7:
                y10 y10Var = (y10) this.b;
                z10 z10Var = y10Var.f;
                int i16 = msg.what;
                if (i16 == 1) {
                    z10Var.onShowPress(y10Var.m);
                    return;
                }
                if (i16 == 2) {
                    y10Var.e.removeMessages(3);
                    y10Var.i = false;
                    y10Var.j = true;
                    z10Var.onLongPress(y10Var.m);
                    return;
                }
                if (i16 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                z10 z10Var2 = y10Var.g;
                if (z10Var2 != null) {
                    if (y10Var.h) {
                        y10Var.i = true;
                        return;
                    } else {
                        z10Var2.onSingleTapConfirmed(y10Var.m);
                        return;
                    }
                }
                return;
            default:
                y3.e eVar2 = (y3.e) this.b;
                eVar2.getClass();
                int i17 = msg.what;
                y3.d dVar2 = null;
                if (i17 == 0) {
                    dVar = (y3.d) msg.obj;
                    try {
                        eVar2.a.queueInputBuffer(dVar.a, 0, dVar.b, dVar.d, dVar.e);
                    } catch (RuntimeException e9) {
                        AtomicReference atomicReference = eVar2.d;
                        while (!atomicReference.compareAndSet(null, e9) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            AtomicReference atomicReference2 = eVar2.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            eVar2.e.c();
                        }
                        if (dVar2 == null) {
                            y3.e.d(dVar2);
                            return;
                        }
                        return;
                    }
                    dVar = (y3.d) msg.obj;
                    int i18 = dVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar.c;
                    long j10 = dVar.d;
                    int i19 = dVar.e;
                    try {
                        synchronized (y3.e.h) {
                            eVar2.a.queueSecureInputBuffer(i18, 0, cryptoInfo, j10, i19);
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference3 = eVar2.d;
                        while (!atomicReference3.compareAndSet(null, e10) && atomicReference3.get() == null) {
                        }
                    }
                }
                dVar2 = dVar;
                if (dVar2 == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rc.h hVar) {
        super(Looper.getMainLooper());
        this.a = 5;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y3.e eVar, Looper looper) {
        super(looper);
        this.a = 8;
        this.b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c2.h hVar) {
        super(Looper.getMainLooper());
        this.a = 3;
        this.b = hVar;
    }
}
