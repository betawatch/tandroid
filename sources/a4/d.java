package a4;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.mediarouter.app.m0;
import c2.x0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jd.e0;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        switch (this.a) {
            case 0:
                f fVar = (f) this.b;
                fVar.getClass();
                int i10 = msg.what;
                e eVar = null;
                if (i10 == 0) {
                    e eVar2 = (e) msg.obj;
                    try {
                        fVar.a.queueInputBuffer(eVar2.a, 0, eVar2.b, eVar2.d, eVar2.e);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = fVar.d;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                    eVar = eVar2;
                } else if (i10 == 1) {
                    e eVar3 = (e) msg.obj;
                    int i11 = eVar3.a;
                    MediaCodec.CryptoInfo cryptoInfo = eVar3.c;
                    long j10 = eVar3.d;
                    int i12 = eVar3.e;
                    try {
                        synchronized (f.h) {
                            fVar.a.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                        }
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference2 = fVar.d;
                        while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                        }
                    }
                    eVar = eVar3;
                } else if (i10 != 2) {
                    AtomicReference atomicReference3 = fVar.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    fVar.e.c();
                }
                if (eVar != null) {
                    f.d(eVar);
                    return;
                }
                return;
            case 1:
                androidx.mediarouter.app.f fVar2 = (androidx.mediarouter.app.f) this.b;
                d dVar = fVar2.I;
                int i13 = msg.what;
                if (i13 == 1) {
                    fVar2.e((List) msg.obj);
                    return;
                }
                if (i13 == 2) {
                    if (fVar2.r.isEmpty()) {
                        fVar2.i(2);
                        dVar.removeMessages(2);
                        dVar.removeMessages(3);
                        dVar.sendMessageDelayed(dVar.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i13 == 3 && fVar2.r.isEmpty()) {
                    fVar2.i(3);
                    dVar.removeMessages(2);
                    dVar.removeMessages(3);
                    dVar.removeMessages(1);
                    fVar2.f.h(fVar2.h);
                    return;
                }
                return;
            case 2:
                if (msg.what != 1) {
                    return;
                }
                androidx.mediarouter.app.b0 b0Var = (androidx.mediarouter.app.b0) this.b;
                List list = (List) msg.obj;
                b0Var.B = SystemClock.uptimeMillis();
                b0Var.s.clear();
                b0Var.s.addAll(list);
                b0Var.v.D();
                return;
            case 3:
                m0 m0Var = (m0) this.b;
                int i14 = msg.what;
                if (i14 == 1) {
                    m0Var.n();
                    return;
                } else {
                    if (i14 == 2 && m0Var.I != null) {
                        m0Var.I = null;
                        m0Var.o();
                        return;
                    }
                    return;
                }
            case 4:
                int i15 = msg.what;
                int i16 = msg.arg1;
                Object obj = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((c2.h) this.b).j;
                x0 x0Var = (x0) sparseArray.get(i16);
                if (x0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i16);
                if (i15 == 3) {
                    x0Var.b((Bundle) obj);
                    return;
                } else {
                    if (i15 != 4) {
                        return;
                    }
                    x0.a(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
                    return;
                }
            case 5:
                c2.t tVar = (c2.t) this.b;
                int i17 = msg.what;
                if (i17 != 1) {
                    if (i17 != 2) {
                        return;
                    }
                    tVar.b = false;
                    tVar.f((c2.o) tVar.h);
                    return;
                }
                tVar.c = false;
                ha.c cVar = (ha.c) tVar.f;
                if (cVar != null) {
                    c2.u uVar = (c2.u) tVar.n;
                    c2.e eVar4 = (c2.e) cVar.b;
                    c2.a0 d = eVar4.d(tVar);
                    if (d != null) {
                        eVar4.m(d, uVar);
                        return;
                    }
                    return;
                }
                return;
            case 6:
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
                e0.q(e0.b((sc.h) this.b), new ja.v(str, null, 1));
                return;
            case 7:
                f20 f20Var = (f20) this.b;
                e20 e20Var = f20Var.g;
                int i18 = msg.what;
                if (i18 == 1) {
                    e20Var.getClass();
                    return;
                }
                if (i18 == 2) {
                    f20Var.f.removeMessages(3);
                    f20Var.j = false;
                    f20Var.k = true;
                    e20Var.onLongPress(f20Var.n);
                    return;
                }
                if (i18 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                d20 d20Var = f20Var.h;
                if (d20Var != null) {
                    if (f20Var.i) {
                        f20Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) d20Var).Z1(f20Var.n);
                        return;
                    }
                }
                return;
            default:
                g20 g20Var = (g20) this.b;
                h20 h20Var = g20Var.f;
                int i19 = msg.what;
                if (i19 == 1) {
                    h20Var.onShowPress(g20Var.m);
                    return;
                }
                if (i19 == 2) {
                    g20Var.e.removeMessages(3);
                    g20Var.i = false;
                    g20Var.j = true;
                    h20Var.onLongPress(g20Var.m);
                    return;
                }
                if (i19 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                h20 h20Var2 = g20Var.g;
                if (h20Var2 != null) {
                    if (g20Var.h) {
                        g20Var.i = true;
                        return;
                    } else {
                        h20Var2.onSingleTapConfirmed(g20Var.m);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sc.h hVar) {
        super(Looper.getMainLooper());
        this.a = 6;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Looper looper) {
        super(looper);
        this.a = 0;
        this.b = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c2.h hVar) {
        super(Looper.getMainLooper());
        this.a = 4;
        this.b = hVar;
    }
}
