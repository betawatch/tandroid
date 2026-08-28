package androidx.mediarouter.app;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import c2.w0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.v10;
import org.telegram.ui.Components.w10;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends Handler {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(Object obj, int i9) {
        this.a = i9;
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
                i iVar = (i) this.b;
                d dVar2 = iVar.I;
                int i9 = msg.what;
                if (i9 == 1) {
                    iVar.e((List) msg.obj);
                    return;
                }
                if (i9 == 2) {
                    if (iVar.r.isEmpty()) {
                        iVar.i(2);
                        dVar2.removeMessages(2);
                        dVar2.removeMessages(3);
                        dVar2.sendMessageDelayed(dVar2.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i9 == 3 && iVar.r.isEmpty()) {
                    iVar.i(3);
                    dVar2.removeMessages(2);
                    dVar2.removeMessages(3);
                    dVar2.removeMessages(1);
                    iVar.f.h(iVar.h);
                    return;
                }
                return;
            case 1:
                if (msg.what != 1) {
                    return;
                }
                e0 e0Var = (e0) this.b;
                List list = (List) msg.obj;
                e0Var.B = SystemClock.uptimeMillis();
                e0Var.s.clear();
                e0Var.s.addAll(list);
                e0Var.v.D();
                return;
            case 2:
                p0 p0Var = (p0) this.b;
                int i10 = msg.what;
                if (i10 == 1) {
                    p0Var.n();
                    return;
                } else {
                    if (i10 == 2 && p0Var.I != null) {
                        p0Var.I = null;
                        p0Var.o();
                        return;
                    }
                    return;
                }
            case 3:
                int i11 = msg.what;
                int i12 = msg.arg1;
                Object obj = msg.obj;
                Bundle peekData = msg.peekData();
                SparseArray sparseArray = ((c2.h) this.b).j;
                w0 w0Var = (w0) sparseArray.get(i12);
                if (w0Var == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i12);
                if (i11 == 3) {
                    w0Var.b((Bundle) obj);
                    return;
                } else {
                    if (i11 != 4) {
                        return;
                    }
                    w0.a(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
                    return;
                }
            case 4:
                c2.s sVar = (c2.s) this.b;
                int i13 = msg.what;
                if (i13 != 1) {
                    if (i13 != 2) {
                        return;
                    }
                    sVar.b = false;
                    sVar.f((c2.o) sVar.h);
                    return;
                }
                sVar.c = false;
                k5.i iVar2 = (k5.i) sVar.f;
                if (iVar2 != null) {
                    c2.t tVar = (c2.t) sVar.n;
                    c2.e eVar = (c2.e) iVar2.b;
                    c2.z d = eVar.d(sVar);
                    if (d != null) {
                        eVar.m(d, tVar);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                kotlin.jvm.internal.i.e(msg, "msg");
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
                hd.f0.q(hd.f0.b((qc.h) this.b), new ha.v(str, null, 1));
                return;
            case 6:
                u10 u10Var = (u10) this.b;
                t10 t10Var = u10Var.g;
                int i14 = msg.what;
                if (i14 == 1) {
                    t10Var.getClass();
                    return;
                }
                if (i14 == 2) {
                    u10Var.f.removeMessages(3);
                    u10Var.j = false;
                    u10Var.k = true;
                    t10Var.onLongPress(u10Var.n);
                    return;
                }
                if (i14 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                s10 s10Var = u10Var.h;
                if (s10Var != null) {
                    if (u10Var.i) {
                        u10Var.j = true;
                        return;
                    } else {
                        ((PhotoViewer) s10Var).Z1(u10Var.n);
                        return;
                    }
                }
                return;
            case 7:
                v10 v10Var = (v10) this.b;
                w10 w10Var = v10Var.f;
                int i15 = msg.what;
                if (i15 == 1) {
                    w10Var.onShowPress(v10Var.m);
                    return;
                }
                if (i15 == 2) {
                    v10Var.e.removeMessages(3);
                    v10Var.i = false;
                    v10Var.j = true;
                    w10Var.onLongPress(v10Var.m);
                    return;
                }
                if (i15 != 3) {
                    throw new RuntimeException("Unknown message " + msg);
                }
                w10 w10Var2 = v10Var.g;
                if (w10Var2 != null) {
                    if (v10Var.h) {
                        v10Var.i = true;
                        return;
                    } else {
                        w10Var2.onSingleTapConfirmed(v10Var.m);
                        return;
                    }
                }
                return;
            default:
                y3.e eVar2 = (y3.e) this.b;
                eVar2.getClass();
                int i16 = msg.what;
                y3.d dVar3 = null;
                if (i16 == 0) {
                    dVar = (y3.d) msg.obj;
                    try {
                        eVar2.a.queueInputBuffer(dVar.a, 0, dVar.b, dVar.d, dVar.e);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = eVar2.d;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            AtomicReference atomicReference2 = eVar2.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            eVar2.e.c();
                        }
                        if (dVar3 == null) {
                            y3.e.d(dVar3);
                            return;
                        }
                        return;
                    }
                    dVar = (y3.d) msg.obj;
                    int i17 = dVar.a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar.c;
                    long j10 = dVar.d;
                    int i18 = dVar.e;
                    try {
                        synchronized (y3.e.h) {
                            eVar2.a.queueSecureInputBuffer(i17, 0, cryptoInfo, j10, i18);
                        }
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference3 = eVar2.d;
                        while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                        }
                    }
                }
                dVar3 = dVar;
                if (dVar3 == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qc.h hVar) {
        super(Looper.getMainLooper());
        this.a = 5;
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y3.e eVar, Looper looper) {
        super(looper);
        this.a = 8;
        this.b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c2.h hVar) {
        super(Looper.getMainLooper());
        this.a = 3;
        this.b = hVar;
    }
}
